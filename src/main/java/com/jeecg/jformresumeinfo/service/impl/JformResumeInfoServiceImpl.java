package com.jeecg.jformresumeinfo.service.impl;

import com.jeecg.jformresumeinfo.service.JformResumeInfoServiceI;
import org.jeecgframework.core.common.service.impl.CommonServiceImpl;
import org.jeecgframework.core.constant.Globals;

import com.jeecg.jformresumeinfo.entity.JformResumeInfoEntity;
import com.jeecg.jformresumetraininfo.entity.JformResumeTrainInfoEntity;
import com.jeecg.jformresumedegreeinfo.entity.JformResumeDegreeInfoEntity;
import com.jeecg.jformresumeexpinfo.entity.JformResumeExpInfoEntity;
import com.jeecg.jformresumefamilyinfo.entity.JformResumeFamilyInfoEntity;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.jeecgframework.core.common.exception.BusinessException;
import org.jeecgframework.core.common.service.impl.CommonServiceImpl;
import org.jeecgframework.core.util.MyBeanUtils;
import org.jeecgframework.core.util.PinyinUtil;
import org.jeecgframework.core.util.StringUtil;
import org.jeecgframework.core.util.oConvertUtils;
import java.util.ArrayList;
import java.util.UUID;
import java.io.Serializable;

@Service("jformResumeInfoService")
@Transactional
public class JformResumeInfoServiceImpl extends CommonServiceImpl implements JformResumeInfoServiceI {

	public <T> void delete(T entity) {
		super.delete(entity);
		// 执行删除操作配置的sql增强
		this.doDelSql((JformResumeInfoEntity) entity);
	}

	public void addMain(JformResumeInfoEntity jformResumeInfo,
			List<JformResumeTrainInfoEntity> jformResumeTrainInfoList,
			List<JformResumeDegreeInfoEntity> jformResumeDegreeInfoList,
			List<JformResumeExpInfoEntity> jformResumeExpInfoList,
			List<JformResumeFamilyInfoEntity> jformResumeFamilyInfoList) {
		String resumeName = jformResumeInfo.getName();
		String orgCode = jformResumeInfo.getDepartNo();
		String resumeNo = this.getNoByName(resumeName, orgCode);
		jformResumeInfo.setEmpNo(resumeNo);
		// 保存主信息
		this.save(jformResumeInfo);

		/** 保存-培训 */
		for (JformResumeTrainInfoEntity jformResumeTrainInfo : jformResumeTrainInfoList) {
			// 外键设置
			jformResumeTrainInfo.setResumeId(jformResumeInfo.getEmpNo());
			this.save(jformResumeTrainInfo);
		}
		/** 保存-学历 */
		for (JformResumeDegreeInfoEntity jformResumeDegreeInfo : jformResumeDegreeInfoList) {
			// 外键设置
			jformResumeDegreeInfo.setResumeId(jformResumeInfo.getEmpNo());
			this.save(jformResumeDegreeInfo);
		}
		/** 保存-经历 */
		for (JformResumeExpInfoEntity jformResumeExpInfo : jformResumeExpInfoList) {
			// 外键设置
			jformResumeExpInfo.setResumeId(jformResumeInfo.getEmpNo());
			this.save(jformResumeExpInfo);
		}
		/** 保存-家庭成员 */
		for (JformResumeFamilyInfoEntity jformResumeFamilyInfo : jformResumeFamilyInfoList) {
			// 外键设置
			jformResumeFamilyInfo.setResumeId(jformResumeInfo.getEmpNo());
			this.save(jformResumeFamilyInfo);
		}
		// 执行新增操作配置的sql增强
		this.doAddSql(jformResumeInfo);
	}

	private String getNoByName(String empName, String orgCode) {
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

	public void updateMain(JformResumeInfoEntity jformResumeInfo,
			List<JformResumeTrainInfoEntity> jformResumeTrainInfoList,
			List<JformResumeDegreeInfoEntity> jformResumeDegreeInfoList,
			List<JformResumeExpInfoEntity> jformResumeExpInfoList,
			List<JformResumeFamilyInfoEntity> jformResumeFamilyInfoList) {
		// 保存主表信息
		this.saveOrUpdate(jformResumeInfo);
		// ===================================================================================
		// 获取参数
		Object id0 = jformResumeInfo.getEmpNo();
		Object id1 = jformResumeInfo.getEmpNo();
		Object id2 = jformResumeInfo.getEmpNo();
		Object id3 = jformResumeInfo.getEmpNo();
		// ===================================================================================
		// 1.查询出数据库的明细数据-培训
		String hql0 = "from JformResumeTrainInfoEntity where 1 = 1 AND rESUME_ID = ? ";
		List<JformResumeTrainInfoEntity> jformResumeTrainInfoOldList = this.findHql(hql0, id0);
		// 2.筛选更新明细数据-培训
		if (jformResumeTrainInfoList != null && jformResumeTrainInfoList.size() > 0) {
			for (JformResumeTrainInfoEntity oldE : jformResumeTrainInfoOldList) {
				boolean isUpdate = false;
				for (JformResumeTrainInfoEntity sendE : jformResumeTrainInfoList) {
					// 需要更新的明细数据-培训
					if (oldE.getId().equals(sendE.getId())) {
						try {
							MyBeanUtils.copyBeanNotNull2Bean(sendE, oldE);
							this.saveOrUpdate(oldE);
						} catch (Exception e) {
							e.printStackTrace();
							throw new BusinessException(e.getMessage());
						}
						isUpdate = true;
						break;
					}
				}
				if (!isUpdate) {
					// 如果数据库存在的明细，前台没有传递过来则是删除-培训
					super.delete(oldE);
				}

			}
			// 3.持久化新增的数据-培训
			for (JformResumeTrainInfoEntity jformResumeTrainInfo : jformResumeTrainInfoList) {
				if (oConvertUtils.isEmpty(jformResumeTrainInfo.getId())) {
					// 外键设置
					jformResumeTrainInfo.setResumeId(jformResumeInfo.getId());
					this.save(jformResumeTrainInfo);
				}
			}
		}
		// ===================================================================================
		// 1.查询出数据库的明细数据-学历
		String hql1 = "from JformResumeDegreeInfoEntity where 1 = 1 AND rESUME_ID = ? ";
		List<JformResumeDegreeInfoEntity> jformResumeDegreeInfoOldList = this.findHql(hql1, id1);
		// 2.筛选更新明细数据-学历
		if (jformResumeDegreeInfoList != null && jformResumeDegreeInfoList.size() > 0) {
			for (JformResumeDegreeInfoEntity oldE : jformResumeDegreeInfoOldList) {
				boolean isUpdate = false;
				for (JformResumeDegreeInfoEntity sendE : jformResumeDegreeInfoList) {
					// 需要更新的明细数据-学历
					if (oldE.getId().equals(sendE.getId())) {
						try {
							MyBeanUtils.copyBeanNotNull2Bean(sendE, oldE);
							this.saveOrUpdate(oldE);
						} catch (Exception e) {
							e.printStackTrace();
							throw new BusinessException(e.getMessage());
						}
						isUpdate = true;
						break;
					}
				}
				if (!isUpdate) {
					// 如果数据库存在的明细，前台没有传递过来则是删除-学历
					super.delete(oldE);
				}

			}
			// 3.持久化新增的数据-学历
			for (JformResumeDegreeInfoEntity jformResumeDegreeInfo : jformResumeDegreeInfoList) {
				if (oConvertUtils.isEmpty(jformResumeDegreeInfo.getId())) {
					// 外键设置
					jformResumeDegreeInfo.setResumeId(jformResumeInfo.getId());
					this.save(jformResumeDegreeInfo);
				}
			}
		}
		// ===================================================================================
		// 1.查询出数据库的明细数据-经历
		String hql2 = "from JformResumeExpInfoEntity where 1 = 1 AND rESUME_ID = ? ";
		List<JformResumeExpInfoEntity> jformResumeExpInfoOldList = this.findHql(hql2, id2);
		// 2.筛选更新明细数据-经历
		if (jformResumeExpInfoList != null && jformResumeExpInfoList.size() > 0) {
			for (JformResumeExpInfoEntity oldE : jformResumeExpInfoOldList) {
				boolean isUpdate = false;
				for (JformResumeExpInfoEntity sendE : jformResumeExpInfoList) {
					// 需要更新的明细数据-经历
					if (oldE.getId().equals(sendE.getId())) {
						try {
							MyBeanUtils.copyBeanNotNull2Bean(sendE, oldE);
							this.saveOrUpdate(oldE);
						} catch (Exception e) {
							e.printStackTrace();
							throw new BusinessException(e.getMessage());
						}
						isUpdate = true;
						break;
					}
				}
				if (!isUpdate) {
					// 如果数据库存在的明细，前台没有传递过来则是删除-经历
					super.delete(oldE);
				}

			}
			// 3.持久化新增的数据-经历
			for (JformResumeExpInfoEntity jformResumeExpInfo : jformResumeExpInfoList) {
				if (oConvertUtils.isEmpty(jformResumeExpInfo.getId())) {
					// 外键设置
					jformResumeExpInfo.setResumeId(jformResumeInfo.getId());
					this.save(jformResumeExpInfo);
				}
			}
		}
		// ===================================================================================
		// 1.查询出数据库的明细数据-家庭成员
		String hql3 = "from JformResumeFamilyInfoEntity where 1 = 1 AND rESUME_ID = ? ";
		List<JformResumeFamilyInfoEntity> jformResumeFamilyInfoOldList = this.findHql(hql3, id3);
		// 2.筛选更新明细数据-家庭成员
		if (jformResumeFamilyInfoList != null && jformResumeFamilyInfoList.size() > 0) {
			for (JformResumeFamilyInfoEntity oldE : jformResumeFamilyInfoOldList) {
				boolean isUpdate = false;
				for (JformResumeFamilyInfoEntity sendE : jformResumeFamilyInfoList) {
					// 需要更新的明细数据-家庭成员
					if (oldE.getId().equals(sendE.getId())) {
						try {
							MyBeanUtils.copyBeanNotNull2Bean(sendE, oldE);
							this.saveOrUpdate(oldE);
						} catch (Exception e) {
							e.printStackTrace();
							throw new BusinessException(e.getMessage());
						}
						isUpdate = true;
						break;
					}
				}
				if (!isUpdate) {
					// 如果数据库存在的明细，前台没有传递过来则是删除-家庭成员
					super.delete(oldE);
				}

			}
			// 3.持久化新增的数据-家庭成员
			for (JformResumeFamilyInfoEntity jformResumeFamilyInfo : jformResumeFamilyInfoList) {
				if (oConvertUtils.isEmpty(jformResumeFamilyInfo.getId())) {
					// 外键设置
					jformResumeFamilyInfo.setResumeId(jformResumeInfo.getId());
					this.save(jformResumeFamilyInfo);
				}
			}
		}
		// 执行更新操作配置的sql增强
		this.doUpdateSql(jformResumeInfo);
	}

	public void delMain(JformResumeInfoEntity jformResumeInfo) {
		// 删除主表信息
		this.delete(jformResumeInfo);
		// ===================================================================================
		// 获取参数
		Object id0 = jformResumeInfo.getEmpNo();
		Object id1 = jformResumeInfo.getEmpNo();
		Object id2 = jformResumeInfo.getEmpNo();
		Object id3 = jformResumeInfo.getEmpNo();
		// ===================================================================================
		// 删除-培训
		String hql0 = "from JformResumeTrainInfoEntity where 1 = 1 AND rESUME_ID = ? ";
		List<JformResumeTrainInfoEntity> jformResumeTrainInfoOldList = this.findHql(hql0, id0);
		this.deleteAllEntitie(jformResumeTrainInfoOldList);
		// ===================================================================================
		// 删除-学历
		String hql1 = "from JformResumeDegreeInfoEntity where 1 = 1 AND rESUME_ID = ? ";
		List<JformResumeDegreeInfoEntity> jformResumeDegreeInfoOldList = this.findHql(hql1, id1);
		this.deleteAllEntitie(jformResumeDegreeInfoOldList);
		// ===================================================================================
		// 删除-经历
		String hql2 = "from JformResumeExpInfoEntity where 1 = 1 AND rESUME_ID = ? ";
		List<JformResumeExpInfoEntity> jformResumeExpInfoOldList = this.findHql(hql2, id2);
		this.deleteAllEntitie(jformResumeExpInfoOldList);
		// ===================================================================================
		// 删除-家庭成员
		String hql3 = "from JformResumeFamilyInfoEntity where 1 = 1 AND rESUME_ID = ? ";
		List<JformResumeFamilyInfoEntity> jformResumeFamilyInfoOldList = this.findHql(hql3, id3);
		this.deleteAllEntitie(jformResumeFamilyInfoOldList);
	}

	/**
	 * 默认按钮-sql增强-新增操作
	 * 
	 * @param id
	 * @return
	 */
	public boolean doAddSql(JformResumeInfoEntity t) {
		return true;
	}

	/**
	 * 默认按钮-sql增强-更新操作
	 * 
	 * @param id
	 * @return
	 */
	public boolean doUpdateSql(JformResumeInfoEntity t) {
		return true;
	}

	/**
	 * 默认按钮-sql增强-删除操作
	 * 
	 * @param id
	 * @return
	 */
	public boolean doDelSql(JformResumeInfoEntity t) {
		return true;
	}

	/**
	 * 替换sql中的变量
	 * 
	 * @param sql
	 * @return
	 */
	public String replaceVal(String sql, JformResumeInfoEntity t) {
		sql = sql.replace("#{id}", String.valueOf(t.getId()));
		sql = sql.replace("#{name}", String.valueOf(t.getName()));
		sql = sql.replace("#{sex}", String.valueOf(t.getSex()));
		sql = sql.replace("#{birthday}", String.valueOf(t.getBirthday()));
		sql = sql.replace("#{email}", String.valueOf(t.getEmail()));
		sql = sql.replace("#{degree}", String.valueOf(t.getDegree()));
		sql = sql.replace("#{workyear}", String.valueOf(t.getWorkyear()));
		sql = sql.replace("#{cardid}", String.valueOf(t.getCardid()));
		sql = sql.replace("#{habitation}", String.valueOf(t.getHabitation()));
		sql = sql.replace("#{residence}", String.valueOf(t.getResidence()));
		sql = sql.replace("#{salary}", String.valueOf(t.getSalary()));
		sql = sql.replace("#{work_place}", String.valueOf(t.getWorkPlace()));
		sql = sql.replace("#{arrival_time}", String.valueOf(t.getArrivalTime()));
		sql = sql.replace("#{mz}", String.valueOf(t.getMz()));
		sql = sql.replace("#{jg}", String.valueOf(t.getJg()));
		sql = sql.replace("#{zzmm}", String.valueOf(t.getZzmm()));
		sql = sql.replace("#{hyzk}", String.valueOf(t.getHyzk()));
		sql = sql.replace("#{sg}", String.valueOf(t.getSg()));
		sql = sql.replace("#{jkzk}", String.valueOf(t.getJkzk()));
		sql = sql.replace("#{jszgz}", String.valueOf(t.getJszgz()));
		sql = sql.replace("#{zcdj}", String.valueOf(t.getZcdj()));
		sql = sql.replace("#{wydj}", String.valueOf(t.getWydj()));
		sql = sql.replace("#{pthdj}", String.valueOf(t.getPthdj()));
		sql = sql.replace("#{telnum}", String.valueOf(t.getTelnum()));
		sql = sql.replace("#{jjlxr_name}", String.valueOf(t.getJjlxrName()));
		sql = sql.replace("#{jjlxr_mobile}", String.valueOf(t.getJjlxrMobile()));
		sql = sql.replace("#{ahtc}", String.valueOf(t.getAhtc()));
		sql = sql.replace("#{ypxz}", String.valueOf(t.getYpxz()));
		sql = sql.replace("#{is_change}", String.valueOf(t.getIsChange()));
		sql = sql.replace("#{info_source}", String.valueOf(t.getInfoSource()));
		sql = sql.replace("#{emp_no}", String.valueOf(t.getEmpNo()));
		sql = sql.replace("#{UUID}", UUID.randomUUID().toString());
		sql = sql.replace("#{depart_no}",  String.valueOf(t.getDepartNo()));
		sql = sql.replace("#{duty_no}",  String.valueOf(t.getDutyNo()));
		return sql;
	}
}