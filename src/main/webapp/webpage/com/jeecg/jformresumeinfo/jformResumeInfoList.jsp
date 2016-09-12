<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<t:base type="jquery,easyui,tools,DatePicker"></t:base>
<div class="easyui-layout" fit="true">
  <div region="center" style="padding:0px;border:0px">
  <t:datagrid name="jformResumeInfoList" checkbox="true" fitColumns="false" title="员工信息表" actionUrl="jformResumeInfoController.do?datagrid" idField="id" fit="true" queryMode="group">
   <t:dgCol title="id"  field="id"  hidden="true"  queryMode="group"  width="120"></t:dgCol>
   <t:dgCol title="员工编号"  field="empNo"    queryMode="single"  width="120" query="true"></t:dgCol>
   <t:dgCol title="姓名"  field="name"    queryMode="single"  width="120" query="true"></t:dgCol>
   <t:dgCol title="性别"  field="sex"    queryMode="single" dictionary="sex" width="120" query="true"></t:dgCol>
   <t:dgCol title="出生年月"  field="birthday" formatter="yyyy-MM-dd"   queryMode="group"  width="120"  query="true"></t:dgCol>
   <t:dgCol title="电子邮箱"  field="email"    queryMode="single"  width="120" query="true"></t:dgCol>
   <t:dgCol title="最高学历"  field="degree"    queryMode="group"  width="120"></t:dgCol>
   <t:dgCol title="工作年限"  field="workyear"    queryMode="group"  width="120"></t:dgCol>
   <t:dgCol title="身份证号"  field="cardid"    queryMode="single"  width="120" query="true"></t:dgCol>
   <t:dgCol title="现居地"  field="habitation"  hidden="true"  queryMode="group"  width="120"></t:dgCol>
   <t:dgCol title="户口所在地"  field="residence"  hidden="true"  queryMode="group"  width="120"></t:dgCol>
   <t:dgCol title="期望薪资"  field="salary"  hidden="true"  queryMode="group"  width="120"></t:dgCol>
   <t:dgCol title="期望工作地点"  field="workPlace"  hidden="true"  queryMode="group"  width="120"></t:dgCol>
   <t:dgCol title="到岗时间"  field="arrivalTime" formatter="yyyy-MM-dd hh:mm:ss" hidden="true"  queryMode="group"  width="120"></t:dgCol>
   <t:dgCol title="民族"  field="mz"  hidden="true"  queryMode="group"  width="120"></t:dgCol>
   <t:dgCol title="籍贯"  field="jg"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="政治面貌"  field="zzmm"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="婚姻状况"  field="hyzk"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="身高"  field="sg"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="健康状况"  field="jkzk"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="教师资格证"  field="jszgz"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="职称等级"  field="zcdj"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="外语等级"  field="wydj"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="普通话等级"  field="pthdj"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="本人联系电话"  field="telnum"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="紧急联系人姓名"  field="jjlxrName"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="紧急联系人电话"  field="jjlxrMobile"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="爱好与特长"  field="ahtc"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="应聘性质"  field="ypxz"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="是否接受调动"  field="isChange"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="信息来源"  field="infoSource"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="操作" field="opt" width="100"></t:dgCol>
   <t:dgDelOpt title="删除" url="jformResumeInfoController.do?doDel&id={id}" />
   <t:dgToolBar title="录入" icon="icon-add" url="jformResumeInfoController.do?goAdd" funname="add" width="100%" height="100%"></t:dgToolBar>
   <t:dgToolBar title="编辑" icon="icon-edit" url="jformResumeInfoController.do?goUpdate" funname="update" width="100%" height="100%"></t:dgToolBar>
   <t:dgToolBar title="批量删除"  icon="icon-remove" url="jformResumeInfoController.do?doBatchDel" funname="deleteALLSelect"></t:dgToolBar>
   <t:dgToolBar title="查看" icon="icon-search" url="jformResumeInfoController.do?goUpdate" funname="detail" width="100%" height="100%"></t:dgToolBar>
   <t:dgToolBar title="导入" icon="icon-put" funname="ImportXls"></t:dgToolBar>
   <t:dgToolBar title="导出" icon="icon-putout" funname="ExportXls"></t:dgToolBar>
   <t:dgToolBar title="模板下载" icon="icon-putout" funname="ExportXlsByT"></t:dgToolBar>
  </t:datagrid>
  </div>
 </div>
 <script src = "webpage/com/jeecg/jformresumeinfo/jformResumeInfoList.js"></script>		
 <script type="text/javascript">
 $(document).ready(function(){
 		//给时间控件加上样式
 			$("#jformResumeInfoListtb").find("input[name='birthday_begin']").attr("class","Wdate").click(function(){WdatePicker({dateFmt:'yyyy-MM-dd'});});
 			$("#jformResumeInfoListtb").find("input[name='birthday_end']").attr("class","Wdate").click(function(){WdatePicker({dateFmt:'yyyy-MM-dd'});});
 			$("#jformResumeInfoListtb").find("input[name='arrivalTime_begin']").attr("class","Wdate").click(function(){WdatePicker({dateFmt:'yyyy-MM-dd'});});
 			$("#jformResumeInfoListtb").find("input[name='arrivalTime_end']").attr("class","Wdate").click(function(){WdatePicker({dateFmt:'yyyy-MM-dd'});});
 });
 
//导入
function ImportXls() {
	openuploadwin('Excel导入', 'jformResumeInfoController.do?upload', "jformResumeInfoList");
}

//导出
function ExportXls() {
	JeecgExcelExport("jformResumeInfoController.do?exportXls","jformResumeInfoList");
}

//模板下载
function ExportXlsByT() {
	JeecgExcelExport("jformResumeInfoController.do?exportXlsByT","jformResumeInfoList");
}
 </script>