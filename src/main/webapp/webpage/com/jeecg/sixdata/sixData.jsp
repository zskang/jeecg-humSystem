<%@ page language="java" import="java.util.*"
	contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<!DOCTYPE html>
<html>
<head>
<title>六项学科数据信息表</title>
<t:base type="jquery,easyui,tools,DatePicker"></t:base>
<script type="text/javascript">
function openCategorySelect() {
	$.dialog.setting.zIndex = 9999; 
	
	var code = $("#code").val(); 
	
	$.dialog({content: 'url:categoryController.do?categorySelect&code='+code, zIndex: 2100, title: '学科分区树', lock: true, width: '400px', height: '350px', opacity: 0.4, button: [
	   {name: '<t:mutiLang langKey="common.confirm"/>', callback: callbackCategorySelect, focus: true},
	   {name: '<t:mutiLang langKey="common.cancel"/>', callback: function (){}}
   ]}).zindex();
}
	
function callbackCategorySelect() {
	  var iframe = this.iframe.contentWindow;
	  var treeObj = iframe.$.fn.zTree.getZTreeObj("categorySelect");
	  var nodes = treeObj.getCheckedNodes(true);
	  if(nodes.length>0){
		  if(nodes.length==3 || nodes.length==6  ){
			  alert(" 请重新选择子菜单！");
			  return;
		  }
	  var ids='',names='';
	  for(i=0;i<nodes.length;i++){
	     var node = nodes[i];
	     ids += node.code+',';
	     names += node.name+',';
	 } 
	 $('#name').val(names.substring(0,names.length-1));
	 $('#name').blur();		
	 $('#code').val(ids.substring(0,ids.length-1));		
	}
}

function callbackClean(){
	$('#name').val('');
    $('#code').val('');	
}

function setCode() {
	
}
$(function(){
	$("#name").prev().hide();
});

</script>
</head>
<body>
	<t:formvalid formid="formobj" dialog="true" usePlugin="password"
		layout="table" tiptype="1" action="sixDataController.do?save">
		<input id="id" name="id" type="hidden" value="${sixDataPage.id }">
		<table style="width:600px;" cellpadding="0" cellspacing="1"
			class="formtable">
			<tr>
				<td align="right"><label class="Validform_label">
						选择学科或分区: </label></td>
				<td class="value">  
			    <input id="name" name="name" type="text" readonly="readonly" class="inputxt" datatype="*" value="${name}" >
                <input id="code" name="code" type="hidden" value="${code}">
                <a href="#" class="easyui-linkbutton" plain="true" icon="icon-search" id="subjectTypeSearch" onclick="openCategorySelect()">选择</a>
                <a href="#" class="easyui-linkbutton" plain="true" icon="icon-redo" id="subjectRedo" onclick="callbackClean()">清空</a>
                 <span
					class="Validform_checktip"></span></td>
			</tr>
			<tr>
				<td align="right"><label class="Validform_label"> 选择年份:
				</label></td>
				<td class="value"><t:dictSelect id="year" field="year"
						typeGroupCode="yeardata" hasLabel="false"
						defaultVal="${sixDataPage.year}"></t:dictSelect> <span
					class="Validform_checktip"></span></td>
			</tr> 
		</table>
	</t:formvalid>
</body>
</html>