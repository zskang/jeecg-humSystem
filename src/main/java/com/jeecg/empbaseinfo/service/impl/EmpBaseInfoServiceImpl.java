package com.jeecg.empbaseinfo.service.impl;

import com.jeecg.empbaseinfo.service.EmpBaseInfoServiceI;

import org.apache.commons.lang3.StringUtils;
import org.jeecgframework.core.common.service.impl.CommonServiceImpl;
import org.jeecgframework.core.util.PinyinUtil;

import com.jeecg.empbaseinfo.entity.EmpBaseInfoEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Map;
import java.util.UUID;
import java.io.Serializable;

@Service("empBaseInfoService")
@Transactional
public class EmpBaseInfoServiceImpl extends CommonServiceImpl implements EmpBaseInfoServiceI {

	public <T> void delete(T entity) {
		super.delete(entity);
		// 执行删除操作配置的sql增强
		this.doDelSql((EmpBaseInfoEntity) entity);
	}

	public <T> Serializable save(T entity) {
		Serializable t = super.save(entity);
		// 执行新增操作配置的sql增强
		this.doAddSql((EmpBaseInfoEntity) entity);
		return t;
	}

	public <T> void saveOrUpdate(T entity) {
		super.saveOrUpdate(entity);
		// 执行更新操作配置的sql增强
		this.doUpdateSql((EmpBaseInfoEntity) entity);
	}

	/**
	 * 默认按钮-sql增强-新增操作
	 * 
	 * @param id
	 * @return
	 */
	public boolean doAddSql(EmpBaseInfoEntity t) {
		return true;
	}

	/**
	 * 默认按钮-sql增强-更新操作
	 * 
	 * @param id
	 * @return
	 */
	public boolean doUpdateSql(EmpBaseInfoEntity t) {
		return true;
	}

	/**
	 * 默认按钮-sql增强-删除操作
	 * 
	 * @param id
	 * @return
	 */
	public boolean doDelSql(EmpBaseInfoEntity t) {
		return true;
	}

	/**
	 * 替换sql中的变量
	 * 
	 * @param sql
	 * @return
	 */
	public String replaceVal(String sql, EmpBaseInfoEntity t) {
		sql = sql.replace("#{id}", String.valueOf(t.getId()));
		sql = sql.replace("#{create_name}", String.valueOf(t.getCreateName()));
		sql = sql.replace("#{create_date}", String.valueOf(t.getCreateDate()));
		sql = sql.replace("#{update_name}", String.valueOf(t.getUpdateName()));
		sql = sql.replace("#{update_date}", String.valueOf(t.getUpdateDate()));
		sql = sql.replace("#{sys_org_code}", String.valueOf(t.getSysOrgCode()));
		sql = sql.replace("#{emp_name}", String.valueOf(t.getEmpName()));
		sql = sql.replace("#{emp_no}", String.valueOf(t.getEmpNo()));
		sql = sql.replace("#{postion}", String.valueOf(t.getPostion()));
		sql = sql.replace("#{sex}", String.valueOf(t.getSex()));
		sql = sql.replace("#{marry}", String.valueOf(t.getMarry()));
		sql = sql.replace("#{brthdate}", String.valueOf(t.getBrthdate()));
		sql = sql.replace("#{minzu}", String.valueOf(t.getMinzu()));
		sql = sql.replace("#{zzmm}", String.valueOf(t.getZzmm()));
		sql = sql.replace("#{age}", String.valueOf(t.getAge()));
		sql = sql.replace("#{langtype}", String.valueOf(t.getLangtype()));
		sql = sql.replace("#{langgrade}", String.valueOf(t.getLanggrade()));
		sql = sql.replace("#{emptype}", String.valueOf(t.getEmptype()));
		sql = sql.replace("#{jiguan}", String.valueOf(t.getJiguan()));
		sql = sql.replace("#{hukou_type}", String.valueOf(t.getHukouType()));
		sql = sql.replace("#{xinzi}", String.valueOf(t.getXinzi()));
		sql = sql.replace("#{techang}", String.valueOf(t.getTechang()));
		sql = sql.replace("#{zyzgz}", String.valueOf(t.getZyzgz()));
		sql = sql.replace("#{crad_no}", String.valueOf(t.getCradNo()));
		sql = sql.replace("#{zhicheng}", String.valueOf(t.getZhicheng()));
		sql = sql.replace("#{huji_address}", String.valueOf(t.getHujiAddress()));
		sql = sql.replace("#{post1}", String.valueOf(t.getPost1()));
		sql = sql.replace("#{now_address}", String.valueOf(t.getNowAddress()));
		sql = sql.replace("#{post2}", String.valueOf(t.getPost2()));
		sql = sql.replace("#{tel}", String.valueOf(t.getTel()));
		sql = sql.replace("#{mobile}", String.valueOf(t.getMobile()));
		sql = sql.replace("#{email}", String.valueOf(t.getEmail()));
		sql = sql.replace("#{UUID}", UUID.randomUUID().toString());
		return sql;
	}

	@Override
	public String getNoByName(String empName, String orgCode) {
		String engName = PinyinUtil.getPinyinWithMark(empName);
		System.out.println(engName);
		System.out.println(orgCode);
		String sql_org = "select t.org_code from t_s_depart t where t.id= ? ";
		Map<String, Object> pOrgCodeMap = commonDao.findOneForJdbc(sql_org, orgCode.split(",")[0]);
		if (pOrgCodeMap != null) {
			orgCode = (String) pOrgCodeMap.get("org_code");
		}
		String orgCode_ = "";
		if (orgCode.length() > 2) {
			orgCode_ = orgCode.substring(0, 3);
		} else {
			orgCode_ = orgCode;
		}
		String fname = "";
		if (orgCode_.equals("A01")) {
			fname = "LSXX";
		} else if (orgCode_.equals("A02")) {
			fname = "LSZX";
		} else if (orgCode_.equals("A03")) {
			fname = "LSPX";
		}
		return fname + "-" + engName + "-" + getMaxNum(fname + "-" + engName + "-");
	}

	/**
	 * 根据用户编号前缀 获取最大的编号。
	 * 
	 * @param pp
	 * @return String
	 */
	private String getMaxNum(String pp) {
		String res_no = "001";
		String sql = " select  max(substr(t.emp_no,8)) mx_no  from emp_base_info t where substr(t.emp_no,1,7) = ? ";
		Map<String, Object> pOrgCodeMap = commonDao.findOneForJdbc(sql, pp);
		if (pOrgCodeMap != null) {
			String mx_no = (String) pOrgCodeMap.get("mx_no");
			if (StringUtils.isNotBlank(mx_no)) {
				int mx_no_ = Integer.parseInt(mx_no);
				if (mx_no_ < 10) {
					res_no = "00" + (mx_no_ + 1);
				} else if (mx_no_ < 100 && mx_no_ > 10) {
					res_no = "0" + (mx_no_ + 1);
				} else if (mx_no_ > 100 && mx_no_ < 1000) {
					res_no = mx_no + 1 + "";
				}
			}
		}
		return res_no;
	}
}