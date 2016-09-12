<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<!DOCTYPE html>
<html>
 <head>
  <title>员工考勤记录表</title>
  <t:base type="jquery,easyui,tools,DatePicker"></t:base>
  <script type="text/javascript">
  //编写自定义JS代码
  </script>
 </head>
 <body>
  <t:formvalid formid="formobj" dialog="true" usePlugin="password" layout="table" action="empWorkCheckInfoController.do?doAdd" tiptype="1" >
					<input id="id" name="id" type="hidden" value="${empWorkCheckInfoPage.id }">
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
							部门:
						</label>
					</td>
					<td class="value">
					     	 <input id="depart" name="depart" type="text" style="width: 150px" class="inputxt" >
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">部门</label>
						</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							日期:
						</label>
					</td>
					<td class="value">
					     	 <input id="date" name="date" type="text" style="width: 150px" class="inputxt" >
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">日期</label>
						</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							星期几:
						</label>
					</td>
					<td class="value">
					     	 <input id="week" name="week" type="text" style="width: 150px" class="inputxt" >
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">星期几</label>
						</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							考勤异常类型:
						</label>
					</td>
					<td class="value">
					     	 <input id="errorType" name="errorType" type="text" style="width: 150px" class="inputxt" >
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">考勤异常类型</label>
						</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							异常时间:
						</label>
					</td>
					<td class="value">
					     	 <input id="errDate" name="errDate" type="text" style="width: 150px" class="inputxt" >
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">异常时间</label>
						</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							考勤扣款:
						</label>
					</td>
					<td class="value">
					     	 <input id="kouMoney" name="kouMoney" type="text" style="width: 150px" class="inputxt" >
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">考勤扣款</label>
						</td>
				</tr>
			</table>
		</t:formvalid>
 </body>
  <script src = "webpage/com/jeecg/empworkcheckinfo/empWorkCheckInfo.js"></script>		
