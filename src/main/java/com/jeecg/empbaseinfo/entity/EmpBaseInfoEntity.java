package com.jeecg.empbaseinfo.entity;

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
import javax.persistence.Transient;

import org.hibernate.annotations.GenericGenerator;
import javax.persistence.SequenceGenerator;
import org.jeecgframework.poi.excel.annotation.Excel;

/**   
 * @Title: Entity
 * @Description: 员工基本信息表
 * @author zsk
 * @date 2016-07-18 18:39:25
 * @version V1.0   
 *
 */
@Entity
@Table(name = "emp_base_info", schema = "")
@SuppressWarnings("serial")
public class EmpBaseInfoEntity implements java.io.Serializable {
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
	/**所属部门*/
	@Excel(name="所属部门")
	private java.lang.String sysOrgCode;
	/**员工名称*/
	@Excel(name="员工名称")
	private java.lang.String empName;
	/**员工编号*/
	@Excel(name="员工编号")
	private java.lang.String empNo;
	/**职务等级*/
	@Excel(name="职务等级")
	private java.lang.String postion;
	/**性别*/
	@Excel(name="性别")
	private java.lang.String sex;
	/**婚姻状况*/
	@Excel(name="婚姻状况")
	private java.lang.String marry;
	/**出生日期*/
	@Excel(name="出生日期",format = "yyyy-MM-dd")
	private java.util.Date brthdate;
	/**民 族*/
	@Excel(name="民 族")
	private java.lang.String minzu;
	/**政治面貌*/
	@Excel(name="政治面貌")
	private java.lang.String zzmm;
	/**年龄*/
	@Excel(name="年龄")
	private java.lang.String age;
	/**外语*/
	@Excel(name="外语")
	private java.lang.String langtype;
	/**外语水平*/
	@Excel(name="外语水平")
	private java.lang.String langgrade;
	/**员工类别*/
	@Excel(name="员工类别")
	private java.lang.String emptype;
	/**籍 贯*/
	@Excel(name="籍 贯")
	private java.lang.String jiguan;
	/**户口性质*/
	@Excel(name="户口性质")
	private java.lang.String hukouType;
	/**核定薪资*/
	@Excel(name="核定薪资")
	private java.lang.String xinzi;
	/**特长*/
	@Excel(name="特长")
	private java.lang.String techang;
	/**执业资格证*/
	@Excel(name="执业资格证")
	private java.lang.String zyzgz;
	/**身份证号码*/
	@Excel(name="身份证号码")
	private java.lang.String cradNo;
	/**职称*/
	@Excel(name="职称")
	private java.lang.String zhicheng;
	/**户籍地址*/
	@Excel(name="户籍地址")
	private java.lang.String hujiAddress;
	/**邮政编码*/
	@Excel(name="邮政编码")
	private java.lang.String post1;
	/**现 住 址*/
	@Excel(name="现 住 址")
	private java.lang.String nowAddress;
	/**邮政编码*/
	@Excel(name="邮政编码")
	private java.lang.String post2;
	/**联络电话*/
	@Excel(name="联络电话")
	private java.lang.String tel;
	/**手机*/
	@Excel(name="手机")
	private java.lang.String mobile;
	/**E_mail*/
	@Excel(name="E_mail")
	private java.lang.String email;
	 
	
	
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
	 *@return: java.lang.String  职务等级
	 */
	@Column(name ="POSTION",nullable=true,length=2)
	public java.lang.String getPostion(){
		return this.postion;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  职务等级
	 */
	public void setPostion(java.lang.String postion){
		this.postion = postion;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  性别
	 */
	@Column(name ="SEX",nullable=true,length=32)
	public java.lang.String getSex(){
		return this.sex;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  性别
	 */
	public void setSex(java.lang.String sex){
		this.sex = sex;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  婚姻状况
	 */
	@Column(name ="MARRY",nullable=true,length=32)
	public java.lang.String getMarry(){
		return this.marry;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  婚姻状况
	 */
	public void setMarry(java.lang.String marry){
		this.marry = marry;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  出生日期
	 */
	@Column(name ="BRTHDATE",nullable=true,length=32)
	public java.util.Date getBrthdate(){
		return this.brthdate;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  出生日期
	 */
	public void setBrthdate(java.util.Date brthdate){
		this.brthdate = brthdate;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  民 族
	 */
	@Column(name ="MINZU",nullable=true,length=32)
	public java.lang.String getMinzu(){
		return this.minzu;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  民 族
	 */
	public void setMinzu(java.lang.String minzu){
		this.minzu = minzu;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  政治面貌
	 */
	@Column(name ="ZZMM",nullable=true,length=32)
	public java.lang.String getZzmm(){
		return this.zzmm;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  政治面貌
	 */
	public void setZzmm(java.lang.String zzmm){
		this.zzmm = zzmm;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  年龄
	 */
	@Column(name ="AGE",nullable=true,length=32)
	public java.lang.String getAge(){
		return this.age;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  年龄
	 */
	public void setAge(java.lang.String age){
		this.age = age;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  外语
	 */
	@Column(name ="LANGTYPE",nullable=true,length=32)
	public java.lang.String getLangtype(){
		return this.langtype;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  外语
	 */
	public void setLangtype(java.lang.String langtype){
		this.langtype = langtype;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  外语水平
	 */
	@Column(name ="LANGGRADE",nullable=true,length=32)
	public java.lang.String getLanggrade(){
		return this.langgrade;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  外语水平
	 */
	public void setLanggrade(java.lang.String langgrade){
		this.langgrade = langgrade;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  员工类别
	 */
	@Column(name ="EMPTYPE",nullable=true,length=32)
	public java.lang.String getEmptype(){
		return this.emptype;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  员工类别
	 */
	public void setEmptype(java.lang.String emptype){
		this.emptype = emptype;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  籍 贯
	 */
	@Column(name ="JIGUAN",nullable=true,length=32)
	public java.lang.String getJiguan(){
		return this.jiguan;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  籍 贯
	 */
	public void setJiguan(java.lang.String jiguan){
		this.jiguan = jiguan;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  户口性质
	 */
	@Column(name ="HUKOU_TYPE",nullable=true,length=32)
	public java.lang.String getHukouType(){
		return this.hukouType;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  户口性质
	 */
	public void setHukouType(java.lang.String hukouType){
		this.hukouType = hukouType;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  核定薪资
	 */
	@Column(name ="XINZI",nullable=true,length=32)
	public java.lang.String getXinzi(){
		return this.xinzi;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  核定薪资
	 */
	public void setXinzi(java.lang.String xinzi){
		this.xinzi = xinzi;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  特长
	 */
	@Column(name ="TECHANG",nullable=true,length=300)
	public java.lang.String getTechang(){
		return this.techang;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  特长
	 */
	public void setTechang(java.lang.String techang){
		this.techang = techang;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  执业资格证
	 */
	@Column(name ="ZYZGZ",nullable=true,length=200)
	public java.lang.String getZyzgz(){
		return this.zyzgz;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  执业资格证
	 */
	public void setZyzgz(java.lang.String zyzgz){
		this.zyzgz = zyzgz;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  身份证号码
	 */
	@Column(name ="CRAD_NO",nullable=true,length=32)
	public java.lang.String getCradNo(){
		return this.cradNo;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  身份证号码
	 */
	public void setCradNo(java.lang.String cradNo){
		this.cradNo = cradNo;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  职称
	 */
	@Column(name ="ZHICHENG",nullable=true,length=32)
	public java.lang.String getZhicheng(){
		return this.zhicheng;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  职称
	 */
	public void setZhicheng(java.lang.String zhicheng){
		this.zhicheng = zhicheng;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  户籍地址
	 */
	@Column(name ="HUJI_ADDRESS",nullable=true,length=32)
	public java.lang.String getHujiAddress(){
		return this.hujiAddress;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  户籍地址
	 */
	public void setHujiAddress(java.lang.String hujiAddress){
		this.hujiAddress = hujiAddress;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  邮政编码
	 */
	@Column(name ="POST1",nullable=true,length=32)
	public java.lang.String getPost1(){
		return this.post1;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  邮政编码
	 */
	public void setPost1(java.lang.String post1){
		this.post1 = post1;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  现 住 址
	 */
	@Column(name ="NOW_ADDRESS",nullable=true,length=32)
	public java.lang.String getNowAddress(){
		return this.nowAddress;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  现 住 址
	 */
	public void setNowAddress(java.lang.String nowAddress){
		this.nowAddress = nowAddress;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  邮政编码
	 */
	@Column(name ="POST2",nullable=true,length=32)
	public java.lang.String getPost2(){
		return this.post2;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  邮政编码
	 */
	public void setPost2(java.lang.String post2){
		this.post2 = post2;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  联络电话
	 */
	@Column(name ="TEL",nullable=true,length=32)
	public java.lang.String getTel(){
		return this.tel;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  联络电话
	 */
	public void setTel(java.lang.String tel){
		this.tel = tel;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  手机
	 */
	@Column(name ="MOBILE",nullable=true,length=32)
	public java.lang.String getMobile(){
		return this.mobile;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  手机
	 */
	public void setMobile(java.lang.String mobile){
		this.mobile = mobile;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  E_mail
	 */
	@Column(name ="EMAIL",nullable=true,length=32)
	public java.lang.String getEmail(){
		return this.email;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  E_mail
	 */
	public void setEmail(java.lang.String email){
		this.email = email;
	}

 
}
