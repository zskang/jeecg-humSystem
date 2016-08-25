<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<t:base type="jquery,easyui,tools,DatePicker"></t:base>
<div class="easyui-layout" fit="true">
  <div region="center" style="padding:0px;border:0px">
  <t:datagrid name="trainInfoList" checkbox="true" fitColumns="false" title="员工培训信息表" actionUrl="trainInfoController.do?datagrid" idField="id" fit="true" queryMode="group">
   <t:dgCol title="主键"  field="id"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="创建人名称"  field="createName"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="创建日期"  field="createDate" formatter="yyyy-MM-dd" hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="培训开始时间"  field="trainStartDate" formatter="yyyy-MM-dd hh:mm:ss"  query="true" queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="培训结束时间"  field="trainEndDate" formatter="yyyy-MM-dd hh:mm:ss"  query="true" queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="员工编号"  field="empNo"   query="true" queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="员工名称"  field="empName"   query="true" queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="培训类型"  field="trainType"   query="true" queryMode="single" dictionary="TrainType" width="120"></t:dgCol>
   <t:dgCol title="培训内容描述"  field="trainDesc"  hidden="true"  queryMode="single"  width="300"></t:dgCol>
   <t:dgCol title="培训结果描述"  field="trainResultDesc"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="培训人名称"  field="trainTeacherName"   query="true" queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="培训人编号"  field="trainTeacherId"   query="true" queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="培训课题"  field="trainSubject"   query="true" queryMode="single"  width="300"></t:dgCol>
   <t:dgCol title="是否合格"  field="trainResult"   query="true" queryMode="single" dictionary="sf_yn" width="120"></t:dgCol>
   <t:dgCol title="操作" field="opt" width="100"></t:dgCol>
   <t:dgDelOpt title="删除" url="trainInfoController.do?doDel&id={id}" />
   <t:dgToolBar title="录入" icon="icon-add" url="trainInfoController.do?goAdd" funname="add"></t:dgToolBar>
   <t:dgToolBar title="编辑" icon="icon-edit" url="trainInfoController.do?goUpdate" funname="update"></t:dgToolBar>
   <t:dgToolBar title="批量删除"  icon="icon-remove" url="trainInfoController.do?doBatchDel" funname="deleteALLSelect"></t:dgToolBar>
   <t:dgToolBar title="查看" icon="icon-search" url="trainInfoController.do?goUpdate" funname="detail"></t:dgToolBar>
   <t:dgToolBar title="导入" icon="icon-put" funname="ImportXls"></t:dgToolBar>
   <t:dgToolBar title="导出" icon="icon-putout" funname="ExportXls"></t:dgToolBar>
   <t:dgToolBar title="模板下载" icon="icon-putout" funname="ExportXlsByT"></t:dgToolBar>
  </t:datagrid>
  </div>
 </div>
 <script src = "webpage/com/jeecg/traininfo/trainInfoList.js"></script>		
 <script type="text/javascript">
 $(document).ready(function(){
 		//给时间控件加上样式
 			$("#trainInfoListtb").find("input[name='createDate']").attr("class","Wdate").click(function(){WdatePicker({dateFmt:'yyyy-MM-dd'});});
 			$("#trainInfoListtb").find("input[name='trainStartDate']").attr("class","Wdate").click(function(){WdatePicker({dateFmt:'yyyy-MM-dd'});});
 			$("#trainInfoListtb").find("input[name='trainEndDate']").attr("class","Wdate").click(function(){WdatePicker({dateFmt:'yyyy-MM-dd'});});
 });
 
//导入
function ImportXls() {
	openuploadwin('Excel导入', 'trainInfoController.do?upload', "trainInfoList");
}

//导出
function ExportXls() {
	JeecgExcelExport("trainInfoController.do?exportXls","trainInfoList");
}

//模板下载
function ExportXlsByT() {
	JeecgExcelExport("trainInfoController.do?exportXlsByT","trainInfoList");
}
 </script>