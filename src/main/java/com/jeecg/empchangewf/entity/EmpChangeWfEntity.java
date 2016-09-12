package com.jeecg.empchangewf.entity;

import java.math.BigDecimal;
import java.util.Date;
import java.lang.String;
import java.lang.Double;
import java.lang.Integer;
import java.math.BigDecimal;
import javax.xml.soap.Text;
import java.sql.Blob;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;
import javax.persistence.SequenceGenerator;
import org.jeecgframework.poi.excel.annotation.Excel;

/**   
 * @Title: Entity
 * @Description: 员工异动流程表
 * @author onlineGenerator
 * @date 2016-09-06 17:23:59
 * @version V1.0   
 *
 */
@Entity
@Table(name = "emp_change_wf", schema = "")
@SuppressWarnings("serial")
public class EmpChangeWfEntity implements java.io.Serializable {
	/**主键*/
	private java.lang.String id;
	/**创建人名称*/
	private java.lang.String createName;
	/**创建人登录名称*/
	private java.lang.String createBy;
	/**创建日期*/
	private java.util.Date createDate;
	/**更新人名称*/
	private java.lang.String updateName;
	/**更新人登录名称*/
	private java.lang.String updateBy;
	/**更新日期*/
	private java.util.Date updateDate;
	/**所属部门*/
	private java.lang.String sysOrgCode;
	/**所属公司*/
	private java.lang.String sysCompanyCode;
	/**流程状态*/
	private java.lang.String bpmStatus;
	/**员工编号*/
	@Excel(name="员工编号")
	private java.lang.String empno;
	/**性别*/
	@Excel(name="性别")
	private java.lang.String sex;
	/**入职日期*/
	@Excel(name="入职日期")
	private java.lang.String ruzhiDate;
	/**生效日期*/
	@Excel(name="生效日期")
	private java.lang.String sxDate;
	/**异动原因类型*/
	@Excel(name="异动原因类型")
	private java.lang.String changeType;
	/**异动前部门*/
	@Excel(name="异动前部门")
	private java.lang.String org1;
	/**异动前岗位*/
	@Excel(name="异动前岗位")
	private java.lang.String dept1;
	/**异动前薪资*/
	@Excel(name="异动前薪资")
	private java.lang.String salary1;
	/**异动前补贴*/
	@Excel(name="异动前补贴")
	private java.lang.String butie1;
	/**异动前其他*/
	@Excel(name="异动前其他")
	private java.lang.String other1;
	/**异动后部门*/
	@Excel(name="异动后部门")
	private java.lang.String org2;
	/**异动后岗位*/
	@Excel(name="异动后岗位")
	private java.lang.String dept2;
	/**异动后薪资*/
	@Excel(name="异动后薪资")
	private java.lang.String salary2;
	/**异动后补贴*/
	@Excel(name="异动后补贴")
	private java.lang.String butie2;
	/**异动后其他*/
	@Excel(name="异动后其他")
	private java.lang.String other2;
	/**具体原因*/
	@Excel(name="具体原因")
	private java.lang.String reason;
	/**申请人名称*/
	@Excel(name="申请人名称")
	private java.lang.String reqName;
	/**申请人电话*/
	@Excel(name="申请人电话")
	private java.lang.String reqMobile;
	/**填表时间*/
	@Excel(name="填表时间")
	private java.lang.String reqDate;
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  主键
	 */
	@Id
	@GeneratedValue(generator = "paymentableGenerator")
	@GenericGenerator(name = "paymentableGenerator", strategy = "uuid")
	@Column(name ="ID",nullable=false,length=36)
	public java.lang.String getId(){
		return this.id;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  主键
	 */
	public void setId(java.lang.String id){
		this.id = id;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  创建人名称
	 */
	@Column(name ="CREATE_NAME",nullable=true,length=50)
	public java.lang.String getCreateName(){
		return this.createName;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  创建人名称
	 */
	public void setCreateName(java.lang.String createName){
		this.createName = createName;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  创建人登录名称
	 */
	@Column(name ="CREATE_BY",nullable=true,length=50)
	public java.lang.String getCreateBy(){
		return this.createBy;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  创建人登录名称
	 */
	public void setCreateBy(java.lang.String createBy){
		this.createBy = createBy;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  创建日期
	 */
	@Column(name ="CREATE_DATE",nullable=true,length=20)
	public java.util.Date getCreateDate(){
		return this.createDate;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  创建日期
	 */
	public void setCreateDate(java.util.Date createDate){
		this.createDate = createDate;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  更新人名称
	 */
	@Column(name ="UPDATE_NAME",nullable=true,length=50)
	public java.lang.String getUpdateName(){
		return this.updateName;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  更新人名称
	 */
	public void setUpdateName(java.lang.String updateName){
		this.updateName = updateName;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  更新人登录名称
	 */
	@Column(name ="UPDATE_BY",nullable=true,length=50)
	public java.lang.String getUpdateBy(){
		return this.updateBy;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  更新人登录名称
	 */
	public void setUpdateBy(java.lang.String updateBy){
		this.updateBy = updateBy;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  更新日期
	 */
	@Column(name ="UPDATE_DATE",nullable=true,length=20)
	public java.util.Date getUpdateDate(){
		return this.updateDate;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  更新日期
	 */
	public void setUpdateDate(java.util.Date updateDate){
		this.updateDate = updateDate;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  所属部门
	 */
	@Column(name ="SYS_ORG_CODE",nullable=true,length=50)
	public java.lang.String getSysOrgCode(){
		return this.sysOrgCode;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  所属部门
	 */
	public void setSysOrgCode(java.lang.String sysOrgCode){
		this.sysOrgCode = sysOrgCode;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  所属公司
	 */
	@Column(name ="SYS_COMPANY_CODE",nullable=true,length=50)
	public java.lang.String getSysCompanyCode(){
		return this.sysCompanyCode;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  所属公司
	 */
	public void setSysCompanyCode(java.lang.String sysCompanyCode){
		this.sysCompanyCode = sysCompanyCode;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  流程状态
	 */
	@Column(name ="BPM_STATUS",nullable=true,length=32)
	public java.lang.String getBpmStatus(){
		return this.bpmStatus;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  流程状态
	 */
	public void setBpmStatus(java.lang.String bpmStatus){
		this.bpmStatus = bpmStatus;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  员工编号
	 */
	@Column(name ="EMPNO",nullable=true,length=32)
	public java.lang.String getEmpno(){
		return this.empno;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  员工编号
	 */
	public void setEmpno(java.lang.String empno){
		this.empno = empno;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  性别
	 */
	@Column(name ="SEX",nullable=true,length=32)
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
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  入职日期
	 */
	@Column(name ="RUZHI_DATE",nullable=true,length=32)
	public java.lang.String getRuzhiDate(){
		return this.ruzhiDate;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  入职日期
	 */
	public void setRuzhiDate(java.lang.String ruzhiDate){
		this.ruzhiDate = ruzhiDate;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  生效日期
	 */
	@Column(name ="SX_DATE",nullable=true,length=32)
	public java.lang.String getSxDate(){
		return this.sxDate;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  生效日期
	 */
	public void setSxDate(java.lang.String sxDate){
		this.sxDate = sxDate;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  异动原因类型
	 */
	@Column(name ="CHANGE_TYPE",nullable=true,length=32)
	public java.lang.String getChangeType(){
		return this.changeType;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  异动原因类型
	 */
	public void setChangeType(java.lang.String changeType){
		this.changeType = changeType;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  异动前部门
	 */
	@Column(name ="ORG1",nullable=true,length=32)
	public java.lang.String getOrg1(){
		return this.org1;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  异动前部门
	 */
	public void setOrg1(java.lang.String org1){
		this.org1 = org1;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  异动前岗位
	 */
	@Column(name ="DEPT1",nullable=true,length=32)
	public java.lang.String getDept1(){
		return this.dept1;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  异动前岗位
	 */
	public void setDept1(java.lang.String dept1){
		this.dept1 = dept1;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  异动前薪资
	 */
	@Column(name ="SALARY1",nullable=true,length=32)
	public java.lang.String getSalary1(){
		return this.salary1;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  异动前薪资
	 */
	public void setSalary1(java.lang.String salary1){
		this.salary1 = salary1;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  异动前补贴
	 */
	@Column(name ="BUTIE1",nullable=true,length=32)
	public java.lang.String getButie1(){
		return this.butie1;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  异动前补贴
	 */
	public void setButie1(java.lang.String butie1){
		this.butie1 = butie1;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  异动前其他
	 */
	@Column(name ="OTHER1",nullable=true,length=32)
	public java.lang.String getOther1(){
		return this.other1;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  异动前其他
	 */
	public void setOther1(java.lang.String other1){
		this.other1 = other1;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  异动后部门
	 */
	@Column(name ="ORG2",nullable=true,length=32)
	public java.lang.String getOrg2(){
		return this.org2;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  异动后部门
	 */
	public void setOrg2(java.lang.String org2){
		this.org2 = org2;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  异动后岗位
	 */
	@Column(name ="DEPT2",nullable=true,length=32)
	public java.lang.String getDept2(){
		return this.dept2;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  异动后岗位
	 */
	public void setDept2(java.lang.String dept2){
		this.dept2 = dept2;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  异动后薪资
	 */
	@Column(name ="SALARY2",nullable=true,length=32)
	public java.lang.String getSalary2(){
		return this.salary2;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  异动后薪资
	 */
	public void setSalary2(java.lang.String salary2){
		this.salary2 = salary2;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  异动后补贴
	 */
	@Column(name ="BUTIE2",nullable=true,length=32)
	public java.lang.String getButie2(){
		return this.butie2;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  异动后补贴
	 */
	public void setButie2(java.lang.String butie2){
		this.butie2 = butie2;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  异动后其他
	 */
	@Column(name ="OTHER2",nullable=true,length=32)
	public java.lang.String getOther2(){
		return this.other2;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  异动后其他
	 */
	public void setOther2(java.lang.String other2){
		this.other2 = other2;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  具体原因
	 */
	@Column(name ="REASON",nullable=true,length=32)
	public java.lang.String getReason(){
		return this.reason;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  具体原因
	 */
	public void setReason(java.lang.String reason){
		this.reason = reason;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  申请人名称
	 */
	@Column(name ="REQ_NAME",nullable=true,length=32)
	public java.lang.String getReqName(){
		return this.reqName;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  申请人名称
	 */
	public void setReqName(java.lang.String reqName){
		this.reqName = reqName;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  申请人电话
	 */
	@Column(name ="REQ_MOBILE",nullable=true,length=32)
	public java.lang.String getReqMobile(){
		return this.reqMobile;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  申请人电话
	 */
	public void setReqMobile(java.lang.String reqMobile){
		this.reqMobile = reqMobile;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  填表时间
	 */
	@Column(name ="REQ_DATE",nullable=true,length=32)
	public java.lang.String getReqDate(){
		return this.reqDate;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  填表时间
	 */
	public void setReqDate(java.lang.String reqDate){
		this.reqDate = reqDate;
	}
}
