package com.jeecg.empworkcheckinfo.service.impl;
import com.jeecg.empworkcheckinfo.service.EmpWorkCheckInfoServiceI;
import org.jeecgframework.core.common.service.impl.CommonServiceImpl;
import com.jeecg.empworkcheckinfo.entity.EmpWorkCheckInfoEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.UUID;
import java.io.Serializable;

@Service("empWorkCheckInfoService")
@Transactional
public class EmpWorkCheckInfoServiceImpl extends CommonServiceImpl implements EmpWorkCheckInfoServiceI {

	
 	public <T> void delete(T entity) {
 		super.delete(entity);
 		//执行删除操作配置的sql增强
		this.doDelSql((EmpWorkCheckInfoEntity)entity);
 	}
 	
 	public <T> Serializable save(T entity) {
 		Serializable t = super.save(entity);
 		//执行新增操作配置的sql增强
 		this.doAddSql((EmpWorkCheckInfoEntity)entity);
 		return t;
 	}
 	
 	public <T> void saveOrUpdate(T entity) {
 		super.saveOrUpdate(entity);
 		//执行更新操作配置的sql增强
 		this.doUpdateSql((EmpWorkCheckInfoEntity)entity);
 	}
 	
 	/**
	 * 默认按钮-sql增强-新增操作
	 * @param id
	 * @return
	 */
 	public boolean doAddSql(EmpWorkCheckInfoEntity t){
	 	return true;
 	}
 	/**
	 * 默认按钮-sql增强-更新操作
	 * @param id
	 * @return
	 */
 	public boolean doUpdateSql(EmpWorkCheckInfoEntity t){
	 	return true;
 	}
 	/**
	 * 默认按钮-sql增强-删除操作
	 * @param id
	 * @return
	 */
 	public boolean doDelSql(EmpWorkCheckInfoEntity t){
	 	return true;
 	}
 	
 	/**
	 * 替换sql中的变量
	 * @param sql
	 * @return
	 */
 	public String replaceVal(String sql,EmpWorkCheckInfoEntity t){
 		sql  = sql.replace("#{id}",String.valueOf(t.getId()));
 		sql  = sql.replace("#{emp_no}",String.valueOf(t.getEmpNo()));
 		sql  = sql.replace("#{emp_name}",String.valueOf(t.getEmpName()));
 		sql  = sql.replace("#{depart}",String.valueOf(t.getDepart()));
 		sql  = sql.replace("#{date}",String.valueOf(t.getDate()));
 		sql  = sql.replace("#{week}",String.valueOf(t.getWeek()));
 		sql  = sql.replace("#{error_type}",String.valueOf(t.getErrorType()));
 		sql  = sql.replace("#{err_date}",String.valueOf(t.getErrDate()));
 		sql  = sql.replace("#{kou_money}",String.valueOf(t.getKouMoney()));
 		sql  = sql.replace("#{UUID}",UUID.randomUUID().toString());
 		return sql;
 	}
}