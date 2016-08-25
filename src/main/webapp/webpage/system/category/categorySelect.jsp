<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<!DOCTYPE html >
<html>
<head>
<title>学科列表页面</title>
<t:base type="jquery"></t:base> 
<link rel="stylesheet" type="text/css" href="plug-in/ztree/css/zTreeStyle.css">
<script type="text/javascript" src="plug-in/ztree/js/jquery.ztree.core-3.5.min.js"></script>
<script type="text/javascript" src="plug-in/ztree/js/jquery.ztree.excheck-3.5.min.js"></script> 
<script type="text/javascript">
	var setting = {
			check: {
				enable: true,
				chkStyle: "radio",
				radioType: "all"
			},data: {
				simpleData: {
					enable: true,
					idKey: "code",
					pIdKey: "pId",
					rootPId: 0
				}
			},
			callback: {
			onExpand: zTreeOnExpand
		} 
	};
	
	//加载展开方法
	function zTreeOnExpand(event, treeId, treeNode){
		 var treeNodeId = treeNode.code; 
		 $.post(
			'categoryController.do?getCategoryInfo',
			{parentCode:treeNodeId,code:$("#code").val()},
			function(data){
				var d = $.parseJSON(data);
				if (d.success) {
					var dbDate = eval(d.msg);
					var tree = $.fn.zTree.getZTreeObj("categorySelect");

					if (!treeNode.zAsync){
						tree.addNodes(treeNode, dbDate);
						treeNode.zAsync = true;
					} else{
						tree.reAsyncChildNodes(treeNode, "refresh");
					} 
				}
			}
		);
	}
	
	//首次进入加载level为1的
	$(function(){
		$.post(
			'categoryController.do?getCategoryInfo',
		    {code:$("#code").val()},
			function(data){
				var d = $.parseJSON(data);
				if (d.success) {
					var dbDate = eval(d.msg);
					$.fn.zTree.init($("#categorySelect"), setting, dbDate);
				}
			}
		);
	});
</script>
</head>
<body style="overflow-y: hidden" scroll="no">
<input id="code" name="code" type="hidden" value="${code}">
<ul id="categorySelect" class="ztree" style="margin-top: 30px;"></ul> 
</body>
</html> 