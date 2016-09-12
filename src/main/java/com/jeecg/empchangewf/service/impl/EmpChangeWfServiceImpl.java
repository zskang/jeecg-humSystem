package com.jeecg.empchangewf.service.impl;
import com.jeecg.empchangewf.service.EmpChangeWfServiceI;
import org.jeecgframework.core.common.service.impl.CommonServiceImpl;
import com.jeecg.empchangewf.entity.EmpChangeWfEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.UUID;
import java.io.Serializable;

@Service("empChangeWfService")
@Transactional
public class EmpChangeWfServiceImpl extends CommonServiceImpl implements EmpChangeWfServiceI {

	
 	public <T> void delete(T entity) {
 		super.delete(entity);
 		//执行删除操作配置的sql增强
		this.doDelSql((EmpChangeWfEntity)entity);
 	}
 	
 	public <T> Serializable save(T entity) {
 		Serializable t = super.save(entity);
 		//执行新增操作配置的sql增强
 		this.doAddSql((EmpChangeWfEntity)entity);
 		return t;
 	}
 	
 	public <T> void saveOrUpdate(T entity) {
 		super.saveOrUpdate(entity);
 		//执行更新操作配置的sql增强
 		this.doUpdateSql((EmpChangeWfEntity)entity);
 	}
 	
 	/**
	 * 默认按钮-sql增强-新增操作
	 * @param id
	 * @return
	 */
 	public boolean doAddSql(EmpChangeWfEntity t){
	 	return true;
 	}
 	/**
	 * 默认按钮-sql增强-更新操作
	 * @param id
	 * @return
	 */
 	public boolean doUpdateSql(EmpChangeWfEntity t){
	 	return true;
 	}
 	/**
	 * 默认按钮-sql增强-删除操作
	 * @param id
	 * @return
	 */
 	public boolean doDelSql(EmpChangeWfEntity t){
	 	return true;
 	}
 	
 	/**
	 * 替换sql中的变量
	 * @param sql
	 * @return
	 */
 	public String replaceVal(String sql,EmpChangeWfEntity t){
 		sql  = sql.replace("#{id}",String.valueOf(t.getId()));
 		sql  = sql.replace("#{create_name}",String.valueOf(t.getCreateName()));
 		sql  = sql.replace("#{create_by}",String.valueOf(t.getCreateBy()));
 		sql  = sql.replace("#{create_date}",String.valueOf(t.getCreateDate()));
 		sql  = sql.replace("#{update_name}",String.valueOf(t.getUpdateName()));
 		sql  = sql.replace("#{update_by}",String.valueOf(t.getUpdateBy()));
 		sql  = sql.replace("#{update_date}",String.valueOf(t.getUpdateDate()));
 		sql  = sql.replace("#{sys_org_code}",String.valueOf(t.getSysOrgCode()));
 		sql  = sql.replace("#{sys_company_code}",String.valueOf(t.getSysCompanyCode()));
 		sql  = sql.replace("#{bpm_status}",String.valueOf(t.getBpmStatus()));
 		sql  = sql.replace("#{empno}",String.valueOf(t.getEmpno()));
 		sql  = sql.replace("#{sex}",String.valueOf(t.getSex()));
 		sql  = sql.replace("#{ruzhi_date}",String.valueOf(t.getRuzhiDate()));
 		sql  = sql.replace("#{sx_date}",String.valueOf(t.getSxDate()));
 		sql  = sql.replace("#{change_type}",String.valueOf(t.getChangeType()));
 		sql  = sql.replace("#{org1}",String.valueOf(t.getOrg1()));
 		sql  = sql.replace("#{dept1}",String.valueOf(t.getDept1()));
 		sql  = sql.replace("#{salary1}",String.valueOf(t.getSalary1()));
 		sql  = sql.replace("#{butie1}",String.valueOf(t.getButie1()));
 		sql  = sql.replace("#{other1}",String.valueOf(t.getOther1()));
 		sql  = sql.replace("#{org2}",String.valueOf(t.getOrg2()));
 		sql  = sql.replace("#{dept2}",String.valueOf(t.getDept2()));
 		sql  = sql.replace("#{salary2}",String.valueOf(t.getSalary2()));
 		sql  = sql.replace("#{butie2}",String.valueOf(t.getButie2()));
 		sql  = sql.replace("#{other2}",String.valueOf(t.getOther2()));
 		sql  = sql.replace("#{reason}",String.valueOf(t.getReason()));
 		sql  = sql.replace("#{req_name}",String.valueOf(t.getReqName()));
 		sql  = sql.replace("#{req_mobile}",String.valueOf(t.getReqMobile()));
 		sql  = sql.replace("#{req_date}",String.valueOf(t.getReqDate()));
 		sql  = sql.replace("#{UUID}",UUID.randomUUID().toString());
 		return sql;
 	}
}