<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<t:base type="jquery,easyui,tools,DatePicker"></t:base>
<div class="easyui-layout" fit="true">
  <div region="center" style="padding:0px;border:0px">
  <t:datagrid name="empPositonChangeInfoList" checkbox="true" fitColumns="false" title="人事调动信息表" actionUrl="empPositonChangeInfoController.do?datagrid" idField="id" fit="true" queryMode="group">
   <t:dgCol title="主键"  field="id"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="创建人名称"  field="createName"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="创建日期"  field="createDate" formatter="yyyy-MM-dd" hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="更新人名称"  field="updateName"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="更新日期"  field="updateDate" formatter="yyyy-MM-dd" hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="调动编号"  field="moveNo"    queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="员工名称"  field="empName"    queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="员工编号"  field="empNo"   query="true" queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="原职务编号"  field="oldPositionNo"    queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="新职务编号"  field="newPositionNo"    queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="原职务名称"  field="oldPositionName"   query="true" queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="新职务名称"  field="newPositionName"   query="true" queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="调动时间"  field="changeDate"   query="true" queryMode="group"  width="120"></t:dgCol>
   <t:dgCol title="调动原因"  field="changeReason"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="备注"  field="remark"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="操作" field="opt" width="100"></t:dgCol>
   <t:dgDelOpt title="删除" url="empPositonChangeInfoController.do?doDel&id={id}" />
   <t:dgToolBar title="录入" icon="icon-add" url="empPositonChangeInfoController.do?goAdd" funname="add"></t:dgToolBar>
   <t:dgToolBar title="编辑" icon="icon-edit" url="empPositonChangeInfoController.do?goUpdate" funname="update"></t:dgToolBar>
   <t:dgToolBar title="批量删除"  icon="icon-remove" url="empPositonChangeInfoController.do?doBatchDel" funname="deleteALLSelect"></t:dgToolBar>
   <t:dgToolBar title="查看" icon="icon-search" url="empPositonChangeInfoController.do?goUpdate" funname="detail"></t:dgToolBar>
 
  </t:datagrid>
  </div>
 </div>
 <script src = "webpage/com/jeecg/emppositonchangeinfo/empPositonChangeInfoList.js"></script>		
 <script type="text/javascript">
 $(document).ready(function(){
 		//给时间控件加上样式
 			$("#empPositonChangeInfoListtb").find("input[name='createDate']").attr("class","Wdate").click(function(){WdatePicker({dateFmt:'yyyy-MM-dd'});});
 			$("#empPositonChangeInfoListtb").find("input[name='updateDate']").attr("class","Wdate").click(function(){WdatePicker({dateFmt:'yyyy-MM-dd'});});
 });
 
//导入
function ImportXls() {
	openuploadwin('Excel导入', 'empPositonChangeInfoController.do?upload', "empPositonChangeInfoList");
}

//导出
function ExportXls() {
	JeecgExcelExport("empPositonChangeInfoController.do?exportXls","empPositonChangeInfoList");
}

//模板下载
function ExportXlsByT() {
	JeecgExcelExport("empPositonChangeInfoController.do?exportXlsByT","empPositonChangeInfoList");
}
 </script>