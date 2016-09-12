package com.jeecg.empleavewf.entity;

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
 * @Description: 员工请假流程表
 * @author onlineGenerator
 * @date 2016-09-06 17:21:28
 * @version V1.0   
 *
 */
@Entity
@Table(name = "emp_leave_wf", schema = "")
@SuppressWarnings("serial")
public class EmpLeaveWfEntity implements java.io.Serializable {
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
	/**请假类别*/
	@Excel(name="请假类别")
	private java.lang.String leaveType;
	/**请假天数*/
	@Excel(name="请假天数")
	private java.lang.String leaveDays;
	/**请假事由*/
	@Excel(name="请假事由")
	private java.lang.String reasons;
	/**请假起始日期*/
	@Excel(name="请假起始日期")
	private java.lang.String startDate;
	/**请假结束日期*/
	@Excel(name="请假结束日期")
	private java.lang.String endDate;
	/**申请人编号*/
	@Excel(name="申请人编号")
	private java.lang.String empNo;
	/**申请人名称*/
	@Excel(name="申请人名称")
	private java.lang.String empName;
	
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
	 *@return: java.lang.String  请假类别
	 */
	@Column(name ="LEAVE_TYPE",nullable=true,length=32)
	public java.lang.String getLeaveType(){
		return this.leaveType;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  请假类别
	 */
	public void setLeaveType(java.lang.String leaveType){
		this.leaveType = leaveType;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  请假天数
	 */
	@Column(name ="LEAVE_DAYS",nullable=true,length=32)
	public java.lang.String getLeaveDays(){
		return this.leaveDays;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  请假天数
	 */
	public void setLeaveDays(java.lang.String leaveDays){
		this.leaveDays = leaveDays;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  请假事由
	 */
	@Column(name ="REASONS",nullable=true,length=32)
	public java.lang.String getReasons(){
		return this.reasons;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  请假事由
	 */
	public void setReasons(java.lang.String reasons){
		this.reasons = reasons;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  请假起始日期
	 */
	@Column(name ="START_DATE",nullable=true,length=32)
	public java.lang.String getStartDate(){
		return this.startDate;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  请假起始日期
	 */
	public void setStartDate(java.lang.String startDate){
		this.startDate = startDate;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  请假结束日期
	 */
	@Column(name ="END_DATE",nullable=true,length=32)
	public java.lang.String getEndDate(){
		return this.endDate;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  请假结束日期
	 */
	public void setEndDate(java.lang.String endDate){
		this.endDate = endDate;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  申请人编号
	 */
	@Column(name ="EMP_NO",nullable=true,length=32)
	public java.lang.String getEmpNo(){
		return this.empNo;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  申请人编号
	 */
	public void setEmpNo(java.lang.String empNo){
		this.empNo = empNo;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  申请人名称
	 */
	@Column(name ="EMP_NAME",nullable=true,length=32)
	public java.lang.String getEmpName(){
		return this.empName;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  申请人名称
	 */
	public void setEmpName(java.lang.String empName){
		this.empName = empName;
	}
}
