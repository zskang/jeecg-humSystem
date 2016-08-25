<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<!DOCTYPE html>
<html>
 <head>
  <title>人事调动信息表</title>
  <t:base type="jquery,easyui,tools,DatePicker"></t:base>
  <script type="text/javascript">
  //编写自定义JS代码
  </script>
 </head>
 <body>
		<t:formvalid formid="formobj" dialog="true" usePlugin="password" layout="table" action="empPositonChangeInfoController.do?doUpdate" tiptype="1" >
					<input id="id" name="id" type="hidden" value="${empPositonChangeInfoPage.id }">
					<input id="createName" name="createName" type="hidden" value="${empPositonChangeInfoPage.createName }">
					<input id="createDate" name="createDate" type="hidden" value="${empPositonChangeInfoPage.createDate }">
					<input id="updateName" name="updateName" type="hidden" value="${empPositonChangeInfoPage.updateName }">
					<input id="updateDate" name="updateDate" type="hidden" value="${empPositonChangeInfoPage.updateDate }">
		<table style="width: 600px;" cellpadding="0" cellspacing="1" class="formtable">
					<tr>
						<td align="right">
							<label class="Validform_label">
								调动编号:
							</label>
						</td>
						<td class="value">
						     	 <input id="moveNo" name="moveNo" type="text" style="width: 150px" class="inputxt" datatype="*" value='${empPositonChangeInfoPage.moveNo}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">调动编号</label>
						</td>
					<tr>
						<td align="right">
							<label class="Validform_label">
								员工编号:
							</label>
						</td>
						<td class="value">
						<input id="empNo" name="empNo" type="text" style="width: 150px" class="searchbox-inputtext" datatype="*" value='${empPositonChangeInfoPage.empNo}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">员工编号</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								原职务编号:
							</label>
						</td>
						<td class="value">
						     	 <input id="oldPositionNo" name="oldPositionNo" type="text" style="width: 150px" class="inputxt"  value='${empPositonChangeInfoPage.oldPositionNo}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">原职务编号</label>
						</td>
					<tr>
						<td align="right">
							<label class="Validform_label">
								新职务编号:
							</label>
						</td>
						<td class="value">
						<input id="newPositionNo" name="newPositionNo" type="text" style="width: 150px" class="searchbox-inputtext"  value='${empPositonChangeInfoPage.newPositionNo}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">新职务编号</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								原职务名称:
							</label>
						</td>
						<td class="value">
						     	 <input id="oldPositionName" name="oldPositionName" type="text" style="width: 150px" class="inputxt"  value='${empPositonChangeInfoPage.oldPositionName}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">原职务名称</label>
						</td>
					<tr>
						<td align="right">
							<label class="Validform_label">
								新职务名称:
							</label>
						</td>
						<td class="value">
						     	 <input id="newPositionName" name="newPositionName" type="text" style="width: 150px" class="inputxt"  value='${empPositonChangeInfoPage.newPositionName}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">新职务名称</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								调动时间:
							</label>
						</td>
						<td class="value">
						     	 <input id="changeDate" name="changeDate" type="text" style="width: 150px" class="inputxt" datatype="*" value='${empPositonChangeInfoPage.changeDate}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">调动时间</label>
						</td>
					<tr>
						<td align="right">
							<label class="Validform_label">
								调动原因:
							</label>
						</td>
						<td class="value">
						  	 	<textarea id="changeReason" style="width:600px;" class="inputxt" rows="6" name="changeReason">${empPositonChangeInfoPage.changeReason}</textarea>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">调动原因</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								备注:
							</label>
						</td>
						<td class="value">
						     	 <input id="remark" name="remark" type="text" style="width: 150px" class="inputxt"  value='${empPositonChangeInfoPage.remark}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">备注</label>
						</td>
					<tr>
						<td align="right">
							<label class="Validform_label">
								员工名称:
							</label>
						</td>
						<td class="value">
						     	 <input id="empName" name="empName" type="text" style="width: 150px" class="inputxt"  value='${empPositonChangeInfoPage.empName}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">员工名称</label>
						</td>
					</tr>
			</table>
		</t:formvalid>
 </body>
  <script src = "webpage/com/jeecg/emppositonchangeinfo/empPositonChangeInfo.js"></script>		
