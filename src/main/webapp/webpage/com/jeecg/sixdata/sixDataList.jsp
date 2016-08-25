<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<t:base type="jquery,easyui,tools,DatePicker"></t:base>
<div class="easyui-layout" fit="true">
  <div region="center" style="padding:0px;border:0px">
  <t:datagrid name="sixDataList" title="六项学科数据信息表" actionUrl="sixDataController.do?datagrid" idField="id" fit="true">
   <t:dgCol title="编号" field="id" hidden="true"></t:dgCol>
   <t:dgCol title="表名" field="dataTitle"   width="120"></t:dgCol>
   <t:dgCol title="年份" field="year"   width="120"></t:dgCol>
   <t:dgCol title="学科类型" field="subjectType"   width="120"></t:dgCol>
   <t:dgCol title="所在部门" field="sysOrgCode"   width="120" hidden="true"></t:dgCol> 
   <t:dgCol title="操作" field="opt" width="100"></t:dgCol>
   <t:dgDelOpt title="删除" url="sixDataController.do?del&id={id}" /> 
   <t:dgToolBar title="录入" icon="icon-add" url="sixDataController.do?addorupdate"  funname="add"></t:dgToolBar>
   <t:dgToolBar title="管理学科六项基础数据" icon="icon-edit" url="sixDataController.do?addorupdatedata" funname="update" height="100%" width="100%"></t:dgToolBar>
  </t:datagrid>
  </div>
 </div> 