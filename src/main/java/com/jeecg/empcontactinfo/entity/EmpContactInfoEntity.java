package com.jeecg.empcontactinfo.entity;

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
 * @Description: 员工合同信息表
 * @author onlineGenerator
 * @date 2016-08-07 14:58:40
 * @version V1.0   
 *
 */
@Entity
@Table(name = "emp_contact_info", schema = "")
@SuppressWarnings("serial")
public class EmpContactInfoEntity implements java.io.Serializable {
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
	/**流程状态*/
	private java.lang.String bpmStatus;
	/**员工编号*/
	@Excel(name="员工编号")
	private java.lang.String empNo;
	/**员工名称*/
	@Excel(name="员工名称")
	private java.lang.String empName;
	/**合同类型*/
	@Excel(name="合同类型")
	private java.lang.String contactType;
	/**合同生效日期*/
	@Excel(name="合同生效日期")
	private java.lang.String startDate;
	/**合同终止日期*/
	@Excel(name="合同终止日期")
	private java.lang.String endDate;
	/**签订日期*/
	@Excel(name="签订日期")
	private java.lang.String onDate;
	/**合同签订单位*/
	@Excel(name="合同签订单位")
	private java.lang.String contactCompany;
	/**合同工资类型*/
	@Excel(name="合同工资类型")
	private java.lang.String contactMoneyType;
	/**合同工资*/
	@Excel(name="合同工资")
	private java.lang.Double contactMoney;
	/**发放时间*/
	@Excel(name="发放时间")
	private java.lang.String grantDate;
	/**合同状态*/
	@Excel(name="合同状态")
	private java.lang.String contactStatus;
	/**工作时间*/
	@Excel(name="工作时间")
	private java.lang.String workTimes;
	/**合同期限*/
	@Excel(name="合同期限")
	private java.lang.String contactTerm;
	/**试用期限*/
	@Excel(name="试用期限")
	private java.lang.String tryTerm;
	/**试用期终止日期*/
	@Excel(name="试用期终止日期")
	private java.lang.String tryEndDate;
	/**现任职务*/
	@Excel(name="现任职务")
	private java.lang.String duty;
	/**原身份*/
	@Excel(name="原身份")
	private java.lang.String oldSf;
	/**备注*/
	@Excel(name="备注")
	private java.lang.String remark;
	
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
	 *@return: java.lang.String  员工名称
	 */
	@Column(name ="EMP_NAME",nullable=true,length=32)
	public java.lang.String getEmpName(){
		return this.empName;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  员工名称
	 */
	public void setEmpName(java.lang.String empName){
		this.empName = empName;
	} 
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  合同生效日期
	 */
	@Column(name ="START_DATE",nullable=true,length=32)
	public java.lang.String getStartDate(){
		return this.startDate;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  合同生效日期
	 */
	public void setStartDate(java.lang.String startDate){
		this.startDate = startDate;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  合同终止日期
	 */
	@Column(name ="END_DATE",nullable=true,length=32)
	public java.lang.String getEndDate(){
		return this.endDate;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  合同终止日期
	 */
	public void setEndDate(java.lang.String endDate){
		this.endDate = endDate;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  签订日期
	 */
	@Column(name ="ON_DATE",nullable=true,length=32)
	public java.lang.String getOnDate(){
		return this.onDate;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  签订日期
	 */
	public void setOnDate(java.lang.String onDate){
		this.onDate = onDate;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  合同签订单位
	 */
	@Column(name ="CONTACT_COMPANY",nullable=true,length=32)
	public java.lang.String getContactCompany(){
		return this.contactCompany;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  合同签订单位
	 */
	public void setContactCompany(java.lang.String contactCompany){
		this.contactCompany = contactCompany;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  合同工资类型
	 */
	@Column(name ="CONTACT_MONEY_TYPE",nullable=true,length=32)
	public java.lang.String getContactMoneyType(){
		return this.contactMoneyType;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  合同工资类型
	 */
	public void setContactMoneyType(java.lang.String contactMoneyType){
		this.contactMoneyType = contactMoneyType;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  合同工资
	 */
	@Column(name ="CONTACT_MONEY",nullable=true,scale=1,length=32)
	public java.lang.Double getContactMoney(){
		return this.contactMoney;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  合同工资
	 */
	public void setContactMoney(java.lang.Double contactMoney){
		this.contactMoney = contactMoney;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  发放时间
	 */
	@Column(name ="GRANT_DATE",nullable=true,length=32)
	public java.lang.String getGrantDate(){
		return this.grantDate;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  发放时间
	 */
	public void setGrantDate(java.lang.String grantDate){
		this.grantDate = grantDate;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  合同状态
	 */
	@Column(name ="CONTACT_STATUS",nullable=true,length=32)
	public java.lang.String getContactStatus(){
		return this.contactStatus;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  合同状态
	 */
	public void setContactStatus(java.lang.String contactStatus){
		this.contactStatus = contactStatus;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  工作时间
	 */
	@Column(name ="WORK_TIMES",nullable=true,length=32)
	public java.lang.String getWorkTimes(){
		return this.workTimes;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  工作时间
	 */
	public void setWorkTimes(java.lang.String workTimes){
		this.workTimes = workTimes;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  合同类型
	 */
	@Column(name ="CONTACT_TYPE",nullable=true,length=32)
	public java.lang.String getContactType(){
		return this.contactType;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  合同类型
	 */
	public void setContactType(java.lang.String contactType){
		this.contactType = contactType;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  合同期限
	 */
	@Column(name ="CONTACT_TERM",nullable=true,length=32)
	public java.lang.String getContactTerm(){
		return this.contactTerm;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  合同期限
	 */
	public void setContactTerm(java.lang.String contactTerm){
		this.contactTerm = contactTerm;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  试用期限
	 */
	@Column(name ="TRY_TERM",nullable=true,length=32)
	public java.lang.String getTryTerm(){
		return this.tryTerm;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  试用期限
	 */
	public void setTryTerm(java.lang.String tryTerm){
		this.tryTerm = tryTerm;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  试用期终止日期
	 */
	@Column(name ="TRY_END_DATE",nullable=true,length=32)
	public java.lang.String getTryEndDate(){
		return this.tryEndDate;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  试用期终止日期
	 */
	public void setTryEndDate(java.lang.String tryEndDate){
		this.tryEndDate = tryEndDate;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  现任职务
	 */
	@Column(name ="DUTY",nullable=true,length=32)
	public java.lang.String getDuty(){
		return this.duty;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  现任职务
	 */
	public void setDuty(java.lang.String duty){
		this.duty = duty;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  原身份
	 */
	@Column(name ="OLD_SF",nullable=true,length=32)
	public java.lang.String getOldSf(){
		return this.oldSf;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  原身份
	 */
	public void setOldSf(java.lang.String oldSf){
		this.oldSf = oldSf;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  备注
	 */
	@Column(name ="REMARK",nullable=true,length=32)
	public java.lang.String getRemark(){
		return this.remark;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  备注
	 */
	public void setRemark(java.lang.String remark){
		this.remark = remark;
	}
}
