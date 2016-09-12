package com.jeecg.jformresumeexpinfo.entity;

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
 * @Description: 经历
 * @author onlineGenerator
 * @date 2016-09-09 07:20:45
 * @version V1.0   
 *
 */
@Entity
@Table(name = "jform_resume_exp_info", schema = "")
@SuppressWarnings("serial")
public class JformResumeExpInfoEntity implements java.io.Serializable {
	/**id*/
	private java.lang.String id;
	/**简历信息表ID*/
	private java.lang.String resumeId;
	/**开始日期*/
	@Excel(name="开始日期",format = "yyyy-MM-dd")
	private java.util.Date beginDate;
	/**结束日期*/
	@Excel(name="结束日期",format = "yyyy-MM-dd")
	private java.util.Date endDate;
	/**公司名称*/
	@Excel(name="公司名称")
	private java.lang.String companyName;
	/**部门名称*/
	@Excel(name="部门名称")
	private java.lang.String departName;
	/**职位*/
	@Excel(name="职位")
	private java.lang.String post;
	/**月薪*/
	@Excel(name="月薪")
	private java.lang.Double money;
	/**证明人姓名*/
	@Excel(name="证明人姓名")
	private java.lang.String certManName;
	/**证明人电话*/
	@Excel(name="证明人电话")
	private java.lang.String certManPhone;
	/**离职原因*/
	@Excel(name="离职原因")
	private java.lang.String reasonGo;
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  id
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
	 *@param: java.lang.String  id
	 */
	public void setId(java.lang.String id){
		this.id = id;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  简历信息表ID
	 */
	@Column(name ="RESUME_ID",nullable=true,length=36)
	public java.lang.String getResumeId(){
		return this.resumeId;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  简历信息表ID
	 */
	public void setResumeId(java.lang.String resumeId){
		this.resumeId = resumeId;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  开始日期
	 */
	@Column(name ="BEGIN_DATE",nullable=true)
	public java.util.Date getBeginDate(){
		return this.beginDate;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  开始日期
	 */
	public void setBeginDate(java.util.Date beginDate){
		this.beginDate = beginDate;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  结束日期
	 */
	@Column(name ="END_DATE",nullable=true)
	public java.util.Date getEndDate(){
		return this.endDate;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  结束日期
	 */
	public void setEndDate(java.util.Date endDate){
		this.endDate = endDate;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  公司名称
	 */
	@Column(name ="COMPANY_NAME",nullable=true,length=200)
	public java.lang.String getCompanyName(){
		return this.companyName;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  公司名称
	 */
	public void setCompanyName(java.lang.String companyName){
		this.companyName = companyName;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  部门名称
	 */
	@Column(name ="DEPART_NAME",nullable=true,length=100)
	public java.lang.String getDepartName(){
		return this.departName;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  部门名称
	 */
	public void setDepartName(java.lang.String departName){
		this.departName = departName;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  职位
	 */
	@Column(name ="POST",nullable=true,length=50)
	public java.lang.String getPost(){
		return this.post;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  职位
	 */
	public void setPost(java.lang.String post){
		this.post = post;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  月薪
	 */
	@Column(name ="MONEY",nullable=true,length=30)
	public java.lang.Double getMoney(){
		return this.money;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  月薪
	 */
	public void setMoney(java.lang.Double money){
		this.money = money;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  证明人姓名
	 */
	@Column(name ="CERT_MAN_NAME",nullable=true,length=32)
	public java.lang.String getCertManName(){
		return this.certManName;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  证明人姓名
	 */
	public void setCertManName(java.lang.String certManName){
		this.certManName = certManName;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  证明人电话
	 */
	@Column(name ="CERT_MAN_PHONE",nullable=true,length=32)
	public java.lang.String getCertManPhone(){
		return this.certManPhone;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  证明人电话
	 */
	public void setCertManPhone(java.lang.String certManPhone){
		this.certManPhone = certManPhone;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  离职原因
	 */
	@Column(name ="REASON_GO",nullable=true,length=32)
	public java.lang.String getReasonGo(){
		return this.reasonGo;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  离职原因
	 */
	public void setReasonGo(java.lang.String reasonGo){
		this.reasonGo = reasonGo;
	}
}
