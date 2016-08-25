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
   <t:dgCol title="民 族"  field="minzu"    query="true" queryMode="single" dictionary="minzu" width="120"></t:dgCol>
   <t:dgCol title="政治面貌"  field="zzmm"    query="true" queryMode="single" dictionary="zzmm" width="120"></t:dgCol>
   <t:dgCol title="年龄"  field="age"     width="120"></t:dgCol>
   <t:dgCol title="外语"  field="langtype"     queryMode="single" dictionary="langtype" width="120"></t:dgCol>
   <t:dgCol title="外语水平"  field="langgrade"      queryMode="single" dictionary="langgrade" width="120"></t:dgCol>
   <t:dgCol title="员工类别"  field="emptype"    queryMode="single" dictionary="emptype" width="120"></t:dgCol>
   <t:dgCol title="籍 贯"  field="jiguan" dictionary="jiguan"   queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="户口性质"  field="hukouType"    queryMode="single" dictionary="hukou_yupe" width="120"></t:dgCol>
   <t:dgCol title="核定薪资"  field="xinzi"      queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="特长"  field="techang"   hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="执业资格证"  field="zyzgz" hidden="true"    queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="身份证号码"  field="cradNo"     queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="职称"  field="zhicheng"      queryMode="single" dictionary="zhicheng" width="120"></t:dgCol>
   <t:dgCol title="户籍地址"  field="hujiAddress"  hidden="true"    queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="邮政编码"  field="post1"  hidden="true"   queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="现 住 址"  field="nowAddress"  hidden="true"   queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="邮政编码"  field="post2" hidden="true"    queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="联络电话"  field="tel"     queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="手机"  field="mobile"      queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="E_mail"  field="email"  hidden="true"   queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="操作" field="opt" width="100"></t:dgCol>
   <t:dgDelOpt title="删除" url="empBaseInfoController.do?doDel&id={id}" />
   <t:dgToolBar title="录入" icon="icon-add" url="empBaseInfoController.do?goAdd" funname="add" height="600" width="810"></t:dgToolBar>
   <t:dgToolBar title="编辑" icon="icon-edit" url="empBaseInfoController.do?goUpdate" funname="update" height="600" width="810"></t:dgToolBar>
   <t:dgToolBar title="批量删除"  icon="icon-remove" url="empBaseInfoController.do?doBatchDel" funname="deleteALLSelect"></t:dgToolBar>
   <t:dgToolBar title="查看" icon="icon-search" url="empBaseInfoController.do?goUpdate" funname="detail" height="600" width="810"></t:dgToolBar>
   <t:dgToolBar title="导入" icon="icon-put" funname="ImportXls"></t:dgToolBar>
   <t:dgToolBar title="导出" icon="icon-putout" funname="ExportXls"></t:dgToolBar>
   <t:dgToolBar title="模板下载" icon="icon-putout" funname="ExportXlsByT"></t:dgToolBar>
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
 
//导入
function ImportXls() {
	openuploadwin('Excel导入', 'empBaseInfoController.do?upload', "empBaseInfoList");
}

//导出
function ExportXls() {
	JeecgExcelExport("empBaseInfoController.do?exportXls","empBaseInfoList");
}

//模板下载
function ExportXlsByT() {
	JeecgExcelExport("empBaseInfoController.do?exportXlsByT","empBaseInfoList");
}
 </script>