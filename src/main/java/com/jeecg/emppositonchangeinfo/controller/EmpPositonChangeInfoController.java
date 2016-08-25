package com.jeecg.emppositonchangeinfo.controller;
import com.jeecg.emppositonchangeinfo.entity.EmpPositonChangeInfoEntity;
import com.jeecg.emppositonchangeinfo.service.EmpPositonChangeInfoServiceI;
import java.util.ArrayList;
import java.util.List;
import java.text.SimpleDateFormat;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import org.jeecgframework.core.common.controller.BaseController;
import org.jeecgframework.core.common.exception.BusinessException;
import org.jeecgframework.core.common.hibernate.qbc.CriteriaQuery;
import org.jeecgframework.core.common.model.json.AjaxJson;
import org.jeecgframework.core.common.model.json.DataGrid;
import org.jeecgframework.core.constant.Globals;
import org.jeecgframework.core.util.StringUtil;
import org.jeecgframework.tag.core.easyui.TagUtil;
import org.jeecgframework.web.system.pojo.base.TSDepart;
import org.jeecgframework.web.system.service.SystemService;
import org.jeecgframework.core.util.MyBeanUtils;

import java.io.OutputStream;
import org.jeecgframework.core.util.BrowserUtils;
import org.jeecgframework.poi.excel.ExcelExportUtil;
import org.jeecgframework.poi.excel.ExcelImportUtil;
import org.jeecgframework.poi.excel.entity.ExportParams;
import org.jeecgframework.poi.excel.entity.ImportParams;
import org.jeecgframework.poi.excel.entity.TemplateExportParams;
import org.jeecgframework.poi.excel.entity.vo.NormalExcelConstants;
import org.jeecgframework.poi.excel.entity.vo.TemplateExcelConstants;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.jeecgframework.core.util.ResourceUtil;
import java.io.IOException;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import java.util.Map;
import org.jeecgframework.core.util.ExceptionUtil;

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
 * @Description: 人事调动信息表
 * @author onlineGenerator
 * @date 2016-07-18 23:20:26
 * @version V1.0   
 *
 */
@Controller
@RequestMapping("/empPositonChangeInfoController")
public class EmpPositonChangeInfoController extends BaseController {
	/**
	 * Logger for this class
	 */
	private static final Logger logger = Logger.getLogger(EmpPositonChangeInfoController.class);

	@Autowired
	private EmpPositonChangeInfoServiceI empPositonChangeInfoService;
	@Autowired
	private SystemService systemService;
	@Autowired
	private Validator validator;
	


	/**
	 * 人事调动信息表列表 页面跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "list")
	public ModelAndView list(HttpServletRequest request) {
		return new ModelAndView("com/jeecg/emppositonchangeinfo/empPositonChangeInfoList");
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
	public void datagrid(EmpPositonChangeInfoEntity empPositonChangeInfo,HttpServletRequest request, HttpServletResponse response, DataGrid dataGrid) {
		CriteriaQuery cq = new CriteriaQuery(EmpPositonChangeInfoEntity.class, dataGrid);
		//查询条件组装器
		org.jeecgframework.core.extend.hqlsearch.HqlGenerateUtil.installHql(cq, empPositonChangeInfo, request.getParameterMap());
		try{
		//自定义追加查询条件
		String query_changeDate_begin = request.getParameter("changeDate_begin");
		String query_changeDate_end = request.getParameter("changeDate_end");
		if(StringUtil.isNotEmpty(query_changeDate_begin)){
			cq.ge("changeDate", new SimpleDateFormat("yyyy-MM-dd").parse(query_changeDate_begin));
		}
		if(StringUtil.isNotEmpty(query_changeDate_end)){
			cq.le("changeDate", new SimpleDateFormat("yyyy-MM-dd").parse(query_changeDate_end));
		}
		}catch (Exception e) {
			throw new BusinessException(e.getMessage());
		}
		cq.add();
		this.empPositonChangeInfoService.getDataGridReturn(cq, true);
		TagUtil.datagrid(response, dataGrid);
	}

	/**
	 * 删除人事调动信息表
	 * 
	 * @return
	 */
	@RequestMapping(params = "doDel")
	@ResponseBody
	public AjaxJson doDel(EmpPositonChangeInfoEntity empPositonChangeInfo, HttpServletRequest request) {
		String message = null;
		AjaxJson j = new AjaxJson();
		empPositonChangeInfo = systemService.getEntity(EmpPositonChangeInfoEntity.class, empPositonChangeInfo.getId());
		message = "人事调动信息表删除成功";
		try{
			empPositonChangeInfoService.delete(empPositonChangeInfo);
			systemService.addLog(message, Globals.Log_Type_DEL, Globals.Log_Leavel_INFO);
		}catch(Exception e){
			e.printStackTrace();
			message = "人事调动信息表删除失败";
			throw new BusinessException(e.getMessage());
		}
		j.setMsg(message);
		return j;
	}
	
	/**
	 * 批量删除人事调动信息表
	 * 
	 * @return
	 */
	 @RequestMapping(params = "doBatchDel")
	@ResponseBody
	public AjaxJson doBatchDel(String ids,HttpServletRequest request){
		String message = null;
		AjaxJson j = new AjaxJson();
		message = "人事调动信息表删除成功";
		try{
			for(String id:ids.split(",")){
				EmpPositonChangeInfoEntity empPositonChangeInfo = systemService.getEntity(EmpPositonChangeInfoEntity.class, 
				id
				);
				empPositonChangeInfoService.delete(empPositonChangeInfo);
				systemService.addLog(message, Globals.Log_Type_DEL, Globals.Log_Leavel_INFO);
			}
		}catch(Exception e){
			e.printStackTrace();
			message = "人事调动信息表删除失败";
			throw new BusinessException(e.getMessage());
		}
		j.setMsg(message);
		return j;
	}


	/**
	 * 添加人事调动信息表
	 * 
	 * @param ids
	 * @return
	 */
	@RequestMapping(params = "doAdd")
	@ResponseBody
	public AjaxJson doAdd(EmpPositonChangeInfoEntity empPositonChangeInfo, HttpServletRequest request) {
		String message = null;
		AjaxJson j = new AjaxJson();
		message = "人事调动信息表添加成功";
		try{
			empPositonChangeInfoService.save(empPositonChangeInfo);
			systemService.addLog(message, Globals.Log_Type_INSERT, Globals.Log_Leavel_INFO);
		}catch(Exception e){
			e.printStackTrace();
			message = "人事调动信息表添加失败";
			throw new BusinessException(e.getMessage());
		}
		j.setMsg(message);
		return j;
	}
	
	/**
	 * 更新人事调动信息表
	 * 
	 * @param ids
	 * @return
	 */
	@RequestMapping(params = "doUpdate")
	@ResponseBody
	public AjaxJson doUpdate(EmpPositonChangeInfoEntity empPositonChangeInfo, HttpServletRequest request) {
		String message = null;
		AjaxJson j = new AjaxJson();
		message = "人事调动信息表更新成功";
		EmpPositonChangeInfoEntity t = empPositonChangeInfoService.get(EmpPositonChangeInfoEntity.class, empPositonChangeInfo.getId());
		try {
			MyBeanUtils.copyBeanNotNull2Bean(empPositonChangeInfo, t);
			empPositonChangeInfoService.saveOrUpdate(t);
			systemService.addLog(message, Globals.Log_Type_UPDATE, Globals.Log_Leavel_INFO);
		} catch (Exception e) {
			e.printStackTrace();
			message = "人事调动信息表更新失败";
			throw new BusinessException(e.getMessage());
		}
		j.setMsg(message);
		return j;
	}
	

	/**
	 * 人事调动信息表新增页面跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "goAdd")
	public ModelAndView goAdd(EmpPositonChangeInfoEntity empPositonChangeInfo, HttpServletRequest req) {
		if (StringUtil.isNotEmpty(empPositonChangeInfo.getId())) {
			empPositonChangeInfo = empPositonChangeInfoService.getEntity(EmpPositonChangeInfoEntity.class, empPositonChangeInfo.getId());
			req.setAttribute("empPositonChangeInfoPage", empPositonChangeInfo);
		}
		return new ModelAndView("com/jeecg/emppositonchangeinfo/empPositonChangeInfo-add");
	}
	/**
	 * 人事调动信息表编辑页面跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "goUpdate")
	public ModelAndView goUpdate(EmpPositonChangeInfoEntity empPositonChangeInfo, HttpServletRequest req) {
		if (StringUtil.isNotEmpty(empPositonChangeInfo.getId())) {
			empPositonChangeInfo = empPositonChangeInfoService.getEntity(EmpPositonChangeInfoEntity.class, empPositonChangeInfo.getId());
			req.setAttribute("empPositonChangeInfoPage", empPositonChangeInfo);
		}
		return new ModelAndView("com/jeecg/emppositonchangeinfo/empPositonChangeInfo-update");
	}
	
	/**
	 * 导入功能跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "upload")
	public ModelAndView upload(HttpServletRequest req) {
		req.setAttribute("controller_name","empPositonChangeInfoController");
		return new ModelAndView("common/upload/pub_excel_upload");
	}
	
	/**
	 * 导出excel
	 * 
	 * @param request
	 * @param response
	 */
	@RequestMapping(params = "exportXls")
	public String exportXls(EmpPositonChangeInfoEntity empPositonChangeInfo,HttpServletRequest request,HttpServletResponse response
			, DataGrid dataGrid,ModelMap modelMap) {
		CriteriaQuery cq = new CriteriaQuery(EmpPositonChangeInfoEntity.class, dataGrid);
		org.jeecgframework.core.extend.hqlsearch.HqlGenerateUtil.installHql(cq, empPositonChangeInfo, request.getParameterMap());
		List<EmpPositonChangeInfoEntity> empPositonChangeInfos = this.empPositonChangeInfoService.getListByCriteriaQuery(cq,false);
		modelMap.put(NormalExcelConstants.FILE_NAME,"人事调动信息表");
		modelMap.put(NormalExcelConstants.CLASS,EmpPositonChangeInfoEntity.class);
		modelMap.put(NormalExcelConstants.PARAMS,new ExportParams("人事调动信息表列表", "导出人:"+ResourceUtil.getSessionUserName().getRealName(),
			"导出信息"));
		modelMap.put(NormalExcelConstants.DATA_LIST,empPositonChangeInfos);
		return NormalExcelConstants.JEECG_EXCEL_VIEW;
	}
	/**
	 * 导出excel 使模板
	 * 
	 * @param request
	 * @param response
	 */
	@RequestMapping(params = "exportXlsByT")
	public String exportXlsByT(EmpPositonChangeInfoEntity empPositonChangeInfo,HttpServletRequest request,HttpServletResponse response
			, DataGrid dataGrid,ModelMap modelMap) {
    	modelMap.put(NormalExcelConstants.FILE_NAME,"人事调动信息表");
    	modelMap.put(NormalExcelConstants.CLASS,EmpPositonChangeInfoEntity.class);
    	modelMap.put(NormalExcelConstants.PARAMS,new ExportParams("人事调动信息表列表", "导出人:"+ResourceUtil.getSessionUserName().getRealName(),
    	"导出信息"));
    	modelMap.put(NormalExcelConstants.DATA_LIST,new ArrayList());
    	return NormalExcelConstants.JEECG_EXCEL_VIEW;
	}
	
	@SuppressWarnings("unchecked")
	@RequestMapping(params = "importExcel", method = RequestMethod.POST)
	@ResponseBody
	public AjaxJson importExcel(HttpServletRequest request, HttpServletResponse response) {
		AjaxJson j = new AjaxJson();
		
		MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;
		Map<String, MultipartFile> fileMap = multipartRequest.getFileMap();
		for (Map.Entry<String, MultipartFile> entity : fileMap.entrySet()) {
			MultipartFile file = entity.getValue();// 获取上传文件对象
			ImportParams params = new ImportParams();
			params.setTitleRows(2);
			params.setHeadRows(1);
			params.setNeedSave(true);
			try {
				List<EmpPositonChangeInfoEntity> listEmpPositonChangeInfoEntitys = ExcelImportUtil.importExcel(file.getInputStream(),EmpPositonChangeInfoEntity.class,params);
				for (EmpPositonChangeInfoEntity empPositonChangeInfo : listEmpPositonChangeInfoEntitys) {
					empPositonChangeInfoService.save(empPositonChangeInfo);
				}
				j.setMsg("文件导入成功！");
			} catch (Exception e) {
				j.setMsg("文件导入失败！");
				logger.error(ExceptionUtil.getExceptionMessage(e));
			}finally{
				try {
					file.getInputStream().close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return j;
	}
	
	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
	public List<EmpPositonChangeInfoEntity> list() {
		List<EmpPositonChangeInfoEntity> listEmpPositonChangeInfos=empPositonChangeInfoService.getList(EmpPositonChangeInfoEntity.class);
		return listEmpPositonChangeInfos;
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<?> get(@PathVariable("id") String id) {
		EmpPositonChangeInfoEntity task = empPositonChangeInfoService.get(EmpPositonChangeInfoEntity.class, id);
		if (task == null) {
			return new ResponseEntity(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity(task, HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ResponseEntity<?> create(@RequestBody EmpPositonChangeInfoEntity empPositonChangeInfo, UriComponentsBuilder uriBuilder) {
		//调用JSR303 Bean Validator进行校验，如果出错返回含400错误码及json格式的错误信息.
		Set<ConstraintViolation<EmpPositonChangeInfoEntity>> failures = validator.validate(empPositonChangeInfo);
		if (!failures.isEmpty()) {
			return new ResponseEntity(BeanValidators.extractPropertyAndMessage(failures), HttpStatus.BAD_REQUEST);
		}

		//保存
		empPositonChangeInfoService.save(empPositonChangeInfo);

		//按照Restful风格约定，创建指向新任务的url, 也可以直接返回id或对象.
		String id = empPositonChangeInfo.getId();
		URI uri = uriBuilder.path("/rest/empPositonChangeInfoController/" + id).build().toUri();
		HttpHeaders headers = new HttpHeaders();
		headers.setLocation(uri);

		return new ResponseEntity(headers, HttpStatus.CREATED);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> update(@RequestBody EmpPositonChangeInfoEntity empPositonChangeInfo) {
		//调用JSR303 Bean Validator进行校验，如果出错返回含400错误码及json格式的错误信息.
		Set<ConstraintViolation<EmpPositonChangeInfoEntity>> failures = validator.validate(empPositonChangeInfo);
		if (!failures.isEmpty()) {
			return new ResponseEntity(BeanValidators.extractPropertyAndMessage(failures), HttpStatus.BAD_REQUEST);
		}

		//保存
		empPositonChangeInfoService.saveOrUpdate(empPositonChangeInfo);

		//按Restful约定，返回204状态码, 无内容. 也可以返回200状态码.
		return new ResponseEntity(HttpStatus.NO_CONTENT);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable("id") String id) {
		empPositonChangeInfoService.deleteEntityById(EmpPositonChangeInfoEntity.class, id);
	}
}
