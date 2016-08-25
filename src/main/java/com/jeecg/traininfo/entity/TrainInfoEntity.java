package com.jeecg.traininfo.entity;

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
 * @Description: 员工培训信息表
 * @author onlineGenerator
 * @date 2016-07-10 19:27:50
 * @version V1.0   
 *
 */
@Entity
@Table(name = "Train_info", schema = "")
@SuppressWarnings("serial")
public class TrainInfoEntity implements java.io.Serializable {
	/**主键*/
	private java.lang.String id;
	/**创建人名称*/
	private java.lang.String createName;
	/**创建日期*/
	private java.util.Date createDate;
	/**培训开始时间*/
	@Excel(name="培训开始时间")
	private java.util.Date trainStartDate;
	/**培训结束时间*/
	@Excel(name="培训结束时间")
	private java.util.Date trainEndDate;
	/**员工编号*/
	@Excel(name="员工编号")
	private java.lang.String empNo;
	/**员工名称*/
	@Excel(name="员工名称")
	private java.lang.String empName;
	/**培训类型*/
	@Excel(name="培训类型")
	private java.lang.String trainType;
	/**培训内容描述*/
	@Excel(name="培训内容描述")
	private java.lang.String trainDesc;
	/**培训结果描述*/
	@Excel(name="培训结果描述")
	private java.lang.String trainResultDesc;
	/**培训人名称*/
	@Excel(name="培训人名称")
	private java.lang.String trainTeacherName;
	/**培训人编号*/
	@Excel(name="培训人编号")
	private java.lang.String trainTeacherId;
	/**培训课题*/
	@Excel(name="培训课题")
	private java.lang.String trainSubject;
	/**是否合格*/
	@Excel(name="是否合格")
	private java.lang.String trainResult;
	
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
	 *@return: java.lang.String  培训开始时间
	 */
	@Column(name ="TRAIN_START_DATE",nullable=false,length=32)
	public java.util.Date getTrainStartDate(){
		return this.trainStartDate;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  培训开始时间
	 */
	public void setTrainStartDate(java.util.Date trainStartDate){
		this.trainStartDate = trainStartDate;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  培训结束时间
	 */
	@Column(name ="TRAIN_END_DATE",nullable=false,length=32)
	public java.util.Date getTrainEndDate(){
		return this.trainEndDate;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  培训结束时间
	 */
	public void setTrainEndDate(java.util.Date trainEndDate){
		this.trainEndDate = trainEndDate;
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
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  员工名称
	 */
	@Column(name ="EMP_NAME",nullable=false,length=32)
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
	 *@return: java.lang.String  培训类型
	 */
	@Column(name ="TRAIN_TYPE",nullable=false,length=32)
	public java.lang.String getTrainType(){
		return this.trainType;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  培训类型
	 */
	public void setTrainType(java.lang.String trainType){
		this.trainType = trainType;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  培训内容描述
	 */
	@Column(name ="TRAIN_DESC",nullable=false,length=4000)
	public java.lang.String getTrainDesc(){
		return this.trainDesc;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  培训内容描述
	 */
	public void setTrainDesc(java.lang.String trainDesc){
		this.trainDesc = trainDesc;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  培训结果描述
	 */
	@Column(name ="TRAIN_RESULT_DESC",nullable=false,length=300)
	public java.lang.String getTrainResultDesc(){
		return this.trainResultDesc;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  培训结果描述
	 */
	public void setTrainResultDesc(java.lang.String trainResultDesc){
		this.trainResultDesc = trainResultDesc;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  培训人名称
	 */
	@Column(name ="TRAIN_TEACHER_NAME",nullable=false,length=32)
	public java.lang.String getTrainTeacherName(){
		return this.trainTeacherName;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  培训人名称
	 */
	public void setTrainTeacherName(java.lang.String trainTeacherName){
		this.trainTeacherName = trainTeacherName;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  培训人编号
	 */
	@Column(name ="TRAIN_TEACHER_ID",nullable=false,length=32)
	public java.lang.String getTrainTeacherId(){
		return this.trainTeacherId;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  培训人编号
	 */
	public void setTrainTeacherId(java.lang.String trainTeacherId){
		this.trainTeacherId = trainTeacherId;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  培训课题
	 */
	@Column(name ="TRAIN_SUBJECT",nullable=false,length=200)
	public java.lang.String getTrainSubject(){
		return this.trainSubject;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  培训课题
	 */
	public void setTrainSubject(java.lang.String trainSubject){
		this.trainSubject = trainSubject;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  是否合格
	 */
	@Column(name ="TRAIN_RESULT",nullable=false,length=32)
	public java.lang.String getTrainResult(){
		return this.trainResult;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  是否合格
	 */
	public void setTrainResult(java.lang.String trainResult){
		this.trainResult = trainResult;
	}
}
