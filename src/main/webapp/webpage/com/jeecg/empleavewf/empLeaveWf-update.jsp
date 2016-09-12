<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<!DOCTYPE html>
<html>
 <head>
  <title>员工请假流程表</title>
  <t:base type="jquery,easyui,tools,DatePicker"></t:base>
  <script type="text/javascript">
  //编写自定义JS代码
  </script>
 </head>
 <body>
		<t:formvalid formid="formobj" dialog="true" usePlugin="password" layout="table" action="empLeaveWfController.do?doUpdate" tiptype="1" >
					<input id="id" name="id" type="hidden" value="${empLeaveWfPage.id }">
					<input id="createName" name="createName" type="hidden" value="${empLeaveWfPage.createName }">
					<input id="createBy" name="createBy" type="hidden" value="${empLeaveWfPage.createBy }">
					<input id="createDate" name="createDate" type="hidden" value="${empLeaveWfPage.createDate }">
					<input id="updateName" name="updateName" type="hidden" value="${empLeaveWfPage.updateName }">
					<input id="updateBy" name="updateBy" type="hidden" value="${empLeaveWfPage.updateBy }">
					<input id="updateDate" name="updateDate" type="hidden" value="${empLeaveWfPage.updateDate }">
					<input id="sysOrgCode" name="sysOrgCode" type="hidden" value="${empLeaveWfPage.sysOrgCode }">
					<input id="sysCompanyCode" name="sysCompanyCode" type="hidden" value="${empLeaveWfPage.sysCompanyCode }">
					<input id="bpmStatus" name="bpmStatus" type="hidden" value="${empLeaveWfPage.bpmStatus }">
		<table style="width: 600px;" cellpadding="0" cellspacing="1" class="formtable">
					<tr>
						<td align="right">
							<label class="Validform_label">
								请假类别:
							</label>
						</td>
						<td class="value">
									<t:dictSelect field="leaveType" type="list"
										typeGroupCode="leave_type" defaultVal="${empLeaveWfPage.leaveType}" hasLabel="false"  title="请假类别"></t:dictSelect>     
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">请假类别</label>
						</td>
					<tr>
						<td align="right">
							<label class="Validform_label">
								请假天数:
							</label>
						</td>
						<td class="value">
						     	 <input id="leaveDays" name="leaveDays" type="text" style="width: 150px" class="inputxt"  value='${empLeaveWfPage.leaveDays}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">请假天数</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								请假事由:
							</label>
						</td>
						<td class="value">
									<script type="text/javascript"  charset="utf-8" src="plug-in/ueditor/ueditor.config.js"></script>
									<script type="text/javascript"  charset="utf-8" src="plug-in/ueditor/ueditor.all.min.js"></script>
							    	<textarea name="reasons" id="reasons" style="width: 650px;height:300px"></textarea>
								    <script type="text/javascript">
								        var editor = UE.getEditor('reasons');
								    </script>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">请假事由</label>
						</td>
					<tr>
						<td align="right">
							<label class="Validform_label">
								请假起始日期:
							</label>
						</td>
						<td class="value">
									  <input id="startDate" name="startDate" type="text" style="width: 150px" class="Wdate" onClick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss'})" value='<fmt:formatDate value='${empLeaveWfPage.startDate}' type="date" pattern="yyyy-MM-dd hh:mm:ss"/>'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">请假起始日期</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								请假结束日期:
							</label>
						</td>
						<td class="value">
									  <input id="endDate" name="endDate" type="text" style="width: 150px" class="Wdate" onClick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss'})" value='<fmt:formatDate value='${empLeaveWfPage.endDate}' type="date" pattern="yyyy-MM-dd hh:mm:ss"/>'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">请假结束日期</label>
						</td>
					<tr>
						<td align="right">
							<label class="Validform_label">
								申请人编号:
							</label>
						</td>
						<td class="value">
						     	 <input id="empNo" name="empNo" type="text" style="width: 150px" class="inputxt"  value='${empLeaveWfPage.empNo}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">申请人编号</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								申请人名称:
							</label>
						</td>
						<td class="value">
						     	 <input id="empName" name="empName" type="text" style="width: 150px" class="inputxt"  value='${empLeaveWfPage.empName}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">申请人名称</label>
						</td>
				<td align="right">
					<label class="Validform_label">
					</label>
				</td>
				<td class="value">
				</td>
					</tr>
			</table>
		</t:formvalid>
 </body>
  <script src = "webpage/com/jeecg/empleavewf/empLeaveWf.js"></script>		
