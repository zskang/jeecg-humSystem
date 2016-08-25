package com.jeecg.entity.emppaymentinfo;

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
 * @Description: 员工薪酬纪录表
 * @author zhangdaihao
 * @date 2016-08-06 10:53:45
 * @version V1.0   
 *
 */
@Entity
@Table(name = "emp_payment_info", schema = "")
@DynamicUpdate(true)
@DynamicInsert(true)
@SuppressWarnings("serial")
public class EmpPaymentInfoEntity implements java.io.Serializable {
	/**id*/
	private java.lang.String id;
	/**员工编号*/
	private java.lang.String empNo;
	/**标准工资*/
	private BigDecimal standardPay;
	/**基本工资*/
	private BigDecimal basePay;
	/**岗位工资*/
	private BigDecimal dutyPay;
	/**级别工资*/
	private BigDecimal gradePay;
	/**保密费*/
	private BigDecimal secretPay;
	/**满勤奖*/
	private BigDecimal fullWorkPay;
	/**工龄工资*/
	private BigDecimal standingPay;
	/**绩效工资*/
	private BigDecimal achievePay;
	/**加班费*/
	private BigDecimal overtimePay;
	/**课时费*/
	private BigDecimal teachingHourPay;
	/**社保补贴*/
	private BigDecimal socialSecurityPay;
	/**其它*/
	private BigDecimal otherPay;
	/**应支付工资*/
	private BigDecimal wagesShouldPay;
	/**考核扣减*/
	private BigDecimal checkDeductionPay;
	/**考勤扣款*/
	private BigDecimal attendanceDeductionPay;
	/**其他扣减*/
	private BigDecimal otherDeductionPay;
	/**养老*/
	private BigDecimal pensionPay;
	/**医疗*/
	private BigDecimal medicalCarePay;
	/**公积金*/
	private BigDecimal accumulationFundPay;
	/**大病*/
	private BigDecimal seriousIllnessPay;
	/**保险合计*/
	private BigDecimal totalInsurancePay;
	/**个税*/
	private BigDecimal personalIncomeTaxPay;
	/**应扣合计*/
	private BigDecimal totalDeduction;
	/**实发工资*/
	private BigDecimal realPayMoney;
	/**实领工资*/
	private BigDecimal realGetMoney;
	/**企业缴费－养老*/
	private BigDecimal qyjfYlj;
	/**企业养老－医疗金*/
	private BigDecimal qyjfYiliao;
	/**企业缴费－工伤*/
	private BigDecimal qyjfGongshang;
	/**企业缴费－生育*/
	private BigDecimal qyjfShengyu;
	/**企业缴费－公积金*/
	private BigDecimal qyjfGjj;
	/**企业缴费－统筹合计*/
	private BigDecimal qyjfTotal;
	/**payDate*/
	private java.lang.String payDate;
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  id
	 */
	
	@Id
	@GeneratedValue(generator = "paymentableGenerator")
	@GenericGenerator(name = "paymentableGenerator", strategy = "uuid")
	@Column(name ="ID",nullable=false,length=50)
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
	 *@return: java.lang.String  员工编号
	 */
	@Column(name ="EMP_NO",nullable=true,length=45)
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
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  标准工资
	 */
	@Column(name ="STANDARD_PAY",nullable=true,precision=24,scale=6)
	public BigDecimal getStandardPay(){
		return this.standardPay;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  标准工资
	 */
	public void setStandardPay(BigDecimal standardPay){
		this.standardPay = standardPay;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  基本工资
	 */
	@Column(name ="BASE_PAY",nullable=true,precision=24,scale=6)
	public BigDecimal getBasePay(){
		return this.basePay;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  基本工资
	 */
	public void setBasePay(BigDecimal basePay){
		this.basePay = basePay;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  岗位工资
	 */
	@Column(name ="DUTY_PAY",nullable=true,precision=24,scale=6)
	public BigDecimal getDutyPay(){
		return this.dutyPay;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  岗位工资
	 */
	public void setDutyPay(BigDecimal dutyPay){
		this.dutyPay = dutyPay;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  级别工资
	 */
	@Column(name ="GRADE_PAY",nullable=true,precision=24,scale=6)
	public BigDecimal getGradePay(){
		return this.gradePay;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  级别工资
	 */
	public void setGradePay(BigDecimal gradePay){
		this.gradePay = gradePay;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  保密费
	 */
	@Column(name ="SECRET_PAY",nullable=true,precision=24,scale=6)
	public BigDecimal getSecretPay(){
		return this.secretPay;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  保密费
	 */
	public void setSecretPay(BigDecimal secretPay){
		this.secretPay = secretPay;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  满勤奖
	 */
	@Column(name ="FULL_WORK_PAY",nullable=true,precision=24,scale=6)
	public BigDecimal getFullWorkPay(){
		return this.fullWorkPay;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  满勤奖
	 */
	public void setFullWorkPay(BigDecimal fullWorkPay){
		this.fullWorkPay = fullWorkPay;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  工龄工资
	 */
	@Column(name ="STANDING_PAY",nullable=true,precision=24,scale=6)
	public BigDecimal getStandingPay(){
		return this.standingPay;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  工龄工资
	 */
	public void setStandingPay(BigDecimal standingPay){
		this.standingPay = standingPay;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  绩效工资
	 */
	@Column(name ="ACHIEVE_PAY",nullable=true,precision=24,scale=6)
	public BigDecimal getAchievePay(){
		return this.achievePay;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  绩效工资
	 */
	public void setAchievePay(BigDecimal achievePay){
		this.achievePay = achievePay;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  加班费
	 */
	@Column(name ="OVERTIME_PAY",nullable=true,precision=24,scale=6)
	public BigDecimal getOvertimePay(){
		return this.overtimePay;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  加班费
	 */
	public void setOvertimePay(BigDecimal overtimePay){
		this.overtimePay = overtimePay;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  课时费
	 */
	@Column(name ="TEACHING_HOUR_PAY",nullable=true,precision=24,scale=6)
	public BigDecimal getTeachingHourPay(){
		return this.teachingHourPay;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  课时费
	 */
	public void setTeachingHourPay(BigDecimal teachingHourPay){
		this.teachingHourPay = teachingHourPay;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  社保补贴
	 */
	@Column(name ="SOCIAL_SECURITY_PAY",nullable=true,precision=24,scale=6)
	public BigDecimal getSocialSecurityPay(){
		return this.socialSecurityPay;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  社保补贴
	 */
	public void setSocialSecurityPay(BigDecimal socialSecurityPay){
		this.socialSecurityPay = socialSecurityPay;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  其它
	 */
	@Column(name ="OTHER_PAY",nullable=true,precision=24,scale=6)
	public BigDecimal getOtherPay(){
		return this.otherPay;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  其它
	 */
	public void setOtherPay(BigDecimal otherPay){
		this.otherPay = otherPay;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  应支付工资
	 */
	@Column(name ="WAGES_SHOULD_PAY",nullable=true,precision=24,scale=6)
	public BigDecimal getWagesShouldPay(){
		return this.wagesShouldPay;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  应支付工资
	 */
	public void setWagesShouldPay(BigDecimal wagesShouldPay){
		this.wagesShouldPay = wagesShouldPay;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  考核扣减
	 */
	@Column(name ="CHECK_DEDUCTION_PAY",nullable=true,precision=24,scale=6)
	public BigDecimal getCheckDeductionPay(){
		return this.checkDeductionPay;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  考核扣减
	 */
	public void setCheckDeductionPay(BigDecimal checkDeductionPay){
		this.checkDeductionPay = checkDeductionPay;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  考勤扣款
	 */
	@Column(name ="ATTENDANCE_DEDUCTION_PAY",nullable=true,precision=24,scale=6)
	public BigDecimal getAttendanceDeductionPay(){
		return this.attendanceDeductionPay;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  考勤扣款
	 */
	public void setAttendanceDeductionPay(BigDecimal attendanceDeductionPay){
		this.attendanceDeductionPay = attendanceDeductionPay;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  其他扣减
	 */
	@Column(name ="OTHER_DEDUCTION_PAY",nullable=true,precision=24,scale=6)
	public BigDecimal getOtherDeductionPay(){
		return this.otherDeductionPay;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  其他扣减
	 */
	public void setOtherDeductionPay(BigDecimal otherDeductionPay){
		this.otherDeductionPay = otherDeductionPay;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  养老
	 */
	@Column(name ="PENSION_PAY",nullable=true,precision=24,scale=6)
	public BigDecimal getPensionPay(){
		return this.pensionPay;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  养老
	 */
	public void setPensionPay(BigDecimal pensionPay){
		this.pensionPay = pensionPay;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  医疗
	 */
	@Column(name ="MEDICAL_CARE_PAY",nullable=true,precision=24,scale=6)
	public BigDecimal getMedicalCarePay(){
		return this.medicalCarePay;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  医疗
	 */
	public void setMedicalCarePay(BigDecimal medicalCarePay){
		this.medicalCarePay = medicalCarePay;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  公积金
	 */
	@Column(name ="ACCUMULATION_FUND_PAY",nullable=true,precision=24,scale=6)
	public BigDecimal getAccumulationFundPay(){
		return this.accumulationFundPay;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  公积金
	 */
	public void setAccumulationFundPay(BigDecimal accumulationFundPay){
		this.accumulationFundPay = accumulationFundPay;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  大病
	 */
	@Column(name ="SERIOUS_ILLNESS_PAY",nullable=true,precision=24,scale=6)
	public BigDecimal getSeriousIllnessPay(){
		return this.seriousIllnessPay;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  大病
	 */
	public void setSeriousIllnessPay(BigDecimal seriousIllnessPay){
		this.seriousIllnessPay = seriousIllnessPay;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  保险合计
	 */
	@Column(name ="TOTAL_INSURANCE_PAY",nullable=true,precision=24,scale=6)
	public BigDecimal getTotalInsurancePay(){
		return this.totalInsurancePay;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  保险合计
	 */
	public void setTotalInsurancePay(BigDecimal totalInsurancePay){
		this.totalInsurancePay = totalInsurancePay;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  个税
	 */
	@Column(name ="PERSONAL_INCOME_TAX_PAY",nullable=true,precision=24,scale=6)
	public BigDecimal getPersonalIncomeTaxPay(){
		return this.personalIncomeTaxPay;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  个税
	 */
	public void setPersonalIncomeTaxPay(BigDecimal personalIncomeTaxPay){
		this.personalIncomeTaxPay = personalIncomeTaxPay;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  应扣合计
	 */
	@Column(name ="TOTAL_DEDUCTION",nullable=true,precision=24,scale=6)
	public BigDecimal getTotalDeduction(){
		return this.totalDeduction;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  应扣合计
	 */
	public void setTotalDeduction(BigDecimal totalDeduction){
		this.totalDeduction = totalDeduction;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  实发工资
	 */
	@Column(name ="REAL_PAY_MONEY",nullable=true,precision=24,scale=6)
	public BigDecimal getRealPayMoney(){
		return this.realPayMoney;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  实发工资
	 */
	public void setRealPayMoney(BigDecimal realPayMoney){
		this.realPayMoney = realPayMoney;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  实领工资
	 */
	@Column(name ="REAL_GET_MONEY",nullable=true,precision=24,scale=6)
	public BigDecimal getRealGetMoney(){
		return this.realGetMoney;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  实领工资
	 */
	public void setRealGetMoney(BigDecimal realGetMoney){
		this.realGetMoney = realGetMoney;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  企业缴费－养老
	 */
	@Column(name ="QYJF_YLJ",nullable=true,precision=24,scale=6)
	public BigDecimal getQyjfYlj(){
		return this.qyjfYlj;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  企业缴费－养老
	 */
	public void setQyjfYlj(BigDecimal qyjfYlj){
		this.qyjfYlj = qyjfYlj;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  企业养老－医疗金
	 */
	@Column(name ="QYJF_YILIAO",nullable=true,precision=24,scale=6)
	public BigDecimal getQyjfYiliao(){
		return this.qyjfYiliao;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  企业养老－医疗金
	 */
	public void setQyjfYiliao(BigDecimal qyjfYiliao){
		this.qyjfYiliao = qyjfYiliao;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  企业缴费－工伤
	 */
	@Column(name ="QYJF_GONGSHANG",nullable=true,precision=24,scale=6)
	public BigDecimal getQyjfGongshang(){
		return this.qyjfGongshang;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  企业缴费－工伤
	 */
	public void setQyjfGongshang(BigDecimal qyjfGongshang){
		this.qyjfGongshang = qyjfGongshang;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  企业缴费－生育
	 */
	@Column(name ="QYJF_SHENGYU",nullable=true,precision=24,scale=6)
	public BigDecimal getQyjfShengyu(){
		return this.qyjfShengyu;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  企业缴费－生育
	 */
	public void setQyjfShengyu(BigDecimal qyjfShengyu){
		this.qyjfShengyu = qyjfShengyu;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  企业缴费－公积金
	 */
	@Column(name ="QYJF_GJJ",nullable=true,precision=24,scale=6)
	public BigDecimal getQyjfGjj(){
		return this.qyjfGjj;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  企业缴费－公积金
	 */
	public void setQyjfGjj(BigDecimal qyjfGjj){
		this.qyjfGjj = qyjfGjj;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  企业缴费－统筹合计
	 */
	@Column(name ="QYJF_TOTAL",nullable=true,precision=24,scale=6)
	public BigDecimal getQyjfTotal(){
		return this.qyjfTotal;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  企业缴费－统筹合计
	 */
	public void setQyjfTotal(BigDecimal qyjfTotal){
		this.qyjfTotal = qyjfTotal;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  payDate
	 */
	@Column(name ="PAY_DATE",nullable=true,length=45)
	public java.lang.String getPayDate(){
		return this.payDate;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  payDate
	 */
	public void setPayDate(java.lang.String payDate){
		this.payDate = payDate;
	}
}
