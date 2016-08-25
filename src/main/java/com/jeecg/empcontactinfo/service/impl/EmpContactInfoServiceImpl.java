package com.jeecg.empcontactinfo.service.impl;
import com.jeecg.empcontactinfo.service.EmpContactInfoServiceI;
import org.jeecgframework.core.common.service.impl.CommonServiceImpl;
import com.jeecg.empcontactinfo.entity.EmpContactInfoEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.UUID;
import java.io.Serializable;

@Service("empContactInfoService")
@Transactional
public class EmpContactInfoServiceImpl extends CommonServiceImpl implements EmpContactInfoServiceI {

	
 	public <T> void delete(T entity) {
 		super.delete(entity);
 		//执行删除操作配置的sql增强
		this.doDelSql((EmpContactInfoEntity)entity);
 	}
 	
 	public <T> Serializable save(T entity) {
 		Serializable t = super.save(entity);
 		//执行新增操作配置的sql增强
 		this.doAddSql((EmpContactInfoEntity)entity);
 		return t;
 	}
 	
 	public <T> void saveOrUpdate(T entity) {
 		super.saveOrUpdate(entity);
 		//执行更新操作配置的sql增强
 		this.doUpdateSql((EmpContactInfoEntity)entity);
 	}
 	
 	/**
	 * 默认按钮-sql增强-新增操作
	 * @param id
	 * @return
	 */
 	public boolean doAddSql(EmpContactInfoEntity t){
	 	return true;
 	}
 	/**
	 * 默认按钮-sql增强-更新操作
	 * @param id
	 * @return
	 */
 	public boolean doUpdateSql(EmpContactInfoEntity t){
	 	return true;
 	}
 	/**
	 * 默认按钮-sql增强-删除操作
	 * @param id
	 * @return
	 */
 	public boolean doDelSql(EmpContactInfoEntity t){
	 	return true;
 	}
 	
 	/**
	 * 替换sql中的变量
	 * @param sql
	 * @return
	 */
 	public String replaceVal(String sql,EmpContactInfoEntity t){
 		sql  = sql.replace("#{id}",String.valueOf(t.getId()));
 		sql  = sql.replace("#{create_name}",String.valueOf(t.getCreateName()));
 		sql  = sql.replace("#{create_by}",String.valueOf(t.getCreateBy()));
 		sql  = sql.replace("#{create_date}",String.valueOf(t.getCreateDate()));
 		sql  = sql.replace("#{update_name}",String.valueOf(t.getUpdateName()));
 		sql  = sql.replace("#{update_by}",String.valueOf(t.getUpdateBy()));
 		sql  = sql.replace("#{update_date}",String.valueOf(t.getUpdateDate()));
 		sql  = sql.replace("#{bpm_status}",String.valueOf(t.getBpmStatus()));
 		sql  = sql.replace("#{emp_no}",String.valueOf(t.getEmpNo()));
 		sql  = sql.replace("#{emp_name}",String.valueOf(t.getEmpName()));
 		sql  = sql.replace("#{contact_type}",String.valueOf(t.getContactType()));
 		sql  = sql.replace("#{start_date}",String.valueOf(t.getStartDate()));
 		sql  = sql.replace("#{end_date}",String.valueOf(t.getEndDate()));
 		sql  = sql.replace("#{on_date}",String.valueOf(t.getOnDate()));
 		sql  = sql.replace("#{contact_company}",String.valueOf(t.getContactCompany()));
 		sql  = sql.replace("#{contact_money_type}",String.valueOf(t.getContactMoneyType()));
 		sql  = sql.replace("#{contact_money}",String.valueOf(t.getContactMoney()));
 		sql  = sql.replace("#{grant_date}",String.valueOf(t.getGrantDate()));
 		sql  = sql.replace("#{contact_status}",String.valueOf(t.getContactStatus()));
 		sql  = sql.replace("#{work_times}",String.valueOf(t.getWorkTimes()));
 		sql  = sql.replace("#{contact_type}",String.valueOf(t.getContactType()));
 		sql  = sql.replace("#{contact_term}",String.valueOf(t.getContactTerm()));
 		sql  = sql.replace("#{try_term}",String.valueOf(t.getTryTerm()));
 		sql  = sql.replace("#{try_end_date}",String.valueOf(t.getTryEndDate()));
 		sql  = sql.replace("#{duty}",String.valueOf(t.getDuty()));
 		sql  = sql.replace("#{old_sf}",String.valueOf(t.getOldSf()));
 		sql  = sql.replace("#{remark}",String.valueOf(t.getRemark()));
 		sql  = sql.replace("#{UUID}",UUID.randomUUID().toString());
 		return sql;
 	}
}