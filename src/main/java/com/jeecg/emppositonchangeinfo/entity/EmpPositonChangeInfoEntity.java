package com.jeecg.emppositonchangeinfo.entity;

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
 * @Description: 人事调动信息表
 * @author onlineGenerator
 * @date 2016-07-18 23:20:26
 * @version V1.0   
 *
 */
@Entity
@Table(name = "emp_positon_change_info", schema = "")
@SuppressWarnings("serial")
public class EmpPositonChangeInfoEntity implements java.io.Serializable {
	/**主键*/
	private java.lang.String id;
	/**创建人名称*/
	private java.lang.String createName;
	/**创建日期*/
	private java.util.Date createDate;
	/**更新人名称*/
	private java.lang.String updateName;
	/**更新日期*/
	private java.util.Date updateDate;
	/**调动编号*/
	@Excel(name="调动编号")
	private java.lang.String moveNo;
	/**员工编号*/
	@Excel(name="员工编号")
	private java.lang.String empNo;
	/**原职务编号*/
	@Excel(name="原职务编号")
	private java.lang.String oldPositionNo;
	/**新职务编号*/
	@Excel(name="新职务编号")
	private java.lang.String newPositionNo;
	/**原职务名称*/
	@Excel(name="原职务名称")
	private java.lang.String oldPositionName;
	/**新职务名称*/
	@Excel(name="新职务名称")
	private java.lang.String newPositionName;
	/**调动时间*/
	@Excel(name="调动时间",format = "yyyy-MM-dd")
	private java.util.Date changeDate;
	/**调动原因*/
	@Excel(name="调动原因")
	private java.lang.String changeReason;
	/**备注*/
	@Excel(name="备注")
	private java.lang.String remark;
	/**员工名称*/
	@Excel(name="员工名称")
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
	 *@return: java.lang.String  调动编号
	 */
	@Column(name ="MOVE_NO",nullable=false,length=32)
	public java.lang.String getMoveNo(){
		return this.moveNo;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  调动编号
	 */
	public void setMoveNo(java.lang.String moveNo){
		this.moveNo = moveNo;
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
	 *@return: java.lang.String  原职务编号
	 */
	@Column(name ="OLD_POSITION_NO",nullable=true,length=100)
	public java.lang.String getOldPositionNo(){
		return this.oldPositionNo;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  原职务编号
	 */
	public void setOldPositionNo(java.lang.String oldPositionNo){
		this.oldPositionNo = oldPositionNo;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  新职务编号
	 */
	@Column(name ="NEW_POSITION_NO",nullable=true,length=100)
	public java.lang.String getNewPositionNo(){
		return this.newPositionNo;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  新职务编号
	 */
	public void setNewPositionNo(java.lang.String newPositionNo){
		this.newPositionNo = newPositionNo;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  原职务名称
	 */
	@Column(name ="OLD_POSITION_NAME",nullable=true,length=100)
	public java.lang.String getOldPositionName(){
		return this.oldPositionName;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  原职务名称
	 */
	public void setOldPositionName(java.lang.String oldPositionName){
		this.oldPositionName = oldPositionName;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  新职务名称
	 */
	@Column(name ="NEW_POSITION_NAME",nullable=true,length=100)
	public java.lang.String getNewPositionName(){
		return this.newPositionName;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  新职务名称
	 */
	public void setNewPositionName(java.lang.String newPositionName){
		this.newPositionName = newPositionName;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  调动时间
	 */
	@Column(name ="CHANGE_DATE",nullable=false,length=32)
	public java.util.Date getChangeDate(){
		return this.changeDate;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  调动时间
	 */
	public void setChangeDate(java.util.Date changeDate){
		this.changeDate = changeDate;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  调动原因
	 */
	@Column(name ="CHANGE_REASON",nullable=false,length=4000)
	public java.lang.String getChangeReason(){
		return this.changeReason;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  调动原因
	 */
	public void setChangeReason(java.lang.String changeReason){
		this.changeReason = changeReason;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  备注
	 */
	@Column(name ="REMARK",nullable=true,length=400)
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
}
