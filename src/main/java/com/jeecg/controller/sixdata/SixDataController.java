package com.jeecg.controller.sixdata;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.apache.log4j.Logger;
import org.jeecgframework.core.beanvalidator.BeanValidators;
import org.jeecgframework.core.common.controller.BaseController;
import org.jeecgframework.core.common.hibernate.qbc.CriteriaQuery;
import org.jeecgframework.core.common.model.json.AjaxJson;
import org.jeecgframework.core.common.model.json.DataGrid;
import org.jeecgframework.core.constant.Globals;
import org.jeecgframework.core.util.MyBeanUtils;
import org.jeecgframework.core.util.StringUtil;
import org.jeecgframework.tag.core.easyui.TagUtil;
import org.jeecgframework.web.system.pojo.base.TSCategoryEntity;
import org.jeecgframework.web.system.service.CategoryServiceI;
import org.jeecgframework.web.system.service.SystemService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.util.UriComponentsBuilder;

import com.jeecg.entity.sixdata.SixDataEntity;
import com.jeecg.service.sixdata.SixDataServiceI;

/**
 * @Title: Controller
 * @Description: 六项学科数据信息表
 * @author zhangdaihao
 * @date 2016-07-14 15:55:24
 * @version V1.0
 *
 */
@Controller
@RequestMapping("/sixDataController")
public class SixDataController extends BaseController {
	/**
	 * Logger for this class
	 */
	private static final Logger logger = Logger.getLogger(SixDataController.class);

	@Autowired
	private SixDataServiceI sixDataService;
	@Autowired
	private SystemService systemService;
	@Autowired
	private Validator validator;
	@Autowired
	private CategoryServiceI categoryService;

	/**
	 * 六项学科数据信息表列表 页面跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "list")
	public ModelAndView list(HttpServletRequest request) {
		return new ModelAndView("com/jeecg/sixdata/sixDataList");
	}

	/**
	 * easyui AJAX请求数据
	 * 
	 * @param request
	 * @param response
	 * @param dataGrid
	 * @param user
	 */

	@SuppressWarnings("unchecked")
	@RequestMapping(params = "datagrid")
	public void datagrid(SixDataEntity sixData, HttpServletRequest request, HttpServletResponse response,
			DataGrid dataGrid) {
		CriteriaQuery cq = new CriteriaQuery(SixDataEntity.class, dataGrid);
		// 查询条件组装器
		org.jeecgframework.core.extend.hqlsearch.HqlGenerateUtil.installHql(cq, sixData, request.getParameterMap());
		this.sixDataService.getDataGridReturn(cq, true);
		List<SixDataEntity> lists = (List<SixDataEntity>) dataGrid.getResults();
		List<SixDataEntity> lists_ = new ArrayList<SixDataEntity>();
		if (lists != null) {
			for (SixDataEntity six : lists) {
				SixDataEntity ss = new SixDataEntity();
				BeanUtils.copyProperties(six, ss);
				String code = six.getSubjectType();
				String subjectTypeName = this.categoryService.findByProperty(TSCategoryEntity.class, "code", code)
						.get(0).getName();
				ss.setSubjectType(subjectTypeName);
				lists_.add(ss);
			}
		}
		dataGrid.setResults(lists_);
		TagUtil.datagrid(response, dataGrid);
	}

	/**
	 * 删除六项学科数据信息表
	 * 
	 * @return
	 */
	@RequestMapping(params = "del")
	@ResponseBody
	public AjaxJson del(SixDataEntity sixData, HttpServletRequest request) {
		String message = null;
		AjaxJson j = new AjaxJson();
		sixData = systemService.getEntity(SixDataEntity.class, sixData.getId());
		message = "六项学科数据信息表删除成功";
		sixDataService.delete(sixData);
		systemService.addLog(message, Globals.Log_Type_DEL, Globals.Log_Leavel_INFO);

		j.setMsg(message);
		return j;
	}

	/**
	 * 添加六项学科数据信息表
	 * 
	 * @param ids
	 * @return
	 */
	@RequestMapping(params = "save")
	@ResponseBody
	public AjaxJson save(SixDataEntity sixData, HttpServletRequest request) {
		String message = null;
		AjaxJson j = new AjaxJson();
		System.out.println(sixData.getId());
		if (StringUtil.isNotEmpty(sixData.getId())) {
			message = "六项学科数据信息表更新成功";
			SixDataEntity t = sixDataService.get(SixDataEntity.class, sixData.getId());
			try { 
				MyBeanUtils.copyBeanNotNull2Bean(sixData, t);
				sixDataService.saveOrUpdate(t);
				systemService.addLog(message, Globals.Log_Type_UPDATE, Globals.Log_Leavel_INFO);
			} catch (Exception e) {
				e.printStackTrace();
				message = "六项学科数据信息表更新失败";
			}
		} else {
			String dataTitle = "";
			Object[] params = null;
			String code = request.getParameter("code");
			String name = request.getParameter("name");
			String year = sixData.getYear();
			// 首先根据传入的code 判断是否是第三级分区。 A01 A05 A01
			// 如果不是 则
			System.out.println("name==" + name + "-----code=" + code);
			if (code.length() == 9) { // A01 A05 非分区的数据
				dataTitle = name + "-" + year + "年度六项考核数据完成情况";
			} else if (code.length() == 12) {
				String topCode = code.substring(0, 9);
				String sql = "select t.name from t_s_category t where t.code = ?";
				params = new Object[] { topCode };
				List<Map<String, Object>> mp = this.systemService.findForJdbc(sql, params);
				if (mp != null) {
					if (!mp.isEmpty()) {
						Map<String, Object> mm = mp.get(0);
						String name_ = (String) mm.get("name");
						if (StringUtil.isNotEmpty(name_)) {
							dataTitle = name_ + "(" + name + ")" + "-" + year + "年度六项考核数据完成情况";
						}
					}
				}
			}
			sixData.setDataTitle(dataTitle);
			sixData.setYear(year);
			sixData.setSubjectType(code);
			message = "六项学科数据信息表添加成功";
			sixDataService.save(sixData);
			systemService.addLog(message, Globals.Log_Type_INSERT, Globals.Log_Leavel_INFO);
		}
		j.setMsg(message);
		return j;
	}

	/**
	 * 六项学科数据信息表列表页面跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "addorupdate")
	public ModelAndView addorupdate(SixDataEntity sixData, HttpServletRequest req) {
		if (StringUtil.isNotEmpty(sixData.getId())) {
			sixData = sixDataService.getEntity(SixDataEntity.class, sixData.getId());
			req.setAttribute("sixDataPage", sixData);
		}
		return new ModelAndView("com/jeecg/sixdata/sixData");
	}

	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
	public List<SixDataEntity> list() {
		List<SixDataEntity> listSixDatas = sixDataService.getList(SixDataEntity.class);
		return listSixDatas;
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<?> get(@PathVariable("id") String id) {
		SixDataEntity task = sixDataService.get(SixDataEntity.class, id);
		if (task == null) {
			return new ResponseEntity(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity(task, HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ResponseEntity<?> create(@RequestBody SixDataEntity sixData, UriComponentsBuilder uriBuilder) {
		// 调用JSR303 Bean Validator进行校验，如果出错返回含400错误码及json格式的错误信息.
		Set<ConstraintViolation<SixDataEntity>> failures = validator.validate(sixData);
		if (!failures.isEmpty()) {
			return new ResponseEntity(BeanValidators.extractPropertyAndMessage(failures), HttpStatus.BAD_REQUEST);
		}

		// 保存
		sixDataService.save(sixData);

		// 按照Restful风格约定，创建指向新任务的url, 也可以直接返回id或对象.
		String id = sixData.getId();
		URI uri = uriBuilder.path("/rest/sixDataController/" + id).build().toUri();
		HttpHeaders headers = new HttpHeaders();
		headers.setLocation(uri);

		return new ResponseEntity(headers, HttpStatus.CREATED);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> update(@RequestBody SixDataEntity sixData) {
		// 调用JSR303 Bean Validator进行校验，如果出错返回含400错误码及json格式的错误信息.
		Set<ConstraintViolation<SixDataEntity>> failures = validator.validate(sixData);
		if (!failures.isEmpty()) {
			return new ResponseEntity(BeanValidators.extractPropertyAndMessage(failures), HttpStatus.BAD_REQUEST);
		}

		// 保存
		sixDataService.saveOrUpdate(sixData);

		// 按Restful约定，返回204状态码, 无内容. 也可以返回200状态码.
		return new ResponseEntity(HttpStatus.NO_CONTENT);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable("id") String id) {
		sixDataService.deleteEntityById(SixDataEntity.class, id);
	}

	@RequestMapping(params = "addorupdatedata")
	public ModelAndView addorupdatedata(SixDataEntity sixDataEntity, HttpServletRequest req) {
		if (StringUtil.isNotEmpty(sixDataEntity.getId())) {
			SixDataEntity ss = sixDataService.get(SixDataEntity.class, sixDataEntity.getId());
			req.setAttribute("sixDataPage", ss);
		}
		return new ModelAndView("com/jeecg/sixdata/sixData2");
	}
}
