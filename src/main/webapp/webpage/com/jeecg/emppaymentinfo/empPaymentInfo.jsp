<%@ page language="java" import="java.util.*"
	contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<!DOCTYPE html>
<html>
<head>
<title>员工薪酬纪录表</title>
<t:base type="jquery,easyui,tools,DatePicker"></t:base>
</head>
<body scroll="yes">
	<t:formvalid formid="formobj" dialog="true" usePlugin="password"
		layout="table" action="empPaymentInfoController.do?save">
		<input id="id" name="id" type="hidden"
			value="${empPaymentInfoPage.id }">
		<table style="width: 600px;" cellpadding="0" cellspacing="1"
			class="formtable">
			<tr>
				<td colspan="2" height="40px">选择员工信息</td>
			</tr>
			<tr>
				<td align="right"><label class="Validform_label"> 员工名称：
				</label></td>
				<td class="value">
				<input name="empNo" type="hidden"
					class="inputxt" value="${empPaymentInfoPage.empNo}" id="empNo"
					datatype="*">
					 <input type="text" name="empName"
					class="inputxt" value="${empName }" id="empName"
					readonly="readonly" datatype="*" />
			  <t:choose hiddenName="empNo"
						hiddenid="empNo" url="jformResumeInfoController.do?lists"
						name="jformResumeInfoList" height="400px" width="1000px"
						icon="icon-search" title="员工列表" textname="empName" isclear="true"
						isInit="true"></t:choose>
						 <span class="Validform_checktip"></span> 
				</td>
			</tr>
			<tr>
				<td align="right"><label class="Validform_label"> 生效时间:
				</label></td>
				<td class="value"><input class="Wdate"
					onClick="WdatePicker({dateFmt:'yyyy-MM-dd'});" id="payDate"
					name="payDate" datatype="*" value="${empPaymentInfoPage.payDate}">
					<span class="Validform_checktip"></span></td>
			</tr>
			<tr>
				<td height="40px" colspan="2">员工详细薪资信息录入</td>
			</tr>
			<tr>
				<td align="right"><label class="Validform_label"> 标准工资:
				</label></td>
				<td class="value"><input class="inputxt" id="standardPay"
					style="width: 65%" name="standardPay"
					value="${empPaymentInfoPage.standardPay}" datatype="d"> <span
					class="Validform_checktip"></span>元</td>

			</tr>
			<tr>
				<td align="right"><label class="Validform_label"> 基本工资:
				</label></td>
				<td class="value"><input class="inputxt" id="basePay"
					style="width: 65%" name="basePay"
					value="${empPaymentInfoPage.basePay}" datatype="d"> <span
					class="Validform_checktip"></span>元</td>

			</tr>
			<tr>
				<td align="right"><label class="Validform_label"> 岗位工资:
				</label></td>
				<td class="value"><input class="inputxt" id="dutyPay"
					style="width: 65%" name="dutyPay"
					value="${empPaymentInfoPage.dutyPay}" datatype="d"> <span
					class="Validform_checktip"></span>元</td>
			</tr>
			<tr>
				<td align="right"><label class="Validform_label"> 级别工资:
				</label></td>
				<td class="value"><input class="inputxt" id="gradePay"
					style="width: 65%" name="gradePay"
					value="${empPaymentInfoPage.gradePay}" datatype="d"> <span
					class="Validform_checktip"></span>元</td>
			</tr>
			<tr>
				<td align="right"><label class="Validform_label"> 保密费:
				</label></td>
				<td class="value"><input class="inputxt" id="secretPay"
					style="width: 65%" name="secretPay"
					value="${empPaymentInfoPage.secretPay}" datatype="d"> <span
					class="Validform_checktip"></span>元</td>

			</tr>
			<tr>
				<td align="right"><label class="Validform_label"> 满勤奖:
				</label></td>
				<td class="value"><input class="inputxt" id="fullWorkPay"
					style="width: 65%" name="fullWorkPay"
					value="${empPaymentInfoPage.fullWorkPay}" datatype="d"> <span
					class="Validform_checktip"></span>元</td>
			</tr>
			<tr>
				<td align="right"><label class="Validform_label"> 工龄工资:
				</label></td>
				<td class="value"><input class="inputxt" id="standingPay"
					style="width: 65%" name="standingPay"
					value="${empPaymentInfoPage.standingPay}" datatype="d"> <span
					class="Validform_checktip"></span>元</td>

			</tr>
			<tr>
				<td align="right"><label class="Validform_label"> 绩效工资:
				</label></td>
				<td class="value"><input class="inputxt" id="achievePay"
					style="width: 65%" name="achievePay"
					value="${empPaymentInfoPage.achievePay}" datatype="d"> <span
					class="Validform_checktip"></span>元</td>
			</tr>
			<tr>
				<td align="right"><label class="Validform_label"> 加班费:
				</label></td>
				<td class="value"><input class="inputxt" id="overtimePay"
					style="width: 65%" name="overtimePay"
					value="${empPaymentInfoPage.overtimePay}" datatype="d"> <span
					class="Validform_checktip"></span>元</td>

			</tr>
			<tr>
				<td align="right"><label class="Validform_label"> 课时费:
				</label></td>
				<td class="value"><input class="inputxt" id="teachingHourPay"
					style="width: 65%" name="teachingHourPay" ignore="ignore"
					value="${empPaymentInfoPage.teachingHourPay}" datatype="d">
					<span class="Validform_checktip"></span>元</td>

			</tr>
			<tr>
				<td align="right"><label class="Validform_label"> 社保补贴:
				</label></td>
				<td class="value"><input class="inputxt" id="socialSecurityPay"
					style="width: 65%" name="socialSecurityPay" ignore="ignore"
					value="${empPaymentInfoPage.socialSecurityPay}" datatype="d">
					<span class="Validform_checktip"></span>元</td>

			</tr>
			<tr>
				<td align="right"><label class="Validform_label"> 其它: </label>
				</td>
				<td class="value"><input class="inputxt" id="otherPay"
					name="otherPay" ignore="ignore" style="width: 65%"
					value="${empPaymentInfoPage.otherPay}" datatype="d"> <span
					class="Validform_checktip"></span>元</td>
			</tr>
			<tr>
				<td align="right"><label class="Validform_label">
						应支付工资: </label></td>
				<td class="value"><input class="inputxt" id="wagesShouldPay"
					name="wagesShouldPay" ignore="ignore" style="width: 65%"
					value="${empPaymentInfoPage.wagesShouldPay}" datatype="d">
					<span class="Validform_checktip"></span>元</td>
			</tr>
			<tr>
				<td align="right"><label class="Validform_label"> 考核扣减:
				</label></td>
				<td class="value"><input class="inputxt" id="checkDeductionPay"
					name="checkDeductionPay" ignore="ignore" style="width: 65%"
					value="${empPaymentInfoPage.checkDeductionPay}" datatype="d">
					<span class="Validform_checktip"></span>元</td>

			</tr>
			<tr>
				<td align="right"><label class="Validform_label"> 考勤扣款:
				</label></td>
				<td class="value"><input class="inputxt"
					id="attendanceDeductionPay" name="attendanceDeductionPay"
					ignore="ignore" style="width: 65%"
					value="${empPaymentInfoPage.attendanceDeductionPay}" datatype="d">
					<span class="Validform_checktip"></span>元</td>

			</tr>
			<tr>
				<td align="right"><label class="Validform_label"> 其他扣减:
				</label></td>
				<td class="value"><input class="inputxt" id="otherDeductionPay"
					name="otherDeductionPay" ignore="ignore" style="width: 65%"
					value="${empPaymentInfoPage.otherDeductionPay}" datatype="d">
					<span class="Validform_checktip"></span>元</td>
			</tr>

			<tr>
				<td align="right"><label class="Validform_label"> 养老: </label>
				</td>
				<td class="value"><input class="inputxt" id="pensionPay"
					name="pensionPay" ignore="ignore" style="width: 65%"
					value="${empPaymentInfoPage.pensionPay}" datatype="d"> <span
					class="Validform_checktip"></span>元</td>

			</tr>
			<tr>
				<td align="right"><label class="Validform_label"> 医疗: </label>
				</td>
				<td class="value"><input class="inputxt" id="medicalCarePay"
					name="medicalCarePay" ignore="ignore" style="width: 65%"
					value="${empPaymentInfoPage.medicalCarePay}" datatype="d">
					<span class="Validform_checktip"></span>元</td>
			</tr>
			<tr>
				<td align="right"><label class="Validform_label"> 公积金:
				</label></td>
				<td class="value"><input class="inputxt" style="width: 65%"
					id="accumulationFundPay" name="accumulationFundPay" ignore="ignore"
					value="${empPaymentInfoPage.accumulationFundPay}" datatype="d">
					<span class="Validform_checktip"></span>元</td>

			</tr>
			<tr>
				<td align="right"><label class="Validform_label"> 大病: </label>
				</td>
				<td class="value"><input class="inputxt" id="seriousIllnessPay"
					name="seriousIllnessPay" ignore="ignore" style="width: 65%"
					value="${empPaymentInfoPage.seriousIllnessPay}" datatype="d">
					<span class="Validform_checktip"></span>元</td>

			</tr>
			<tr>
				<td align="right"><label class="Validform_label"> 保险合计:
				</label></td>
				<td class="value"><input class="inputxt" id="totalInsurancePay"
					name="totalInsurancePay" ignore="ignore" style="width: 65%"
					value="${empPaymentInfoPage.totalInsurancePay}" datatype="d">
					<span class="Validform_checktip"></span>元</td>

			</tr>
			<tr>
				<td align="right"><label class="Validform_label"> 个税: </label>
				</td>
				<td class="value"><input class="inputxt"
					id="personalIncomeTaxPay" name="personalIncomeTaxPay"
					style="width: 65%" ignore="ignore"
					value="${empPaymentInfoPage.personalIncomeTaxPay}" datatype="d">
					<span class="Validform_checktip"></span>元</td>
			</tr>
			<tr>
				<td align="right"><label class="Validform_label"> 应扣合计:
				</label></td>
				<td class="value"><input class="inputxt" id="totalDeduction"
					name="totalDeduction" ignore="ignore" style="width: 65%"
					value="${empPaymentInfoPage.totalDeduction}" datatype="d">
					<span class="Validform_checktip"></span>元</td>
			</tr>
			<tr>
				<td align="right"><label class="Validform_label"> 实发工资:
				</label></td>
				<td class="value"><input class="inputxt" id="realPayMoney"
					name="realPayMoney" ignore="ignore" style="width: 65%"
					value="${empPaymentInfoPage.realPayMoney}" datatype="d"> <span
					class="Validform_checktip"></span>元</td>

			</tr>
			<tr>
				<td align="right"><label class="Validform_label"> 实领工资:
				</label></td>
				<td class="value" colspan="3"><input class="inputxt"
					id="realGetMoney" name="realGetMoney" ignore="ignore"
					style="width: 65%" value="${empPaymentInfoPage.realGetMoney}"
					datatype="d"> <span class="Validform_checktip"></span>元</td>
			</tr>
			<tr>
				<td height="40px" colspan="2">企业缴费信息录入</td>
			</tr>
			<tr>
				<td align="right"><label class="Validform_label"> 养老: </label>
				</td>
				<td class="value"><input class="inputxt" id="qyjfYlj"
					name="qyjfYlj" ignore="ignore" style="width: 65%"
					value="${empPaymentInfoPage.qyjfYlj}" datatype="d"> <span
					class="Validform_checktip"></span>元</td>

			</tr>
			<tr>
				<td align="right"><label class="Validform_label"> 医疗金:
				</label></td>
				<td class="value"><input class="inputxt" id="qyjfYiliao"
					name="qyjfYiliao" ignore="ignore" style="width: 65%"
					value="${empPaymentInfoPage.qyjfYiliao}" datatype="d"> <span
					class="Validform_checktip"></span>元</td>

			</tr>
			<tr>
				<td align="right"><label class="Validform_label"> 工伤: </label>
				</td>
				<td class="value"><input class="inputxt" id="qyjfGongshang"
					name="qyjfGongshang" ignore="ignore" style="width: 65%"
					value="${empPaymentInfoPage.qyjfGongshang}" datatype="d"> <span
					class="Validform_checktip"></span>元</td>
			</tr>
			<tr>
				<td align="right"><label class="Validform_label"> 生育: </label>
				</td>
				<td class="value"><input class="inputxt" id="qyjfShengyu"
					name="qyjfShengyu" ignore="ignore" style="width: 65%"
					value="${empPaymentInfoPage.qyjfShengyu}" datatype="d"> <span
					class="Validform_checktip"></span>元</td>

			</tr>
			<tr>
				<td align="right"><label class="Validform_label"> 公积金:
				</label></td>
				<td class="value"><input class="inputxt" id="qyjfGjj"
					name="qyjfGjj" ignore="ignore" style="width: 65%"
					value="${empPaymentInfoPage.qyjfGjj}" datatype="d"> <span
					class="Validform_checktip"></span>元</td>
			</tr>
			<tr>
				<td align="right"><label class="Validform_label"> 统筹合计:
				</label></td>
				<td class="value"><input class="inputxt" id="qyjfTotal"
					name="qyjfTotal" ignore="ignore" style="width: 65%"
					value="${empPaymentInfoPage.qyjfTotal}" datatype="d"> <span
					class="Validform_checktip"></span>元</td>
			</tr>
		</table>
	</t:formvalid>
</body>