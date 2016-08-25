<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<t:base type="jquery,easyui,tools,DatePicker"></t:base>
<div class="easyui-layout" fit="true">
  <div region="center" style="padding:0px;border:0px">
  <t:datagrid name="empEducatInfoList" checkbox="true" fitColumns="false" title="员工教育培训信息" actionUrl="empEducatInfoController.do?datagrid" idField="id" fit="true" queryMode="group">
   <t:dgCol title="主键"  field="id"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="创建人名称"  field="createName"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="创建日期"  field="createDate" formatter="yyyy-MM-dd" hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="员工编号"  field="empNo"    queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="入学日期"  field="startDate" formatter="yyyy-MM-dd"   queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="毕业日期"  field="endDate" formatter="yyyy-MM-dd"   queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="学校或培训名称"  field="schoolName"    queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="地址"  field="address"    queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="专业"  field="profess"    queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="学历"  field="educat"    queryMode="single" dictionary="edu" width="120"></t:dgCol>
   <t:dgCol title="操作" field="opt" width="100"></t:dgCol>
   <t:dgDelOpt title="删除" url="empEducatInfoController.do?doDel&id={id}" />
   <t:dgToolBar title="录入" icon="icon-add" url="empEducatInfoController.do?goAdd" funname="add"></t:dgToolBar>
   <t:dgToolBar title="编辑" icon="icon-edit" url="empEducatInfoController.do?goUpdate" funname="update"></t:dgToolBar>
   <t:dgToolBar title="批量删除"  icon="icon-remove" url="empEducatInfoController.do?doBatchDel" funname="deleteALLSelect"></t:dgToolBar>
   <t:dgToolBar title="查看" icon="icon-search" url="empEducatInfoController.do?goUpdate" funname="detail"></t:dgToolBar>  
  </t:datagrid>
  </div>
 </div>
 <script src = "webpage/com/jeecg/empeducatinfo/empEducatInfoList.js"></script>		
 <script type="text/javascript">
 $(document).ready(function(){
 		//给时间控件加上样式
 			$("#empEducatInfoListtb").find("input[name='createDate']").attr("class","Wdate").click(function(){WdatePicker({dateFmt:'yyyy-MM-dd'});});
 			$("#empEducatInfoListtb").find("input[name='startDate']").attr("class","Wdate").click(function(){WdatePicker({dateFmt:'yyyy-MM-dd'});});
 			$("#empEducatInfoListtb").find("input[name='endDate']").attr("class","Wdate").click(function(){WdatePicker({dateFmt:'yyyy-MM-dd'});});
 }); 
 </script>