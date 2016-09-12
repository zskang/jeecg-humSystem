<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<!DOCTYPE html>
<html>
 <head>
  <title>员工合同信息表</title>
  <t:base type="jquery,easyui,tools,DatePicker"></t:base>
  <script type="text/javascript">
  //编写自定义JS代码
  </script>
 </head>
 <body>
  <t:formvalid formid="formobj" dialog="true" usePlugin="password" layout="table" action="empContactInfoController.do?doAdd" tiptype="1" >
					<input id="id" name="id" type="hidden" value="${empContactInfoPage.id }">
					<input id="createName" name="createName" type="hidden" value="${empContactInfoPage.createName }">
					<input id="createBy" name="createBy" type="hidden" value="${empContactInfoPage.createBy }">
					<input id="createDate" name="createDate" type="hidden" value="${empContactInfoPage.createDate }">
					<input id="updateName" name="updateName" type="hidden" value="${empContactInfoPage.updateName }">
					<input id="updateBy" name="updateBy" type="hidden" value="${empContactInfoPage.updateBy }">
					<input id="updateDate" name="updateDate" type="hidden" value="${empContactInfoPage.updateDate }">
					<input id="bpmStatus" name="bpmStatus" type="hidden" value="${empContactInfoPage.bpmStatus }">
		<table style="width: 600px;" cellpadding="0" cellspacing="1" class="formtable">
				<tr> 
					<td align="right">
						<label class="Validform_label">
							员工名称:
						</label>
					</td>
					<td class="value">
					  	 <input id="empNo" name="empNo" type="hidden" style="width: 150px" class="inputxt" readonly="readonly" required="required" >
					     	 <input id="empName" name="empName" type="text" style="width: 150px" class="inputxt" readonly="readonly" required="required">
					     	 <t:choose hiddenName="empNo"
						hiddenid="empNo" url="jformResumeInfoController.do?lists"
						name="jformResumeInfoList" height="400px" width="1000px"
						icon="icon-search" title="员工列表" textname="empName" isclear="true"
						isInit="true"></t:choose>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">员工名称</label>
						</td>
					</tr>
				<tr>
					
					<td align="right">
						<label class="Validform_label">
							合同生效日期:
						</label>
					</td>
					<td class="value">
							   <input id="startDate" name="startDate" type="text" style="width: 150px"  required="required"
					      						class="Wdate" onClick="WdatePicker()"
>    
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">合同生效日期</label>
						</td>
				 	</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							合同终止日期:
						</label>
					</td>
					<td class="value">
							   <input id="endDate" name="endDate" type="text" style="width: 150px"  required="required"
					      						class="Wdate" onClick="WdatePicker()"
>    
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">合同终止日期</label>
						</td>
					</tr>
					<tr>	
					
					<td align="right">
						<label class="Validform_label">
							签订日期:
						</label>
					</td>
					<td class="value">
							   <input id="onDate" name="onDate" type="text" style="width: 150px" required="required"
					      						class="Wdate" onClick="WdatePicker()"
>    
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">签订日期</label>
						</td>
				 	</tr>
				<!-- <tr>
					<td align="right">
						<label class="Validform_label">
							合同签订单位:
						</label>
					</td>
					<td class="value">
					     	 <input id="contactCompany" name="contactCompany" type="text" style="width: 150px" class="inputxt" >
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">合同签订单位</label>
						</td>
					</tr> -->
					<tr>
						<td align="right">
						<label class="Validform_label">
							合同类型:
						</label>
					</td>
					<td class="value">
							  <t:dictSelect field="contactType" type="list"  
									typeGroupCode="contType" defaultVal="${empContactInfoPage.contactType}" hasLabel="false"  title="合同类型"></t:dictSelect>     
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">合同类型</label>
						</td>	</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							合同工资类型:
						</label>
					</td>
					<td class="value">
							  <t:dictSelect field="contactMoneyType" type="list"  
									typeGroupCode="amttype" defaultVal="${empContactInfoPage.contactMoneyType}" hasLabel="false"  title="合同工资类型"></t:dictSelect>     
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">合同工资类型</label>
						</td>
					</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							合同工资:
						</label>
					</td>
					<td class="value">
					     	 <input id="contactMoney" name="contactMoney" datatype="d" type="text" style="width: 150px" class="inputxt" required="required">
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">合同工资</label>
						</td>	</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							发放时间:
						</label>
					</td>
					<td class="value">
							   <input id="grantDate" name="grantDate" type="text" style="width: 150px"  required="required"
					      						class="Wdate" onClick="WdatePicker()"
>    
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">发放时间</label>
						</td>
					</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							合同状态: 
						</label>
					</td>
					<td class="value">
							  <t:dictSelect field="contactStatus" type="list"  
									typeGroupCode="contStatus" defaultVal="${empContactInfoPage.contactStatus}" hasLabel="false"  title="合同状态"></t:dictSelect>     
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">合同状态</label>
						</td>	</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							工作时间:
						</label>
					</td>
					<td class="value">
					     	 <input id="workTimes" name="workTimes" type="text" style="width: 150px" class="inputxt" >
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">工作时间</label>
						</td>
					</tr>
				<tr> 
					<td align="right">
						<label class="Validform_label">
							合同期限:
						</label>
					</td>
					<td class="value" colspan="3">
					     	 <input id="contactTerm" name="contactTerm" type="text" style="width: 150px" class="inputxt" required="required">
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">合同期限</label>
						</td>
					</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							试用期限:
						</label>
					</td>
					<td class="value">
					     	 <input id="tryTerm" name="tryTerm" type="text" style="width: 150px" class="inputxt" required="required">
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">试用期限</label>
						</td>	</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							试用期终止日期:
						</label>
					</td>
					<td class="value">
							   <input id="tryEndDate" name="tryEndDate" type="text" style="width: 150px" required="required"
					      						class="Wdate" onClick="WdatePicker()"
>    
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">试用期终止日期</label>
						</td>
					</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							现任职务:
						</label>
					</td>
					<td class="value">
							  <t:dictSelect field="duty" type="list"  
									typeGroupCode="postion" defaultVal="${empContactInfoPage.duty}" hasLabel="false"  title="现任职务"></t:dictSelect>     
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">现任职务</label>
						</td>	</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							原身份:
						</label>
					</td>
					<td class="value">
					     	 <input id="oldSf" name="oldSf" type="text" style="width: 150px" class="inputxt" >
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">原身份</label>
						</td>
					</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							备注:
						</label>
					</td>
					<td class="value"  >
					     	 <input id="remark" name="remark" type="text" style="width: 450px" class="inputxt" >
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">备注</label>
						</td> 
					</tr>
			</table>
		</t:formvalid>
 </body>
  <script src = "webpage/com/jeecg/empcontactinfo/empContactInfo.js"></script>		
