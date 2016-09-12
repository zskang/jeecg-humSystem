<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<!DOCTYPE html>
<html>
 <head>
  <title>员工公出未打卡流程</title>
  <t:base type="jquery,easyui,tools,DatePicker"></t:base>
  <script type="text/javascript">
  //编写自定义JS代码
  </script>
 </head>
 <body>
  <t:formvalid formid="formobj" dialog="true" usePlugin="password" layout="table" action="empOutWfController.do?doAdd" tiptype="1" >
					<input id="id" name="id" type="hidden" value="${empOutWfPage.id }">
					<input id="createName" name="createName" type="hidden" value="${empOutWfPage.createName }">
					<input id="createBy" name="createBy" type="hidden" value="${empOutWfPage.createBy }">
					<input id="createDate" name="createDate" type="hidden" value="${empOutWfPage.createDate }">
					<input id="updateName" name="updateName" type="hidden" value="${empOutWfPage.updateName }">
					<input id="updateBy" name="updateBy" type="hidden" value="${empOutWfPage.updateBy }">
					<input id="updateDate" name="updateDate" type="hidden" value="${empOutWfPage.updateDate }">
					<input id="sysOrgCode" name="sysOrgCode" type="hidden" value="${empOutWfPage.sysOrgCode }">
					<input id="sysCompanyCode" name="sysCompanyCode" type="hidden" value="${empOutWfPage.sysCompanyCode }">
					<input id="bpmStatus" name="bpmStatus" type="hidden" value="${empOutWfPage.bpmStatus }">
		<table style="width: 600px;" cellpadding="0" cellspacing="1" class="formtable">
				<tr>
					<td align="right">
						<label class="Validform_label">
							员工编号:
						</label>
					</td>
					<td class="value">
					     	 <input id="empno" name="empno" type="text" style="width: 150px" class="inputxt" >
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">员工编号</label>
						</td>
				<tr>
					<td align="right">
						<label class="Validform_label">
							员工名称:
						</label>
					</td>
					<td class="value">
					     	 <input id="empname" name="empname" type="text" style="width: 150px" class="inputxt" >
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">员工名称</label>
						</td>
					</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							所属部门编号:
						</label>
					</td>
					<td class="value">
					     	 <input id="orgno" name="orgno" type="text" style="width: 150px" class="inputxt" >
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">所属部门编号</label>
						</td>
				<tr>
					<td align="right">
						<label class="Validform_label">
							所在部门:
						</label>
					</td>
					<td class="value">
					     	 <input id="orgname" name="orgname" type="text" style="width: 150px" class="inputxt" >
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">所在部门</label>
						</td>
					</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							岗位:
						</label>
					</td>
					<td class="value">
					     	 <input id="deptno" name="deptno" type="text" style="width: 150px" class="inputxt" >
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">岗位</label>
						</td>
				<tr>
					<td align="right">
						<label class="Validform_label">
							岗位名称:
						</label>
					</td>
					<td class="value">
					     	 <input id="deptname" name="deptname" type="text" style="width: 150px" class="inputxt" >
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">岗位名称</label>
						</td>
					</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							原因:
						</label>
					</td>
					<td class="value">
						  	 <textarea style="width:600px;" class="inputxt" rows="6" id="reason" name="reason"></textarea>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">原因</label>
						</td>
				<tr>
					<td align="right">
						<label class="Validform_label">
							开始时间:
						</label>
					</td>
					<td class="value">
							   <input id="startDate" name="startDate" type="text" style="width: 150px" 
					      						 class="Wdate" onClick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss'})"
>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">开始时间</label>
						</td>
					</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							结束时间:
						</label>
					</td>
					<td class="value">
							   <input id="endDate" name="endDate" type="text" style="width: 150px" 
					      						 class="Wdate" onClick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss'})"
>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">结束时间</label>
						</td>
				<tr>
					<td align="right">
						<label class="Validform_label">
							未打卡时间:
						</label>
					</td>
					<td class="value">
					     	 <input id="betweenTime" name="betweenTime" type="text" style="width: 150px" class="inputxt" >
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">未打卡时间</label>
						</td>
					</tr>
			</table>
		</t:formvalid>
 </body>
  <script src = "webpage/com/jeecg/empoutwf/empOutWf.js"></script>		
