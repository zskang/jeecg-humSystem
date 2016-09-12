<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<t:base type="jquery,easyui,tools,DatePicker"></t:base>
<div class="easyui-layout" fit="true">
  <div region="center" style="padding:0px;border:0px">
  <t:datagrid name="jformResumeInfoList" checkbox="true" onLoadSuccess="initCheck"
      fitColumns="false" title="员工信息表" actionUrl="jformResumeInfoController.do?datagrid"
       idField="id" fit="true" queryMode="group">
   <t:dgCol title="员工编号"  field="empNo"    queryMode="single"  width="120" query="true"></t:dgCol>
   <t:dgCol title="姓名"  field="name"    queryMode="single"  width="120" query="true"></t:dgCol>
   <t:dgCol title="性别"  field="sex"    queryMode="single" dictionary="sex" width="120" query="true"></t:dgCol>
   <t:dgCol title="出生年月"  field="birthday" formatter="yyyy-MM-dd"   queryMode="group"  width="120"  query="true"></t:dgCol>
   <t:dgCol title="电子邮箱"  field="email"    queryMode="single"  width="120" query="true"></t:dgCol>
   <t:dgCol title="最高学历"  field="degree"    queryMode="group"  width="120"></t:dgCol>
   <t:dgCol title="工作年限"  field="workyear"    queryMode="group"  width="120"></t:dgCol>
   <t:dgCol title="身份证号"  field="cardid"    queryMode="single"  width="120" query="true"></t:dgCol>  
   <t:dgCol title="id"  field="id"  hidden="true"  queryMode="group"  width="120"></t:dgCol>
  </t:datagrid>
  </div>
 </div>

 <script type="text/javascript"> 
 function initCheck(data){
 	var ids = "${ids}";
 	var idArr = ids.split(",");
 	for(var i=0;i<idArr.length;i++){
 		if(idArr[i]!=""){
 			$("#jformResumeInfoList").datagrid("selectRecord",idArr[i]);
 		}
 	}
 }
 </script> 