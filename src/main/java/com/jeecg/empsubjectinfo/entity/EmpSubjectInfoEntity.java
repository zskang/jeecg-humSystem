package com.jeecg.empsubjectinfo.entity;

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
 * @Description: 学科信息表
 * @author onlineGenerator
 * @date 2016-07-18 23:25:23
 * @version V1.0   
 *
 */
@Entity
@Table(name = "emp_subject_info", schema = "")
@SuppressWarnings("serial")
public class EmpSubjectInfoEntity implements java.io.Serializable {
	/**主键*/
	private java.lang.String id;
	/**创建人名称*/
	private java.lang.String createName;
	/**创建日期*/
	private java.util.Date createDate;
	/**学科编号*/
	@Excel(name="学科编号")
	private java.lang.String subjectId;
	/**学科名称*/
	@Excel(name="学科名称")
	private java.lang.String subjectName;
	/**父类id*/
	@Excel(name="父类id")
	private java.lang.String parentId;
	/**负责人id*/
	@Excel(name="负责人id")
	private java.lang.String adminId;
	/**修改时间*/
	private java.util.Date updateDate;
	/**修改任名称*/
	private java.lang.String updateName;
	
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
	 *@return: java.lang.String  学科编号
	 */
	@Column(name ="SUBJECT_ID",nullable=true,length=32)
	public java.lang.String getSubjectId(){
		return this.subjectId;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  学科编号
	 */
	public void setSubjectId(java.lang.String subjectId){
		this.subjectId = subjectId;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  学科名称
	 */
	@Column(name ="SUBJECT_NAME",nullable=true,length=32)
	public java.lang.String getSubjectName(){
		return this.subjectName;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  学科名称
	 */
	public void setSubjectName(java.lang.String subjectName){
		this.subjectName = subjectName;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  父类id
	 */
	@Column(name ="PARENT_ID",nullable=true,length=32)
	public java.lang.String getParentId(){
		return this.parentId;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  父类id
	 */
	public void setParentId(java.lang.String parentId){
		this.parentId = parentId;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  负责人id
	 */
	@Column(name ="ADMIN_ID",nullable=true,length=32)
	public java.lang.String getAdminId(){
		return this.adminId;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  负责人id
	 */
	public void setAdminId(java.lang.String adminId){
		this.adminId = adminId;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  修改时间
	 */
	@Column(name ="UPDATE_DATE",nullable=true,length=32)
	public java.util.Date getUpdateDate(){
		return this.updateDate;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  修改时间
	 */
	public void setUpdateDate(java.util.Date updateDate){
		this.updateDate = updateDate;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  修改任名称
	 */
	@Column(name ="UPDATE_NAME",nullable=true,length=50)
	public java.lang.String getUpdateName(){
		return this.updateName;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  修改任名称
	 */
	public void setUpdateName(java.lang.String updateName){
		this.updateName = updateName;
	}
}
