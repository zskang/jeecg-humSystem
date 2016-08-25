<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<t:base type="jquery,easyui,tools,DatePicker"></t:base>
<div class="easyui-layout" fit="true">
  <div region="center" style="padding:0px;border:0px">
  <t:datagrid name="empPaymentInfoList" title="员工薪酬纪录表" actionUrl="empPaymentInfoController.do?datagrid" idField="id" fit="true">
   <t:dgCol title="编号" field="id" hidden="true"></t:dgCol>
   <t:dgCol title="员工编号" field="empNo"   width="120"></t:dgCol>
   <t:dgCol title="月份" field="payDate"   width="120"></t:dgCol>
   <t:dgCol title="标准工资" field="standardPay"   width="120"></t:dgCol>
   <t:dgCol title="基本工资" field="basePay"   width="120"></t:dgCol>
   <t:dgCol title="岗位工资" field="dutyPay"   width="120"></t:dgCol>
   <t:dgCol title="级别工资" field="gradePay"   width="120"></t:dgCol> 
   <t:dgCol title="操作" field="opt" width="100"></t:dgCol>
   <t:dgDelOpt title="删除" url="empPaymentInfoController.do?del&id={id}" />
   <t:dgToolBar title="录入员工薪酬" icon="icon-add" url="empPaymentInfoController.do?addorupdate" funname="add"  ></t:dgToolBar>
   <t:dgToolBar title="编辑员工薪酬" icon="icon-edit" url="empPaymentInfoController.do?addorupdate" funname="update"  ></t:dgToolBar>
   <t:dgToolBar title="查看员工薪酬" icon="icon-search" url="empPaymentInfoController.do?addorupdate" funname="detail"  ></t:dgToolBar>
  </t:datagrid>
  </div>
 </div>