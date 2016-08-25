<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<!DOCTYPE html>
<html>
 <head>
  <title>岗位信息表</title>
  <t:base type="jquery,easyui,tools,DatePicker"></t:base>
  <script type="text/javascript">
  //编写自定义JS代码
  </script>
 </head>
 <body>
		<t:formvalid formid="formobj" dialog="true" usePlugin="password" layout="table" action="baseDutyInfoController.do?doUpdate" tiptype="1" >
					<input id="id" name="id" type="hidden" value="${baseDutyInfoPage.id }">
					<input id="createName" name="createName" type="hidden" value="${baseDutyInfoPage.createName }">
					<input id="createBy" name="createBy" type="hidden" value="${baseDutyInfoPage.createBy }">
					<input id="createDate" name="createDate" type="hidden" value="${baseDutyInfoPage.createDate }">
					<input id="updateName" name="updateName" type="hidden" value="${baseDutyInfoPage.updateName }">
					<input id="updateBy" name="updateBy" type="hidden" value="${baseDutyInfoPage.updateBy }">
					<input id="updateDate" name="updateDate" type="hidden" value="${baseDutyInfoPage.updateDate }">
		<table style="width: 600px;" cellpadding="0" cellspacing="1" class="formtable">
					<tr>
						<td align="right">
							<label class="Validform_label">
								岗位编号:
							</label>
						</td>
						<td class="value">
						     	 <input id="dutyNo" name="dutyNo" type="text" style="width: 150px" class="inputxt"  value='${baseDutyInfoPage.dutyNo}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">岗位编号</label>
						</td>
					<tr>
						<td align="right">
							<label class="Validform_label">
								岗位名称:
							</label>
						</td>
						<td class="value">
						     	 <input id="dutyName" name="dutyName" type="text" style="width: 150px" class="inputxt"  value='${baseDutyInfoPage.dutyName}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">岗位名称</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								描述:
							</label>
						</td>
						<td class="value">
						     	 <input id="remark" name="remark" type="text" style="width: 150px" class="inputxt"  value='${baseDutyInfoPage.remark}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">描述</label>
						</td>
					<tr>
						<td align="right">
							<label class="Validform_label">
								岗位工资:
							</label>
						</td>
						<td class="value">
						     	 <input id="gwgz" name="gwgz" type="text" style="width: 150px" class="inputxt"  value='${baseDutyInfoPage.gwgz}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">岗位工资</label>
						</td>
					</tr>
			</table>
		</t:formvalid>
 </body>
  <script src = "webpage/com/jeecg/basedutyinfo/baseDutyInfo.js"></script>		
