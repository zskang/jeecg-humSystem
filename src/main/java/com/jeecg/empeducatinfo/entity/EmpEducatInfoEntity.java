package com.jeecg.empeducatinfo.entity;

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
 * @Description: 员工教育培训信息
 * @author onlineGenerator
 * @date 2016-07-24 20:42:07
 * @version V1.0   
 *
 */
@Entity
@Table(name = "emp_educat_info", schema = "")
@SuppressWarnings("serial")
public class EmpEducatInfoEntity implements java.io.Serializable {
	/**主键*/
	private java.lang.String id;
	/**创建人名称*/
	private java.lang.String createName;
	/**创建日期*/
	private java.util.Date createDate;
	/**员工编号*/
	@Excel(name="员工编号")
	private java.lang.String empNo;
	/**入学日期*/
	@Excel(name="入学日期",format = "yyyy-MM-dd")
	private java.util.Date startDate;
	/**毕业日期*/
	@Excel(name="毕业日期",format = "yyyy-MM-dd")
	private java.util.Date endDate;
	/**学校或培训名称*/
	@Excel(name="学校或培训名称")
	private java.lang.String schoolName;
	/**地址*/
	@Excel(name="地址")
	private java.lang.String address;
	/**专业*/
	@Excel(name="专业")
	private java.lang.String profess;
	/**学历*/
	@Excel(name="学历")
	private java.lang.String educat;
	
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
	 *@return: java.lang.String  员工编号
	 */
	@Column(name ="EMP_NO",nullable=false,length=32)
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
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  入学日期
	 */
	@Column(name ="START_DATE",nullable=true,length=32)
	public java.util.Date getStartDate(){
		return this.startDate;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  入学日期
	 */
	public void setStartDate(java.util.Date startDate){
		this.startDate = startDate;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  毕业日期
	 */
	@Column(name ="END_DATE",nullable=true,length=32)
	public java.util.Date getEndDate(){
		return this.endDate;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  毕业日期
	 */
	public void setEndDate(java.util.Date endDate){
		this.endDate = endDate;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  学校或培训名称
	 */
	@Column(name ="SCHOOL_NAME",nullable=true,length=200)
	public java.lang.String getSchoolName(){
		return this.schoolName;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  学校或培训名称
	 */
	public void setSchoolName(java.lang.String schoolName){
		this.schoolName = schoolName;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  地址
	 */
	@Column(name ="ADDRESS",nullable=true,length=200)
	public java.lang.String getAddress(){
		return this.address;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  地址
	 */
	public void setAddress(java.lang.String address){
		this.address = address;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  专业
	 */
	@Column(name ="PROFESS",nullable=true,length=100)
	public java.lang.String getProfess(){
		return this.profess;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  专业
	 */
	public void setProfess(java.lang.String profess){
		this.profess = profess;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  学历
	 */
	@Column(name ="EDUCAT",nullable=true,length=32)
	public java.lang.String getEducat(){
		return this.educat;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  学历
	 */
	public void setEducat(java.lang.String educat){
		this.educat = educat;
	}
}
