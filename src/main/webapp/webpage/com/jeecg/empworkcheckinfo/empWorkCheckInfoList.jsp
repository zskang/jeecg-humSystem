<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<t:base type="jquery,easyui,tools,DatePicker"></t:base>
<div class="easyui-layout" fit="true">
  <div region="center" style="padding:0px;border:0px">
  <t:datagrid name="empWorkCheckInfoList" checkbox="true" fitColumns="false" title="员工考勤记录表" actionUrl="empWorkCheckInfoController.do?datagrid" idField="id" fit="true" queryMode="group">
   <t:dgCol title="主键"  field="id"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="员工编号"  field="empNo"   query="true" queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="员工名称"  field="empName"   query="true" queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="部门"  field="depart"   query="true" queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="日期"  field="date"   query="true" queryMode="group"  width="120"></t:dgCol>
   <t:dgCol title="星期几"  field="week"   query="true" queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="考勤异常类型"  field="errorType"   query="true" queryMode="single" dictionary="work_error" width="120"></t:dgCol>
   <t:dgCol title="异常时间"  field="errDate"   query="true" queryMode="group"  width="120"></t:dgCol>
   <t:dgCol title="考勤扣款"  field="kouMoney"    queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="操作" field="opt" width="100"></t:dgCol>
   <t:dgDelOpt title="删除" url="empWorkCheckInfoController.do?doDel&id={id}" />
   <t:dgToolBar title="录入" icon="icon-add" url="empWorkCheckInfoController.do?goAdd" funname="add"></t:dgToolBar>
   <t:dgToolBar title="编辑" icon="icon-edit" url="empWorkCheckInfoController.do?goUpdate" funname="update"></t:dgToolBar>
   <t:dgToolBar title="批量删除"  icon="icon-remove" url="empWorkCheckInfoController.do?doBatchDel" funname="deleteALLSelect"></t:dgToolBar>
   <t:dgToolBar title="查看" icon="icon-search" url="empWorkCheckInfoController.do?goUpdate" funname="detail"></t:dgToolBar>
   <t:dgToolBar title="导入" icon="icon-put" funname="ImportXls"></t:dgToolBar>
   <t:dgToolBar title="导出" icon="icon-putout" funname="ExportXls"></t:dgToolBar>
   <t:dgToolBar title="模板下载" icon="icon-putout" funname="ExportXlsByT"></t:dgToolBar>
  </t:datagrid>
  </div>
 </div>
 <script src = "webpage/com/jeecg/empworkcheckinfo/empWorkCheckInfoList.js"></script>		
 <script type="text/javascript">
 $(document).ready(function(){
 		//给时间控件加上样式
 });
 
//导入
function ImportXls() {
	openuploadwin('Excel导入', 'empWorkCheckInfoController.do?upload', "empWorkCheckInfoList");
}

//导出
function ExportXls() {
	JeecgExcelExport("empWorkCheckInfoController.do?exportXls","empWorkCheckInfoList");
}

//模板下载
function ExportXlsByT() {
	JeecgExcelExport("empWorkCheckInfoController.do?exportXlsByT","empWorkCheckInfoList");
}
 </script>