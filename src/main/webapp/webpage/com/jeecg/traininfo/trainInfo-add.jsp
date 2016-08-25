<%@ page language="java" import="java.util.*"
	contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<!DOCTYPE html>
<html>
<head>
<title>员工培训信息表</title>
<t:base type="jquery,easyui,tools,DatePicker"></t:base>
<script type="text/javascript">
	//编写自定义JS代码
</script>
</head>
<body>
	<t:formvalid formid="formobj" dialog="true" usePlugin="password"
		layout="table" action="trainInfoController.do?doAdd" tiptype="1">
		<input id="id" name="id" type="hidden" value="${trainInfoPage.id }">
		<input id="createName" name="createName" type="hidden"
			value="${trainInfoPage.createName }">
		<input id="createDate" name="createDate" type="hidden"
			value="${trainInfoPage.createDate }">
		<table style="width: 600px;" cellpadding="0" cellspacing="1"
			class="formtable">
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
		<!-- 	<tr>
				<td align="right"><label class="Validform_label"> 员工编号:
				</label></td>
				<td class="value"><input id="empNo" name="empNo" type="text"
					style="width: 150px" class="inputxt" datatype="*"> <span
					class="Validform_checktip"></span> <label class="Validform_label"
					style="display: none;">员工编号</label></td>
				<td align="right"><label class="Validform_label"> 员工名称:
				</label></td>
				<td class="value"><input id="empName" name="empName"
					type="text" style="width: 150px" class="inputxt" datatype="*">
					<span class="Validform_checktip"></span> <label
					class="Validform_label" style="display: none;">员工名称</label></td>
			</tr> -->
			<tr>
				<td align="right"><label class="Validform_label">
						培训开始时间: </label></td>
				<td class="value"><input id="trainStartDate"
					name="trainStartDate" type="text" style="width: 150px"
					class="Wdate"
					onClick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss'})" datatype="*">
					<span class="Validform_checktip"></span> <label
					class="Validform_label" style="display: none;">培训开始时间</label></td>
				<td align="right"><label class="Validform_label">
						培训结束时间: </label></td>
				<td class="value"><input id="trainEndDate" name="trainEndDate"
					type="text" style="width: 150px" class="Wdate"
					onClick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss'})" datatype="*">
					<span class="Validform_checktip"></span> <label
					class="Validform_label" style="display: none;">培训结束时间</label></td>
			</tr>

			<tr>
				<td align="right"><label class="Validform_label"> 培训类型:
				</label></td>
				<td class="value" colspan="3"><t:dictSelect field="trainType"
						type="list" typeGroupCode="TrainType"
						defaultVal="${trainInfoPage.trainType}" hasLabel="false"
						title="培训类型"></t:dictSelect> <span class="Validform_checktip"></span>
					<label class="Validform_label" style="display: none;">培训类型</label>
				</td>

			</tr>
			<tr>
				<td align="right"><label class="Validform_label">
						培训人编号: </label></td>
				<td class="value"><input id="trainTeacherId"
					name="trainTeacherId" type="text" style="width: 150px"
					class="inputxt" datatype="*"> <span
					class="Validform_checktip"></span> <label class="Validform_label"
					style="display: none;">培训人编号</label></td>

				<td align="right"><label class="Validform_label">
						培训人名称: </label></td>
				<td class="value"><input id="trainTeacherName"
					name="trainTeacherName" type="text" style="width: 150px"
					class="inputxt" datatype="*"> <span
					class="Validform_checktip"></span> <label class="Validform_label"
					style="display: none;">培训人名称</label></td>
			</tr>

			<tr>
				<td align="right"><label class="Validform_label"> 培训课题:
				</label></td>
				<td class="value" colspan="3"><textarea style="width: 300px;"
						class="inputxt" rows="6" id="trainSubject" name="trainSubject"></textarea>
					<span class="Validform_checktip"></span> <label
					class="Validform_label" style="display: none;">培训课题</label></td>

			</tr>
			<tr>
				<td align="right"><label class="Validform_label">
						培训内容描述: </label></td>
				<td class="value" colspan="3"><textarea style="width: 300px;"
						class="inputxt" rows="6" id="trainDesc" name="trainDesc"></textarea>
					<span class="Validform_checktip"></span> <label
					class="Validform_label" style="display: none;">培训内容描述</label></td>
			</tr>
			<tr>
				<td align="right"><label class="Validform_label"> 是否合格:
				</label></td>
				<td class="value" colspan="3"><t:dictSelect field="trainResult"
						type="list" typeGroupCode="sf_yn"
						defaultVal="${trainInfoPage.trainResult}" hasLabel="false"
						title="是否合格"></t:dictSelect> <span class="Validform_checktip"></span>
					<label class="Validform_label" style="display: none;">是否合格</label>
				</td>
			</tr>
			<tr>
				<td align="right"><label class="Validform_label">
						培训结果描述: </label></td>
				<td class="value" colspan="3"><textarea style="width: 300px;"
						class="inputxt" rows="6" id="trainResultDesc"
						name="trainResultDesc"></textarea> <span
					class="Validform_checktip"></span> <label class="Validform_label"
					style="display: none;">培训结果描述</label></td>
			</tr>
		</table>
	</t:formvalid>
</body>
<script src="webpage/com/jeecg/traininfo/trainInfo.js"></script>