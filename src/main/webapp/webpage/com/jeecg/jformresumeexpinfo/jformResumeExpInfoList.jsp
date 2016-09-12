<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<script type="text/javascript">
	$('#addJformResumeExpInfoBtn').linkbutton({   
	    iconCls: 'icon-add'  
	});  
	$('#delJformResumeExpInfoBtn').linkbutton({   
	    iconCls: 'icon-remove'  
	}); 
	$('#addJformResumeExpInfoBtn').bind('click', function(){   
 		 var tr =  $("#add_jformResumeExpInfo_table_template tr").clone();
	 	 $("#add_jformResumeExpInfo_table").append(tr);
	 	 resetTrNum('add_jformResumeExpInfo_table');
	 	 return false;
    });  
	$('#delJformResumeExpInfoBtn').bind('click', function(){   
      	$("#add_jformResumeExpInfo_table").find("input:checked").parent().parent().remove();   
        resetTrNum('add_jformResumeExpInfo_table'); 
        return false;
    }); 
    $(document).ready(function(){
    	$(".datagrid-toolbar").parent().css("width","auto");
    	if(location.href.indexOf("load=detail")!=-1){
			$(":input").attr("disabled","true");
			$(".datagrid-toolbar").hide();
		}
		//将表格的表头固定
	    $("#jformResumeExpInfo_table").createhftable({
	    	height:'300px',
			width:'auto',
			fixFooter:false
			});
    });
</script>
<div style="padding: 3px; height: 25px;width:auto;" class="datagrid-toolbar">
	<a id="addJformResumeExpInfoBtn" href="#">添加</a> <a id="delJformResumeExpInfoBtn" href="#">删除</a> 
</div>
<table border="0" cellpadding="2" cellspacing="0" id="jformResumeExpInfo_table">
	<tr bgcolor="#E6E6E6">
		<td align="center" bgcolor="#EEEEEE" style="width: 25px;">序号</td>
		<td align="center" bgcolor="#EEEEEE" style="width: 25px;">操作</td>
				  <td align="left" bgcolor="#EEEEEE" style="width: 126px;">
						开始日期
				  </td>
				  <td align="left" bgcolor="#EEEEEE" style="width: 126px;">
						结束日期
				  </td>
				  <td align="left" bgcolor="#EEEEEE" style="width: 126px;">
						公司名称
				  </td>
				  <td align="left" bgcolor="#EEEEEE" style="width: 126px;">
						部门名称
				  </td>
				  <td align="left" bgcolor="#EEEEEE" style="width: 126px;">
						职位
				  </td>
				  <td align="left" bgcolor="#EEEEEE" style="width: 126px;">
						月薪
				  </td>
				  <td align="left" bgcolor="#EEEEEE" style="width: 126px;">
						证明人姓名
				  </td>
				  <td align="left" bgcolor="#EEEEEE" style="width: 126px;">
						证明人电话
				  </td>
				  <td align="left" bgcolor="#EEEEEE" style="width: 126px;">
						离职原因
				  </td>
	</tr>
	<tbody id="add_jformResumeExpInfo_table">
	<c:if test="${fn:length(jformResumeExpInfoList)  > 0 }">
		<c:forEach items="${jformResumeExpInfoList}" var="poVal" varStatus="stuts">
			<tr>
				<td align="center"><div style="width: 25px;" name="xh">${stuts.index+1 }</div></td>
				<td align="center"><input style="width:20px;"  type="checkbox" name="ck" /></td>
					<input name="jformResumeExpInfoList[${stuts.index }].id" type="hidden" value="${poVal.id }"/>
					<input name="jformResumeExpInfoList[${stuts.index }].resumeId" type="hidden" value="${poVal.resumeId }"/>
				   <td align="left">
							<input name="jformResumeExpInfoList[${stuts.index }].beginDate" maxlength="0" 
					  		type="text" class="Wdate" onClick="WdatePicker()"  style="width:120px;"    value="<fmt:formatDate value='${poVal.beginDate}' type="date" pattern="yyyy-MM-dd"/>">
					  <label class="Validform_label" style="display: none;">开始日期</label>
				   </td>
				   <td align="left">
							<input name="jformResumeExpInfoList[${stuts.index }].endDate" maxlength="0" 
					  		type="text" class="Wdate" onClick="WdatePicker()"  style="width:120px;"    value="<fmt:formatDate value='${poVal.endDate}' type="date" pattern="yyyy-MM-dd"/>">
					  <label class="Validform_label" style="display: none;">结束日期</label>
				   </td>
				   <td align="left">
					  	<input name="jformResumeExpInfoList[${stuts.index }].companyName" maxlength="200" 
					  		type="text" class="inputxt"  style="width:120px;"  value="${poVal.companyName }">
					  <label class="Validform_label" style="display: none;">公司名称</label>
				   </td>
				   <td align="left">
					  	<input name="jformResumeExpInfoList[${stuts.index }].departName" maxlength="100" 
					  		type="text" class="inputxt"  style="width:120px;"  value="${poVal.departName }">
					  <label class="Validform_label" style="display: none;">部门名称</label>
				   </td>
				   <td align="left">
							<t:dictSelect field="jformResumeExpInfoList[${stuts.index }].post" type="list"
										typeGroupCode="" defaultVal="${poVal.post }" hasLabel="false"  title="职位"></t:dictSelect>     
					  <label class="Validform_label" style="display: none;">职位</label>
				   </td>
				   <td align="left">
					  	<input name="jformResumeExpInfoList[${stuts.index }].money" maxlength="30" 
					  		type="text" class="inputxt"  style="width:120px;"  value="${poVal.money }">
					  <label class="Validform_label" style="display: none;">月薪</label>
				   </td>
				   <td align="left">
					  	<input name="jformResumeExpInfoList[${stuts.index }].certManName" maxlength="32" 
					  		type="text" class="inputxt"  style="width:120px;"  value="${poVal.certManName }">
					  <label class="Validform_label" style="display: none;">证明人姓名</label>
				   </td>
				   <td align="left">
					  	<input name="jformResumeExpInfoList[${stuts.index }].certManPhone" maxlength="32" 
					  		type="text" class="inputxt"  style="width:120px;"  value="${poVal.certManPhone }">
					  <label class="Validform_label" style="display: none;">证明人电话</label>
				   </td>
				   <td align="left">
					  	<input name="jformResumeExpInfoList[${stuts.index }].reasonGo" maxlength="32" 
					  		type="text" class="inputxt"  style="width:120px;"  value="${poVal.reasonGo }">
					  <label class="Validform_label" style="display: none;">离职原因</label>
				   </td>
   			</tr>
		</c:forEach>
	</c:if>	
	</tbody>
</table>
