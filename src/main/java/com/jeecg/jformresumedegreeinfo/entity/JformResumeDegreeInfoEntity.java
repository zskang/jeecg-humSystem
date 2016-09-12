package com.jeecg.jformresumedegreeinfo.entity;

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
 * @Description: 学历
 * @author onlineGenerator
 * @date 2016-09-09 07:20:45
 * @version V1.0   
 *
 */
@Entity
@Table(name = "jform_resume_degree_info", schema = "")
@SuppressWarnings("serial")
public class JformResumeDegreeInfoEntity implements java.io.Serializable {
	/**id*/
	private java.lang.String id;
	/**简历主键*/
	private java.lang.String resumeId;
	/**开始时间*/
	@Excel(name="开始时间",format = "yyyy-MM-dd")
	private java.util.Date beginDate;
	/**结束时间*/
	@Excel(name="结束时间",format = "yyyy-MM-dd")
	private java.util.Date endDate;
	/**学校名称*/
	@Excel(name="学校名称")
	private java.lang.String schoolName;
	/**专业*/
	@Excel(name="专业")
	private java.lang.String major;
	/**学历学位*/
	@Excel(name="学历学位")
	private java.lang.String degree;
	/**所获得证书*/
	@Excel(name="所获得证书")
	private java.lang.String certissure;
	/**学历性质*/
	@Excel(name="学历性质")
	private java.lang.String degreeType;
	
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
	 *@return: java.lang.String  简历主键
	 */
	@Column(name ="RESUME_ID",nullable=false,length=36)
	public java.lang.String getResumeId(){
		return this.resumeId;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  简历主键
	 */
	public void setResumeId(java.lang.String resumeId){
		this.resumeId = resumeId;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  开始时间
	 */
	@Column(name ="BEGIN_DATE",nullable=true)
	public java.util.Date getBeginDate(){
		return this.beginDate;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  开始时间
	 */
	public void setBeginDate(java.util.Date beginDate){
		this.beginDate = beginDate;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  结束时间
	 */
	@Column(name ="END_DATE",nullable=true)
	public java.util.Date getEndDate(){
		return this.endDate;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  结束时间
	 */
	public void setEndDate(java.util.Date endDate){
		this.endDate = endDate;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  学校名称
	 */
	@Column(name ="SCHOOL_NAME",nullable=true,length=100)
	public java.lang.String getSchoolName(){
		return this.schoolName;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  学校名称
	 */
	public void setSchoolName(java.lang.String schoolName){
		this.schoolName = schoolName;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  专业
	 */
	@Column(name ="MAJOR",nullable=true,length=100)
	public java.lang.String getMajor(){
		return this.major;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  专业
	 */
	public void setMajor(java.lang.String major){
		this.major = major;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  学历学位
	 */
	@Column(name ="DEGREE",nullable=true,length=30)
	public java.lang.String getDegree(){
		return this.degree;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  学历学位
	 */
	public void setDegree(java.lang.String degree){
		this.degree = degree;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  所获得证书
	 */
	@Column(name ="CERTISSURE",nullable=true,length=32)
	public java.lang.String getCertissure(){
		return this.certissure;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  所获得证书
	 */
	public void setCertissure(java.lang.String certissure){
		this.certissure = certissure;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  学历性质
	 */
	@Column(name ="DEGREE_TYPE",nullable=true,length=32)
	public java.lang.String getDegreeType(){
		return this.degreeType;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  学历性质
	 */
	public void setDegreeType(java.lang.String degreeType){
		this.degreeType = degreeType;
	}
}
