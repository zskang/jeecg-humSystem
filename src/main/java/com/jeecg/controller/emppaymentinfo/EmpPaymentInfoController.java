package com.jeecg.controller.emppaymentinfo;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import org.jeecgframework.core.common.controller.BaseController;
import org.jeecgframework.core.common.hibernate.qbc.CriteriaQuery;
import org.jeecgframework.core.common.model.json.AjaxJson;
import org.jeecgframework.core.common.model.json.DataGrid;
import org.jeecgframework.core.constant.Globals;
import org.jeecgframework.core.util.StringUtil;
import org.jeecgframework.tag.core.easyui.TagUtil;
import org.jeecgframework.web.system.pojo.base.TSDepart;
import org.jeecgframework.web.system.service.SystemService;
import org.jeecgframework.core.util.MyBeanUtils;

import com.jeecg.entity.emppaymentinfo.EmpPaymentInfoEntity;
import com.jeecg.service.emppaymentinfo.EmpPaymentInfoServiceI;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.jeecgframework.core.beanvalidator.BeanValidators;
import java.util.Set;
import javax.validation.ConstraintViolation;
import javax.validation.Validator;
import java.net.URI;
import org.springframework.http.MediaType;
import org.springframework.web.util.UriComponentsBuilder;

/**   
 * @Title: Controller
 * @Description: 员工薪酬纪录表
 * @author zhangdaihao
 * @date 2016-08-06 10:53:44
 * @version V1.0   
 *
 */
@Controller
@RequestMapping("/empPaymentInfoController")
public class EmpPaymentInfoController extends BaseController {
	/**
	 * Logger for this class
	 */
	private static final Logger logger = Logger.getLogger(EmpPaymentInfoController.class);

	@Autowired
	private EmpPaymentInfoServiceI empPaymentInfoService;
	@Autowired
	private SystemService systemService;
	@Autowired
	private Validator validator;
	


	/**
	 * 员工薪酬纪录表列表 页面跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "list")
	public ModelAndView list(HttpServletRequest request) {
		return new ModelAndView("com/jeecg/emppaymentinfo/empPaymentInfoList");
	}

	/**
	 * easyui AJAX请求数据
	 * 
	 * @param request
	 * @param response
	 * @param dataGrid
	 * @param user
	 */

	@RequestMapping(params = "datagrid")
	public void datagrid(EmpPaymentInfoEntity empPaymentInfo,HttpServletRequest request, HttpServletResponse response, DataGrid dataGrid) {
		CriteriaQuery cq = new CriteriaQuery(EmpPaymentInfoEntity.class, dataGrid);
		//查询条件组装器
		org.jeecgframework.core.extend.hqlsearch.HqlGenerateUtil.installHql(cq, empPaymentInfo, request.getParameterMap());
		this.empPaymentInfoService.getDataGridReturn(cq, true);
		TagUtil.datagrid(response, dataGrid);
	}

	/**
	 * 删除员工薪酬纪录表
	 * 
	 * @return
	 */
	@RequestMapping(params = "del")
	@ResponseBody
	public AjaxJson del(EmpPaymentInfoEntity empPaymentInfo, HttpServletRequest request) {
		String message = null;
		AjaxJson j = new AjaxJson();
		empPaymentInfo = systemService.getEntity(EmpPaymentInfoEntity.class, empPaymentInfo.getId());
		message = "员工薪酬纪录表删除成功";
		empPaymentInfoService.delete(empPaymentInfo);
		systemService.addLog(message, Globals.Log_Type_DEL, Globals.Log_Leavel_INFO);
		
		j.setMsg(message);
		return j;
	}


	/**
	 * 添加员工薪酬纪录表
	 * 
	 * @param ids
	 * @return
	 */
	@RequestMapping(params = "save")
	@ResponseBody
	public AjaxJson save(EmpPaymentInfoEntity empPaymentInfo, HttpServletRequest request) {
		String message = null;
		AjaxJson j = new AjaxJson();
		if (StringUtil.isNotEmpty(empPaymentInfo.getId())) {
			message = "员工薪酬纪录表更新成功";
			EmpPaymentInfoEntity t = empPaymentInfoService.get(EmpPaymentInfoEntity.class, empPaymentInfo.getId());
			try {
				MyBeanUtils.copyBeanNotNull2Bean(empPaymentInfo, t);
				empPaymentInfoService.saveOrUpdate(t);
				systemService.addLog(message, Globals.Log_Type_UPDATE, Globals.Log_Leavel_INFO);
			} catch (Exception e) {
				e.printStackTrace();
				message = "员工薪酬纪录表更新失败";
			}
		} else {
			message = "员工薪酬纪录表添加成功";
			empPaymentInfoService.save(empPaymentInfo);
			systemService.addLog(message, Globals.Log_Type_INSERT, Globals.Log_Leavel_INFO);
		}
		j.setMsg(message);
		return j;
	}

	/**
	 * 员工薪酬纪录表列表页面跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "addorupdate")
	public ModelAndView addorupdate(EmpPaymentInfoEntity empPaymentInfo, HttpServletRequest req) {
		if (StringUtil.isNotEmpty(empPaymentInfo.getId())) {
			empPaymentInfo = empPaymentInfoService.getEntity(EmpPaymentInfoEntity.class, empPaymentInfo.getId());
			req.setAttribute("empPaymentInfoPage", empPaymentInfo);
		}
		return new ModelAndView("com/jeecg/emppaymentinfo/empPaymentInfo");
	}
	
	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
	public List<EmpPaymentInfoEntity> list() {
		List<EmpPaymentInfoEntity> listEmpPaymentInfos=empPaymentInfoService.getList(EmpPaymentInfoEntity.class);
		return listEmpPaymentInfos;
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<?> get(@PathVariable("id") String id) {
		EmpPaymentInfoEntity task = empPaymentInfoService.get(EmpPaymentInfoEntity.class, id);
		if (task == null) {
			return new ResponseEntity(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity(task, HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ResponseEntity<?> create(@RequestBody EmpPaymentInfoEntity empPaymentInfo, UriComponentsBuilder uriBuilder) {
		//调用JSR303 Bean Validator进行校验，如果出错返回含400错误码及json格式的错误信息.
		Set<ConstraintViolation<EmpPaymentInfoEntity>> failures = validator.validate(empPaymentInfo);
		if (!failures.isEmpty()) {
			return new ResponseEntity(BeanValidators.extractPropertyAndMessage(failures), HttpStatus.BAD_REQUEST);
		}

		//保存
		empPaymentInfoService.save(empPaymentInfo);

		//按照Restful风格约定，创建指向新任务的url, 也可以直接返回id或对象.
		String id = empPaymentInfo.getId();
		URI uri = uriBuilder.path("/rest/empPaymentInfoController/" + id).build().toUri();
		HttpHeaders headers = new HttpHeaders();
		headers.setLocation(uri);

		return new ResponseEntity(headers, HttpStatus.CREATED);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> update(@RequestBody EmpPaymentInfoEntity empPaymentInfo) {
		//调用JSR303 Bean Validator进行校验，如果出错返回含400错误码及json格式的错误信息.
		Set<ConstraintViolation<EmpPaymentInfoEntity>> failures = validator.validate(empPaymentInfo);
		if (!failures.isEmpty()) {
			return new ResponseEntity(BeanValidators.extractPropertyAndMessage(failures), HttpStatus.BAD_REQUEST);
		}

		//保存
		empPaymentInfoService.saveOrUpdate(empPaymentInfo);

		//按Restful约定，返回204状态码, 无内容. 也可以返回200状态码.
		return new ResponseEntity(HttpStatus.NO_CONTENT);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable("id") String id) {
		empPaymentInfoService.deleteEntityById(EmpPaymentInfoEntity.class, id);
	}
}
