package com.jeecg.jformresumeinfo.service;
import com.jeecg.jformresumeinfo.entity.JformResumeInfoEntity;
import com.jeecg.jformresumetraininfo.entity.JformResumeTrainInfoEntity;
import com.jeecg.jformresumedegreeinfo.entity.JformResumeDegreeInfoEntity;
import com.jeecg.jformresumeexpinfo.entity.JformResumeExpInfoEntity;
import com.jeecg.jformresumefamilyinfo.entity.JformResumeFamilyInfoEntity;

import java.util.List;
import org.jeecgframework.core.common.service.CommonService;
import java.io.Serializable;

public interface JformResumeInfoServiceI extends CommonService{
	
 	public <T> void delete(T entity);
	/**
	 * 添加一对多
	 * 
	 */
	public void addMain(JformResumeInfoEntity jformResumeInfo,
	        List<JformResumeTrainInfoEntity> jformResumeTrainInfoList,List<JformResumeDegreeInfoEntity> jformResumeDegreeInfoList,List<JformResumeExpInfoEntity> jformResumeExpInfoList,List<JformResumeFamilyInfoEntity> jformResumeFamilyInfoList) ;
	/**
	 * 修改一对多
	 * 
	 */
	public void updateMain(JformResumeInfoEntity jformResumeInfo,
	        List<JformResumeTrainInfoEntity> jformResumeTrainInfoList,List<JformResumeDegreeInfoEntity> jformResumeDegreeInfoList,List<JformResumeExpInfoEntity> jformResumeExpInfoList,List<JformResumeFamilyInfoEntity> jformResumeFamilyInfoList);
	public void delMain (JformResumeInfoEntity jformResumeInfo);
	
 	/**
	 * 默认按钮-sql增强-新增操作
	 * @param id
	 * @return
	 */
 	public boolean doAddSql(JformResumeInfoEntity t);
 	/**
	 * 默认按钮-sql增强-更新操作
	 * @param id
	 * @return
	 */
 	public boolean doUpdateSql(JformResumeInfoEntity t);
 	/**
	 * 默认按钮-sql增强-删除操作
	 * @param id
	 * @return
	 */
 	public boolean doDelSql(JformResumeInfoEntity t);
}
