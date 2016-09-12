<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<!DOCTYPE html>
<html>
 <head>
  <title>员工销假流程表</title>
  <t:base type="jquery,easyui,tools,DatePicker"></t:base>
  <script type="text/javascript">
  //编写自定义JS代码
  </script>
 </head>
 <body>
		<t:formvalid formid="formobj" dialog="true" usePlugin="password" layout="table" action="empDelholidayWfController.do?doUpdate" tiptype="1" >
					<input id="id" name="id" type="hidden" value="${empDelholidayWfPage.id }">
					<input id="createName" name="createName" type="hidden" value="${empDelholidayWfPage.createName }">
					<input id="createBy" name="createBy" type="hidden" value="${empDelholidayWfPage.createBy }">
					<input id="createDate" name="createDate" type="hidden" value="${empDelholidayWfPage.createDate }">
					<input id="updateName" name="updateName" type="hidden" value="${empDelholidayWfPage.updateName }">
					<input id="updateBy" name="updateBy" type="hidden" value="${empDelholidayWfPage.updateBy }">
					<input id="updateDate" name="updateDate" type="hidden" value="${empDelholidayWfPage.updateDate }">
					<input id="sysOrgCode" name="sysOrgCode" type="hidden" value="${empDelholidayWfPage.sysOrgCode }">
					<input id="sysCompanyCode" name="sysCompanyCode" type="hidden" value="${empDelholidayWfPage.sysCompanyCode }">
					<input id="bpmStatus" name="bpmStatus" type="hidden" value="${empDelholidayWfPage.bpmStatus }">
		<table style="width: 600px;" cellpadding="0" cellspacing="1" class="formtable">
					<tr>
						<td align="right">
							<label class="Validform_label">
								员工编号:
							</label>
						</td>
						<td class="value">
						     	 <input id="empno" name="empno" type="text" style="width: 150px" class="inputxt"  value='${empDelholidayWfPage.empno}'>
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
						     	 <input id="empname" name="empname" type="text" style="width: 150px" class="inputxt"  value='${empDelholidayWfPage.empname}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">员工名称</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								复职日期:
							</label>
						</td>
						<td class="value">
						     	 <input id="fuzhiDate" name="fuzhiDate" type="text" style="width: 150px" class="inputxt"  value='${empDelholidayWfPage.fuzhiDate}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">复职日期</label>
						</td>
					<tr>
						<td align="right">
							<label class="Validform_label">
								申请人签字:
							</label>
						</td>
						<td class="value">
						     	 <input id="reqname" name="reqname" type="text" style="width: 150px" class="inputxt"  value='${empDelholidayWfPage.reqname}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">申请人签字</label>
						</td>
					</tr>
			</table>
		</t:formvalid>
 </body>
  <script src = "webpage/com/jeecg/empdelholidaywf/empDelholidayWf.js"></script>		
