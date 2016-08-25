package com.jeecg.empworkcheckinfo.entity;

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
 * @Description: 员工考勤记录表
 * @author onlineGenerator
 * @date 2016-07-17 16:59:33
 * @version V1.0   
 *
 */
@Entity
@Table(name = "emp_work_check_info", schema = "")
@SuppressWarnings("serial")
public class EmpWorkCheckInfoEntity implements java.io.Serializable {
	/**主键*/
	private java.lang.String id;
	/**员工编号*/
	@Excel(name="员工编号")
	private java.lang.String empNo;
	/**员工名称*/
	@Excel(name="员工名称")
	private java.lang.String empName;
	/**部门*/
	@Excel(name="部门")
	private java.lang.String depart;
	/**日期*/
	@Excel(name="日期")
	private java.lang.String date;
	/**星期几*/
	@Excel(name="星期几")
	private java.lang.String week;
	/**考勤异常类型*/
	@Excel(name="考勤异常类型")
	private java.lang.String errorType;
	/**异常时间*/
	@Excel(name="异常时间")
	private java.lang.String errDate;
	/**考勤扣款*/
	@Excel(name="考勤扣款")
	private java.math.BigDecimal kouMoney;
	
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
	 *@return: java.lang.String  员工编号
	 */
	@Column(name ="EMP_NO",nullable=false,length=50)
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
	@Column(name ="EMP_NAME",nullable=true,length=50)
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
	 *@return: java.lang.String  部门
	 */
	@Column(name ="DEPART",nullable=true,length=20)
	public java.lang.String getDepart(){
		return this.depart;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  部门
	 */
	public void setDepart(java.lang.String depart){
		this.depart = depart;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  日期
	 */
	@Column(name ="DATE",nullable=true,length=50)
	public java.lang.String getDate(){
		return this.date;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  日期
	 */
	public void setDate(java.lang.String date){
		this.date = date;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  星期几
	 */
	@Column(name ="WEEK",nullable=true,length=50)
	public java.lang.String getWeek(){
		return this.week;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  星期几
	 */
	public void setWeek(java.lang.String week){
		this.week = week;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  考勤异常类型
	 */
	@Column(name ="ERROR_TYPE",nullable=true,length=20)
	public java.lang.String getErrorType(){
		return this.errorType;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  考勤异常类型
	 */
	public void setErrorType(java.lang.String errorType){
		this.errorType = errorType;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  异常时间
	 */
	@Column(name ="ERR_DATE",nullable=true,length=50)
	public java.lang.String getErrDate(){
		return this.errDate;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  异常时间
	 */
	public void setErrDate(java.lang.String errDate){
		this.errDate = errDate;
	}
	/**
	 *方法: 取得java.math.BigDecimal
	 *@return: java.math.BigDecimal  考勤扣款
	 */
	@Column(name ="KOU_MONEY",nullable=true,length=50)
	public java.math.BigDecimal getKouMoney(){
		return this.kouMoney;
	}

	/**
	 *方法: 设置java.math.BigDecimal
	 *@param: java.math.BigDecimal  考勤扣款
	 */
	public void setKouMoney(java.math.BigDecimal kouMoney){
		this.kouMoney = kouMoney;
	}
}
