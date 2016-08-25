<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<!DOCTYPE html>
<html>
 <head>
  <title>学科信息表</title>
  <t:base type="jquery,easyui,tools,DatePicker"></t:base>
  <script type="text/javascript">
  //编写自定义JS代码
  </script>
 </head>
 <body>
		<t:formvalid formid="formobj" dialog="true" usePlugin="password" layout="table" action="empSubjectInfoController.do?doUpdate" tiptype="1" >
					<input id="id" name="id" type="hidden" value="${empSubjectInfoPage.id }">
					<input id="createName" name="createName" type="hidden" value="${empSubjectInfoPage.createName }">
					<input id="createDate" name="createDate" type="hidden" value="${empSubjectInfoPage.createDate }">
					<input id="updateDate" name="updateDate" type="hidden" value="${empSubjectInfoPage.updateDate }">
					<input id="updateName" name="updateName" type="hidden" value="${empSubjectInfoPage.updateName }">
		<table style="width: 600px;" cellpadding="0" cellspacing="1" class="formtable">
					<tr>
						<td align="right">
							<label class="Validform_label">
								学科编号:
							</label>
						</td>
						<td class="value">
						     	 <input id="subjectId" name="subjectId" type="text" style="width: 150px" class="inputxt"  value='${empSubjectInfoPage.subjectId}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">学科编号</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								学科名称:
							</label>
						</td>
						<td class="value">
						     	 <input id="subjectName" name="subjectName" type="text" style="width: 150px" class="inputxt"  value='${empSubjectInfoPage.subjectName}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">学科名称</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								父类id:
							</label>
						</td>
						<td class="value">
						     	 <input id="parentId" name="parentId" type="text" style="width: 150px" class="inputxt"  value='${empSubjectInfoPage.parentId}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">父类id</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								负责人id:
							</label>
						</td>
						<td class="value">
						     	 <input id="adminId" name="adminId" type="text" style="width: 150px" class="inputxt"  value='${empSubjectInfoPage.adminId}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">负责人id</label>
						</td>
					</tr>
			</table>
		</t:formvalid>
 </body>
  <script src = "webpage/com/jeecg/empsubjectinfo/empSubjectInfo.js"></script>		
