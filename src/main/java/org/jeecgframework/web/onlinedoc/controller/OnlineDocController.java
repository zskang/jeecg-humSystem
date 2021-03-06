package org.jeecgframework.web.onlinedoc.controller;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.jeecgframework.core.common.controller.BaseController;
import org.jeecgframework.core.common.exception.BusinessException;
import org.jeecgframework.core.common.hibernate.qbc.CriteriaQuery;
import org.jeecgframework.core.common.model.json.AjaxJson;
import org.jeecgframework.core.common.model.json.DataGrid;
import org.jeecgframework.core.constant.Globals;
import org.jeecgframework.core.util.ExceptionUtil;
import org.jeecgframework.core.util.MyBeanUtils;
import org.jeecgframework.core.util.ResourceUtil;
import org.jeecgframework.core.util.StringUtil;
import org.jeecgframework.poi.excel.ExcelImportUtil;
import org.jeecgframework.poi.excel.entity.ExportParams;
import org.jeecgframework.poi.excel.entity.ImportParams;
import org.jeecgframework.poi.excel.entity.vo.NormalExcelConstants;
import org.jeecgframework.tag.core.easyui.TagUtil;
import org.jeecgframework.web.onlinedoc.entity.OnlineDocEntity;
import org.jeecgframework.web.onlinedoc.service.OnlineDocServiceI;
import org.jeecgframework.web.system.service.SystemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;



/**   
 * @Title: Controller
 * @Description: 在线文档
 * @author onlineGenerator
 * @date 2016-03-19 15:49:59
 * @version V1.0   
 *
 */
//@Scope("prototype")
@Controller
@RequestMapping("/onlineDocController")
public class OnlineDocController extends BaseController {
	/**
	 * Logger for this class
	 */
	private static final Logger logger = Logger.getLogger(OnlineDocController.class);

	@Autowired
	private OnlineDocServiceI onlineDocService;
	@Autowired
	private SystemService systemService;


	/**
	 * 在线文档列表 页面跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "list")
	public ModelAndView list(HttpServletRequest request) {
		return new ModelAndView("jeecg/onlinedoc/onlineDocList");
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
	public void datagrid(OnlineDocEntity onlineDoc,HttpServletRequest request, HttpServletResponse response, DataGrid dataGrid) {
		CriteriaQuery cq = new CriteriaQuery(OnlineDocEntity.class, dataGrid);
		//查询条件组装器
		org.jeecgframework.core.extend.hqlsearch.HqlGenerateUtil.installHql(cq, onlineDoc, request.getParameterMap());
		try{
		//自定义追加查询条件
		}catch (Exception e) {
			throw new BusinessException(e.getMessage());
		}
		cq.add();
		this.onlineDocService.getDataGridReturn(cq, true);
		TagUtil.datagrid(response, dataGrid);
	}

	/**
	 * 删除在线文档
	 * 
	 * @return
	 */
	@RequestMapping(params = "doDel")
	@ResponseBody
	public AjaxJson doDel(OnlineDocEntity onlineDoc, HttpServletRequest request) {
		String message = null;
		AjaxJson j = new AjaxJson();
		onlineDoc = systemService.getEntity(OnlineDocEntity.class, onlineDoc.getId());
		message = "在线文档删除成功";
		try{
			onlineDocService.delete(onlineDoc);
			systemService.addLog(message, Globals.Log_Type_DEL, Globals.Log_Leavel_INFO);
		}catch(Exception e){
			e.printStackTrace();
			message = "在线文档删除失败";
			throw new BusinessException(e.getMessage());
		}
		j.setMsg(message);
		return j;
	}
	
	/**
	 * 批量删除在线文档
	 * 
	 * @return
	 */
	 @RequestMapping(params = "doBatchDel")
	@ResponseBody
	public AjaxJson doBatchDel(String ids,HttpServletRequest request){
		String message = null;
		AjaxJson j = new AjaxJson();
		message = "在线文档删除成功";
		try{
			for(String id:ids.split(",")){
				OnlineDocEntity onlineDoc = systemService.getEntity(OnlineDocEntity.class, 
				id
				);
				onlineDocService.delete(onlineDoc);
				systemService.addLog(message, Globals.Log_Type_DEL, Globals.Log_Leavel_INFO);
			}
		}catch(Exception e){
			e.printStackTrace();
			message = "在线文档删除失败";
			throw new BusinessException(e.getMessage());
		}
		j.setMsg(message);
		return j;
	}


	/**
	 * 添加在线文档
	 * 
	 * @param ids
	 * @return
	 */
	@RequestMapping(params = "doAdd")
	@ResponseBody
	public AjaxJson doAdd(OnlineDocEntity onlineDoc, HttpServletRequest request) {
		String message = null;
		AjaxJson j = new AjaxJson();
		message = "在线文档添加成功";
		try{
			onlineDocService.save(onlineDoc);
			systemService.addLog(message, Globals.Log_Type_INSERT, Globals.Log_Leavel_INFO);
		}catch(Exception e){
			e.printStackTrace();
			message = "在线文档添加失败";
			throw new BusinessException(e.getMessage());
		}
		j.setMsg(message);
		return j;
	}
	
	/**
	 * 更新在线文档
	 * 
	 * @param ids
	 * @return
	 */
	@RequestMapping(params = "doUpdate")
	@ResponseBody
	public AjaxJson doUpdate(OnlineDocEntity onlineDoc, HttpServletRequest request) {
		String message = null;
		AjaxJson j = new AjaxJson();
		message = "在线文档更新成功";
		OnlineDocEntity t = onlineDocService.get(OnlineDocEntity.class, onlineDoc.getId());
		try {
			MyBeanUtils.copyBeanNotNull2Bean(onlineDoc, t);
			onlineDocService.saveOrUpdate(t);
			systemService.addLog(message, Globals.Log_Type_UPDATE, Globals.Log_Leavel_INFO);
		} catch (Exception e) {
			e.printStackTrace();
			message = "在线文档更新失败";
			throw new BusinessException(e.getMessage());
		}
		j.setMsg(message);
		return j;
	}
	

	/**
	 * 在线文档新增页面跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "goAdd")
	public ModelAndView goAdd(OnlineDocEntity onlineDoc, HttpServletRequest req) {
		if (StringUtil.isNotEmpty(onlineDoc.getId())) {
			onlineDoc = onlineDocService.getEntity(OnlineDocEntity.class, onlineDoc.getId());
			req.setAttribute("onlineDocPage", onlineDoc);
		}
		return new ModelAndView("jeecg/onlinedoc/onlineDoc-add");
	}
	/**
	 * 在线文档编辑页面跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "goUpdate")
	public ModelAndView goUpdate(OnlineDocEntity onlineDoc, HttpServletRequest req) {
		if (StringUtil.isNotEmpty(onlineDoc.getId())) {
			onlineDoc = onlineDocService.getEntity(OnlineDocEntity.class, onlineDoc.getId());
			req.setAttribute("onlineDocPage", onlineDoc);
		}
		return new ModelAndView("jeecg/onlinedoc/onlineDoc-update");
	}
	
	/**
	 * 导入功能跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "upload")
	public ModelAndView upload(HttpServletRequest req) {
		req.setAttribute("controller_name","onlineDocController");
		return new ModelAndView("common/upload/pub_excel_upload");
	}
	
	/**
	 * 导出excel
	 * 
	 * @param request
	 * @param response
	 */
	@RequestMapping(params = "exportXls")
	public String exportXls(OnlineDocEntity onlineDoc,HttpServletRequest request,HttpServletResponse response
			, DataGrid dataGrid,ModelMap modelMap) {
		CriteriaQuery cq = new CriteriaQuery(OnlineDocEntity.class, dataGrid);
		org.jeecgframework.core.extend.hqlsearch.HqlGenerateUtil.installHql(cq, onlineDoc, request.getParameterMap());
		List<OnlineDocEntity> onlineDocs = this.onlineDocService.getListByCriteriaQuery(cq,false);
		modelMap.put(NormalExcelConstants.FILE_NAME,"在线文档");
		modelMap.put(NormalExcelConstants.CLASS,OnlineDocEntity.class);
		modelMap.put(NormalExcelConstants.PARAMS,new ExportParams("在线文档列表", "导出人:"+ResourceUtil.getSessionUserName().getRealName(),
			"导出信息"));
		modelMap.put(NormalExcelConstants.DATA_LIST,onlineDocs);
		return NormalExcelConstants.JEECG_EXCEL_VIEW;
	}
	/**
	 * 导出excel 使模板
	 * 
	 * @param request
	 * @param response
	 */
	@RequestMapping(params = "exportXlsByT")
	public String exportXlsByT(OnlineDocEntity onlineDoc,HttpServletRequest request,HttpServletResponse response
			, DataGrid dataGrid,ModelMap modelMap) {
    	modelMap.put(NormalExcelConstants.FILE_NAME,"在线文档");
    	modelMap.put(NormalExcelConstants.CLASS,OnlineDocEntity.class);
    	modelMap.put(NormalExcelConstants.PARAMS,new ExportParams("在线文档列表", "导出人:"+ResourceUtil.getSessionUserName().getRealName(),
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
				List<OnlineDocEntity> listOnlineDocEntitys = ExcelImportUtil.importExcel(file.getInputStream(),OnlineDocEntity.class,params);
				for (OnlineDocEntity onlineDoc : listOnlineDocEntitys) {
					onlineDocService.save(onlineDoc);
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
	
	//上传文件方法
	@RequestMapping(params="ajaxUpload")
	@ResponseBody
	public String ajaxUpload(HttpServletRequest request) throws IllegalStateException, IOException {
		MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;
		String fileName = "";
		String uploadPath = "upload/";
		String path =request.getSession().getServletContext().getRealPath("/")+uploadPath;  
		String realPath = "";
		String oldName = "";
		for (Iterator<String> it = multipartRequest.getFileNames(); it.hasNext();) {
			String key = it.next();
			MultipartFile mulfile = multipartRequest.getFile(key);
			fileName = mulfile.getOriginalFilename();
			oldName = fileName.substring(0,fileName.lastIndexOf("."));
			fileName = rewriteFileName(fileName);
			File file = new File(path + fileName);
			mulfile.transferTo(file);
		}
		realPath = "{\"path\":\""+uploadPath+fileName+"\",\"oldName\":\"" + oldName + "\",\"newName\":\"" + fileName + "\"}";
		return realPath;
	}

	//文件名称处理
	private String rewriteFileName(String fileName) {
		int pointIndex = fileName.lastIndexOf(".");
		StringBuffer fileNameBuffer = new StringBuffer();
		fileNameBuffer.append((new Date()).getTime()+"_"+fileName.substring(0,pointIndex));
		fileNameBuffer.append(fileName.substring(pointIndex));
		return fileNameBuffer.toString();
	}
}
