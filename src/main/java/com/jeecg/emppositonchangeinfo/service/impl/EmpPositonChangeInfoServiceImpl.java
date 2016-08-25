package com.jeecg.emppositonchangeinfo.service.impl;
import com.jeecg.emppositonchangeinfo.service.EmpPositonChangeInfoServiceI;
import org.jeecgframework.core.common.service.impl.CommonServiceImpl;
import com.jeecg.emppositonchangeinfo.entity.EmpPositonChangeInfoEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.UUID;
import java.io.Serializable;

@Service("empPositonChangeInfoService")
@Transactional
public class EmpPositonChangeInfoServiceImpl extends CommonServiceImpl implements EmpPositonChangeInfoServiceI {

	
 	public <T> void delete(T entity) {
 		super.delete(entity);
 		//执行删除操作配置的sql增强
		this.doDelSql((EmpPositonChangeInfoEntity)entity);
 	}
 	
 	public <T> Serializable save(T entity) {
 		Serializable t = super.save(entity);
 		//执行新增操作配置的sql增强
 		this.doAddSql((EmpPositonChangeInfoEntity)entity);
 		return t;
 	}
 	
 	public <T> void saveOrUpdate(T entity) {
 		super.saveOrUpdate(entity);
 		//执行更新操作配置的sql增强
 		this.doUpdateSql((EmpPositonChangeInfoEntity)entity);
 	}
 	
 	/**
	 * 默认按钮-sql增强-新增操作
	 * @param id
	 * @return
	 */
 	public boolean doAddSql(EmpPositonChangeInfoEntity t){
	 	return true;
 	}
 	/**
	 * 默认按钮-sql增强-更新操作
	 * @param id
	 * @return
	 */
 	public boolean doUpdateSql(EmpPositonChangeInfoEntity t){
	 	return true;
 	}
 	/**
	 * 默认按钮-sql增强-删除操作
	 * @param id
	 * @return
	 */
 	public boolean doDelSql(EmpPositonChangeInfoEntity t){
	 	return true;
 	}
 	
 	/**
	 * 替换sql中的变量
	 * @param sql
	 * @return
	 */
 	public String replaceVal(String sql,EmpPositonChangeInfoEntity t){
 		sql  = sql.replace("#{id}",String.valueOf(t.getId()));
 		sql  = sql.replace("#{create_name}",String.valueOf(t.getCreateName()));
 		sql  = sql.replace("#{create_date}",String.valueOf(t.getCreateDate()));
 		sql  = sql.replace("#{update_name}",String.valueOf(t.getUpdateName()));
 		sql  = sql.replace("#{update_date}",String.valueOf(t.getUpdateDate()));
 		sql  = sql.replace("#{move_no}",String.valueOf(t.getMoveNo()));
 		sql  = sql.replace("#{emp_no}",String.valueOf(t.getEmpNo()));
 		sql  = sql.replace("#{old_position_no}",String.valueOf(t.getOldPositionNo()));
 		sql  = sql.replace("#{new_position_no}",String.valueOf(t.getNewPositionNo()));
 		sql  = sql.replace("#{old_position_name}",String.valueOf(t.getOldPositionName()));
 		sql  = sql.replace("#{new_position_name}",String.valueOf(t.getNewPositionName()));
 		sql  = sql.replace("#{change_date}",String.valueOf(t.getChangeDate()));
 		sql  = sql.replace("#{change_reason}",String.valueOf(t.getChangeReason()));
 		sql  = sql.replace("#{remark}",String.valueOf(t.getRemark()));
 		sql  = sql.replace("#{emp_name}",String.valueOf(t.getEmpName()));
 		sql  = sql.replace("#{UUID}",UUID.randomUUID().toString());
 		return sql;
 	}
}