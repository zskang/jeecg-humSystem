package com.jeecg.traininfo.service.impl;
import com.jeecg.traininfo.service.TrainInfoServiceI;
import org.jeecgframework.core.common.service.impl.CommonServiceImpl;
import com.jeecg.traininfo.entity.TrainInfoEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.UUID;
import java.io.Serializable;

@Service("trainInfoService")
@Transactional
public class TrainInfoServiceImpl extends CommonServiceImpl implements TrainInfoServiceI {

	
 	public <T> void delete(T entity) {
 		super.delete(entity);
 		//执行删除操作配置的sql增强
		this.doDelSql((TrainInfoEntity)entity);
 	}
 	
 	public <T> Serializable save(T entity) {
 		Serializable t = super.save(entity);
 		//执行新增操作配置的sql增强
 		this.doAddSql((TrainInfoEntity)entity);
 		return t;
 	}
 	
 	public <T> void saveOrUpdate(T entity) {
 		super.saveOrUpdate(entity);
 		//执行更新操作配置的sql增强
 		this.doUpdateSql((TrainInfoEntity)entity);
 	}
 	
 	/**
	 * 默认按钮-sql增强-新增操作
	 * @param id
	 * @return
	 */
 	public boolean doAddSql(TrainInfoEntity t){
	 	return true;
 	}
 	/**
	 * 默认按钮-sql增强-更新操作
	 * @param id
	 * @return
	 */
 	public boolean doUpdateSql(TrainInfoEntity t){
	 	return true;
 	}
 	/**
	 * 默认按钮-sql增强-删除操作
	 * @param id
	 * @return
	 */
 	public boolean doDelSql(TrainInfoEntity t){
	 	return true;
 	}
 	
 	/**
	 * 替换sql中的变量
	 * @param sql
	 * @return
	 */
 	public String replaceVal(String sql,TrainInfoEntity t){
 		sql  = sql.replace("#{id}",String.valueOf(t.getId()));
 		sql  = sql.replace("#{create_name}",String.valueOf(t.getCreateName()));
 		sql  = sql.replace("#{create_date}",String.valueOf(t.getCreateDate()));
 		sql  = sql.replace("#{train_start_date}",String.valueOf(t.getTrainStartDate()));
 		sql  = sql.replace("#{train_end_date}",String.valueOf(t.getTrainEndDate()));
 		sql  = sql.replace("#{emp_no}",String.valueOf(t.getEmpNo()));
 		sql  = sql.replace("#{emp_name}",String.valueOf(t.getEmpName()));
 		sql  = sql.replace("#{train_type}",String.valueOf(t.getTrainType()));
 		sql  = sql.replace("#{train_desc}",String.valueOf(t.getTrainDesc()));
 		sql  = sql.replace("#{train_result_desc}",String.valueOf(t.getTrainResultDesc()));
 		sql  = sql.replace("#{train_teacher_name}",String.valueOf(t.getTrainTeacherName()));
 		sql  = sql.replace("#{train_teacher_id}",String.valueOf(t.getTrainTeacherId()));
 		sql  = sql.replace("#{train_subject}",String.valueOf(t.getTrainSubject()));
 		sql  = sql.replace("#{train_result}",String.valueOf(t.getTrainResult()));
 		sql  = sql.replace("#{UUID}",UUID.randomUUID().toString());
 		return sql;
 	}
}