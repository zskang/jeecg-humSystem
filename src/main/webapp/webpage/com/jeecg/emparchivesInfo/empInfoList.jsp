<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<t:base type="jquery,easyui,tools,DatePicker"></t:base>
<div class="easyui-layout" fit="true">
  <div region="center" style="padding:0px;border:0px">
  <t:datagrid name="empBaseInfoList" checkbox="true" fitColumns="false" title="员工基本信息表" actionUrl="empBaseInfoController.do?datagrid" idField="id" fit="true" queryMode="group">
   <t:dgCol title="员工名称"  field="empName"   query="true" queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="员工编号"  field="empNo"   query="true" queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="所属部门"  field="sysOrgCode"   query="true" queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="职务等级"  field="postion"   query="true" queryMode="single" dictionary="postion" width="120"></t:dgCol>
   <t:dgCol title="性别"  field="sex"   query="true" queryMode="single" dictionary="sex" width="120"></t:dgCol>
   <t:dgCol title="婚姻状况"  field="marry"   query="true" queryMode="single" dictionary="marry" width="120"></t:dgCol>
   <t:dgCol title="出生日期"  field="brthdate" formatter="yyyy-MM-dd"   queryMode="single"  width="120"></t:dgCol> 
   <t:dgToolBar title="查看" icon="icon-search" url="empArchivesInfoController.do?goUpdate" funname="detail" height="600" width="810"></t:dgToolBar> 
   <t:dgToolBar title="录入员工教育培训信息" icon="icon-edit" url="empArchivesInfoController.do?toAddEducatInfo&empNo={empNo}" funname="toAddEducatInfo"  operationCode="edit"></t:dgToolBar>
   <t:dgToolBar title="录入员工工作经历信息" icon="icon-edit" url="empArchivesInfoController.do?toAddWorkedInfo&empNo={empNo}" funname="toAddWorkedInfo"  operationCode="edit"></t:dgToolBar>
   <t:dgToolBar title="录入员工任职信息" icon="icon-edit" url="empArchivesInfoController.do?toAddTakeOfficeInfo&empNo={empNo}" funname="toAddTakeOfficeInfo"  operationCode="edit"></t:dgToolBar>
   <t:dgToolBar title="录入员工其他信息" icon="icon-edit" url="empArchivesInfoController.do?toAddOtherInfo&empNo={empNo}" funname="toAddOtherInfo"  operationCode="edit"></t:dgToolBar>
   <t:dgCol title="主键"  field="id"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="创建人名称"  field="createName"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="创建日期"  field="createDate" formatter="yyyy-MM-dd" hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="更新人名称"  field="updateName"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="更新日期"  field="updateDate" formatter="yyyy-MM-dd" hidden="true"  queryMode="single"  width="120"></t:dgCol>
  </t:datagrid>
  </div>
 </div>
 <script src = "webpage/com/jeecg/empbaseinfo/empBaseInfoList.js"></script>		
 <script type="text/javascript">
 $(document).ready(function(){
 		//给时间控件加上样式
 			$("#empBaseInfoListtb").find("input[name='createDate']").attr("class","Wdate").click(function(){WdatePicker({dateFmt:'yyyy-MM-dd'});});
 			$("#empBaseInfoListtb").find("input[name='updateDate']").attr("class","Wdate").click(function(){WdatePicker({dateFmt:'yyyy-MM-dd'});});
 			$("#empBaseInfoListtb").find("input[name='brthdate']").attr("class","Wdate").click(function(){WdatePicker({dateFmt:'yyyy-MM-dd'});});
 });

 
//录入员工教育培训信息 
function toAddEducatInfo(title,url){
	 	alert("aaaaaa");
	window.location.href='${webRoot}/'+url
}

//录入员工工作经历信息 
function toAddOtherInfo(title,url){
	 	alert("aaaaaa");
	window.location.href='${webRoot}/'+url
}

//录入员工任职信息
function toAddTakeOfficeInfo(title,url){
	 	alert("aaaaaa");
	window.location.href='${webRoot}/'+url
}
//录入员工其他信息
function toAddEducatInfo(title,url){
	 	alert("aaaaaa");
	window.location.href='${webRoot}/'+url
}

 </script>