<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<t:base type="jquery,easyui,tools,DatePicker"></t:base>
<div class="easyui-layout" fit="true">
  <div region="center" style="padding:0px;border:0px">
  <t:datagrid name="empContactInfoList" checkbox="true" fitColumns="false" title="员工合同信息表" actionUrl="empContactInfoController.do?datagrid" idField="id" fit="true" queryMode="group">
   <t:dgCol title="主键"  field="id"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="创建人名称"  field="createName"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="创建人登录名称"  field="createBy"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="创建日期"  field="createDate" formatter="yyyy-MM-dd" hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="更新人名称"  field="updateName"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="更新人登录名称"  field="updateBy"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="更新日期"  field="updateDate" formatter="yyyy-MM-dd" hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="流程状态"  field="bpmStatus"    queryMode="single" dictionary="bpm_status" width="120"></t:dgCol>
   <t:dgCol title="员工编号"  field="empNo"   query="true" queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="员工名称"  field="empName"   query="true" queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="合同类型"  field="contactType"  dictionary="contType" query="true" queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="合同生效日期"  field="startDate" formatter="yyyy-MM-dd"   queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="合同终止日期"  field="endDate" formatter="yyyy-MM-dd"   queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="签订日期"  field="onDate" formatter="yyyy-MM-dd"   queryMode="single"  width="120"></t:dgCol> 
   <t:dgCol title="合同工资类型"  field="contactMoneyType"  dictionary="amttype"   queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="合同工资"  field="contactMoney"    queryMode="single"  width="120"></t:dgCol> 
   <t:dgCol title="操作" field="opt" width="100"></t:dgCol>
   <t:dgDelOpt title="删除" url="empContactInfoController.do?doDel&id={id}" />
   <t:dgToolBar title="新增合同信息" icon="icon-add" url="empContactInfoController.do?goAdd" funname="add"></t:dgToolBar>
   <t:dgToolBar title="编辑合同信息" icon="icon-edit" url="empContactInfoController.do?goUpdate" funname="update"></t:dgToolBar>
   <t:dgToolBar title="批量删除"  icon="icon-remove" url="empContactInfoController.do?doBatchDel" funname="deleteALLSelect"></t:dgToolBar>
   <t:dgToolBar title="查看合同信息" icon="icon-search" url="empContactInfoController.do?goUpdate" funname="detail"></t:dgToolBar>
   <t:dgToolBar title="导入合同信息" icon="icon-put" funname="ImportXls"></t:dgToolBar>
   <t:dgToolBar title="导出合同信息" icon="icon-putout" funname="ExportXls"></t:dgToolBar>
   <t:dgToolBar title="模板下载" icon="icon-putout" funname="ExportXlsByT"></t:dgToolBar>
  </t:datagrid>
  </div>
 </div>
 <script src = "webpage/com/jeecg/empcontactinfo/empContactInfoList.js"></script>		
 <script type="text/javascript">
 $(document).ready(function(){
 		//给时间控件加上样式
 			$("#empContactInfoListtb").find("input[name='createDate']").attr("class","Wdate").click(function(){WdatePicker({dateFmt:'yyyy-MM-dd'});});
 			$("#empContactInfoListtb").find("input[name='updateDate']").attr("class","Wdate").click(function(){WdatePicker({dateFmt:'yyyy-MM-dd'});});
 			$("#empContactInfoListtb").find("input[name='startDate']").attr("class","Wdate").click(function(){WdatePicker({dateFmt:'yyyy-MM-dd'});});
 			$("#empContactInfoListtb").find("input[name='endDate']").attr("class","Wdate").click(function(){WdatePicker({dateFmt:'yyyy-MM-dd'});});
 			$("#empContactInfoListtb").find("input[name='onDate']").attr("class","Wdate").click(function(){WdatePicker({dateFmt:'yyyy-MM-dd'});});
 			$("#empContactInfoListtb").find("input[name='grantDate']").attr("class","Wdate").click(function(){WdatePicker({dateFmt:'yyyy-MM-dd'});});
 			$("#empContactInfoListtb").find("input[name='tryEndDate']").attr("class","Wdate").click(function(){WdatePicker({dateFmt:'yyyy-MM-dd'});});
 });
 
//导入
function ImportXls() {
	openuploadwin('Excel导入', 'empContactInfoController.do?upload', "empContactInfoList");
}

//导出
function ExportXls() {
	JeecgExcelExport("empContactInfoController.do?exportXls","empContactInfoList");
}

//模板下载
function ExportXlsByT() {
	JeecgExcelExport("empContactInfoController.do?exportXlsByT","empContactInfoList");
}
 </script>