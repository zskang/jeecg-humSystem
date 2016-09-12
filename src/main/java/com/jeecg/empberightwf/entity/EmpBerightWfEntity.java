package com.jeecg.empberightwf.entity;

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
 * @Description: 员工转正流程表
 * @author onlineGenerator
 * @date 2016-09-06 17:24:57
 * @version V1.0   
 *
 */
@Entity
@Table(name = "emp_beright_wf", schema = "")
@SuppressWarnings("serial")
public class EmpBerightWfEntity implements java.io.Serializable {
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
	private java.lang.String empNo;
	/**性别*/
	@Excel(name="性别")
	private java.lang.String sex;
	/**出生日期*/
	@Excel(name="出生日期")
	private java.lang.String birth;
	/**所属部门*/
	@Excel(name="所属部门")
	private java.lang.String orgno;
	/**所属岗位*/
	@Excel(name="所属岗位")
	private java.lang.String deptno;
	/**入职时间*/
	@Excel(name="入职时间")
	private java.lang.String ruzhiDate;
	/**转正日期*/
	@Excel(name="转正日期")
	private java.lang.String berightDate;
	/**试用期工资*/
	@Excel(name="试用期工资")
	private java.lang.String trySalary;
	/**转正后薪资*/
	@Excel(name="转正后薪资")
	private java.lang.String rightSalary;
	/**试用期总结*/
	@Excel(name="试用期总结")
	private java.lang.String remark;
	/**签字人姓名*/
	@Excel(name="签字人姓名")
	private java.lang.String reqName;
	/**签字时间*/
	@Excel(name="签字时间")
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
	@Column(name ="EMP_NO",nullable=true,length=32)
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
	 *@return: java.lang.String  出生日期
	 */
	@Column(name ="BIRTH",nullable=true,length=32)
	public java.lang.String getBirth(){
		return this.birth;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  出生日期
	 */
	public void setBirth(java.lang.String birth){
		this.birth = birth;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  所属部门
	 */
	@Column(name ="ORGNO",nullable=true,length=32)
	public java.lang.String getOrgno(){
		return this.orgno;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  所属部门
	 */
	public void setOrgno(java.lang.String orgno){
		this.orgno = orgno;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  所属岗位
	 */
	@Column(name ="DEPTNO",nullable=true,length=32)
	public java.lang.String getDeptno(){
		return this.deptno;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  所属岗位
	 */
	public void setDeptno(java.lang.String deptno){
		this.deptno = deptno;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  入职时间
	 */
	@Column(name ="RUZHI_DATE",nullable=true,length=32)
	public java.lang.String getRuzhiDate(){
		return this.ruzhiDate;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  入职时间
	 */
	public void setRuzhiDate(java.lang.String ruzhiDate){
		this.ruzhiDate = ruzhiDate;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  转正日期
	 */
	@Column(name ="BERIGHT_DATE",nullable=true,length=32)
	public java.lang.String getBerightDate(){
		return this.berightDate;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  转正日期
	 */
	public void setBerightDate(java.lang.String berightDate){
		this.berightDate = berightDate;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  试用期工资
	 */
	@Column(name ="TRY_SALARY",nullable=true,length=32)
	public java.lang.String getTrySalary(){
		return this.trySalary;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  试用期工资
	 */
	public void setTrySalary(java.lang.String trySalary){
		this.trySalary = trySalary;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  转正后薪资
	 */
	@Column(name ="RIGHT_SALARY",nullable=true,length=32)
	public java.lang.String getRightSalary(){
		return this.rightSalary;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  转正后薪资
	 */
	public void setRightSalary(java.lang.String rightSalary){
		this.rightSalary = rightSalary;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  试用期总结
	 */
	@Column(name ="REMARK",nullable=true,length=3000)
	public java.lang.String getRemark(){
		return this.remark;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  试用期总结
	 */
	public void setRemark(java.lang.String remark){
		this.remark = remark;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  签字人姓名
	 */
	@Column(name ="REQ_NAME",nullable=true,length=32)
	public java.lang.String getReqName(){
		return this.reqName;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  签字人姓名
	 */
	public void setReqName(java.lang.String reqName){
		this.reqName = reqName;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  签字时间
	 */
	@Column(name ="REQ_DATE",nullable=true,length=32)
	public java.lang.String getReqDate(){
		return this.reqDate;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  签字时间
	 */
	public void setReqDate(java.lang.String reqDate){
		this.reqDate = reqDate;
	}
}
