package com.jeecg.entity.sixdata;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.GenericGenerator;
import javax.persistence.SequenceGenerator;

/**   
 * @Title: Entity
 * @Description: 六项学科数据信息表
 * @date 2016-07-14 15:55:25
 * @version V1.0   
 *
 */
@Entity
@Table(name = "six_data_info", schema = "")
//@DynamicUpdate(true)
//@DynamicInsert(true)
@SuppressWarnings("serial")
public class SixDataEntity implements java.io.Serializable {
	/**id*/
	private java.lang.String id;
	/**dataTitle*/
	private java.lang.String dataTitle;
	/**year*/
	private java.lang.String year;
	/**subjectType*/
	private java.lang.String subjectType;
	/**createName*/
	private java.lang.String createName;
	/**createDate*/
	private java.util.Date createDate;
	/**updateName*/
	private java.lang.String updateName;
	/**updateDate*/
	private java.util.Date updateDate;
	/**sysOrgCode*/
	private java.lang.String sysOrgCode;
	/**hMb1*/
	private BigDecimal HMB1;
	/**hMb2*/
	private BigDecimal HMB2;
	/**hMb3*/
	private BigDecimal HMB3;
	/**hMb4*/
	private BigDecimal HMB4;
	/**hMb5*/
	private BigDecimal HMB5;
	/**hMb6*/
	private BigDecimal HMB6;
	/**hMb7*/
	private BigDecimal HMB7;
	/**hMb8*/
	private BigDecimal HMB8;
	/**hMb9*/
	private BigDecimal HMB9;
	/**hMb10*/
	private BigDecimal HMB10;
	/**hMb11*/
	private BigDecimal HMB11;
	/**hMb12*/
	private BigDecimal HMB12;
	/**hMb13*/
	private BigDecimal HMB13;
	/**hMb14*/
	private BigDecimal HMB14;
	/**cMb1*/
	private BigDecimal CMB1;
	/**cMb2*/
	private BigDecimal CMB2;
	/**cMb3*/
	private BigDecimal CMB3;
	/**cMb4*/
	private BigDecimal CMB4;
	/**cMb5*/
	private BigDecimal CMB5;
	/**cMb6*/
	private BigDecimal CMB6;
	/**cMb7*/
	private BigDecimal CMB7;
	/**cMb8*/
	private BigDecimal CMB8;
	/**cMb9*/
	private BigDecimal CMB9;
	/**cMb10*/
	private BigDecimal CMB10;
	/**cMb11*/
	private BigDecimal CMB11;
	/**cMb12*/
	private BigDecimal CMB12;
	/**cMb13*/
	private BigDecimal CMB13;
	/**cMb14*/
	private BigDecimal CMB14;
	/**sMb1*/
	private BigDecimal SMB1;
	/**sMb2*/
	private BigDecimal SMB2;
	/**sMb3*/
	private BigDecimal SMB3;
	/**sMb4*/
	private BigDecimal SMB4;
	/**sMb5*/
	private BigDecimal SMB5;
	/**sMb6*/
	private BigDecimal SMB6;
	/**sMb7*/
	private BigDecimal SMB7;
	/**sMb8*/
	private BigDecimal SMB8;
	/**sMb9*/
	private BigDecimal SMB9;
	/**sMb10*/
	private BigDecimal SMB10;
	/**sMb11*/
	private BigDecimal SMB11;
	/**sMb12*/
	private BigDecimal SMB12;
	/**sMb13*/
	private BigDecimal SMB13;
	/**sMb14*/
	private BigDecimal SMB14;
	/**qMb1*/
	private BigDecimal QMB1;
	/**qMb2*/
	private BigDecimal QMB2;
	/**qMb3*/
	private BigDecimal QMB3;
	/**qMb4*/
	private BigDecimal QMB4;
	/**qMb5*/
	private BigDecimal QMB5;
	/**qMb6*/
	private BigDecimal QMB6;
	/**qMb7*/
	private BigDecimal QMB7;
	/**qMb8*/
	private BigDecimal QMB8;
	/**qMb9*/
	private BigDecimal QMB9;
	/**qMb10*/
	private BigDecimal QMB10;
	/**qMb11*/
	private BigDecimal QMB11;
	/**qMb12*/
	private BigDecimal QMB12;
	/**qMb13*/
	private BigDecimal QMB13;
	/**qMb14*/
	private BigDecimal QMB14;
	/**totalMb1*/
	private BigDecimal totalMb1;
	/**totalMb2*/
	private BigDecimal totalMb2;
	/**totalMb3*/
	private BigDecimal totalMb3;
	/**totalMb4*/
	private BigDecimal totalMb4;
	/**totalMb5*/
	private BigDecimal totalMb5;
	/**totalMb6*/
	private BigDecimal totalMb6;
	/**totalMb7*/
	private BigDecimal totalMb7;
	/**totalMb8*/
	private BigDecimal totalMb8;
	/**totalMb9*/
	private BigDecimal totalMb9;
	/**totalMb10*/
	private BigDecimal totalMb10;
	/**totalMb11*/
	private BigDecimal totalMb11;
	/**totalMb12*/
	private BigDecimal totalMb12;
	/**totalMb13*/
	private BigDecimal totalMb13;
	/**totalMb14*/
	private BigDecimal totalMb14;
	/**hWc1*/
	private BigDecimal HWC1;
	/**hWc2*/
	private BigDecimal HWC2;
	/**hWc3*/
	private BigDecimal HWC3;
	/**hWc4*/
	private BigDecimal HWC4;
	/**hWc5*/
	private BigDecimal HWC5;
	/**hWc6*/
	private BigDecimal HWC6;
	/**hWc7*/
	private BigDecimal HWC7;
	/**hWc8*/
	private BigDecimal HWC8;
	/**hWc9*/
	private BigDecimal HWC9;
	/**hWc10*/
	private BigDecimal HWC10;
	/**hWc11*/
	private BigDecimal HWC11;
	/**hWc12*/
	private BigDecimal HWC12;
	/**hWc13*/
	private BigDecimal HWC13;
	/**hWc14*/
	private BigDecimal HWC14;
	/**cWc1*/
	private BigDecimal CWC1;
	/**cWc2*/
	private BigDecimal CWC2;
	/**cWc3*/
	private BigDecimal CWC3;
	/**cWc4*/
	private BigDecimal CWC4;
	/**cWc5*/
	private BigDecimal CWC5;
	/**cWc6*/
	private BigDecimal CWC6;
	/**cWc7*/
	private BigDecimal CWC7;
	/**cWc8*/
	private BigDecimal CWC8;
	/**cWc9*/
	private BigDecimal CWC9;
	/**cWc10*/
	private BigDecimal CWC10;
	/**cWc11*/
	private BigDecimal CWC11;
	/**cWc12*/
	private BigDecimal CWC12;
	/**cWc13*/
	private BigDecimal CWC13;
	/**cWc14*/
	private BigDecimal CWC14;
	/**sWc1*/
	private BigDecimal SWC1;
	/**sWc2*/
	private BigDecimal SWC2;
	/**sWc3*/
	private BigDecimal SWC3;
	/**sWc4*/
	private BigDecimal SWC4;
	/**sWc5*/
	private BigDecimal SWC5;
	/**sWc6*/
	private BigDecimal SWC6;
	/**sWc7*/
	private BigDecimal SWC7;
	/**sWc8*/
	private BigDecimal SWC8;
	/**sWc9*/
	private BigDecimal SWC9;
	/**sWc10*/
	private BigDecimal SWC10;
	/**sWc11*/
	private BigDecimal SWC11;
	/**sWc12*/
	private BigDecimal SWC12;
	/**sWc13*/
	private BigDecimal SWC13;
	/**sWc14*/
	private BigDecimal SWC14;
	/**qWc1*/
	private BigDecimal QWC1;
	/**qWc2*/
	private BigDecimal QWC2;
	/**qWc3*/
	private BigDecimal QWC3;
	/**qWc4*/
	private BigDecimal QWC4;
	/**qWc5*/
	private BigDecimal QWC5;
	/**qWc6*/
	private BigDecimal QWC6;
	/**qWc7*/
	private BigDecimal QWC7;
	/**qWc8*/
	private BigDecimal QWC8;
	/**qWc9*/
	private BigDecimal QWC9;
	/**qWc10*/
	private BigDecimal QWC10;
	/**qWc11*/
	private BigDecimal QWC11;
	/**qWc12*/
	private BigDecimal QWC12;
	/**qWc13*/
	private BigDecimal QWC13;
	/**qWc14*/
	private BigDecimal QWC14;
	/**totalWc1*/
	private BigDecimal totalWc1;
	/**totalWc2*/
	private BigDecimal totalWc2;
	/**totalWc3*/
	private BigDecimal totalWc3;
	/**totalWc4*/
	private BigDecimal totalWc4;
	/**totalWc5*/
	private BigDecimal totalWc5;
	/**totalWc6*/
	private BigDecimal totalWc6;
	/**totalWc7*/
	private BigDecimal totalWc7;
	/**totalWc8*/
	private BigDecimal totalWc8;
	/**totalWc9*/
	private BigDecimal totalWc9;
	/**totalWc10*/
	private BigDecimal totalWc10;
	/**totalWc11*/
	private BigDecimal totalWc11;
	/**totalWc12*/
	private BigDecimal totalWc12;
	/**totalWc13*/
	private BigDecimal totalWc13;
	/**totalWc14*/
	private BigDecimal totalWc14;
	/**totalWcl1*/
	private BigDecimal totalWcl1;
	/**totalWcl2*/
	private BigDecimal totalWcl2;
	/**totalWcl3*/
	private BigDecimal totalWcl3;
	/**totalWcl4*/
	private BigDecimal totalWcl4;
	/**totalWcl5*/
	private BigDecimal totalWcl5;
	/**totalWcl6*/
	private BigDecimal totalWcl6;
	/**totalWcl7*/
	private BigDecimal totalWcl7;
	/**totalWcl8*/
	private BigDecimal totalWcl8;
	/**totalWcl9*/
	private BigDecimal totalWcl9;
	/**totalWcl10*/
	private BigDecimal totalWcl10;
	/**totalWcl11*/
	private BigDecimal totalWcl11;
	/**totalWcl12*/
	private BigDecimal totalWcl12;
	/**totalWcl13*/
	private BigDecimal totalWcl13;
	/**totalWcl14*/
	private BigDecimal totalWcl14;
	/**yue11*/
	private BigDecimal yue11;
	/**yue12*/
	private BigDecimal yue12;
	/**yue13*/
	private BigDecimal yue13;
	/**yue14*/
	private BigDecimal yue14;
	/**yue15*/
	private BigDecimal yue15;
	/**yue16*/
	private BigDecimal yue16;
	/**yue17*/
	private BigDecimal yue17;
	/**yue18*/
	private BigDecimal yue18;
	/**yue19*/
	private BigDecimal yue19;
	/**yue110*/
	private BigDecimal yue110;
	/**yue111*/
	private BigDecimal yue1_11;
	/**yue112*/
	private BigDecimal yue1_12;
	/**yue113*/
	private BigDecimal yue1_13;
	/**yue114*/
	private BigDecimal yue1_14;
	/**yue21*/
	private BigDecimal yue21;
	/**yue22*/
	private BigDecimal yue22;
	/**yue23*/
	private BigDecimal yue23;
	/**yue24*/
	private BigDecimal yue24;
	/**yue25*/
	private BigDecimal yue25;
	/**yue26*/
	private BigDecimal yue26;
	/**yue27*/
	private BigDecimal yue27;
	/**yue28*/
	private BigDecimal yue28;
	/**yue29*/
	private BigDecimal yue29;
	/**yue210*/
	private BigDecimal yue210;
	/**yue211*/
	private BigDecimal yue211;
	/**yue212*/
	private BigDecimal yue212;
	/**yue213*/
	private BigDecimal yue213;
	/**yue214*/
	private BigDecimal yue214;
	/**yue31*/
	private BigDecimal yue31;
	/**yue32*/
	private BigDecimal yue32;
	/**yue33*/
	private BigDecimal yue33;
	/**yue34*/
	private BigDecimal yue34;
	/**yue35*/
	private BigDecimal yue35;
	/**yue36*/
	private BigDecimal yue36;
	/**yue37*/
	private BigDecimal yue37;
	/**yue38*/
	private BigDecimal yue38;
	/**yue39*/
	private BigDecimal yue39;
	/**yue310*/
	private BigDecimal yue310;
	/**yue311*/
	private BigDecimal yue311;
	/**yue312*/
	private BigDecimal yue312;
	/**yue313*/
	private BigDecimal yue313;
	/**yue314*/
	private BigDecimal yue314;
	/**yue41*/
	private BigDecimal yue41;
	/**yue42*/
	private BigDecimal yue42;
	/**yue43*/
	private BigDecimal yue43;
	/**yue44*/
	private BigDecimal yue44;
	/**yue45*/
	private BigDecimal yue45;
	/**yue46*/
	private BigDecimal yue46;
	/**yue47*/
	private BigDecimal yue47;
	/**yue48*/
	private BigDecimal yue48;
	/**yue49*/
	private BigDecimal yue49;
	/**yue410*/
	private BigDecimal yue410;
	/**yue411*/
	private BigDecimal yue411;
	/**yue412*/
	private BigDecimal yue412;
	/**yue413*/
	private BigDecimal yue413;
	/**yue414*/
	private BigDecimal yue414;
	/**yue51*/
	private BigDecimal yue51;
	/**yue52*/
	private BigDecimal yue52;
	/**yue53*/
	private BigDecimal yue53;
	/**yue54*/
	private BigDecimal yue54;
	/**yue55*/
	private BigDecimal yue55;
	/**yue56*/
	private BigDecimal yue56;
	/**yue57*/
	private BigDecimal yue57;
	/**yue58*/
	private BigDecimal yue58;
	/**yue59*/
	private BigDecimal yue59;
	/**yue510*/
	private BigDecimal yue510;
	/**yue511*/
	private BigDecimal yue511;
	/**yue512*/
	private BigDecimal yue512;
	/**yue513*/
	private BigDecimal yue513;
	/**yue514*/
	private BigDecimal yue514;
	/**yue61*/
	private BigDecimal yue61;
	/**yue62*/
	private BigDecimal yue62;
	/**yue63*/
	private BigDecimal yue63;
	/**yue64*/
	private BigDecimal yue64;
	/**yue65*/
	private BigDecimal yue65;
	/**yue66*/
	private BigDecimal yue66;
	/**yue67*/
	private BigDecimal yue67;
	/**yue68*/
	private BigDecimal yue68;
	/**yue69*/
	private BigDecimal yue69;
	/**yue610*/
	private BigDecimal yue610;
	/**yue611*/
	private BigDecimal yue611;
	/**yue612*/
	private BigDecimal yue612;
	/**yue613*/
	private BigDecimal yue613;
	/**yue614*/
	private BigDecimal yue614;
	/**yue71*/
	private BigDecimal yue71;
	/**yue72*/
	private BigDecimal yue72;
	/**yue73*/
	private BigDecimal yue73;
	/**yue74*/
	private BigDecimal yue74;
	/**yue75*/
	private BigDecimal yue75;
	/**yue76*/
	private BigDecimal yue76;
	/**yue77*/
	private BigDecimal yue77;
	/**yue78*/
	private BigDecimal yue78;
	/**yue79*/
	private BigDecimal yue79;
	/**yue710*/
	private BigDecimal yue710;
	/**yue711*/
	private BigDecimal yue711;
	/**yue712*/
	private BigDecimal yue712;
	/**yue713*/
	private BigDecimal yue713;
	/**yue714*/
	private BigDecimal yue714;
	/**yue81*/
	private BigDecimal yue81;
	/**yue82*/
	private BigDecimal yue82;
	/**yue83*/
	private BigDecimal yue83;
	/**yue84*/
	private BigDecimal yue84;
	/**yue85*/
	private BigDecimal yue85;
	/**yue86*/
	private BigDecimal yue86;
	/**yue87*/
	private BigDecimal yue87;
	/**yue88*/
	private BigDecimal yue88;
	/**yue89*/
	private BigDecimal yue89;
	/**yue810*/
	private BigDecimal yue810;
	/**yue811*/
	private BigDecimal yue811;
	/**yue812*/
	private BigDecimal yue812;
	/**yue813*/
	private BigDecimal yue813;
	/**yue814*/
	private BigDecimal yue814;
	/**yue91*/
	private BigDecimal yue91;
	/**yue92*/
	private BigDecimal yue92;
	/**yue93*/
	private BigDecimal yue93;
	/**yue94*/
	private BigDecimal yue94;
	/**yue95*/
	private BigDecimal yue95;
	/**yue96*/
	private BigDecimal yue96;
	/**yue97*/
	private BigDecimal yue97;
	/**yue98*/
	private BigDecimal yue98;
	/**yue99*/
	private BigDecimal yue99;
	/**yue910*/
	private BigDecimal yue910;
	/**yue911*/
	private BigDecimal yue911;
	/**yue912*/
	private BigDecimal yue912;
	/**yue913*/
	private BigDecimal yue913;
	/**yue914*/
	private BigDecimal yue914;
	/**yue101*/
	private BigDecimal yue101;
	/**yue102*/
	private BigDecimal yue102;
	/**yue103*/
	private BigDecimal yue103;
	/**yue104*/
	private BigDecimal yue104;
	/**yue105*/
	private BigDecimal yue105;
	/**yue106*/
	private BigDecimal yue106;
	/**yue107*/
	private BigDecimal yue107;
	/**yue108*/
	private BigDecimal yue108;
	/**yue109*/
	private BigDecimal yue109;
	/**yue1010*/
	private BigDecimal yue1010;
	/**yue1011*/
	private BigDecimal yue1011;
	/**yue1012*/
	private BigDecimal yue1012;
	/**yue1013*/
	private BigDecimal yue1013;
	/**yue1014*/
	private BigDecimal yue1014;
	/**yue111*/
	private BigDecimal yue111;
	/**yue112*/
	private BigDecimal yue112;
	/**yue113*/
	private BigDecimal yue113;
	/**yue114*/
	private BigDecimal yue114;
	/**yue115*/
	private BigDecimal yue115;
	/**yue116*/
	private BigDecimal yue116;
	/**yue117*/
	private BigDecimal yue117;
	/**yue118*/
	private BigDecimal yue118;
	/**yue119*/
	private BigDecimal yue119;
	/**yue1110*/
	private BigDecimal yue1110;
	/**yue1111*/
	private BigDecimal yue1111;
	/**yue1112*/
	private BigDecimal yue1112;
	/**yue1113*/
	private BigDecimal yue1113;
	/**yue1114*/
	private BigDecimal yue1114;
	/**yue121*/
	private BigDecimal yue121;
	/**yue122*/
	private BigDecimal yue122;
	/**yue123*/
	private BigDecimal yue123;
	/**yue124*/
	private BigDecimal yue124;
	/**yue125*/
	private BigDecimal yue125;
	/**yue126*/
	private BigDecimal yue126;
	/**yue127*/
	private BigDecimal yue127;
	/**yue128*/
	private BigDecimal yue128;
	/**yue129*/
	private BigDecimal yue129;
	/**yue1210*/
	private BigDecimal yue1210;
	/**yue1211*/
	private BigDecimal yue1211;
	/**yue1212*/
	private BigDecimal yue1212;
	/**yue1213*/
	private BigDecimal yue1213;
	/**yue1214*/
	private BigDecimal yue1214;
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  id
	 */
	
	@Id
	@GeneratedValue(generator = "paymentableGenerator")
	@GenericGenerator(name = "paymentableGenerator", strategy = "uuid")
	@Column(name ="ID",nullable=false,length=32)
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
	 *@return: java.lang.String  dataTitle
	 */
	@Column(name ="DATA_TITLE",nullable=true,length=200)
	public java.lang.String getDataTitle(){
		return this.dataTitle;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  dataTitle
	 */
	public void setDataTitle(java.lang.String dataTitle){
		this.dataTitle = dataTitle;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  year
	 */
	@Column(name ="YEAR",nullable=true,length=45)
	public java.lang.String getYear(){
		return this.year;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  year
	 */
	public void setYear(java.lang.String year){
		this.year = year;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  subjectType
	 */
	@Column(name ="SUBJECT_TYPE",nullable=true,length=20)
	public java.lang.String getSubjectType(){
		return this.subjectType;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  subjectType
	 */
	public void setSubjectType(java.lang.String subjectType){
		this.subjectType = subjectType;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  createName
	 */
	@Column(name ="CREATE_NAME",nullable=true,length=45)
	public java.lang.String getCreateName(){
		return this.createName;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  createName
	 */
	public void setCreateName(java.lang.String createName){
		this.createName = createName;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  createDate
	 */
	@Column(name ="CREATE_DATE",nullable=true)
	public java.util.Date getCreateDate(){
		return this.createDate;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  createDate
	 */
	public void setCreateDate(java.util.Date createDate){
		this.createDate = createDate;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  updateName
	 */
	@Column(name ="UPDATE_NAME",nullable=true,length=45)
	public java.lang.String getUpdateName(){
		return this.updateName;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  updateName
	 */
	public void setUpdateName(java.lang.String updateName){
		this.updateName = updateName;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  updateDate
	 */
	@Column(name ="UPDATE_DATE",nullable=true,length=45)
	public java.util.Date getUpdateDate(){
		return this.updateDate;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  updateDate
	 */
	public void setUpdateDate(java.util.Date updateDate){
		this.updateDate = updateDate;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  sysOrgCode
	 */
	@Column(name ="SYS_ORG_CODE",nullable=true,length=45)
	public java.lang.String getSysOrgCode(){
		return this.sysOrgCode;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  sysOrgCode
	 */
	public void setSysOrgCode(java.lang.String sysOrgCode){
		this.sysOrgCode = sysOrgCode;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  hMb1
	 */
	@Column(name ="H_MB_1",nullable=true,precision=10,scale=0)
	public BigDecimal getHMB1(){
		return this.HMB1;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  hMb1
	 */
	public void setHMB1(BigDecimal HMB1){
		this.HMB1 = HMB1;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  hMb2
	 */
	@Column(name ="H_MB_2",nullable=true,precision=10,scale=0)
	public BigDecimal getHMB2(){
		return this.HMB2;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  hMb2
	 */
	public void setHMB2(BigDecimal hMb2){
		this.HMB2 = hMb2;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  hMb3
	 */
	@Column(name ="H_MB_3",nullable=true,precision=10,scale=0)
	public BigDecimal getHMB3(){
		return this.HMB3;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  hMb3
	 */
	public void setHMB3(BigDecimal hMb3){
		this.HMB3 = hMb3;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  hMb4
	 */
	@Column(name ="H_MB_4",nullable=true,precision=10,scale=0)
	public BigDecimal getHMB4(){
		return this.HMB4;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  hMb4
	 */
	public void setHMB4(BigDecimal hMb4){
		this.HMB4 = hMb4;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  hMb5
	 */
	@Column(name ="H_MB_5",nullable=true,precision=10,scale=0)
	public BigDecimal getHMB5(){
		return this.HMB5;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  hMb5
	 */
	public void setHMB5(BigDecimal hMb5){
		this.HMB5 = hMb5;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  hMb6
	 */
	@Column(name ="H_MB_6",nullable=true,precision=10,scale=0)
	public BigDecimal getHMB6(){
		return this.HMB6;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  hMb6
	 */
	public void setHMB6(BigDecimal hMb6){
		this.HMB6 = hMb6;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  hMb7
	 */
	@Column(name ="H_MB_7",nullable=true,precision=10,scale=0)
	public BigDecimal getHMB7(){
		return this.HMB7;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  hMb7
	 */
	public void setHMB7(BigDecimal hMb7){
		this.HMB7 = hMb7;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  hMb8
	 */
	@Column(name ="H_MB_8",nullable=true,precision=10,scale=0)
	public BigDecimal getHMB8(){
		return this.HMB8;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  hMb8
	 */
	public void setHMB8(BigDecimal hMb8){
		this.HMB8 = hMb8;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  hMb9
	 */
	@Column(name ="H_MB_9",nullable=true,precision=10,scale=0)
	public BigDecimal getHMB9(){
		return this.HMB9;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  hMb9
	 */
	public void setHMB9(BigDecimal hMb9){
		this.HMB9 = hMb9;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  hMb10
	 */
	@Column(name ="H_MB_10",nullable=true,precision=10,scale=0)
	public BigDecimal getHMB10(){
		return this.HMB10;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  hMb10
	 */
	public void setHMB10(BigDecimal hMb10){
		this.HMB10 = hMb10;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  hMb11
	 */
	@Column(name ="H_MB_11",nullable=true,precision=10,scale=0)
	public BigDecimal getHMB11(){
		return this.HMB11;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  hMb11
	 */
	public void setHMB11(BigDecimal hMb11){
		this.HMB11 = hMb11;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  hMb12
	 */
	@Column(name ="H_MB_12",nullable=true,precision=10,scale=0)
	public BigDecimal getHMB12(){
		return this.HMB12;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  hMb12
	 */
	public void setHMB12(BigDecimal hMb12){
		this.HMB12 = hMb12;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  hMb13
	 */
	@Column(name ="H_MB_13",nullable=true,precision=10,scale=0)
	public BigDecimal getHMB13(){
		return this.HMB13;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  hMb13
	 */
	public void setHMB13(BigDecimal hMb13){
		this.HMB13 = hMb13;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  hMb14
	 */
	@Column(name ="H_MB_14",nullable=true,precision=10,scale=0)
	public BigDecimal getHMB14(){
		return this.HMB14;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  hMb14
	 */
	public void setHMB14(BigDecimal hMb14){
		this.HMB14 = hMb14;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  cMb1
	 */
	@Column(name ="C_MB_1",nullable=true,precision=10,scale=0)
	public BigDecimal getCMB1(){
		return this.CMB1;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  cMb1
	 */
	public void setCMB1(BigDecimal cMb1){
		this.CMB1 = cMb1;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  cMb2
	 */
	@Column(name ="C_MB_2",nullable=true,precision=10,scale=0)
	public BigDecimal getCMB2(){
		return this.CMB2;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  cMb2
	 */
	public void setCMB2(BigDecimal cMb2){
		this.CMB2 = cMb2;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  cMb3
	 */
	@Column(name ="C_MB_3",nullable=true,precision=10,scale=0)
	public BigDecimal getCMB3(){
		return this.CMB3;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  cMb3
	 */
	public void setCMB3(BigDecimal cMb3){
		this.CMB3 = cMb3;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  cMb4
	 */
	@Column(name ="C_MB_4",nullable=true,precision=10,scale=0)
	public BigDecimal getCMB4(){
		return this.CMB4;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  cMb4
	 */
	public void setCMB4(BigDecimal cMb4){
		this.CMB4 = cMb4;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  cMb5
	 */
	@Column(name ="C_MB_5",nullable=true,precision=10,scale=0)
	public BigDecimal getCMB5(){
		return this.CMB5;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  cMb5
	 */
	public void setCMB5(BigDecimal cMb5){
		this.CMB5 = cMb5;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  cMb6
	 */
	@Column(name ="C_MB_6",nullable=true,precision=10,scale=0)
	public BigDecimal getCMB6(){
		return this.CMB6;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  cMb6
	 */
	public void setCMB6(BigDecimal cMb6){
		this.CMB6 = cMb6;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  cMb7
	 */
	@Column(name ="C_MB_7",nullable=true,precision=10,scale=0)
	public BigDecimal getCMB7(){
		return this.CMB7;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  cMb7
	 */
	public void setCMB7(BigDecimal cMb7){
		this.CMB7 = cMb7;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  cMb8
	 */
	@Column(name ="C_MB_8",nullable=true,precision=10,scale=0)
	public BigDecimal getCMB8(){
		return this.CMB8;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  cMb8
	 */
	public void setCMB8(BigDecimal cMb8){
		this.CMB8 = cMb8;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  cMb9
	 */
	@Column(name ="C_MB_9",nullable=true,precision=10,scale=0)
	public BigDecimal getCMB9(){
		return this.CMB9;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  cMb9
	 */
	public void setCMB9(BigDecimal cMb9){
		this.CMB9 = cMb9;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  cMb10
	 */
	@Column(name ="C_MB_10",nullable=true,precision=10,scale=0)
	public BigDecimal getCMB10(){
		return this.CMB10;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  cMb10
	 */
	public void setCMB10(BigDecimal cMb10){
		this.CMB10 = cMb10;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  cMb11
	 */
	@Column(name ="C_MB_11",nullable=true,precision=10,scale=0)
	public BigDecimal getCMB11(){
		return this.CMB11;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  cMb11
	 */
	public void setCMB11(BigDecimal cMb11){
		this.CMB11 = cMb11;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  cMb12
	 */
	@Column(name ="C_MB_12",nullable=true,precision=10,scale=0)
	public BigDecimal getCMB12(){
		return this.CMB12;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  cMb12
	 */
	public void setCMB12(BigDecimal cMb12){
		this.CMB12 = cMb12;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  cMb13
	 */
	@Column(name ="C_MB_13",nullable=true,precision=10,scale=0)
	public BigDecimal getCMB13(){
		return this.CMB13;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  cMb13
	 */
	public void setCMB13(BigDecimal cMb13){
		this.CMB13 = cMb13;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  cMb14
	 */
	@Column(name ="C_MB_14",nullable=true,precision=10,scale=0)
	public BigDecimal getCMB14(){
		return this.CMB14;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  cMb14
	 */
	public void setCMB14(BigDecimal cMb14){
		this.CMB14 = cMb14;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  sMb1
	 */
	@Column(name ="S_MB_1",nullable=true,precision=10,scale=0)
	public BigDecimal getSMB1(){
		return this.SMB1;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  sMb1
	 */
	public void setSMB1(BigDecimal sMb1){
		this.SMB1 = sMb1;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  sMb2
	 */
	@Column(name ="S_MB_2",nullable=true,precision=10,scale=0)
	public BigDecimal getSMB2(){
		return this.SMB2;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  sMb2
	 */
	public void setSMB2(BigDecimal sMb2){
		this.SMB2 = sMb2;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  sMb3
	 */
	@Column(name ="S_MB_3",nullable=true,precision=10,scale=0)
	public BigDecimal getSMB3(){
		return this.SMB3;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  sMb3
	 */
	public void setSMB3(BigDecimal sMb3){
		this.SMB3 = sMb3;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  sMb4
	 */
	@Column(name ="S_MB_4",nullable=true,precision=10,scale=0)
	public BigDecimal getSMB4(){
		return this.SMB4;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  sMb4
	 */
	public void setSMB4(BigDecimal sMb4){
		this.SMB4 = sMb4;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  sMb5
	 */
	@Column(name ="S_MB_5",nullable=true,precision=10,scale=0)
	public BigDecimal getSMB5(){
		return this.SMB5;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  sMb5
	 */
	public void setSMB5(BigDecimal sMb5){
		this.SMB5 = sMb5;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  sMb6
	 */
	@Column(name ="S_MB_6",nullable=true,precision=10,scale=0)
	public BigDecimal getSMB6(){
		return this.SMB6;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  sMb6
	 */
	public void setSMB6(BigDecimal sMb6){
		this.SMB6 = sMb6;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  sMb7
	 */
	@Column(name ="S_MB_7",nullable=true,precision=10,scale=0)
	public BigDecimal getSMB7(){
		return this.SMB7;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  sMb7
	 */
	public void setSMB7(BigDecimal sMb7){
		this.SMB7 = sMb7;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  sMb8
	 */
	@Column(name ="S_MB_8",nullable=true,precision=10,scale=0)
	public BigDecimal getSMB8(){
		return this.SMB8;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  sMb8
	 */
	public void setSMB8(BigDecimal sMb8){
		this.SMB8 = sMb8;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  sMb9
	 */
	@Column(name ="S_MB_9",nullable=true,precision=10,scale=0)
	public BigDecimal getSMB9(){
		return this.SMB9;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  sMb9
	 */
	public void setSMB9(BigDecimal sMb9){
		this.SMB9 = sMb9;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  sMb10
	 */
	@Column(name ="S_MB_10",nullable=true,precision=10,scale=0)
	public BigDecimal getSMB10(){
		return this.SMB10;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  sMb10
	 */
	public void setSMB10(BigDecimal sMb10){
		this.SMB10 = sMb10;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  sMb11
	 */
	@Column(name ="S_MB_11",nullable=true,precision=10,scale=0)
	public BigDecimal getSMB11(){
		return this.SMB11;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  sMb11
	 */
	public void setSMB11(BigDecimal sMb11){
		this.SMB11 = sMb11;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  sMb12
	 */
	@Column(name ="S_MB_12",nullable=true,precision=10,scale=0)
	public BigDecimal getSMB12(){
		return this.SMB12;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  sMb12
	 */
	public void setSMB12(BigDecimal sMb12){
		this.SMB12 = sMb12;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  sMb13
	 */
	@Column(name ="S_MB_13",nullable=true,precision=10,scale=0)
	public BigDecimal getSMB13(){
		return this.SMB13;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  sMb13
	 */
	public void setSMB13(BigDecimal sMb13){
		this.SMB13 = sMb13;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  sMb14
	 */
	@Column(name ="S_MB_14",nullable=true,precision=10,scale=0)
	public BigDecimal getSMB14(){
		return this.SMB14;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  sMb14
	 */
	public void setSMB14(BigDecimal sMb14){
		this.SMB14 = sMb14;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  qMb1
	 */
	@Column(name ="Q_MB_1",nullable=true,precision=10,scale=0)
	public BigDecimal getQMB1(){
		return this.QMB1;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  qMb1
	 */
	public void setQMB1(BigDecimal qMb1){
		this.QMB1 = qMb1;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  qMb2
	 */
	@Column(name ="Q_MB_2",nullable=true,precision=10,scale=0)
	public BigDecimal getQMB2(){
		return this.QMB2;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  qMb2
	 */
	public void setQMB2(BigDecimal qMb2){
		this.QMB2 = qMb2;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  qMb3
	 */
	@Column(name ="Q_MB_3",nullable=true,precision=10,scale=0)
	public BigDecimal getQMB3(){
		return this.QMB3;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  qMb3
	 */
	public void setQMB3(BigDecimal qMb3){
		this.QMB3 = qMb3;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  qMb4
	 */
	@Column(name ="Q_MB_4",nullable=true,precision=10,scale=0)
	public BigDecimal getQMB4(){
		return this.QMB4;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  qMb4
	 */
	public void setQMB4(BigDecimal qMb4){
		this.QMB4 = qMb4;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  qMb5
	 */
	@Column(name ="Q_MB_5",nullable=true,precision=10,scale=0)
	public BigDecimal getQMB5(){
		return this.QMB5;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  qMb5
	 */
	public void setQMB5(BigDecimal qMb5){
		this.QMB5 = qMb5;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  qMb6
	 */
	@Column(name ="Q_MB_6",nullable=true,precision=10,scale=0)
	public BigDecimal getQMB6(){
		return this.QMB6;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  qMb6
	 */
	public void setQMB6(BigDecimal qMb6){
		this.QMB6 = qMb6;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  qMb7
	 */
	@Column(name ="Q_MB_7",nullable=true,precision=10,scale=0)
	public BigDecimal getQMB7(){
		return this.QMB7;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  qMb7
	 */
	public void setQMB7(BigDecimal qMb7){
		this.QMB7 = qMb7;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  qMb8
	 */
	@Column(name ="Q_MB_8",nullable=true,precision=10,scale=0)
	public BigDecimal getQMB8(){
		return this.QMB8;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  qMb8
	 */
	public void setQMB8(BigDecimal qMb8){
		this.QMB8 = qMb8;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  qMb9
	 */
	@Column(name ="Q_MB_9",nullable=true,precision=10,scale=0)
	public BigDecimal getQMB9(){
		return this.QMB9;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  qMb9
	 */
	public void setQMB9(BigDecimal qMb9){
		this.QMB9 = qMb9;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  qMb10
	 */
	@Column(name ="Q_MB_10",nullable=true,precision=10,scale=0)
	public BigDecimal getQMB10(){
		return this.QMB10;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  qMb10
	 */
	public void setQMB10(BigDecimal qMb10){
		this.QMB10 = qMb10;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  qMb11
	 */
	@Column(name ="Q_MB_11",nullable=true,precision=10,scale=0)
	public BigDecimal getQMB11(){
		return this.QMB11;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  qMb11
	 */
	public void setQMB11(BigDecimal qMb11){
		this.QMB11 = qMb11;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  qMb12
	 */
	@Column(name ="Q_MB_12",nullable=true,precision=10,scale=0)
	public BigDecimal getQMB12(){
		return this.QMB12;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  qMb12
	 */
	public void setQMB12(BigDecimal qMb12){
		this.QMB12 = qMb12;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  qMb13
	 */
	@Column(name ="Q_MB_13",nullable=true,precision=10,scale=0)
	public BigDecimal getQMB13(){
		return this.QMB13;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  qMb13
	 */
	public void setQMB13(BigDecimal qMb13){
		this.QMB13 = qMb13;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  qMb14
	 */
	@Column(name ="Q_MB_14",nullable=true,precision=10,scale=0)
	public BigDecimal getQMB14(){
		return this.QMB14;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  qMb14
	 */
	public void setQMB14(BigDecimal qMb14){
		this.QMB14 = qMb14;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  totalMb1
	 */
	@Column(name ="TOTAL_MB_1",nullable=true,precision=10,scale=0)
	public BigDecimal getTotalMb1(){
		return this.totalMb1;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  totalMb1
	 */
	public void setTotalMb1(BigDecimal totalMb1){
		this.totalMb1 = totalMb1;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  totalMb2
	 */
	@Column(name ="TOTAL_MB_2",nullable=true,precision=10,scale=0)
	public BigDecimal getTotalMb2(){
		return this.totalMb2;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  totalMb2
	 */
	public void setTotalMb2(BigDecimal totalMb2){
		this.totalMb2 = totalMb2;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  totalMb3
	 */
	@Column(name ="TOTAL_MB_3",nullable=true,precision=10,scale=0)
	public BigDecimal getTotalMb3(){
		return this.totalMb3;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  totalMb3
	 */
	public void setTotalMb3(BigDecimal totalMb3){
		this.totalMb3 = totalMb3;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  totalMb4
	 */
	@Column(name ="TOTAL_MB_4",nullable=true,precision=10,scale=0)
	public BigDecimal getTotalMb4(){
		return this.totalMb4;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  totalMb4
	 */
	public void setTotalMb4(BigDecimal totalMb4){
		this.totalMb4 = totalMb4;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  totalMb5
	 */
	@Column(name ="TOTAL_MB_5",nullable=true,precision=10,scale=0)
	public BigDecimal getTotalMb5(){
		return this.totalMb5;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  totalMb5
	 */
	public void setTotalMb5(BigDecimal totalMb5){
		this.totalMb5 = totalMb5;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  totalMb6
	 */
	@Column(name ="TOTAL_MB_6",nullable=true,precision=10,scale=0)
	public BigDecimal getTotalMb6(){
		return this.totalMb6;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  totalMb6
	 */
	public void setTotalMb6(BigDecimal totalMb6){
		this.totalMb6 = totalMb6;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  totalMb7
	 */
	@Column(name ="TOTAL_MB_7",nullable=true,precision=10,scale=0)
	public BigDecimal getTotalMb7(){
		return this.totalMb7;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  totalMb7
	 */
	public void setTotalMb7(BigDecimal totalMb7){
		this.totalMb7 = totalMb7;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  totalMb8
	 */
	@Column(name ="TOTAL_MB_8",nullable=true,precision=10,scale=0)
	public BigDecimal getTotalMb8(){
		return this.totalMb8;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  totalMb8
	 */
	public void setTotalMb8(BigDecimal totalMb8){
		this.totalMb8 = totalMb8;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  totalMb9
	 */
	@Column(name ="TOTAL_MB_9",nullable=true,precision=10,scale=0)
	public BigDecimal getTotalMb9(){
		return this.totalMb9;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  totalMb9
	 */
	public void setTotalMb9(BigDecimal totalMb9){
		this.totalMb9 = totalMb9;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  totalMb10
	 */
	@Column(name ="TOTAL_MB_10",nullable=true,precision=10,scale=0)
	public BigDecimal getTotalMb10(){
		return this.totalMb10;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  totalMb10
	 */
	public void setTotalMb10(BigDecimal totalMb10){
		this.totalMb10 = totalMb10;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  totalMb11
	 */
	@Column(name ="TOTAL_MB_11",nullable=true,precision=10,scale=0)
	public BigDecimal getTotalMb11(){
		return this.totalMb11;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  totalMb11
	 */
	public void setTotalMb11(BigDecimal totalMb11){
		this.totalMb11 = totalMb11;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  totalMb12
	 */
	@Column(name ="TOTAL_MB_12",nullable=true,precision=10,scale=0)
	public BigDecimal getTotalMb12(){
		return this.totalMb12;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  totalMb12
	 */
	public void setTotalMb12(BigDecimal totalMb12){
		this.totalMb12 = totalMb12;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  totalMb13
	 */
	@Column(name ="TOTAL_MB_13",nullable=true,precision=10,scale=0)
	public BigDecimal getTotalMb13(){
		return this.totalMb13;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  totalMb13
	 */
	public void setTotalMb13(BigDecimal totalMb13){
		this.totalMb13 = totalMb13;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  totalMb14
	 */
	@Column(name ="TOTAL_MB_14",nullable=true,precision=10,scale=0)
	public BigDecimal getTotalMb14(){
		return this.totalMb14;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  totalMb14
	 */
	public void setTotalMb14(BigDecimal totalMb14){
		this.totalMb14 = totalMb14;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  hWc1
	 */
	@Column(name ="H_WC_1",nullable=true,precision=10,scale=0)
	public BigDecimal getHWC1(){
		return this.HWC1;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  hWc1
	 */
	public void setHWC1(BigDecimal hWc1){
		this.HWC1 = hWc1;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  hWc2
	 */
	@Column(name ="H_WC_2",nullable=true,precision=10,scale=0)
	public BigDecimal getHWC2(){
		return this.HWC2;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  hWc2
	 */
	public void setHWC2(BigDecimal hWc2){
		this.HWC2 = hWc2;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  hWc3
	 */
	@Column(name ="H_WC_3",nullable=true,precision=10,scale=0)
	public BigDecimal getHWC3(){
		return this.HWC3;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  hWc3
	 */
	public void setHWC3(BigDecimal hWc3){
		this.HWC3 = hWc3;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  hWc4
	 */
	@Column(name ="H_WC_4",nullable=true,precision=10,scale=0)
	public BigDecimal getHWC4(){
		return this.HWC4;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  hWc4
	 */
	public void setHWC4(BigDecimal hWc4){
		this.HWC4 = hWc4;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  hWc5
	 */
	@Column(name ="H_WC_5",nullable=true,precision=10,scale=0)
	public BigDecimal getHWC5(){
		return this.HWC5;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  hWc5
	 */
	public void setHWC5(BigDecimal hWc5){
		this.HWC5 = hWc5;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  hWc6
	 */
	@Column(name ="H_WC_6",nullable=true,precision=10,scale=0)
	public BigDecimal getHWC6(){
		return this.HWC6;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  hWc6
	 */
	public void setHWC6(BigDecimal hWc6){
		this.HWC6 = hWc6;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  hWc7
	 */
	@Column(name ="H_WC_7",nullable=true,precision=10,scale=0)
	public BigDecimal getHWC7(){
		return this.HWC7;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  hWc7
	 */
	public void setHWC7(BigDecimal hWc7){
		this.HWC7 = hWc7;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  hWc8
	 */
	@Column(name ="H_WC_8",nullable=true,precision=10,scale=0)
	public BigDecimal getHWC8(){
		return this.HWC8;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  hWc8
	 */
	public void setHWC8(BigDecimal hWc8){
		this.HWC8 = hWc8;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  hWc9
	 */
	@Column(name ="H_WC_9",nullable=true,precision=10,scale=0)
	public BigDecimal getHWC9(){
		return this.HWC9;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  hWc9
	 */
	public void setHWC9(BigDecimal hWc9){
		this.HWC9 = hWc9;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  hWc10
	 */
	@Column(name ="H_WC_10",nullable=true,precision=10,scale=0)
	public BigDecimal getHWC10(){
		return this.HWC10;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  hWc10
	 */
	public void setHWC10(BigDecimal hWc10){
		this.HWC10 = hWc10;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  hWc11
	 */
	@Column(name ="H_WC_11",nullable=true,precision=10,scale=0)
	public BigDecimal getHWC11(){
		return this.HWC11;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  hWc11
	 */
	public void setHWC11(BigDecimal hWc11){
		this.HWC11 = hWc11;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  hWc12
	 */
	@Column(name ="H_WC_12",nullable=true,precision=10,scale=0)
	public BigDecimal getHWC12(){
		return this.HWC12;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  hWc12
	 */
	public void setHWC12(BigDecimal hWc12){
		this.HWC12 = hWc12;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  hWc13
	 */
	@Column(name ="H_WC_13",nullable=true,precision=10,scale=0)
	public BigDecimal getHWC13(){
		return this.HWC13;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  hWc13
	 */
	public void setHWC13(BigDecimal hWc13){
		this.HWC13 = hWc13;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  hWc14
	 */
	@Column(name ="H_WC_14",nullable=true,precision=10,scale=0)
	public BigDecimal getHWC14(){
		return this.HWC14;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  hWc14
	 */
	public void setHWC14(BigDecimal hWc14){
		this.HWC14 = hWc14;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  cWc1
	 */
	@Column(name ="C_WC_1",nullable=true,precision=10,scale=0)
	public BigDecimal getCWC1(){
		return this.CWC1;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  cWc1
	 */
	public void setCWC1(BigDecimal cWc1){
		this.CWC1 = cWc1;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  cWc2
	 */
	@Column(name ="C_WC_2",nullable=true,precision=10,scale=0)
	public BigDecimal getCWC2(){
		return this.CWC2;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  cWc2
	 */
	public void setCWC2(BigDecimal cWc2){
		this.CWC2 = cWc2;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  cWc3
	 */
	@Column(name ="C_WC_3",nullable=true,precision=10,scale=0)
	public BigDecimal getCWC3(){
		return this.CWC3;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  cWc3
	 */
	public void setCWC3(BigDecimal cWc3){
		this.CWC3 = cWc3;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  cWc4
	 */
	@Column(name ="C_WC_4",nullable=true,precision=10,scale=0)
	public BigDecimal getCWC4(){
		return this.CWC4;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  cWc4
	 */
	public void setCWC4(BigDecimal cWc4){
		this.CWC4 = cWc4;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  cWc5
	 */
	@Column(name ="C_WC_5",nullable=true,precision=10,scale=0)
	public BigDecimal getCWC5(){
		return this.CWC5;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  cWc5
	 */
	public void setCWC5(BigDecimal cWc5){
		this.CWC5 = cWc5;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  cWc6
	 */
	@Column(name ="C_WC_6",nullable=true,precision=10,scale=0)
	public BigDecimal getCWC6(){
		return this.CWC6;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  cWc6
	 */
	public void setCWC6(BigDecimal cWc6){
		this.CWC6 = cWc6;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  cWc7
	 */
	@Column(name ="C_WC_7",nullable=true,precision=10,scale=0)
	public BigDecimal getCWC7(){
		return this.CWC7;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  cWc7
	 */
	public void setCWC7(BigDecimal cWc7){
		this.CWC7 = cWc7;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  cWc8
	 */
	@Column(name ="C_WC_8",nullable=true,precision=10,scale=0)
	public BigDecimal getCWC8(){
		return this.CWC8;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  cWc8
	 */
	public void setCWC8(BigDecimal cWc8){
		this.CWC8 = cWc8;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  cWc9
	 */
	@Column(name ="C_WC_9",nullable=true,precision=10,scale=0)
	public BigDecimal getCWC9(){
		return this.CWC9;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  cWc9
	 */
	public void setCWC9(BigDecimal cWc9){
		this.CWC9 = cWc9;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  cWc10
	 */
	@Column(name ="C_WC_10",nullable=true,precision=10,scale=0)
	public BigDecimal getCWC10(){
		return this.CWC10;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  cWc10
	 */
	public void setCWC10(BigDecimal cWc10){
		this.CWC10 = cWc10;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  cWc11
	 */
	@Column(name ="C_WC_11",nullable=true,precision=10,scale=0)
	public BigDecimal getCWC11(){
		return this.CWC11;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  cWc11
	 */
	public void setCWC11(BigDecimal cWc11){
		this.CWC11 = cWc11;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  cWc12
	 */
	@Column(name ="C_WC_12",nullable=true,precision=10,scale=0)
	public BigDecimal getCWC12(){
		return this.CWC12;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  cWc12
	 */
	public void setCWC12(BigDecimal cWc12){
		this.CWC12 = cWc12;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  cWc13
	 */
	@Column(name ="C_WC_13",nullable=true,precision=10,scale=0)
	public BigDecimal getCWC13(){
		return this.CWC13;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  cWc13
	 */
	public void setCWC13(BigDecimal cWc13){
		this.CWC13 = cWc13;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  cWc14
	 */
	@Column(name ="C_WC_14",nullable=true,precision=10,scale=0)
	public BigDecimal getCWC14(){
		return this.CWC14;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  cWc14
	 */
	public void setCWC14(BigDecimal cWc14){
		this.CWC14 = cWc14;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  sWc1
	 */
	@Column(name ="S_WC_1",nullable=true,precision=10,scale=0)
	public BigDecimal getSWC1(){
		return this.SWC1;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  sWc1
	 */
	public void setSWC1(BigDecimal sWc1){
		this.SWC1 = sWc1;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  sWc2
	 */
	@Column(name ="S_WC_2",nullable=true,precision=10,scale=0)
	public BigDecimal getSWC2(){
		return this.SWC2;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  sWc2
	 */
	public void setSWC2(BigDecimal sWc2){
		this.SWC2 = sWc2;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  sWc3
	 */
	@Column(name ="S_WC_3",nullable=true,precision=10,scale=0)
	public BigDecimal getSWC3(){
		return this.SWC3;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  sWc3
	 */
	public void setSWC3(BigDecimal sWc3){
		this.SWC3 = sWc3;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  sWc4
	 */
	@Column(name ="S_WC_4",nullable=true,precision=10,scale=0)
	public BigDecimal getSWC4(){
		return this.SWC4;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  sWc4
	 */
	public void setSWC4(BigDecimal sWc4){
		this.SWC4 = sWc4;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  sWc5
	 */
	@Column(name ="S_WC_5",nullable=true,precision=10,scale=0)
	public BigDecimal getSWC5(){
		return this.SWC5;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  sWc5
	 */
	public void setSWC5(BigDecimal sWc5){
		this.SWC5 = sWc5;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  sWc6
	 */
	@Column(name ="S_WC_6",nullable=true,precision=10,scale=0)
	public BigDecimal getSWC6(){
		return this.SWC6;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  sWc6
	 */
	public void setSWC6(BigDecimal sWc6){
		this.SWC6 = sWc6;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  sWc7
	 */
	@Column(name ="S_WC_7",nullable=true,precision=10,scale=0)
	public BigDecimal getSWC7(){
		return this.SWC7;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  sWc7
	 */
	public void setSWC7(BigDecimal sWc7){
		this.SWC7 = sWc7;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  sWc8
	 */
	@Column(name ="S_WC_8",nullable=true,precision=10,scale=0)
	public BigDecimal getSWC8(){
		return this.SWC8;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  sWc8
	 */
	public void setSWC8(BigDecimal sWc8){
		this.SWC8 = sWc8;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  sWc9
	 */
	@Column(name ="S_WC_9",nullable=true,precision=10,scale=0)
	public BigDecimal getSWC9(){
		return this.SWC9;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  sWc9
	 */
	public void setSWC9(BigDecimal sWc9){
		this.SWC9 = sWc9;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  sWc10
	 */
	@Column(name ="S_WC_10",nullable=true,precision=10,scale=0)
	public BigDecimal getSWC10(){
		return this.SWC10;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  sWc10
	 */
	public void setSWC10(BigDecimal sWc10){
		this.SWC10 = sWc10;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  sWc11
	 */
	@Column(name ="S_WC_11",nullable=true,precision=10,scale=0)
	public BigDecimal getSWC11(){
		return this.SWC11;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  sWc11
	 */
	public void setSWC11(BigDecimal sWc11){
		this.SWC11 = sWc11;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  sWc12
	 */
	@Column(name ="S_WC_12",nullable=true,precision=10,scale=0)
	public BigDecimal getSWC12(){
		return this.SWC12;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  sWc12
	 */
	public void setSWC12(BigDecimal sWc12){
		this.SWC12 = sWc12;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  sWc13
	 */
	@Column(name ="S_WC_13",nullable=true,precision=10,scale=0)
	public BigDecimal getSWC13(){
		return this.SWC13;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  sWc13
	 */
	public void setSWC13(BigDecimal sWc13){
		this.SWC13 = sWc13;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  sWc14
	 */
	@Column(name ="S_WC_14",nullable=true,precision=10,scale=0)
	public BigDecimal getSWC14(){
		return this.SWC14;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  sWc14
	 */
	public void setSWC14(BigDecimal sWc14){
		this.SWC14 = sWc14;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  qWc1
	 */
	@Column(name ="Q_WC_1",nullable=true,precision=10,scale=0)
	public BigDecimal getQWC1(){
		return this.QWC1;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  qWc1
	 */
	public void setQWC1(BigDecimal qWc1){
		this.QWC1 = qWc1;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  qWc2
	 */
	@Column(name ="Q_WC_2",nullable=true,precision=10,scale=0)
	public BigDecimal getQWC2(){
		return this.QWC2;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  qWc2
	 */
	public void setQWC2(BigDecimal qWc2){
		this.QWC2 = qWc2;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  qWc3
	 */
	@Column(name ="Q_WC_3",nullable=true,precision=10,scale=0)
	public BigDecimal getQWC3(){
		return this.QWC3;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  qWc3
	 */
	public void setQWC3(BigDecimal qWc3){
		this.QWC3 = qWc3;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  qWc4
	 */
	@Column(name ="Q_WC_4",nullable=true,precision=10,scale=0)
	public BigDecimal getQWC4(){
		return this.QWC4;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  qWc4
	 */
	public void setQWC4(BigDecimal qWc4){
		this.QWC4 = qWc4;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  qWc5
	 */
	@Column(name ="Q_WC_5",nullable=true,precision=10,scale=0)
	public BigDecimal getQWC5(){
		return this.QWC5;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  qWc5
	 */
	public void setQWC5(BigDecimal qWc5){
		this.QWC5 = qWc5;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  qWc6
	 */
	@Column(name ="Q_WC_6",nullable=true,precision=10,scale=0)
	public BigDecimal getQWC6(){
		return this.QWC6;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  qWc6
	 */
	public void setQWC6(BigDecimal qWc6){
		this.QWC6 = qWc6;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  qWc7
	 */
	@Column(name ="Q_WC_7",nullable=true,precision=10,scale=0)
	public BigDecimal getQWC7(){
		return this.QWC7;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  qWc7
	 */
	public void setQWC7(BigDecimal qWc7){
		this.QWC7 = qWc7;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  qWc8
	 */
	@Column(name ="Q_WC_8",nullable=true,precision=10,scale=0)
	public BigDecimal getQWC8(){
		return this.QWC8;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  qWc8
	 */
	public void setQWC8(BigDecimal qWc8){
		this.QWC8 = qWc8;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  qWc9
	 */
	@Column(name ="Q_WC_9",nullable=true,precision=10,scale=0)
	public BigDecimal getQWC9(){
		return this.QWC9;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  qWc9
	 */
	public void setQWC9(BigDecimal qWc9){
		this.QWC9 = qWc9;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  qWc10
	 */
	@Column(name ="Q_WC_10",nullable=true,precision=10,scale=0)
	public BigDecimal getQWC10(){
		return this.QWC10;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  qWc10
	 */
	public void setQWC10(BigDecimal qWc10){
		this.QWC10 = qWc10;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  qWc11
	 */
	@Column(name ="Q_WC_11",nullable=true,precision=10,scale=0)
	public BigDecimal getQWC11(){
		return this.QWC11;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  qWc11
	 */
	public void setQWC11(BigDecimal qWc11){
		this.QWC11 = qWc11;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  qWc12
	 */
	@Column(name ="Q_WC_12",nullable=true,precision=10,scale=0)
	public BigDecimal getQWC12(){
		return this.QWC12;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  qWc12
	 */
	public void setQWC12(BigDecimal qWc12){
		this.QWC12 = qWc12;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  qWc13
	 */
	@Column(name ="Q_WC_13",nullable=true,precision=10,scale=0)
	public BigDecimal getQWC13(){
		return this.QWC13;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  qWc13
	 */
	public void setQWC13(BigDecimal qWc13){
		this.QWC13 = qWc13;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  qWc14
	 */
	@Column(name ="Q_WC_14",nullable=true,precision=10,scale=0)
	public BigDecimal getQWC14(){
		return this.QWC14;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  qWc14
	 */
	public void setQWC14(BigDecimal qWc14){
		this.QWC14 = qWc14;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  totalWc1
	 */
	@Column(name ="TOTAL_WC_1",nullable=true,precision=10,scale=0)
	public BigDecimal getTotalWc1(){
		return this.totalWc1;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  totalWc1
	 */
	public void setTotalWc1(BigDecimal totalWc1){
		this.totalWc1 = totalWc1;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  totalWc2
	 */
	@Column(name ="TOTAL_WC_2",nullable=true,precision=10,scale=0)
	public BigDecimal getTotalWc2(){
		return this.totalWc2;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  totalWc2
	 */
	public void setTotalWc2(BigDecimal totalWc2){
		this.totalWc2 = totalWc2;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  totalWc3
	 */
	@Column(name ="TOTAL_WC_3",nullable=true,precision=10,scale=0)
	public BigDecimal getTotalWc3(){
		return this.totalWc3;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  totalWc3
	 */
	public void setTotalWc3(BigDecimal totalWc3){
		this.totalWc3 = totalWc3;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  totalWc4
	 */
	@Column(name ="TOTAL_WC_4",nullable=true,precision=10,scale=0)
	public BigDecimal getTotalWc4(){
		return this.totalWc4;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  totalWc4
	 */
	public void setTotalWc4(BigDecimal totalWc4){
		this.totalWc4 = totalWc4;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  totalWc5
	 */
	@Column(name ="TOTAL_WC_5",nullable=true,precision=10,scale=0)
	public BigDecimal getTotalWc5(){
		return this.totalWc5;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  totalWc5
	 */
	public void setTotalWc5(BigDecimal totalWc5){
		this.totalWc5 = totalWc5;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  totalWc6
	 */
	@Column(name ="TOTAL_WC_6",nullable=true,precision=10,scale=0)
	public BigDecimal getTotalWc6(){
		return this.totalWc6;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  totalWc6
	 */
	public void setTotalWc6(BigDecimal totalWc6){
		this.totalWc6 = totalWc6;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  totalWc7
	 */
	@Column(name ="TOTAL_WC_7",nullable=true,precision=10,scale=0)
	public BigDecimal getTotalWc7(){
		return this.totalWc7;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  totalWc7
	 */
	public void setTotalWc7(BigDecimal totalWc7){
		this.totalWc7 = totalWc7;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  totalWc8
	 */
	@Column(name ="TOTAL_WC_8",nullable=true,precision=10,scale=0)
	public BigDecimal getTotalWc8(){
		return this.totalWc8;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  totalWc8
	 */
	public void setTotalWc8(BigDecimal totalWc8){
		this.totalWc8 = totalWc8;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  totalWc9
	 */
	@Column(name ="TOTAL_WC_9",nullable=true,precision=10,scale=0)
	public BigDecimal getTotalWc9(){
		return this.totalWc9;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  totalWc9
	 */
	public void setTotalWc9(BigDecimal totalWc9){
		this.totalWc9 = totalWc9;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  totalWc10
	 */
	@Column(name ="TOTAL_WC_10",nullable=true,precision=10,scale=0)
	public BigDecimal getTotalWc10(){
		return this.totalWc10;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  totalWc10
	 */
	public void setTotalWc10(BigDecimal totalWc10){
		this.totalWc10 = totalWc10;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  totalWc11
	 */
	@Column(name ="TOTAL_WC_11",nullable=true,precision=10,scale=0)
	public BigDecimal getTotalWc11(){
		return this.totalWc11;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  totalWc11
	 */
	public void setTotalWc11(BigDecimal totalWc11){
		this.totalWc11 = totalWc11;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  totalWc12
	 */
	@Column(name ="TOTAL_WC_12",nullable=true,precision=10,scale=0)
	public BigDecimal getTotalWc12(){
		return this.totalWc12;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  totalWc12
	 */
	public void setTotalWc12(BigDecimal totalWc12){
		this.totalWc12 = totalWc12;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  totalWc13
	 */
	@Column(name ="TOTAL_WC_13",nullable=true,precision=10,scale=0)
	public BigDecimal getTotalWc13(){
		return this.totalWc13;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  totalWc13
	 */
	public void setTotalWc13(BigDecimal totalWc13){
		this.totalWc13 = totalWc13;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  totalWc14
	 */
	@Column(name ="TOTAL_WC_14",nullable=true,precision=10,scale=0)
	public BigDecimal getTotalWc14(){
		return this.totalWc14;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  totalWc14
	 */
	public void setTotalWc14(BigDecimal totalWc14){
		this.totalWc14 = totalWc14;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  totalWcl1
	 */
	@Column(name ="TOTAL_WCL_1",nullable=true,precision=10,scale=0)
	public BigDecimal getTotalWcl1(){
		return this.totalWcl1;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  totalWcl1
	 */
	public void setTotalWcl1(BigDecimal totalWcl1){
		this.totalWcl1 = totalWcl1;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  totalWcl2
	 */
	@Column(name ="TOTAL_WCL_2",nullable=true,precision=10,scale=0)
	public BigDecimal getTotalWcl2(){
		return this.totalWcl2;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  totalWcl2
	 */
	public void setTotalWcl2(BigDecimal totalWcl2){
		this.totalWcl2 = totalWcl2;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  totalWcl3
	 */
	@Column(name ="TOTAL_WCL_3",nullable=true,precision=10,scale=0)
	public BigDecimal getTotalWcl3(){
		return this.totalWcl3;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  totalWcl3
	 */
	public void setTotalWcl3(BigDecimal totalWcl3){
		this.totalWcl3 = totalWcl3;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  totalWcl4
	 */
	@Column(name ="TOTAL_WCL_4",nullable=true,precision=10,scale=0)
	public BigDecimal getTotalWcl4(){
		return this.totalWcl4;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  totalWcl4
	 */
	public void setTotalWcl4(BigDecimal totalWcl4){
		this.totalWcl4 = totalWcl4;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  totalWcl5
	 */
	@Column(name ="TOTAL_WCL_5",nullable=true,precision=10,scale=0)
	public BigDecimal getTotalWcl5(){
		return this.totalWcl5;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  totalWcl5
	 */
	public void setTotalWcl5(BigDecimal totalWcl5){
		this.totalWcl5 = totalWcl5;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  totalWcl6
	 */
	@Column(name ="TOTAL_WCL_6",nullable=true,precision=10,scale=0)
	public BigDecimal getTotalWcl6(){
		return this.totalWcl6;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  totalWcl6
	 */
	public void setTotalWcl6(BigDecimal totalWcl6){
		this.totalWcl6 = totalWcl6;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  totalWcl7
	 */
	@Column(name ="TOTAL_WCL_7",nullable=true,precision=10,scale=0)
	public BigDecimal getTotalWcl7(){
		return this.totalWcl7;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  totalWcl7
	 */
	public void setTotalWcl7(BigDecimal totalWcl7){
		this.totalWcl7 = totalWcl7;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  totalWcl8
	 */
	@Column(name ="TOTAL_WCL_8",nullable=true,precision=10,scale=0)
	public BigDecimal getTotalWcl8(){
		return this.totalWcl8;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  totalWcl8
	 */
	public void setTotalWcl8(BigDecimal totalWcl8){
		this.totalWcl8 = totalWcl8;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  totalWcl9
	 */
	@Column(name ="TOTAL_WCL_9",nullable=true,precision=10,scale=0)
	public BigDecimal getTotalWcl9(){
		return this.totalWcl9;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  totalWcl9
	 */
	public void setTotalWcl9(BigDecimal totalWcl9){
		this.totalWcl9 = totalWcl9;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  totalWcl10
	 */
	@Column(name ="TOTAL_WCL_10",nullable=true,precision=10,scale=0)
	public BigDecimal getTotalWcl10(){
		return this.totalWcl10;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  totalWcl10
	 */
	public void setTotalWcl10(BigDecimal totalWcl10){
		this.totalWcl10 = totalWcl10;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  totalWcl11
	 */
	@Column(name ="TOTAL_WCL_11",nullable=true,precision=10,scale=0)
	public BigDecimal getTotalWcl11(){
		return this.totalWcl11;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  totalWcl11
	 */
	public void setTotalWcl11(BigDecimal totalWcl11){
		this.totalWcl11 = totalWcl11;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  totalWcl12
	 */
	@Column(name ="TOTAL_WCL_12",nullable=true,precision=10,scale=0)
	public BigDecimal getTotalWcl12(){
		return this.totalWcl12;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  totalWcl12
	 */
	public void setTotalWcl12(BigDecimal totalWcl12){
		this.totalWcl12 = totalWcl12;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  totalWcl13
	 */
	@Column(name ="TOTAL_WCL_13",nullable=true,precision=10,scale=0)
	public BigDecimal getTotalWcl13(){
		return this.totalWcl13;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  totalWcl13
	 */
	public void setTotalWcl13(BigDecimal totalWcl13){
		this.totalWcl13 = totalWcl13;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  totalWcl14
	 */
	@Column(name ="TOTAL_WCL_14",nullable=true,precision=10,scale=0)
	public BigDecimal getTotalWcl14(){
		return this.totalWcl14;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  totalWcl14
	 */
	public void setTotalWcl14(BigDecimal totalWcl14){
		this.totalWcl14 = totalWcl14;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  yue11
	 */
	@Column(name ="YUE_1_1",nullable=true,precision=10,scale=0)
	public BigDecimal getYue11(){
		return this.yue11;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  yue11
	 */
	public void setYue11(BigDecimal yue11){
		this.yue11 = yue11;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  yue12
	 */
	@Column(name ="YUE_1_2",nullable=true,precision=10,scale=0)
	public BigDecimal getYue12(){
		return this.yue12;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  yue12
	 */
	public void setYue12(BigDecimal yue12){
		this.yue12 = yue12;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  yue13
	 */
	@Column(name ="YUE_1_3",nullable=true,precision=10,scale=0)
	public BigDecimal getYue13(){
		return this.yue13;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  yue13
	 */
	public void setYue13(BigDecimal yue13){
		this.yue13 = yue13;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  yue14
	 */
	@Column(name ="YUE_1_4",nullable=true,precision=10,scale=0)
	public BigDecimal getYue14(){
		return this.yue14;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  yue14
	 */
	public void setYue14(BigDecimal yue14){
		this.yue14 = yue14;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  yue15
	 */
	@Column(name ="YUE_1_5",nullable=true,precision=10,scale=0)
	public BigDecimal getYue15(){
		return this.yue15;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  yue15
	 */
	public void setYue15(BigDecimal yue15){
		this.yue15 = yue15;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  yue16
	 */
	@Column(name ="YUE_1_6",nullable=true,precision=10,scale=0)
	public BigDecimal getYue16(){
		return this.yue16;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  yue16
	 */
	public void setYue16(BigDecimal yue16){
		this.yue16 = yue16;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  yue17
	 */
	@Column(name ="YUE_1_7",nullable=true,precision=10,scale=0)
	public BigDecimal getYue17(){
		return this.yue17;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  yue17
	 */
	public void setYue17(BigDecimal yue17){
		this.yue17 = yue17;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  yue18
	 */
	@Column(name ="YUE_1_8",nullable=true,precision=10,scale=0)
	public BigDecimal getYue18(){
		return this.yue18;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  yue18
	 */
	public void setYue18(BigDecimal yue18){
		this.yue18 = yue18;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  yue19
	 */
	@Column(name ="YUE_1_9",nullable=true,precision=10,scale=0)
	public BigDecimal getYue19(){
		return this.yue19;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  yue19
	 */
	public void setYue19(BigDecimal yue19){
		this.yue19 = yue19;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  yue110
	 */
	@Column(name ="YUE_1_10",nullable=true,precision=10,scale=0)
	public BigDecimal getYue110(){
		return this.yue110;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  yue110
	 */
	public void setYue110(BigDecimal yue110){
		this.yue110 = yue110;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  yue111
	 */
	@Column(name ="YUE_1_11",nullable=true,precision=10,scale=0)
	public BigDecimal getYue1_11(){
		return this.yue1_11;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  yue111
	 */
	public void setYue1_11(BigDecimal yue1_11){
		this.yue1_11 = yue1_11;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  yue112
	 */
	@Column(name ="YUE_1_12",nullable=true,precision=10,scale=0)
	public BigDecimal getYue1_12(){
		return this.yue1_12;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  yue112
	 */
	public void setYue1_12(BigDecimal yue1_12){
		this.yue1_12 = yue1_12;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  yue113
	 */
	@Column(name ="YUE_1_13",nullable=true,precision=10,scale=0)
	public BigDecimal getYue1_13(){
		return this.yue1_13;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  yue113
	 */
	public void setYue1_13(BigDecimal yue1_13){
		this.yue1_13 = yue1_13;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  yue114
	 */
	@Column(name ="YUE_1_14",nullable=true,precision=10,scale=0)
	public BigDecimal getYue1_14(){
		return this.yue1_14;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  yue114
	 */
	public void setYue1_14(BigDecimal yue1_14){
		this.yue1_14 = yue1_14;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  yue21
	 */
	@Column(name ="YUE_2_1",nullable=true,precision=10,scale=0)
	public BigDecimal getYue21(){
		return this.yue21;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  yue21 
	 */
	public void setYue21(BigDecimal yue21){
		this.yue21 = yue21;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  yue22
	 */
	@Column(name ="YUE_2_2",nullable=true,precision=10,scale=0)
	public BigDecimal getYue22(){
		return this.yue22;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  yue22
	 */
	public void setYue22(BigDecimal yue22){
		this.yue22 = yue22;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  yue23
	 */
	@Column(name ="YUE_2_3",nullable=true,precision=10,scale=0)
	public BigDecimal getYue23(){
		return this.yue23;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  yue23
	 */
	public void setYue23(BigDecimal yue23){
		this.yue23 = yue23;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  yue24
	 */
	@Column(name ="YUE_2_4",nullable=true,precision=10,scale=0)
	public BigDecimal getYue24(){
		return this.yue24;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  yue24
	 */
	public void setYue24(BigDecimal yue24){
		this.yue24 = yue24;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  yue25
	 */
	@Column(name ="YUE_2_5",nullable=true,precision=10,scale=0)
	public BigDecimal getYue25(){
		return this.yue25;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  yue25
	 */
	public void setYue25(BigDecimal yue25){
		this.yue25 = yue25;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  yue26
	 */
	@Column(name ="YUE_2_6",nullable=true,precision=10,scale=0)
	public BigDecimal getYue26(){
		return this.yue26;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  yue26
	 */
	public void setYue26(BigDecimal yue26){
		this.yue26 = yue26;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  yue27
	 */
	@Column(name ="YUE_2_7",nullable=true,precision=10,scale=0)
	public BigDecimal getYue27(){
		return this.yue27;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  yue27
	 */
	public void setYue27(BigDecimal yue27){
		this.yue27 = yue27;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  yue28
	 */
	@Column(name ="YUE_2_8",nullable=true,precision=10,scale=0)
	public BigDecimal getYue28(){
		return this.yue28;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  yue28
	 */
	public void setYue28(BigDecimal yue28){
		this.yue28 = yue28;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  yue29
	 */
	@Column(name ="YUE_2_9",nullable=true,precision=10,scale=0)
	public BigDecimal getYue29(){
		return this.yue29;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  yue29
	 */
	public void setYue29(BigDecimal yue29){
		this.yue29 = yue29;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  yue210
	 */
	@Column(name ="YUE_2_10",nullable=true,precision=10,scale=0)
	public BigDecimal getYue210(){
		return this.yue210;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  yue210
	 */
	public void setYue210(BigDecimal yue210){
		this.yue210 = yue210;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  yue211
	 */
	@Column(name ="YUE_2_11",nullable=true,precision=10,scale=0)
	public BigDecimal getYue211(){
		return this.yue211;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  yue211
	 */
	public void setYue211(BigDecimal yue211){
		this.yue211 = yue211;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  yue212
	 */
	@Column(name ="YUE_2_12",nullable=true,precision=10,scale=0)
	public BigDecimal getYue212(){
		return this.yue212;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  yue212
	 */
	public void setYue212(BigDecimal yue212){
		this.yue212 = yue212;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  yue213
	 */
	@Column(name ="YUE_2_13",nullable=true,precision=10,scale=0)
	public BigDecimal getYue213(){
		return this.yue213;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  yue213
	 */
	public void setYue213(BigDecimal yue213){
		this.yue213 = yue213;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  yue214
	 */
	@Column(name ="YUE_2_14",nullable=true,precision=10,scale=0)
	public BigDecimal getYue214(){
		return this.yue214;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  yue214
	 */
	public void setYue214(BigDecimal yue214){
		this.yue214 = yue214;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  yue31
	 */
	@Column(name ="YUE_3_1",nullable=true,precision=10,scale=0)
	public BigDecimal getYue31(){
		return this.yue31;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  yue31
	 */
	public void setYue31(BigDecimal yue31){
		this.yue31 = yue31;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  yue32
	 */
	@Column(name ="YUE_3_2",nullable=true,precision=10,scale=0)
	public BigDecimal getYue32(){
		return this.yue32;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  yue32
	 */
	public void setYue32(BigDecimal yue32){
		this.yue32 = yue32;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  yue33
	 */
	@Column(name ="YUE_3_3",nullable=true,precision=10,scale=0)
	public BigDecimal getYue33(){
		return this.yue33;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  yue33
	 */
	public void setYue33(BigDecimal yue33){
		this.yue33 = yue33;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  yue34
	 */
	@Column(name ="YUE_3_4",nullable=true,precision=10,scale=0)
	public BigDecimal getYue34(){
		return this.yue34;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  yue34
	 */
	public void setYue34(BigDecimal yue34){
		this.yue34 = yue34;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  yue35
	 */
	@Column(name ="YUE_3_5",nullable=true,precision=10,scale=0)
	public BigDecimal getYue35(){
		return this.yue35;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  yue35
	 */
	public void setYue35(BigDecimal yue35){
		this.yue35 = yue35;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  yue36
	 */
	@Column(name ="YUE_3_6",nullable=true,precision=10,scale=0)
	public BigDecimal getYue36(){
		return this.yue36;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  yue36
	 */
	public void setYue36(BigDecimal yue36){
		this.yue36 = yue36;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  yue37
	 */
	@Column(name ="YUE_3_7",nullable=true,precision=10,scale=0)
	public BigDecimal getYue37(){
		return this.yue37;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  yue37
	 */
	public void setYue37(BigDecimal yue37){
		this.yue37 = yue37;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  yue38
	 */
	@Column(name ="YUE_3_8",nullable=true,precision=10,scale=0)
	public BigDecimal getYue38(){
		return this.yue38;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  yue38
	 */
	public void setYue38(BigDecimal yue38){
		this.yue38 = yue38;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  yue39
	 */
	@Column(name ="YUE_3_9",nullable=true,precision=10,scale=0)
	public BigDecimal getYue39(){
		return this.yue39;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  yue39
	 */
	public void setYue39(BigDecimal yue39){
		this.yue39 = yue39;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  yue310
	 */
	@Column(name ="YUE_3_10",nullable=true,precision=10,scale=0)
	public BigDecimal getYue310(){
		return this.yue310;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  yue310
	 */
	public void setYue310(BigDecimal yue310){
		this.yue310 = yue310;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  yue311
	 */
	@Column(name ="YUE_3_11",nullable=true,precision=10,scale=0)
	public BigDecimal getYue311(){
		return this.yue311;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  yue311
	 */
	public void setYue311(BigDecimal yue311){
		this.yue311 = yue311;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  yue312
	 */
	@Column(name ="YUE_3_12",nullable=true,precision=10,scale=0)
	public BigDecimal getYue312(){
		return this.yue312;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  yue312
	 */
	public void setYue312(BigDecimal yue312){
		this.yue312 = yue312;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  yue313
	 */
	@Column(name ="YUE_3_13",nullable=true,precision=10,scale=0)
	public BigDecimal getYue313(){
		return this.yue313;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  yue313
	 */
	public void setYue313(BigDecimal yue313){
		this.yue313 = yue313;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  yue314
	 */
	@Column(name ="YUE_3_14",nullable=true,precision=10,scale=0)
	public BigDecimal getYue314(){
		return this.yue314;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  yue314
	 */
	public void setYue314(BigDecimal yue314){
		this.yue314 = yue314;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  yue41
	 */
	@Column(name ="YUE_4_1",nullable=true,precision=10,scale=0)
	public BigDecimal getYue41(){
		return this.yue41;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  yue41
	 */
	public void setYue41(BigDecimal yue41){
		this.yue41 = yue41;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  yue42
	 */
	@Column(name ="YUE_4_2",nullable=true,precision=10,scale=0)
	public BigDecimal getYue42(){
		return this.yue42;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  yue42
	 */
	public void setYue42(BigDecimal yue42){
		this.yue42 = yue42;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  yue43
	 */
	@Column(name ="YUE_4_3",nullable=true,precision=10,scale=0)
	public BigDecimal getYue43(){
		return this.yue43;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  yue43
	 */
	public void setYue43(BigDecimal yue43){
		this.yue43 = yue43;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  yue44
	 */
	@Column(name ="YUE_4_4",nullable=true,precision=10,scale=0)
	public BigDecimal getYue44(){
		return this.yue44;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  yue44
	 */
	public void setYue44(BigDecimal yue44){
		this.yue44 = yue44;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  yue45
	 */
	@Column(name ="YUE_4_5",nullable=true,precision=10,scale=0)
	public BigDecimal getYue45(){
		return this.yue45;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  yue45
	 */
	public void setYue45(BigDecimal yue45){
		this.yue45 = yue45;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  yue46
	 */
	@Column(name ="YUE_4_6",nullable=true,precision=10,scale=0)
	public BigDecimal getYue46(){
		return this.yue46;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  yue46
	 */
	public void setYue46(BigDecimal yue46){
		this.yue46 = yue46;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  yue47
	 */
	@Column(name ="YUE_4_7",nullable=true,precision=10,scale=0)
	public BigDecimal getYue47(){
		return this.yue47;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  yue47
	 */
	public void setYue47(BigDecimal yue47){
		this.yue47 = yue47;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  yue48
	 */
	@Column(name ="YUE_4_8",nullable=true,precision=10,scale=0)
	public BigDecimal getYue48(){
		return this.yue48;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  yue48
	 */
	public void setYue48(BigDecimal yue48){
		this.yue48 = yue48;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  yue49
	 */
	@Column(name ="YUE_4_9",nullable=true,precision=10,scale=0)
	public BigDecimal getYue49(){
		return this.yue49;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  yue49
	 */
	public void setYue49(BigDecimal yue49){
		this.yue49 = yue49;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  yue410
	 */
	@Column(name ="YUE_4_10",nullable=true,precision=10,scale=0)
	public BigDecimal getYue410(){
		return this.yue410;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  yue410
	 */
	public void setYue410(BigDecimal yue410){
		this.yue410 = yue410;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  yue411
	 */
	@Column(name ="YUE_4_11",nullable=true,precision=10,scale=0)
	public BigDecimal getYue411(){
		return this.yue411;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  yue411
	 */
	public void setYue411(BigDecimal yue411){
		this.yue411 = yue411;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  yue412
	 */
	@Column(name ="YUE_4_12",nullable=true,precision=10,scale=0)
	public BigDecimal getYue412(){
		return this.yue412;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  yue412
	 */
	public void setYue412(BigDecimal yue412){
		this.yue412 = yue412;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  yue413
	 */
	@Column(name ="YUE_4_13",nullable=true,precision=10,scale=0)
	public BigDecimal getYue413(){
		return this.yue413;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  yue413
	 */
	public void setYue413(BigDecimal yue413){
		this.yue413 = yue413;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  yue414
	 */
	@Column(name ="YUE_4_14",nullable=true,precision=10,scale=0)
	public BigDecimal getYue414(){
		return this.yue414;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  yue414
	 */
	public void setYue414(BigDecimal yue414){
		this.yue414 = yue414;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  yue51
	 */
	@Column(name ="YUE_5_1",nullable=true,precision=10,scale=0)
	public BigDecimal getYue51(){
		return this.yue51;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  yue51
	 */
	public void setYue51(BigDecimal yue51){
		this.yue51 = yue51;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  yue52
	 */
	@Column(name ="YUE_5_2",nullable=true,precision=10,scale=0)
	public BigDecimal getYue52(){
		return this.yue52;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  yue52
	 */
	public void setYue52(BigDecimal yue52){
		this.yue52 = yue52;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  yue53
	 */
	@Column(name ="YUE_5_3",nullable=true,precision=10,scale=0)
	public BigDecimal getYue53(){
		return this.yue53;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  yue53
	 */
	public void setYue53(BigDecimal yue53){
		this.yue53 = yue53;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  yue54
	 */
	@Column(name ="YUE_5_4",nullable=true,precision=10,scale=0)
	public BigDecimal getYue54(){
		return this.yue54;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  yue54
	 */
	public void setYue54(BigDecimal yue54){
		this.yue54 = yue54;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  yue55
	 */
	@Column(name ="YUE_5_5",nullable=true,precision=10,scale=0)
	public BigDecimal getYue55(){
		return this.yue55;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  yue55
	 */
	public void setYue55(BigDecimal yue55){
		this.yue55 = yue55;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  yue56
	 */
	@Column(name ="YUE_5_6",nullable=true,precision=10,scale=0)
	public BigDecimal getYue56(){
		return this.yue56;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  yue56
	 */
	public void setYue56(BigDecimal yue56){
		this.yue56 = yue56;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  yue57
	 */
	@Column(name ="YUE_5_7",nullable=true,precision=10,scale=0)
	public BigDecimal getYue57(){
		return this.yue57;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  yue57
	 */
	public void setYue57(BigDecimal yue57){
		this.yue57 = yue57;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  yue58
	 */
	@Column(name ="YUE_5_8",nullable=true,precision=10,scale=0)
	public BigDecimal getYue58(){
		return this.yue58;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  yue58
	 */
	public void setYue58(BigDecimal yue58){
		this.yue58 = yue58;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  yue59
	 */
	@Column(name ="YUE_5_9",nullable=true,precision=10,scale=0)
	public BigDecimal getYue59(){
		return this.yue59;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  yue59
	 */
	public void setYue59(BigDecimal yue59){
		this.yue59 = yue59;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  yue510
	 */
	@Column(name ="YUE_5_10",nullable=true,precision=10,scale=0)
	public BigDecimal getYue510(){
		return this.yue510;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  yue510
	 */
	public void setYue510(BigDecimal yue510){
		this.yue510 = yue510;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  yue511
	 */
	@Column(name ="YUE_5_11",nullable=true,precision=10,scale=0)
	public BigDecimal getYue511(){
		return this.yue511;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  yue511
	 */
	public void setYue511(BigDecimal yue511){
		this.yue511 = yue511;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  yue512
	 */
	@Column(name ="YUE_5_12",nullable=true,precision=10,scale=0)
	public BigDecimal getYue512(){
		return this.yue512;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  yue512
	 */
	public void setYue512(BigDecimal yue512){
		this.yue512 = yue512;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  yue513
	 */
	@Column(name ="YUE_5_13",nullable=true,precision=10,scale=0)
	public BigDecimal getYue513(){
		return this.yue513;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  yue513
	 */
	public void setYue513(BigDecimal yue513){
		this.yue513 = yue513;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  yue514
	 */
	@Column(name ="YUE_5_14",nullable=true,precision=10,scale=0)
	public BigDecimal getYue514(){
		return this.yue514;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  yue514
	 */
	public void setYue514(BigDecimal yue514){
		this.yue514 = yue514;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  yue61
	 */
	@Column(name ="YUE_6_1",nullable=true,precision=10,scale=0)
	public BigDecimal getYue61(){
		return this.yue61;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  yue61
	 */
	public void setYue61(BigDecimal yue61){
		this.yue61 = yue61;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  yue62
	 */
	@Column(name ="YUE_6_2",nullable=true,precision=10,scale=0)
	public BigDecimal getYue62(){
		return this.yue62;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  yue62
	 */
	public void setYue62(BigDecimal yue62){
		this.yue62 = yue62;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  yue63
	 */
	@Column(name ="YUE_6_3",nullable=true,precision=10,scale=0)
	public BigDecimal getYue63(){
		return this.yue63;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  yue63
	 */
	public void setYue63(BigDecimal yue63){
		this.yue63 = yue63;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  yue64
	 */
	@Column(name ="YUE_6_4",nullable=true,precision=10,scale=0)
	public BigDecimal getYue64(){
		return this.yue64;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  yue64
	 */
	public void setYue64(BigDecimal yue64){
		this.yue64 = yue64;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  yue65
	 */
	@Column(name ="YUE_6_5",nullable=true,precision=10,scale=0)
	public BigDecimal getYue65(){
		return this.yue65;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  yue65
	 */
	public void setYue65(BigDecimal yue65){
		this.yue65 = yue65;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  yue66
	 */
	@Column(name ="YUE_6_6",nullable=true,precision=10,scale=0)
	public BigDecimal getYue66(){
		return this.yue66;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  yue66
	 */
	public void setYue66(BigDecimal yue66){
		this.yue66 = yue66;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  yue67
	 */
	@Column(name ="YUE_6_7",nullable=true,precision=10,scale=0)
	public BigDecimal getYue67(){
		return this.yue67;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  yue67
	 */
	public void setYue67(BigDecimal yue67){
		this.yue67 = yue67;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  yue68
	 */
	@Column(name ="YUE_6_8",nullable=true,precision=10,scale=0)
	public BigDecimal getYue68(){
		return this.yue68;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  yue68
	 */
	public void setYue68(BigDecimal yue68){
		this.yue68 = yue68;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  yue69
	 */
	@Column(name ="YUE_6_9",nullable=true,precision=10,scale=0)
	public BigDecimal getYue69(){
		return this.yue69;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  yue69
	 */
	public void setYue69(BigDecimal yue69){
		this.yue69 = yue69;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  yue610
	 */
	@Column(name ="YUE_6_10",nullable=true,precision=10,scale=0)
	public BigDecimal getYue610(){
		return this.yue610;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  yue610
	 */
	public void setYue610(BigDecimal yue610){
		this.yue610 = yue610;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  yue611
	 */
	@Column(name ="YUE_6_11",nullable=true,precision=10,scale=0)
	public BigDecimal getYue611(){
		return this.yue611;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  yue611
	 */
	public void setYue611(BigDecimal yue611){
		this.yue611 = yue611;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  yue612
	 */
	@Column(name ="YUE_6_12",nullable=true,precision=10,scale=0)
	public BigDecimal getYue612(){
		return this.yue612;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  yue612
	 */
	public void setYue612(BigDecimal yue612){
		this.yue612 = yue612;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  yue613
	 */
	@Column(name ="YUE_6_13",nullable=true,precision=10,scale=0)
	public BigDecimal getYue613(){
		return this.yue613;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  yue613
	 */
	public void setYue613(BigDecimal yue613){
		this.yue613 = yue613;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  yue614
	 */
	@Column(name ="YUE_6_14",nullable=true,precision=10,scale=0)
	public BigDecimal getYue614(){
		return this.yue614;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  yue614
	 */
	public void setYue614(BigDecimal yue614){
		this.yue614 = yue614;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  yue71
	 */
	@Column(name ="YUE_7_1",nullable=true,precision=10,scale=0)
	public BigDecimal getYue71(){
		return this.yue71;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  yue71
	 */
	public void setYue71(BigDecimal yue71){
		this.yue71 = yue71;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  yue72
	 */
	@Column(name ="YUE_7_2",nullable=true,precision=10,scale=0)
	public BigDecimal getYue72(){
		return this.yue72;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  yue72
	 */
	public void setYue72(BigDecimal yue72){
		this.yue72 = yue72;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  yue73
	 */
	@Column(name ="YUE_7_3",nullable=true,precision=10,scale=0)
	public BigDecimal getYue73(){
		return this.yue73;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  yue73
	 */
	public void setYue73(BigDecimal yue73){
		this.yue73 = yue73;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  yue74
	 */
	@Column(name ="YUE_7_4",nullable=true,precision=10,scale=0)
	public BigDecimal getYue74(){
		return this.yue74;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  yue74
	 */
	public void setYue74(BigDecimal yue74){
		this.yue74 = yue74;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  yue75
	 */
	@Column(name ="YUE_7_5",nullable=true,precision=10,scale=0)
	public BigDecimal getYue75(){
		return this.yue75;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  yue75
	 */
	public void setYue75(BigDecimal yue75){
		this.yue75 = yue75;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  yue76
	 */
	@Column(name ="YUE_7_6",nullable=true,precision=10,scale=0)
	public BigDecimal getYue76(){
		return this.yue76;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  yue76
	 */
	public void setYue76(BigDecimal yue76){
		this.yue76 = yue76;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  yue77
	 */
	@Column(name ="YUE_7_7",nullable=true,precision=10,scale=0)
	public BigDecimal getYue77(){
		return this.yue77;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  yue77
	 */
	public void setYue77(BigDecimal yue77){
		this.yue77 = yue77;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  yue78
	 */
	@Column(name ="YUE_7_8",nullable=true,precision=10,scale=0)
	public BigDecimal getYue78(){
		return this.yue78;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  yue78
	 */
	public void setYue78(BigDecimal yue78){
		this.yue78 = yue78;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  yue79
	 */
	@Column(name ="YUE_7_9",nullable=true,precision=10,scale=0)
	public BigDecimal getYue79(){
		return this.yue79;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  yue79
	 */
	public void setYue79(BigDecimal yue79){
		this.yue79 = yue79;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  yue710
	 */
	@Column(name ="YUE_7_10",nullable=true,precision=10,scale=0)
	public BigDecimal getYue710(){
		return this.yue710;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  yue710
	 */
	public void setYue710(BigDecimal yue710){
		this.yue710 = yue710;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  yue711
	 */
	@Column(name ="YUE_7_11",nullable=true,precision=10,scale=0)
	public BigDecimal getYue711(){
		return this.yue711;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  yue711
	 */
	public void setYue711(BigDecimal yue711){
		this.yue711 = yue711;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  yue712
	 */
	@Column(name ="YUE_7_12",nullable=true,precision=10,scale=0)
	public BigDecimal getYue712(){
		return this.yue712;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  yue712
	 */
	public void setYue712(BigDecimal yue712){
		this.yue712 = yue712;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  yue713
	 */
	@Column(name ="YUE_7_13",nullable=true,precision=10,scale=0)
	public BigDecimal getYue713(){
		return this.yue713;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  yue713
	 */
	public void setYue713(BigDecimal yue713){
		this.yue713 = yue713;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  yue714
	 */
	@Column(name ="YUE_7_14",nullable=true,precision=10,scale=0)
	public BigDecimal getYue714(){
		return this.yue714;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  yue714
	 */
	public void setYue714(BigDecimal yue714){
		this.yue714 = yue714;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  yue81
	 */
	@Column(name ="YUE_8_1",nullable=true,precision=10,scale=0)
	public BigDecimal getYue81(){
		return this.yue81;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  yue81
	 */
	public void setYue81(BigDecimal yue81){
		this.yue81 = yue81;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  yue82
	 */
	@Column(name ="YUE_8_2",nullable=true,precision=10,scale=0)
	public BigDecimal getYue82(){
		return this.yue82;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  yue82
	 */
	public void setYue82(BigDecimal yue82){
		this.yue82 = yue82;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  yue83
	 */
	@Column(name ="YUE_8_3",nullable=true,precision=10,scale=0)
	public BigDecimal getYue83(){
		return this.yue83;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  yue83
	 */
	public void setYue83(BigDecimal yue83){
		this.yue83 = yue83;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  yue84
	 */
	@Column(name ="YUE_8_4",nullable=true,precision=10,scale=0)
	public BigDecimal getYue84(){
		return this.yue84;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  yue84
	 */
	public void setYue84(BigDecimal yue84){
		this.yue84 = yue84;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  yue85
	 */
	@Column(name ="YUE_8_5",nullable=true,precision=10,scale=0)
	public BigDecimal getYue85(){
		return this.yue85;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  yue85
	 */
	public void setYue85(BigDecimal yue85){
		this.yue85 = yue85;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  yue86
	 */
	@Column(name ="YUE_8_6",nullable=true,precision=10,scale=0)
	public BigDecimal getYue86(){
		return this.yue86;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  yue86
	 */
	public void setYue86(BigDecimal yue86){
		this.yue86 = yue86;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  yue87
	 */
	@Column(name ="YUE_8_7",nullable=true,precision=10,scale=0)
	public BigDecimal getYue87(){
		return this.yue87;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  yue87
	 */
	public void setYue87(BigDecimal yue87){
		this.yue87 = yue87;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  yue88
	 */
	@Column(name ="YUE_8_8",nullable=true,precision=10,scale=0)
	public BigDecimal getYue88(){
		return this.yue88;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  yue88
	 */
	public void setYue88(BigDecimal yue88){
		this.yue88 = yue88;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  yue89
	 */
	@Column(name ="YUE_8_9",nullable=true,precision=10,scale=0)
	public BigDecimal getYue89(){
		return this.yue89;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  yue89
	 */
	public void setYue89(BigDecimal yue89){
		this.yue89 = yue89;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  yue810
	 */
	@Column(name ="YUE_8_10",nullable=true,precision=10,scale=0)
	public BigDecimal getYue810(){
		return this.yue810;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  yue810
	 */
	public void setYue810(BigDecimal yue810){
		this.yue810 = yue810;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  yue811
	 */
	@Column(name ="YUE_8_11",nullable=true,precision=10,scale=0)
	public BigDecimal getYue811(){
		return this.yue811;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  yue811
	 */
	public void setYue811(BigDecimal yue811){
		this.yue811 = yue811;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  yue812
	 */
	@Column(name ="YUE_8_12",nullable=true,precision=10,scale=0)
	public BigDecimal getYue812(){
		return this.yue812;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  yue812
	 */
	public void setYue812(BigDecimal yue812){
		this.yue812 = yue812;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  yue813
	 */
	@Column(name ="YUE_8_13",nullable=true,precision=10,scale=0)
	public BigDecimal getYue813(){
		return this.yue813;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  yue813
	 */
	public void setYue813(BigDecimal yue813){
		this.yue813 = yue813;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  yue814
	 */
	@Column(name ="YUE_8_14",nullable=true,precision=10,scale=0)
	public BigDecimal getYue814(){
		return this.yue814;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  yue814
	 */
	public void setYue814(BigDecimal yue814){
		this.yue814 = yue814;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  yue91
	 */
	@Column(name ="YUE_9_1",nullable=true,precision=10,scale=0)
	public BigDecimal getYue91(){
		return this.yue91;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  yue91
	 */
	public void setYue91(BigDecimal yue91){
		this.yue91 = yue91;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  yue92
	 */
	@Column(name ="YUE_9_2",nullable=true,precision=10,scale=0)
	public BigDecimal getYue92(){
		return this.yue92;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  yue92
	 */
	public void setYue92(BigDecimal yue92){
		this.yue92 = yue92;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  yue93
	 */
	@Column(name ="YUE_9_3",nullable=true,precision=10,scale=0)
	public BigDecimal getYue93(){
		return this.yue93;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  yue93
	 */
	public void setYue93(BigDecimal yue93){
		this.yue93 = yue93;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  yue94
	 */
	@Column(name ="YUE_9_4",nullable=true,precision=10,scale=0)
	public BigDecimal getYue94(){
		return this.yue94;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  yue94
	 */
	public void setYue94(BigDecimal yue94){
		this.yue94 = yue94;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  yue95
	 */
	@Column(name ="YUE_9_5",nullable=true,precision=10,scale=0)
	public BigDecimal getYue95(){
		return this.yue95;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  yue95
	 */
	public void setYue95(BigDecimal yue95){
		this.yue95 = yue95;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  yue96
	 */
	@Column(name ="YUE_9_6",nullable=true,precision=10,scale=0)
	public BigDecimal getYue96(){
		return this.yue96;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  yue96
	 */
	public void setYue96(BigDecimal yue96){
		this.yue96 = yue96;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  yue97
	 */
	@Column(name ="YUE_9_7",nullable=true,precision=10,scale=0)
	public BigDecimal getYue97(){
		return this.yue97;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  yue97
	 */
	public void setYue97(BigDecimal yue97){
		this.yue97 = yue97;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  yue98
	 */
	@Column(name ="YUE_9_8",nullable=true,precision=10,scale=0)
	public BigDecimal getYue98(){
		return this.yue98;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  yue98
	 */
	public void setYue98(BigDecimal yue98){
		this.yue98 = yue98;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  yue99
	 */
	@Column(name ="YUE_9_9",nullable=true,precision=10,scale=0)
	public BigDecimal getYue99(){
		return this.yue99;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  yue99
	 */
	public void setYue99(BigDecimal yue99){
		this.yue99 = yue99;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  yue910
	 */
	@Column(name ="YUE_9_10",nullable=true,precision=10,scale=0)
	public BigDecimal getYue910(){
		return this.yue910;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  yue910
	 */
	public void setYue910(BigDecimal yue910){
		this.yue910 = yue910;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  yue911
	 */
	@Column(name ="YUE_9_11",nullable=true,precision=10,scale=0)
	public BigDecimal getYue911(){
		return this.yue911;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  yue911
	 */
	public void setYue911(BigDecimal yue911){
		this.yue911 = yue911;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  yue912
	 */
	@Column(name ="YUE_9_12",nullable=true,precision=10,scale=0)
	public BigDecimal getYue912(){
		return this.yue912;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  yue912
	 */
	public void setYue912(BigDecimal yue912){
		this.yue912 = yue912;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  yue913
	 */
	@Column(name ="YUE_9_13",nullable=true,precision=10,scale=0)
	public BigDecimal getYue913(){
		return this.yue913;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  yue913
	 */
	public void setYue913(BigDecimal yue913){
		this.yue913 = yue913;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  yue914
	 */
	@Column(name ="YUE_9_14",nullable=true,precision=10,scale=0)
	public BigDecimal getYue914(){
		return this.yue914;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  yue914
	 */
	public void setYue914(BigDecimal yue914){
		this.yue914 = yue914;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  yue101
	 */
	@Column(name ="YUE_10_1",nullable=true,precision=10,scale=0)
	public BigDecimal getYue101(){
		return this.yue101;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  yue101
	 */
	public void setYue101(BigDecimal yue101){
		this.yue101 = yue101;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  yue102
	 */
	@Column(name ="YUE_10_2",nullable=true,precision=10,scale=0)
	public BigDecimal getYue102(){
		return this.yue102;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  yue102
	 */
	public void setYue102(BigDecimal yue102){
		this.yue102 = yue102;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  yue103
	 */
	@Column(name ="YUE_10_3",nullable=true,precision=10,scale=0)
	public BigDecimal getYue103(){
		return this.yue103;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  yue103
	 */
	public void setYue103(BigDecimal yue103){
		this.yue103 = yue103;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  yue104
	 */
	@Column(name ="YUE_10_4",nullable=true,precision=10,scale=0)
	public BigDecimal getYue104(){
		return this.yue104;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  yue104
	 */
	public void setYue104(BigDecimal yue104){
		this.yue104 = yue104;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  yue105
	 */
	@Column(name ="YUE_10_5",nullable=true,precision=10,scale=0)
	public BigDecimal getYue105(){
		return this.yue105;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  yue105
	 */
	public void setYue105(BigDecimal yue105){
		this.yue105 = yue105;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  yue106
	 */
	@Column(name ="YUE_10_6",nullable=true,precision=10,scale=0)
	public BigDecimal getYue106(){
		return this.yue106;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  yue106
	 */
	public void setYue106(BigDecimal yue106){
		this.yue106 = yue106;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  yue107
	 */
	@Column(name ="YUE_10_7",nullable=true,precision=10,scale=0)
	public BigDecimal getYue107(){
		return this.yue107;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  yue107
	 */
	public void setYue107(BigDecimal yue107){
		this.yue107 = yue107;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  yue108
	 */
	@Column(name ="YUE_10_8",nullable=true,precision=10,scale=0)
	public BigDecimal getYue108(){
		return this.yue108;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  yue108
	 */
	public void setYue108(BigDecimal yue108){
		this.yue108 = yue108;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  yue109
	 */
	@Column(name ="YUE_10_9",nullable=true,precision=10,scale=0)
	public BigDecimal getYue109(){
		return this.yue109;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  yue109
	 */
	public void setYue109(BigDecimal yue109){
		this.yue109 = yue109;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  yue1010
	 */
	@Column(name ="YUE_10_10",nullable=true,precision=10,scale=0)
	public BigDecimal getYue1010(){
		return this.yue1010;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  yue1010
	 */
	public void setYue1010(BigDecimal yue1010){
		this.yue1010 = yue1010;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  yue1011
	 */
	@Column(name ="YUE_10_11",nullable=true,precision=10,scale=0)
	public BigDecimal getYue1011(){
		return this.yue1011;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  yue1011
	 */
	public void setYue1011(BigDecimal yue1011){
		this.yue1011 = yue1011;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  yue1012
	 */
	@Column(name ="YUE_10_12",nullable=true,precision=10,scale=0)
	public BigDecimal getYue1012(){
		return this.yue1012;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  yue1012
	 */
	public void setYue1012(BigDecimal yue1012){
		this.yue1012 = yue1012;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  yue1013
	 */
	@Column(name ="YUE_10_13",nullable=true,precision=10,scale=0)
	public BigDecimal getYue1013(){
		return this.yue1013;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  yue1013
	 */
	public void setYue1013(BigDecimal yue1013){
		this.yue1013 = yue1013;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  yue1014
	 */
	@Column(name ="YUE_10_14",nullable=true,precision=10,scale=0)
	public BigDecimal getYue1014(){
		return this.yue1014;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  yue1014
	 */
	public void setYue1014(BigDecimal yue1014){
		this.yue1014 = yue1014;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  yue111
	 */
	@Column(name ="YUE_11_1",nullable=true,precision=10,scale=0)
	public BigDecimal getYue111(){
		return this.yue111;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  yue111
	 */
	public void setYue111(BigDecimal yue111){
		this.yue111 = yue111;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  yue112
	 */
	@Column(name ="YUE_11_2",nullable=true,precision=10,scale=0)
	public BigDecimal getYue112(){
		return this.yue112;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  yue112
	 */
	public void setYue112(BigDecimal yue112){
		this.yue112 = yue112;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  yue113
	 */
	@Column(name ="YUE_11_3",nullable=true,precision=10,scale=0)
	public BigDecimal getYue113(){
		return this.yue113;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  yue113
	 */
	public void setYue113(BigDecimal yue113){
		this.yue113 = yue113;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  yue114
	 */
	@Column(name ="YUE_11_4",nullable=true,precision=10,scale=0)
	public BigDecimal getYue114(){
		return this.yue114;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  yue114
	 */
	public void setYue114(BigDecimal yue114){
		this.yue114 = yue114;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  yue115
	 */
	@Column(name ="YUE_11_5",nullable=true,precision=10,scale=0)
	public BigDecimal getYue115(){
		return this.yue115;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  yue115
	 */
	public void setYue115(BigDecimal yue115){
		this.yue115 = yue115;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  yue116
	 */
	@Column(name ="YUE_11_6",nullable=true,precision=10,scale=0)
	public BigDecimal getYue116(){
		return this.yue116;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  yue116
	 */
	public void setYue116(BigDecimal yue116){
		this.yue116 = yue116;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  yue117
	 */
	@Column(name ="YUE_11_7",nullable=true,precision=10,scale=0)
	public BigDecimal getYue117(){
		return this.yue117;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  yue117
	 */
	public void setYue117(BigDecimal yue117){
		this.yue117 = yue117;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  yue118
	 */
	@Column(name ="YUE_11_8",nullable=true,precision=10,scale=0)
	public BigDecimal getYue118(){
		return this.yue118;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  yue118
	 */
	public void setYue118(BigDecimal yue118){
		this.yue118 = yue118;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  yue119
	 */
	@Column(name ="YUE_11_9",nullable=true,precision=10,scale=0)
	public BigDecimal getYue119(){
		return this.yue119;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  yue119
	 */
	public void setYue119(BigDecimal yue119){
		this.yue119 = yue119;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  yue1110
	 */
	@Column(name ="YUE_11_10",nullable=true,precision=10,scale=0)
	public BigDecimal getYue1110(){
		return this.yue1110;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  yue1110
	 */
	public void setYue1110(BigDecimal yue1110){
		this.yue1110 = yue1110;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  yue1111
	 */
	@Column(name ="YUE_11_11",nullable=true,precision=10,scale=0)
	public BigDecimal getYue1111(){
		return this.yue1111;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  yue1111
	 */
	public void setYue1111(BigDecimal yue1111){
		this.yue1111 = yue1111;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  yue1112
	 */
	@Column(name ="YUE_11_12",nullable=true,precision=10,scale=0)
	public BigDecimal getYue1112(){
		return this.yue1112;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  yue1112
	 */
	public void setYue1112(BigDecimal yue1112){
		this.yue1112 = yue1112;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  yue1113
	 */
	@Column(name ="YUE_11_13",nullable=true,precision=10,scale=0)
	public BigDecimal getYue1113(){
		return this.yue1113;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  yue1113
	 */
	public void setYue1113(BigDecimal yue1113){
		this.yue1113 = yue1113;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  yue1114
	 */
	@Column(name ="YUE_11_14",nullable=true,precision=10,scale=0)
	public BigDecimal getYue1114(){
		return this.yue1114;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  yue1114
	 */
	public void setYue1114(BigDecimal yue1114){
		this.yue1114 = yue1114;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  yue121
	 */
	@Column(name ="YUE_12_1",nullable=true,precision=10,scale=0)
	public BigDecimal getYue121(){
		return this.yue121;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  yue121
	 */
	public void setYue121(BigDecimal yue121){
		this.yue121 = yue121;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  yue122
	 */
	@Column(name ="YUE_12_2",nullable=true,precision=10,scale=0)
	public BigDecimal getYue122(){
		return this.yue122;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  yue122
	 */
	public void setYue122(BigDecimal yue122){
		this.yue122 = yue122;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  yue123
	 */
	@Column(name ="YUE_12_3",nullable=true,precision=10,scale=0)
	public BigDecimal getYue123(){
		return this.yue123;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  yue123
	 */
	public void setYue123(BigDecimal yue123){
		this.yue123 = yue123;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  yue124
	 */
	@Column(name ="YUE_12_4",nullable=true,precision=10,scale=0)
	public BigDecimal getYue124(){
		return this.yue124;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  yue124
	 */
	public void setYue124(BigDecimal yue124){
		this.yue124 = yue124;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  yue125
	 */
	@Column(name ="YUE_12_5",nullable=true,precision=10,scale=0)
	public BigDecimal getYue125(){
		return this.yue125;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  yue125
	 */
	public void setYue125(BigDecimal yue125){
		this.yue125 = yue125;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  yue126
	 */
	@Column(name ="YUE_12_6",nullable=true,precision=10,scale=0)
	public BigDecimal getYue126(){
		return this.yue126;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  yue126
	 */
	public void setYue126(BigDecimal yue126){
		this.yue126 = yue126;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  yue127
	 */
	@Column(name ="YUE_12_7",nullable=true,precision=10,scale=0)
	public BigDecimal getYue127(){
		return this.yue127;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  yue127
	 */
	public void setYue127(BigDecimal yue127){
		this.yue127 = yue127;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  yue128
	 */
	@Column(name ="YUE_12_8",nullable=true,precision=10,scale=0)
	public BigDecimal getYue128(){
		return this.yue128;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  yue128
	 */
	public void setYue128(BigDecimal yue128){
		this.yue128 = yue128;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  yue129
	 */
	@Column(name ="YUE_12_9",nullable=true,precision=10,scale=0)
	public BigDecimal getYue129(){
		return this.yue129;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  yue129
	 */
	public void setYue129(BigDecimal yue129){
		this.yue129 = yue129;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  yue1210
	 */
	@Column(name ="YUE_12_10",nullable=true,precision=10,scale=0)
	public BigDecimal getYue1210(){
		return this.yue1210;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  yue1210
	 */
	public void setYue1210(BigDecimal yue1210){
		this.yue1210 = yue1210;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  yue1211
	 */
	@Column(name ="YUE_12_11",nullable=true,precision=10,scale=0)
	public BigDecimal getYue1211(){
		return this.yue1211;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  yue1211
	 */
	public void setYue1211(BigDecimal yue1211){
		this.yue1211 = yue1211;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  yue1212
	 */
	@Column(name ="YUE_12_12",nullable=true,precision=10,scale=0)
	public BigDecimal getYue1212(){
		return this.yue1212;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  yue1212
	 */
	public void setYue1212(BigDecimal yue1212){
		this.yue1212 = yue1212;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  yue1213
	 */
	@Column(name ="YUE_12_13",nullable=true,precision=10,scale=0)
	public BigDecimal getYue1213(){
		return this.yue1213;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  yue1213
	 */
	public void setYue1213(BigDecimal yue1213){
		this.yue1213 = yue1213;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  yue1214
	 */
	@Column(name ="YUE_12_14",nullable=true,precision=10,scale=0)
	public BigDecimal getYue1214(){
		return this.yue1214;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  yue1214
	 */
	public void setYue1214(BigDecimal yue1214){
		this.yue1214 = yue1214;
	}
}
