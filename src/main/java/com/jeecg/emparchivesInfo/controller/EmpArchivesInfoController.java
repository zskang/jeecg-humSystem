package com.jeecg.emparchivesInfo.controller;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.log4j.Logger;
import org.jeecgframework.core.common.controller.BaseController;
import org.jeecgframework.core.common.exception.BusinessException;
import org.jeecgframework.core.common.hibernate.qbc.CriteriaQuery;
import org.jeecgframework.core.common.model.json.DataGrid;
import org.jeecgframework.core.util.StringUtil;
import org.jeecgframework.tag.core.easyui.TagUtil;
import org.jeecgframework.web.system.service.SystemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.jeecg.empbaseinfo.entity.EmpBaseInfoEntity;
import com.jeecg.empbaseinfo.service.EmpBaseInfoServiceI;

@Controller
@RequestMapping("/empArchivesInfoController")
public class EmpArchivesInfoController extends BaseController {
	private static final Logger logger = Logger.getLogger(EmpArchivesInfoController.class);

	@Autowired
	private SystemService systemService;

	@Autowired
	private EmpBaseInfoServiceI empBaseInfoService;

	/**
	 * 员工基本信息表列表 页面跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "list")
	public ModelAndView list(HttpServletRequest request) {
		return new ModelAndView("com/jeecg/emparchivesInfo/empInfoList");
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
	public void datagrid(EmpBaseInfoEntity empBaseInfo, HttpServletRequest request, HttpServletResponse response,
			DataGrid dataGrid) {
		CriteriaQuery cq = new CriteriaQuery(EmpBaseInfoEntity.class, dataGrid);
		// 查询条件组装器
		org.jeecgframework.core.extend.hqlsearch.HqlGenerateUtil.installHql(cq, empBaseInfo, request.getParameterMap());
		try {
			// 自定义追加查询条件
		} catch (Exception e) {
			throw new BusinessException(e.getMessage());
		}
		cq.add();
		this.empBaseInfoService.getDataGridReturn(cq, true);
		@SuppressWarnings("unchecked")
		List<EmpBaseInfoEntity> emps = (List<EmpBaseInfoEntity>) dataGrid.getResults();
		List<EmpBaseInfoEntity> lst_emps = new ArrayList<EmpBaseInfoEntity>();
		for (EmpBaseInfoEntity emp : emps) {
			EmpBaseInfoEntity newEmp = new EmpBaseInfoEntity();
			try {
				BeanUtils.copyProperties(newEmp, emp);
				if (StringUtil.isNotEmpty(emp.getSysOrgCode())) {
					String orgName = this.systemService.getOrgName(emp.getSysOrgCode());
					newEmp.setSysOrgCode(orgName);
				}
				lst_emps.add(newEmp);
			} catch (IllegalAccessException e) {
				logger.error("数据加载失败！");
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				e.printStackTrace();
			}
		}
		dataGrid.setResults(lst_emps);
		TagUtil.datagrid(response, dataGrid);
	}

	@RequestMapping(params = "toAddEducatInfo") 
	public ModelAndView toAddEducatInfo(HttpServletRequest req) { 
		return new ModelAndView("com/jeecg/emparchivesInfo/empEducatInfoList");
	}

	@RequestMapping(params = "toAddWorkedInfo") 
	public ModelAndView toAddWorkedInfo(HttpServletRequest req) {
		// String id_ = id;
		// EmpBaseInfoEntity empBaseInfo =
		// empBaseInfoService.getEntity(EmpBaseInfoEntity.class, id);
		// req.setAttribute("empBaseInfoPage", empBaseInfo);
		return new ModelAndView("com/jeecg/emparchivesInfo/empWorkedInfoList");
	}

	@RequestMapping(params = "toAddTakeOfficeInfo") 
	public ModelAndView toAddTakeOfficeInfo(HttpServletRequest req) {
		// String id_ = id;
		// EmpBaseInfoEntity empBaseInfo =
		// empBaseInfoService.getEntity(EmpBaseInfoEntity.class, id);
		// req.setAttribute("empBaseInfoPage", empBaseInfo);
		return new ModelAndView("com/jeecg/emparchivesInfo/empTakeOfficeInfoList");
	}

	@RequestMapping(params = "toAddOtherInfo") 
	public ModelAndView toAddOtherInfo(HttpServletRequest req) {
		// String id_ = id;
		// EmpBaseInfoEntity empBaseInfo =
		// empBaseInfoService.getEntity(EmpBaseInfoEntity.class, id);
		// req.setAttribute("empBaseInfoPage", empBaseInfo);
		return new ModelAndView("com/jeecg/emparchivesInfo/empOtherInfoList");
	}
}
