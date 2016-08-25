package com.jeecg.empbaseinfo.service;
import com.jeecg.empbaseinfo.entity.EmpBaseInfoEntity;
import org.jeecgframework.core.common.service.CommonService;

import java.io.Serializable;

public interface EmpBaseInfoServiceI extends CommonService{
	
 	public <T> void delete(T entity);
 	
 	public <T> Serializable save(T entity);
 	
 	public <T> void saveOrUpdate(T entity);
 	
 	/**
	 * 默认按钮-sql增强-新增操作
	 * @param id
	 * @return
	 */
 	public boolean doAddSql(EmpBaseInfoEntity t);
 	/**
	 * 默认按钮-sql增强-更新操作
	 * @param id
	 * @return
	 */
 	public boolean doUpdateSql(EmpBaseInfoEntity t);
 	/**
	 * 默认按钮-sql增强-删除操作
	 * @param id
	 * @return
	 */
 	public boolean doDelSql(EmpBaseInfoEntity t);

 	/**
 	 * 根据员工姓名 获取当前用户编号
 	 * @param orgcode 
 	 */
	public String getNoByName(String empName, String orgcode);
}
