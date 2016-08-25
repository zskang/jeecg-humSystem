<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<!DOCTYPE html>
<html>
 <head>
  <title>员工教育培训信息</title>
  <t:base type="jquery,easyui,tools,DatePicker"></t:base>
  <script type="text/javascript">
  //编写自定义JS代码
  </script>
 </head>
 <body>
  <t:formvalid formid="formobj" dialog="true" usePlugin="password" layout="table" action="empEducatInfoController.do?doAdd" tiptype="1" >
					<input id="id" name="id" type="hidden" value="${empEducatInfoPage.id }">
					<input id="createName" name="createName" type="hidden" value="${empEducatInfoPage.createName }">
					<input id="createDate" name="createDate" type="hidden" value="${empEducatInfoPage.createDate }">
		<table style="width: 600px;" cellpadding="0" cellspacing="1" class="formtable">
				<tr>
				<td align="right"><label class="Validform_label"> 员工名称：
				</label></td>
				<td class="value" colspan="3"><input name="empNo" type="hidden"
					class="inputxt" id="empNo" datatype="*"> <input type="text"
					name="empName" class="inputxt" id="empName" readonly="readonly"
					datatype="*" /> <t:choose hiddenName="empNo" hiddenid="empNo"
						url="empBaseInfoController.do?lists" name="empBaseInfoList"
						height="400px" width="1000px" icon="icon-search" title="员工列表"
						textname="empName" isclear="true" isInit="true"></t:choose> <span
					class="Validform_checktip"></span></td>
			</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							入学日期:
						</label>
					</td>
					<td class="value">
							   <input id="startDate" name="startDate" type="text" style="width: 150px" 
					      						class="Wdate" onClick="WdatePicker()"
>    
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">入学日期</label>
						</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							毕业日期:
						</label>
					</td>
					<td class="value">
							   <input id="endDate" name="endDate" type="text" style="width: 150px" 
					      						class="Wdate" onClick="WdatePicker()"
>    
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">毕业日期</label>
						</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							学校或培训名称:
						</label>
					</td>
					<td class="value">
					     	 <input id="schoolName" name="schoolName" type="text" style="width: 150px" class="inputxt" >
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">学校或培训名称</label>
						</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							地址:
						</label>
					</td>
					<td class="value">
						  	 <textarea style="width:600px;" class="inputxt" rows="6" id="address" name="address"></textarea>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">地址</label>
						</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							专业:
						</label>
					</td>
					<td class="value">
					     	 <input id="profess" name="profess" type="text" style="width: 150px" class="inputxt" >
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">专业</label>
						</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							学历:
						</label>
					</td>
					<td class="value">
							  <t:dictSelect field="educat" type="list"
									typeGroupCode="edu" defaultVal="${empEducatInfoPage.educat}" hasLabel="false"  title="学历"></t:dictSelect>     
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">学历</label>
						</td>
				</tr>
			</table>
		</t:formvalid>
 </body>
  <script src = "webpage/com/jeecg/empeducatinfo/empEducatInfo.js"></script>		
