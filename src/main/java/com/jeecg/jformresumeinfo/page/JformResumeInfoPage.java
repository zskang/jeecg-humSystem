
package com.jeecg.jformresumeinfo.page;
import com.jeecg.jformresumeinfo.entity.JformResumeInfoEntity;
import com.jeecg.jformresumetraininfo.entity.JformResumeTrainInfoEntity;
import com.jeecg.jformresumedegreeinfo.entity.JformResumeDegreeInfoEntity;
import com.jeecg.jformresumeexpinfo.entity.JformResumeExpInfoEntity;
import com.jeecg.jformresumefamilyinfo.entity.JformResumeFamilyInfoEntity;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;
import javax.persistence.SequenceGenerator;
import org.jeecgframework.poi.excel.annotation.Excel;
import org.jeecgframework.poi.excel.annotation.ExcelCollection;

/**   
 * @Title: Entity
 * @Description: 员工信息表
 * @author onlineGenerator
 * @date 2016-09-09 07:20:46
 * @version V1.0   
 *
 */
public class JformResumeInfoPage implements java.io.Serializable {
	/**id*/
	private java.lang.String id;
	/**姓名*/
    @Excel(name="姓名")
	private java.lang.String name;
	/**性别*/
    @Excel(name="性别")
	private java.lang.String sex;
	/**出生年月*/
    @Excel(name="出生年月",format = "yyyy-MM-dd")
	private java.util.Date birthday;
	/**电子邮箱*/
    @Excel(name="电子邮箱")
	private java.lang.String email;
	/**最高学历*/
    @Excel(name="最高学历")
	private java.lang.String degree;
	/**工作年限*/
    @Excel(name="工作年限")
	private java.lang.String workyear;
	/**身份证号*/
	private java.lang.String cardid;
	/**现居地*/
	private java.lang.String habitation;
	/**户口所在地*/
    @Excel(name="户口所在地")
	private java.lang.String residence;
	/**期望薪资*/
    @Excel(name="期望薪资")
	private java.lang.String salary;
	/**期望工作地点*/
    @Excel(name="期望工作地点")
	private java.lang.String workPlace;
	/**到岗时间*/
    @Excel(name="到岗时间",format = "yyyy-MM-dd")
	private java.util.Date arrivalTime;
	/**民族*/
    @Excel(name="民族")
	private java.lang.String mz;
	/**籍贯*/
    @Excel(name="籍贯")
	private java.lang.String jg;
	/**政治面貌*/
    @Excel(name="政治面貌")
	private java.lang.String zzmm;
	/**婚姻状况*/
    @Excel(name="婚姻状况")
	private java.lang.String hyzk;
	/**身高*/
    @Excel(name="身高")
	private java.lang.String sg;
	/**健康状况*/
    @Excel(name="健康状况")
	private java.lang.String jkzk;
	/**教师资格证*/
    @Excel(name="教师资格证")
	private java.lang.String jszgz;
	/**职称等级*/
    @Excel(name="职称等级")
	private java.lang.String zcdj;
	/**外语等级*/
    @Excel(name="外语等级")
	private java.lang.String wydj;
	/**普通话等级*/
    @Excel(name="普通话等级")
	private java.lang.String pthdj;
	/**本人联系电话*/
    @Excel(name="本人联系电话")
	private java.lang.String telnum;
	/**紧急联系人姓名*/
    @Excel(name="紧急联系人姓名")
	private java.lang.String jjlxrName;
	/**紧急联系人电话*/
    @Excel(name="紧急联系人电话")
	private java.lang.String jjlxrMobile;
	/**爱好与特长*/
    @Excel(name="爱好与特长")
	private java.lang.String ahtc;
	/**应聘性质*/
    @Excel(name="应聘性质")
	private java.lang.String ypxz;
	/**是否接受调动*/
    @Excel(name="是否接受调动")
	private java.lang.String isChange;
	/**信息来源*/
    @Excel(name="信息来源")
	private java.lang.String infoSource;
	/**员工编号*/
    @Excel(name="员工编号")
	private java.lang.String empNo;
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  id
	 */
	public java.lang.String getId(){
		return this.id;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  id
	 */
	public void setId(java.lang.String id){
		this.id = id;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  姓名
	 */
	public java.lang.String getName(){
		return this.name;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  姓名
	 */
	public void setName(java.lang.String name){
		this.name = name;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  性别
	 */
	public java.lang.String getSex(){
		return this.sex;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  性别
	 */
	public void setSex(java.lang.String sex){
		this.sex = sex;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  出生年月
	 */
	public java.util.Date getBirthday(){
		return this.birthday;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  出生年月
	 */
	public void setBirthday(java.util.Date birthday){
		this.birthday = birthday;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  电子邮箱
	 */
	public java.lang.String getEmail(){
		return this.email;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  电子邮箱
	 */
	public void setEmail(java.lang.String email){
		this.email = email;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  最高学历
	 */
	public java.lang.String getDegree(){
		return this.degree;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  最高学历
	 */
	public void setDegree(java.lang.String degree){
		this.degree = degree;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  工作年限
	 */
	public java.lang.String getWorkyear(){
		return this.workyear;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  工作年限
	 */
	public void setWorkyear(java.lang.String workyear){
		this.workyear = workyear;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  身份证号
	 */
	public java.lang.String getCardid(){
		return this.cardid;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  身份证号
	 */
	public void setCardid(java.lang.String cardid){
		this.cardid = cardid;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  现居地
	 */
	public java.lang.String getHabitation(){
		return this.habitation;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  现居地
	 */
	public void setHabitation(java.lang.String habitation){
		this.habitation = habitation;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  户口所在地
	 */
	public java.lang.String getResidence(){
		return this.residence;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  户口所在地
	 */
	public void setResidence(java.lang.String residence){
		this.residence = residence;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  期望薪资
	 */
	public java.lang.String getSalary(){
		return this.salary;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  期望薪资
	 */
	public void setSalary(java.lang.String salary){
		this.salary = salary;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  期望工作地点
	 */
	public java.lang.String getWorkPlace(){
		return this.workPlace;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  期望工作地点
	 */
	public void setWorkPlace(java.lang.String workPlace){
		this.workPlace = workPlace;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  到岗时间
	 */
	public java.util.Date getArrivalTime(){
		return this.arrivalTime;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  到岗时间
	 */
	public void setArrivalTime(java.util.Date arrivalTime){
		this.arrivalTime = arrivalTime;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  民族
	 */
	public java.lang.String getMz(){
		return this.mz;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  民族
	 */
	public void setMz(java.lang.String mz){
		this.mz = mz;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  籍贯
	 */
	public java.lang.String getJg(){
		return this.jg;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  籍贯
	 */
	public void setJg(java.lang.String jg){
		this.jg = jg;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  政治面貌
	 */
	public java.lang.String getZzmm(){
		return this.zzmm;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  政治面貌
	 */
	public void setZzmm(java.lang.String zzmm){
		this.zzmm = zzmm;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  婚姻状况
	 */
	public java.lang.String getHyzk(){
		return this.hyzk;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  婚姻状况
	 */
	public void setHyzk(java.lang.String hyzk){
		this.hyzk = hyzk;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  身高
	 */
	public java.lang.String getSg(){
		return this.sg;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  身高
	 */
	public void setSg(java.lang.String sg){
		this.sg = sg;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  健康状况
	 */
	public java.lang.String getJkzk(){
		return this.jkzk;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  健康状况
	 */
	public void setJkzk(java.lang.String jkzk){
		this.jkzk = jkzk;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  教师资格证
	 */
	public java.lang.String getJszgz(){
		return this.jszgz;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  教师资格证
	 */
	public void setJszgz(java.lang.String jszgz){
		this.jszgz = jszgz;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  职称等级
	 */
	public java.lang.String getZcdj(){
		return this.zcdj;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  职称等级
	 */
	public void setZcdj(java.lang.String zcdj){
		this.zcdj = zcdj;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  外语等级
	 */
	public java.lang.String getWydj(){
		return this.wydj;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  外语等级
	 */
	public void setWydj(java.lang.String wydj){
		this.wydj = wydj;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  普通话等级
	 */
	public java.lang.String getPthdj(){
		return this.pthdj;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  普通话等级
	 */
	public void setPthdj(java.lang.String pthdj){
		this.pthdj = pthdj;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  本人联系电话
	 */
	public java.lang.String getTelnum(){
		return this.telnum;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  本人联系电话
	 */
	public void setTelnum(java.lang.String telnum){
		this.telnum = telnum;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  紧急联系人姓名
	 */
	public java.lang.String getJjlxrName(){
		return this.jjlxrName;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  紧急联系人姓名
	 */
	public void setJjlxrName(java.lang.String jjlxrName){
		this.jjlxrName = jjlxrName;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  紧急联系人电话
	 */
	public java.lang.String getJjlxrMobile(){
		return this.jjlxrMobile;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  紧急联系人电话
	 */
	public void setJjlxrMobile(java.lang.String jjlxrMobile){
		this.jjlxrMobile = jjlxrMobile;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  爱好与特长
	 */
	public java.lang.String getAhtc(){
		return this.ahtc;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  爱好与特长
	 */
	public void setAhtc(java.lang.String ahtc){
		this.ahtc = ahtc;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  应聘性质
	 */
	public java.lang.String getYpxz(){
		return this.ypxz;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  应聘性质
	 */
	public void setYpxz(java.lang.String ypxz){
		this.ypxz = ypxz;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  是否接受调动
	 */
	public java.lang.String getIsChange(){
		return this.isChange;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  是否接受调动
	 */
	public void setIsChange(java.lang.String isChange){
		this.isChange = isChange;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  信息来源
	 */
	public java.lang.String getInfoSource(){
		return this.infoSource;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  信息来源
	 */
	public void setInfoSource(java.lang.String infoSource){
		this.infoSource = infoSource;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  员工编号
	 */
	public java.lang.String getEmpNo(){
		return this.empNo;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  员工编号
	 */
	public void setEmpNo(java.lang.String empNo){
		this.empNo = empNo;
	}

	/**保存-培训*/
    @ExcelCollection(name="培训")
	private List<JformResumeTrainInfoEntity> jformResumeTrainInfoList = new ArrayList<JformResumeTrainInfoEntity>();
		public List<JformResumeTrainInfoEntity> getJformResumeTrainInfoList() {
		return jformResumeTrainInfoList;
		}
		public void setJformResumeTrainInfoList(List<JformResumeTrainInfoEntity> jformResumeTrainInfoList) {
		this.jformResumeTrainInfoList = jformResumeTrainInfoList;
		}
	/**保存-学历*/
    @ExcelCollection(name="学历")
	private List<JformResumeDegreeInfoEntity> jformResumeDegreeInfoList = new ArrayList<JformResumeDegreeInfoEntity>();
		public List<JformResumeDegreeInfoEntity> getJformResumeDegreeInfoList() {
		return jformResumeDegreeInfoList;
		}
		public void setJformResumeDegreeInfoList(List<JformResumeDegreeInfoEntity> jformResumeDegreeInfoList) {
		this.jformResumeDegreeInfoList = jformResumeDegreeInfoList;
		}
	/**保存-经历*/
    @ExcelCollection(name="经历")
	private List<JformResumeExpInfoEntity> jformResumeExpInfoList = new ArrayList<JformResumeExpInfoEntity>();
		public List<JformResumeExpInfoEntity> getJformResumeExpInfoList() {
		return jformResumeExpInfoList;
		}
		public void setJformResumeExpInfoList(List<JformResumeExpInfoEntity> jformResumeExpInfoList) {
		this.jformResumeExpInfoList = jformResumeExpInfoList;
		}
	/**保存-家庭成员*/
    @ExcelCollection(name="家庭成员")
	private List<JformResumeFamilyInfoEntity> jformResumeFamilyInfoList = new ArrayList<JformResumeFamilyInfoEntity>();
		public List<JformResumeFamilyInfoEntity> getJformResumeFamilyInfoList() {
		return jformResumeFamilyInfoList;
		}
		public void setJformResumeFamilyInfoList(List<JformResumeFamilyInfoEntity> jformResumeFamilyInfoList) {
		this.jformResumeFamilyInfoList = jformResumeFamilyInfoList;
		}
}
