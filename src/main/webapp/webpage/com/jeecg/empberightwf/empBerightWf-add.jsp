<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<!DOCTYPE html>
<html>
 <head>
  <title>员工转正流程表</title>
  <t:base type="jquery,easyui,tools,DatePicker"></t:base>
  <script type="text/javascript">
  //编写自定义JS代码
  </script>
 </head>
 <body>
  <t:formvalid formid="formobj" dialog="true" usePlugin="password" layout="table" action="empBerightWfController.do?doAdd" tiptype="1" >
					<input id="id" name="id" type="hidden" value="${empBerightWfPage.id }">
					<input id="createName" name="createName" type="hidden" value="${empBerightWfPage.createName }">
					<input id="createBy" name="createBy" type="hidden" value="${empBerightWfPage.createBy }">
					<input id="createDate" name="createDate" type="hidden" value="${empBerightWfPage.createDate }">
					<input id="updateName" name="updateName" type="hidden" value="${empBerightWfPage.updateName }">
					<input id="updateBy" name="updateBy" type="hidden" value="${empBerightWfPage.updateBy }">
					<input id="updateDate" name="updateDate" type="hidden" value="${empBerightWfPage.updateDate }">
					<input id="sysOrgCode" name="sysOrgCode" type="hidden" value="${empBerightWfPage.sysOrgCode }">
					<input id="sysCompanyCode" name="sysCompanyCode" type="hidden" value="${empBerightWfPage.sysCompanyCode }">
					<input id="bpmStatus" name="bpmStatus" type="hidden" value="${empBerightWfPage.bpmStatus }">
		<table style="width: 600px;" cellpadding="0" cellspacing="1" class="formtable">
				<tr>
					<td align="right">
						<label class="Validform_label">
							员工编号:
						</label>
					</td>
					<td class="value">
					     	 <input id="empNo" name="empNo" type="text" style="width: 150px" class="inputxt" >
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">员工编号</label>
						</td>
					<td align="right">
						<label class="Validform_label">
							性别:
						</label>
					</td>
					<td class="value">
					     	 <input id="sex" name="sex" type="text" style="width: 150px" class="inputxt" >
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">性别</label>
						</td>
					</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							出生日期:
						</label>
					</td>
					<td class="value">
					     	 <input id="birth" name="birth" type="text" style="width: 150px" class="inputxt" >
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">出生日期</label>
						</td>
					<td align="right">
						<label class="Validform_label">
							所属部门:
						</label>
					</td>
					<td class="value">
					     	 <input id="orgno" name="orgno" type="text" style="width: 150px" class="inputxt" >
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">所属部门</label>
						</td>
					</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							所属岗位:
						</label>
					</td>
					<td class="value">
					     	 <input id="deptno" name="deptno" type="text" style="width: 150px" class="inputxt" >
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">所属岗位</label>
						</td>
					<td align="right">
						<label class="Validform_label">
							入职时间:
						</label>
					</td>
					<td class="value">
							   <input id="ruzhiDate" name="ruzhiDate" type="text" style="width: 150px" 
					      						class="Wdate" onClick="WdatePicker()"
>    
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">入职时间</label>
						</td>
					</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							转正日期:
						</label>
					</td>
					<td class="value">
							   <input id="berightDate" name="berightDate" type="text" style="width: 150px" 
					      						class="Wdate" onClick="WdatePicker()"
>    
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">转正日期</label>
						</td>
					<td align="right">
						<label class="Validform_label">
							试用期工资:
						</label>
					</td>
					<td class="value">
					     	 <input id="trySalary" name="trySalary" type="text" style="width: 150px" class="inputxt" >
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">试用期工资</label>
						</td>
					</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							转正后薪资:
						</label>
					</td>
					<td class="value">
					     	 <input id="rightSalary" name="rightSalary" type="text" style="width: 150px" class="inputxt" >
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">转正后薪资</label>
						</td>
					<td align="right">
						<label class="Validform_label">
							试用期总结:
						</label>
					</td>
					<td class="value">
					     	 <input id="remark" name="remark" type="text" style="width: 150px" class="inputxt" >
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">试用期总结</label>
						</td>
					</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							签字人姓名:
						</label>
					</td>
					<td class="value">
					     	 <input id="reqName" name="reqName" type="text" style="width: 150px" class="inputxt" >
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">签字人姓名</label>
						</td>
					<td align="right">
						<label class="Validform_label">
							签字时间:
						</label>
					</td>
					<td class="value">
							   <input id="reqDate" name="reqDate" type="text" style="width: 150px" 
					      						class="Wdate" onClick="WdatePicker()"
>    
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">签字时间</label>
						</td>
					</tr>
			</table>
		</t:formvalid>
 </body>
  <script src = "webpage/com/jeecg/empberightwf/empBerightWf.js"></script>		
