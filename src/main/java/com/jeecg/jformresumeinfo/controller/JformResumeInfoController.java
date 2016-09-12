package com.jeecg.jformresumeinfo.controller;
import com.jeecg.jformresumeinfo.entity.JformResumeInfoEntity;
import com.jeecg.jformresumeinfo.service.JformResumeInfoServiceI;
import com.jeecg.jformresumeinfo.page.JformResumeInfoPage;
import com.jeecg.jformresumetraininfo.entity.JformResumeTrainInfoEntity;
import com.jeecg.jformresumedegreeinfo.entity.JformResumeDegreeInfoEntity;
import com.jeecg.jformresumeexpinfo.entity.JformResumeExpInfoEntity;
import com.jeecg.jformresumefamilyinfo.entity.JformResumeFamilyInfoEntity;
import java.util.ArrayList;
import java.util.List;
import java.text.SimpleDateFormat;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import org.jeecgframework.core.common.controller.BaseController;
import org.jeecgframework.core.common.exception.BusinessException;
import org.jeecgframework.core.common.hibernate.qbc.CriteriaQuery;
import org.jeecgframework.core.common.model.json.AjaxJson;
import org.jeecgframework.core.common.model.json.DataGrid;
import org.jeecgframework.core.constant.Globals;
import org.jeecgframework.core.util.ExceptionUtil;
import org.jeecgframework.core.util.ResourceUtil;
import org.jeecgframework.core.util.StringUtil;
import org.jeecgframework.core.util.oConvertUtils;
import org.jeecgframework.tag.core.easyui.TagUtil;
import org.jeecgframework.web.system.pojo.base.TSDepart;
import org.jeecgframework.web.system.service.SystemService;
import org.jeecgframework.core.util.MyBeanUtils;
import org.jeecgframework.poi.excel.ExcelImportUtil;
import org.jeecgframework.poi.excel.entity.ExportParams;
import org.jeecgframework.poi.excel.entity.ImportParams;
import org.jeecgframework.poi.excel.entity.vo.NormalExcelConstants;
import org.springframework.ui.ModelMap;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import java.io.IOException;
import java.util.Map;

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
 * @Description: 员工信息表
 * @author onlineGenerator
 * @date 2016-09-09 07:20:45
 * @version V1.0   
 *
 */
@Controller
@RequestMapping("/jformResumeInfoController")
public class JformResumeInfoController extends BaseController {
	/**
	 * Logger for this class
	 */
	private static final Logger logger = Logger.getLogger(JformResumeInfoController.class);

	@Autowired
	private JformResumeInfoServiceI jformResumeInfoService;
	@Autowired
	private SystemService systemService;
	@Autowired
	private Validator validator;

	
	
	/**
	 * 用户选择员工跳转页面
	 * 
	 * @return
	 */
	@RequestMapping(params = "lists")
	public ModelAndView lists(HttpServletRequest request) {
		ModelAndView mv = new ModelAndView("com/jeecg/jformresumeinfo/resumeInfos");
		String ids = oConvertUtils.getString(request.getParameter("ids"));
		mv.addObject("ids", ids);
		return mv;
	}
	/**
	 * 员工信息表列表 页面跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "list")
	public ModelAndView list(HttpServletRequest request) {
		return new ModelAndView("com/jeecg/jformresumeinfo/jformResumeInfoList");
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
	public void datagrid(JformResumeInfoEntity jformResumeInfo,HttpServletRequest request, HttpServletResponse response, DataGrid dataGrid) {
		CriteriaQuery cq = new CriteriaQuery(JformResumeInfoEntity.class, dataGrid);
		//查询条件组装器
		org.jeecgframework.core.extend.hqlsearch.HqlGenerateUtil.installHql(cq, jformResumeInfo);
		try{
		//自定义追加查询条件
		}catch (Exception e) {
			throw new BusinessException(e.getMessage());
		}
		cq.add();
		this.jformResumeInfoService.getDataGridReturn(cq, true);
		TagUtil.datagrid(response, dataGrid);
	}

	/**
	 * 删除员工信息表
	 * 
	 * @return
	 */
	@RequestMapping(params = "doDel")
	@ResponseBody
	public AjaxJson doDel(JformResumeInfoEntity jformResumeInfo, HttpServletRequest request) {
		AjaxJson j = new AjaxJson();
		jformResumeInfo = systemService.getEntity(JformResumeInfoEntity.class, jformResumeInfo.getId());
		String message = "员工信息表删除成功";
		try{
			jformResumeInfoService.delMain(jformResumeInfo);
			systemService.addLog(message, Globals.Log_Type_DEL, Globals.Log_Leavel_INFO);
		}catch(Exception e){
			e.printStackTrace();
			message = "员工信息表删除失败";
			throw new BusinessException(e.getMessage());
		}
		j.setMsg(message);
		return j;
	}

	/**
	 * 批量删除员工信息表
	 * 
	 * @return
	 */
	 @RequestMapping(params = "doBatchDel")
	@ResponseBody
	public AjaxJson doBatchDel(String ids,HttpServletRequest request){
		AjaxJson j = new AjaxJson();
		String message = "员工信息表删除成功";
		try{
			for(String id:ids.split(",")){
				JformResumeInfoEntity jformResumeInfo = systemService.getEntity(JformResumeInfoEntity.class,
				id
				);
				jformResumeInfoService.delMain(jformResumeInfo);
				systemService.addLog(message, Globals.Log_Type_DEL, Globals.Log_Leavel_INFO);
			}
		}catch(Exception e){
			e.printStackTrace();
			message = "员工信息表删除失败";
			throw new BusinessException(e.getMessage());
		}
		j.setMsg(message);
		return j;
	}

	/**
	 * 添加员工信息表
	 * 
	 * @param ids
	 * @return
	 */
	@RequestMapping(params = "doAdd")
	@ResponseBody
	public AjaxJson doAdd(JformResumeInfoEntity jformResumeInfo,JformResumeInfoPage jformResumeInfoPage, HttpServletRequest request) {
		List<JformResumeTrainInfoEntity> jformResumeTrainInfoList =  jformResumeInfoPage.getJformResumeTrainInfoList();
		List<JformResumeDegreeInfoEntity> jformResumeDegreeInfoList =  jformResumeInfoPage.getJformResumeDegreeInfoList();
		List<JformResumeExpInfoEntity> jformResumeExpInfoList =  jformResumeInfoPage.getJformResumeExpInfoList();
		List<JformResumeFamilyInfoEntity> jformResumeFamilyInfoList =  jformResumeInfoPage.getJformResumeFamilyInfoList();
		AjaxJson j = new AjaxJson();
		String message = "添加成功";
		try{
			jformResumeInfoService.addMain(jformResumeInfo, jformResumeTrainInfoList,jformResumeDegreeInfoList,jformResumeExpInfoList,jformResumeFamilyInfoList);
			systemService.addLog(message, Globals.Log_Type_INSERT, Globals.Log_Leavel_INFO);
		}catch(Exception e){
			e.printStackTrace();
			message = "员工信息表添加失败";
			throw new BusinessException(e.getMessage());
		}
		j.setMsg(message);
		return j;
	}
	/**
	 * 更新员工信息表
	 * 
	 * @param ids
	 * @return
	 */
	@RequestMapping(params = "doUpdate")
	@ResponseBody
	public AjaxJson doUpdate(JformResumeInfoEntity jformResumeInfo,JformResumeInfoPage jformResumeInfoPage, HttpServletRequest request) {
		List<JformResumeTrainInfoEntity> jformResumeTrainInfoList =  jformResumeInfoPage.getJformResumeTrainInfoList();
		List<JformResumeDegreeInfoEntity> jformResumeDegreeInfoList =  jformResumeInfoPage.getJformResumeDegreeInfoList();
		List<JformResumeExpInfoEntity> jformResumeExpInfoList =  jformResumeInfoPage.getJformResumeExpInfoList();
		List<JformResumeFamilyInfoEntity> jformResumeFamilyInfoList =  jformResumeInfoPage.getJformResumeFamilyInfoList();
		AjaxJson j = new AjaxJson();
		String message = "更新成功";
		try{
			jformResumeInfoService.updateMain(jformResumeInfo, jformResumeTrainInfoList,jformResumeDegreeInfoList,jformResumeExpInfoList,jformResumeFamilyInfoList);
			systemService.addLog(message, Globals.Log_Type_UPDATE, Globals.Log_Leavel_INFO);
		}catch(Exception e){
			e.printStackTrace();
			message = "更新员工信息表失败";
			throw new BusinessException(e.getMessage());
		}
		j.setMsg(message);
		return j;
	}

	/**
	 * 员工信息表新增页面跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "goAdd")
	public ModelAndView goAdd(JformResumeInfoEntity jformResumeInfo, HttpServletRequest req) {
		if (StringUtil.isNotEmpty(jformResumeInfo.getId())) {
			jformResumeInfo = jformResumeInfoService.getEntity(JformResumeInfoEntity.class, jformResumeInfo.getId());
			req.setAttribute("jformResumeInfoPage", jformResumeInfo);
		}
		return new ModelAndView("com/jeecg/jformresumeinfo/jformResumeInfo-add");
	}
	
	/**
	 * 员工信息表编辑页面跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "goUpdate")
	public ModelAndView goUpdate(JformResumeInfoEntity jformResumeInfo, HttpServletRequest req) {
		if (StringUtil.isNotEmpty(jformResumeInfo.getId())) {
			jformResumeInfo = jformResumeInfoService.getEntity(JformResumeInfoEntity.class, jformResumeInfo.getId());
			req.setAttribute("jformResumeInfoPage", jformResumeInfo);
		}
		return new ModelAndView("com/jeecg/jformresumeinfo/jformResumeInfo-update");
	}
	
	
	/**
	 * 加载明细列表[培训]
	 * 
	 * @return
	 */
	@RequestMapping(params = "jformResumeTrainInfoList")
	public ModelAndView jformResumeTrainInfoList(JformResumeInfoEntity jformResumeInfo, HttpServletRequest req) {
	
		//===================================================================================
		//获取参数
		Object id0 = jformResumeInfo.getId();
		//===================================================================================
		//查询-培训
	    String hql0 = "from JformResumeTrainInfoEntity where 1 = 1 AND rESUME_ID = ? ";
	    try{
	    	List<JformResumeTrainInfoEntity> jformResumeTrainInfoEntityList = systemService.findHql(hql0,id0);
			req.setAttribute("jformResumeTrainInfoList", jformResumeTrainInfoEntityList);
		}catch(Exception e){
			logger.info(e.getMessage());
		}
		return new ModelAndView("com/jeecg/jformresumetraininfo/jformResumeTrainInfoList");
	}
	/**
	 * 加载明细列表[学历]
	 * 
	 * @return
	 */
	@RequestMapping(params = "jformResumeDegreeInfoList")
	public ModelAndView jformResumeDegreeInfoList(JformResumeInfoEntity jformResumeInfo, HttpServletRequest req) {
	
		//===================================================================================
		//获取参数
		Object id1 = jformResumeInfo.getId();
		//===================================================================================
		//查询-学历
	    String hql1 = "from JformResumeDegreeInfoEntity where 1 = 1 AND rESUME_ID = ? ";
	    try{
	    	List<JformResumeDegreeInfoEntity> jformResumeDegreeInfoEntityList = systemService.findHql(hql1,id1);
			req.setAttribute("jformResumeDegreeInfoList", jformResumeDegreeInfoEntityList);
		}catch(Exception e){
			logger.info(e.getMessage());
		}
		return new ModelAndView("com/jeecg/jformresumedegreeinfo/jformResumeDegreeInfoList");
	}
	/**
	 * 加载明细列表[经历]
	 * 
	 * @return
	 */
	@RequestMapping(params = "jformResumeExpInfoList")
	public ModelAndView jformResumeExpInfoList(JformResumeInfoEntity jformResumeInfo, HttpServletRequest req) {
	
		//===================================================================================
		//获取参数
		Object id2 = jformResumeInfo.getId();
		//===================================================================================
		//查询-经历
	    String hql2 = "from JformResumeExpInfoEntity where 1 = 1 AND rESUME_ID = ? ";
	    try{
	    	List<JformResumeExpInfoEntity> jformResumeExpInfoEntityList = systemService.findHql(hql2,id2);
			req.setAttribute("jformResumeExpInfoList", jformResumeExpInfoEntityList);
		}catch(Exception e){
			logger.info(e.getMessage());
		}
		return new ModelAndView("com/jeecg/jformresumeexpinfo/jformResumeExpInfoList");
	}
	/**
	 * 加载明细列表[家庭成员]
	 * 
	 * @return
	 */
	@RequestMapping(params = "jformResumeFamilyInfoList")
	public ModelAndView jformResumeFamilyInfoList(JformResumeInfoEntity jformResumeInfo, HttpServletRequest req) {
	
		//===================================================================================
		//获取参数
		Object id3 = jformResumeInfo.getId();
		//===================================================================================
		//查询-家庭成员
	    String hql3 = "from JformResumeFamilyInfoEntity where 1 = 1 AND rESUME_ID = ? ";
	    try{
	    	List<JformResumeFamilyInfoEntity> jformResumeFamilyInfoEntityList = systemService.findHql(hql3,id3);
			req.setAttribute("jformResumeFamilyInfoList", jformResumeFamilyInfoEntityList);
		}catch(Exception e){
			logger.info(e.getMessage());
		}
		return new ModelAndView("com/jeecg/jformresumefamilyinfo/jformResumeFamilyInfoList");
	}

    /**
    * 导出excel
    *
    * @param request
    * @param response
    */
    @RequestMapping(params = "exportXls")
    public String exportXls(JformResumeInfoEntity jformResumeInfo,HttpServletRequest request, HttpServletResponse response, DataGrid dataGrid,ModelMap map) {
    	CriteriaQuery cq = new CriteriaQuery(JformResumeInfoEntity.class, dataGrid);
    	//查询条件组装器
    	org.jeecgframework.core.extend.hqlsearch.HqlGenerateUtil.installHql(cq, jformResumeInfo);
    	try{
    	//自定义追加查询条件
    	}catch (Exception e) {
    		throw new BusinessException(e.getMessage());
    	}
    	cq.add();
    	List<JformResumeInfoEntity> list=this.jformResumeInfoService.getListByCriteriaQuery(cq, false);
    	List<JformResumeInfoPage> pageList=new ArrayList<JformResumeInfoPage>();
        if(list!=null&&list.size()>0){
        	for(JformResumeInfoEntity entity:list){
        		try{
        		JformResumeInfoPage page=new JformResumeInfoPage();
        		   MyBeanUtils.copyBeanNotNull2Bean(entity,page);
            	    Object id0 = entity.getId();
				    String hql0 = "from JformResumeTrainInfoEntity where 1 = 1 AND rESUME_ID = ? ";
        	        List<JformResumeTrainInfoEntity> jformResumeTrainInfoEntityList = systemService.findHql(hql0,id0);
            		page.setJformResumeTrainInfoList(jformResumeTrainInfoEntityList);
            	    Object id1 = entity.getId();
				    String hql1 = "from JformResumeDegreeInfoEntity where 1 = 1 AND rESUME_ID = ? ";
        	        List<JformResumeDegreeInfoEntity> jformResumeDegreeInfoEntityList = systemService.findHql(hql1,id1);
            		page.setJformResumeDegreeInfoList(jformResumeDegreeInfoEntityList);
            	    Object id2 = entity.getId();
				    String hql2 = "from JformResumeExpInfoEntity where 1 = 1 AND rESUME_ID = ? ";
        	        List<JformResumeExpInfoEntity> jformResumeExpInfoEntityList = systemService.findHql(hql2,id2);
            		page.setJformResumeExpInfoList(jformResumeExpInfoEntityList);
            	    Object id3 = entity.getId();
				    String hql3 = "from JformResumeFamilyInfoEntity where 1 = 1 AND rESUME_ID = ? ";
        	        List<JformResumeFamilyInfoEntity> jformResumeFamilyInfoEntityList = systemService.findHql(hql3,id3);
            		page.setJformResumeFamilyInfoList(jformResumeFamilyInfoEntityList);
            		pageList.add(page);
            	}catch(Exception e){
            		logger.info(e.getMessage());
            	}
            }
        }
        map.put(NormalExcelConstants.FILE_NAME,"员工信息表");
        map.put(NormalExcelConstants.CLASS,JformResumeInfoPage.class);
        map.put(NormalExcelConstants.PARAMS,new ExportParams("员工信息表列表", "导出人:Jeecg",
            "导出信息"));
        map.put(NormalExcelConstants.DATA_LIST,pageList);
        return NormalExcelConstants.JEECG_EXCEL_VIEW;
	}

    /**
	 * 通过excel导入数据
	 * @param request
	 * @param
	 * @return
	 */
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
			params.setHeadRows(2);
			params.setNeedSave(true);
			try {
				List<JformResumeInfoPage> list =  ExcelImportUtil.importExcel(file.getInputStream(), JformResumeInfoPage.class, params);
				JformResumeInfoEntity entity1=null;
				for (JformResumeInfoPage page : list) {
					entity1=new JformResumeInfoEntity();
					MyBeanUtils.copyBeanNotNull2Bean(page,entity1);
		            jformResumeInfoService.addMain(entity1, page.getJformResumeTrainInfoList(),page.getJformResumeDegreeInfoList(),page.getJformResumeExpInfoList(),page.getJformResumeFamilyInfoList());
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
	/**
	* 导出excel 使模板
	*/
	@RequestMapping(params = "exportXlsByT")
	public String exportXlsByT(ModelMap map) {
		map.put(NormalExcelConstants.FILE_NAME,"员工信息表");
		map.put(NormalExcelConstants.CLASS,JformResumeInfoPage.class);
		map.put(NormalExcelConstants.PARAMS,new ExportParams("员工信息表列表", "导出人:"+ ResourceUtil.getSessionUserName().getRealName(),
		"导出信息"));
		map.put(NormalExcelConstants.DATA_LIST,new ArrayList());
		return NormalExcelConstants.JEECG_EXCEL_VIEW;
	}
	/**
	* 导入功能跳转
	*
	* @return
	*/
	@RequestMapping(params = "upload")
	public ModelAndView upload(HttpServletRequest req) {
		req.setAttribute("controller_name", "jformResumeInfoController");
		return new ModelAndView("common/upload/pub_excel_upload");
	}

 	
 	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
	public List<JformResumeInfoEntity> list() {
		List<JformResumeInfoEntity> listJformResumeInfos=jformResumeInfoService.getList(JformResumeInfoEntity.class);
		return listJformResumeInfos;
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<?> get(@PathVariable("id") String id) {
		JformResumeInfoEntity task = jformResumeInfoService.get(JformResumeInfoEntity.class, id);
		if (task == null) {
			return new ResponseEntity(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity(task, HttpStatus.OK);
	}
 	
 	@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ResponseEntity<?> create(@RequestBody JformResumeInfoPage jformResumeInfoPage, UriComponentsBuilder uriBuilder) {
		//调用JSR303 Bean Validator进行校验，如果出错返回含400错误码及json格式的错误信息.
		Set<ConstraintViolation<JformResumeInfoPage>> failures = validator.validate(jformResumeInfoPage);
		if (!failures.isEmpty()) {
			return new ResponseEntity(BeanValidators.extractPropertyAndMessage(failures), HttpStatus.BAD_REQUEST);
		}

		//保存
		List<JformResumeTrainInfoEntity> jformResumeTrainInfoList =  jformResumeInfoPage.getJformResumeTrainInfoList();
		List<JformResumeDegreeInfoEntity> jformResumeDegreeInfoList =  jformResumeInfoPage.getJformResumeDegreeInfoList();
		List<JformResumeExpInfoEntity> jformResumeExpInfoList =  jformResumeInfoPage.getJformResumeExpInfoList();
		List<JformResumeFamilyInfoEntity> jformResumeFamilyInfoList =  jformResumeInfoPage.getJformResumeFamilyInfoList();
		
		JformResumeInfoEntity jformResumeInfo = new JformResumeInfoEntity();
		try{
			MyBeanUtils.copyBeanNotNull2Bean(jformResumeInfo,jformResumeInfoPage);
		}catch(Exception e){
            logger.info(e.getMessage());
        }
		jformResumeInfoService.addMain(jformResumeInfo, jformResumeTrainInfoList,jformResumeDegreeInfoList,jformResumeExpInfoList,jformResumeFamilyInfoList);

		//按照Restful风格约定，创建指向新任务的url, 也可以直接返回id或对象.
		String id = jformResumeInfoPage.getId();
		URI uri = uriBuilder.path("/rest/jformResumeInfoController/" + id).build().toUri();
		HttpHeaders headers = new HttpHeaders();
		headers.setLocation(uri);

		return new ResponseEntity(headers, HttpStatus.CREATED);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> update(@RequestBody JformResumeInfoPage jformResumeInfoPage) {
		//调用JSR303 Bean Validator进行校验，如果出错返回含400错误码及json格式的错误信息.
		Set<ConstraintViolation<JformResumeInfoPage>> failures = validator.validate(jformResumeInfoPage);
		if (!failures.isEmpty()) {
			return new ResponseEntity(BeanValidators.extractPropertyAndMessage(failures), HttpStatus.BAD_REQUEST);
		}

		//保存
		List<JformResumeTrainInfoEntity> jformResumeTrainInfoList =  jformResumeInfoPage.getJformResumeTrainInfoList();
		List<JformResumeDegreeInfoEntity> jformResumeDegreeInfoList =  jformResumeInfoPage.getJformResumeDegreeInfoList();
		List<JformResumeExpInfoEntity> jformResumeExpInfoList =  jformResumeInfoPage.getJformResumeExpInfoList();
		List<JformResumeFamilyInfoEntity> jformResumeFamilyInfoList =  jformResumeInfoPage.getJformResumeFamilyInfoList();
		
		JformResumeInfoEntity jformResumeInfo = new JformResumeInfoEntity();
		try{
			MyBeanUtils.copyBeanNotNull2Bean(jformResumeInfo,jformResumeInfoPage);
		}catch(Exception e){
            logger.info(e.getMessage());
        }
		jformResumeInfoService.updateMain(jformResumeInfo, jformResumeTrainInfoList,jformResumeDegreeInfoList,jformResumeExpInfoList,jformResumeFamilyInfoList);

		//按Restful约定，返回204状态码, 无内容. 也可以返回200状态码.
		return new ResponseEntity(HttpStatus.NO_CONTENT);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable("id") String id) {
		JformResumeInfoEntity jformResumeInfo = jformResumeInfoService.get(JformResumeInfoEntity.class, id);
		jformResumeInfoService.delMain(jformResumeInfo);
	}
}
