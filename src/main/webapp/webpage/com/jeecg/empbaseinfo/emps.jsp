<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<!DOCTYPE html >
<html>
<head>
<title>员工集合</title>
<t:base type="jquery,easyui,tools"></t:base>
</head>
<body  scroll="no">
  <t:datagrid name="empBaseInfoList" idField="id" checkbox="true" showRefresh="false"  
             onLoadSuccess="initCheck" title="员工基本信息表"   pagination="false"
             actionUrl="empBaseInfoController.do?datagrid"  fit="true" queryMode="group">
   <t:dgCol title="员工名称"  field="empName"   query="true" queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="员工编号"  field="empNo"   query="true" queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="身份证号码"  field="cradNo"     queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="所属部门"  field="sysOrgCode"   query="true" queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="职务等级"  field="postion"   query="true" queryMode="single" dictionary="postion" width="120"></t:dgCol>
   <t:dgCol title="性别"  field="sex"   query="true" queryMode="single" dictionary="sex" width="120"></t:dgCol>
   <t:dgCol title="婚姻状况"  field="marry"   query="true" queryMode="single" dictionary="marry" width="120"></t:dgCol>
   <t:dgCol title="出生日期"  field="brthdate" formatter="yyyy-MM-dd"   queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="民 族"  field="minzu"    query="true" queryMode="single" dictionary="minzu" width="120"></t:dgCol>
   <t:dgCol title="政治面貌"  field="zzmm"    query="true" queryMode="single" dictionary="zzmm" width="120"></t:dgCol>
   <t:dgCol title="年龄"  field="age"     width="120"></t:dgCol>
   <t:dgCol title="外语"  field="langtype"     queryMode="single" dictionary="langtype" width="120"></t:dgCol>
   <t:dgCol title="员工类别"  field="emptype"    queryMode="single" dictionary="emptype" width="120"></t:dgCol>
   <t:dgCol title="籍 贯"  field="jiguan" dictionary="jiguan"   queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="户口性质"  field="hukouType"    queryMode="single" dictionary="hukou_type" width="120"></t:dgCol>
   <t:dgCol title="职称"  field="zhicheng"      queryMode="single" dictionary="zhicheng" width="120"></t:dgCol>
   <t:dgCol title="手机"  field="mobile"      queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="主键"  field="id"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
  </t:datagrid>
 </body>
</html>
 <script type="text/javascript"> 
 function initCheck(data){
 	var ids = "${ids}";
 	var idArr = ids.split(",");
 	for(var i=0;i<idArr.length;i++){
 		if(idArr[i]!=""){
 			$("#empBaseInfoList").datagrid("selectRecord",idArr[i]);
 		}
 	}
 }
 </script>