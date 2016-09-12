<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<script type="text/javascript">
	$('#addJformResumeTrainInfoBtn').linkbutton({   
	    iconCls: 'icon-add'  
	});  
	$('#delJformResumeTrainInfoBtn').linkbutton({   
	    iconCls: 'icon-remove'  
	}); 
	$('#addJformResumeTrainInfoBtn').bind('click', function(){   
 		 var tr =  $("#add_jformResumeTrainInfo_table_template tr").clone();
	 	 $("#add_jformResumeTrainInfo_table").append(tr);
	 	 resetTrNum('add_jformResumeTrainInfo_table');
	 	 return false;
    });  
	$('#delJformResumeTrainInfoBtn').bind('click', function(){   
      	$("#add_jformResumeTrainInfo_table").find("input:checked").parent().parent().remove();   
        resetTrNum('add_jformResumeTrainInfo_table'); 
        return false;
    }); 
    $(document).ready(function(){
    	$(".datagrid-toolbar").parent().css("width","auto");
    	if(location.href.indexOf("load=detail")!=-1){
			$(":input").attr("disabled","true");
			$(".datagrid-toolbar").hide();
		}
		//将表格的表头固定
	    $("#jformResumeTrainInfo_table").createhftable({
	    	height:'300px',
			width:'auto',
			fixFooter:false
			});
    });
</script>
<div style="padding: 3px; height: 25px;width:auto;" class="datagrid-toolbar">
	<a id="addJformResumeTrainInfoBtn" href="#">添加</a> <a id="delJformResumeTrainInfoBtn" href="#">删除</a> 
</div>
<table border="0" cellpadding="2" cellspacing="0" id="jformResumeTrainInfo_table">
	<tr bgcolor="#E6E6E6">
		<td align="center" bgcolor="#EEEEEE" style="width: 25px;">序号</td>
		<td align="center" bgcolor="#EEEEEE" style="width: 25px;">操作</td>
				  <td align="left" bgcolor="#EEEEEE" style="width: 126px;">
						档案编号
				  </td>
				  <td align="left" bgcolor="#EEEEEE" style="width: 126px;">
						开始时间
				  </td>
				  <td align="left" bgcolor="#EEEEEE" style="width: 126px;">
						结束时间
				  </td>
				  <td align="left" bgcolor="#EEEEEE" style="width: 126px;">
						培训机构名称
				  </td>
				  <td align="left" bgcolor="#EEEEEE" style="width: 126px;">
						课程名称
				  </td>
				  <td align="left" bgcolor="#EEEEEE" style="width: 126px;">
						所获证书
				  </td>
	</tr>
	<tbody id="add_jformResumeTrainInfo_table">
	<c:if test="${fn:length(jformResumeTrainInfoList)  > 0 }">
		<c:forEach items="${jformResumeTrainInfoList}" var="poVal" varStatus="stuts">
			<tr>
				<td align="center"><div style="width: 25px;" name="xh">${stuts.index+1 }</div></td>
				<td align="center"><input style="width:20px;"  type="checkbox" name="ck" /></td>
					<input name="jformResumeTrainInfoList[${stuts.index }].id" type="hidden" value="${poVal.id }"/>
					<input name="jformResumeTrainInfoList[${stuts.index }].createName" type="hidden" value="${poVal.createName }"/>
					<input name="jformResumeTrainInfoList[${stuts.index }].createBy" type="hidden" value="${poVal.createBy }"/>
					<input name="jformResumeTrainInfoList[${stuts.index }].createDate" type="hidden" value="${poVal.createDate }"/>
					<input name="jformResumeTrainInfoList[${stuts.index }].updateName" type="hidden" value="${poVal.updateName }"/>
					<input name="jformResumeTrainInfoList[${stuts.index }].updateBy" type="hidden" value="${poVal.updateBy }"/>
					<input name="jformResumeTrainInfoList[${stuts.index }].updateDate" type="hidden" value="${poVal.updateDate }"/>
				   <td align="left">
					  	<input name="jformResumeTrainInfoList[${stuts.index }].resumeId" maxlength="32" 
					  		type="text" class="inputxt"  style="width:120px;"  value="${poVal.resumeId }">
					  <label class="Validform_label" style="display: none;">档案编号</label>
				   </td>
				   <td align="left">
							<input name="jformResumeTrainInfoList[${stuts.index }].startDate" maxlength="32" 
					  		type="text" class="Wdate" onClick="WdatePicker()"  style="width:120px;"    value="<fmt:formatDate value='${poVal.startDate}' type="date" pattern="yyyy-MM-dd"/>">
					  <label class="Validform_label" style="display: none;">开始时间</label>
				   </td>
				   <td align="left">
							<input name="jformResumeTrainInfoList[${stuts.index }].endDate" maxlength="32" 
					  		type="text" class="Wdate" onClick="WdatePicker()"  style="width:120px;"    value="<fmt:formatDate value='${poVal.endDate}' type="date" pattern="yyyy-MM-dd"/>">
					  <label class="Validform_label" style="display: none;">结束时间</label>
				   </td>
				   <td align="left">
					  	<input name="jformResumeTrainInfoList[${stuts.index }].schoolName" maxlength="32" 
					  		type="text" class="inputxt"  style="width:120px;"  value="${poVal.schoolName }">
					  <label class="Validform_label" style="display: none;">培训机构名称</label>
				   </td>
				   <td align="left">
					  	<input name="jformResumeTrainInfoList[${stuts.index }].className" maxlength="32" 
					  		type="text" class="inputxt"  style="width:120px;"  value="${poVal.className }">
					  <label class="Validform_label" style="display: none;">课程名称</label>
				   </td>
				   <td align="left">
					  	<input name="jformResumeTrainInfoList[${stuts.index }].certBook" maxlength="32" 
					  		type="text" class="inputxt"  style="width:120px;"  value="${poVal.certBook }">
					  <label class="Validform_label" style="display: none;">所获证书</label>
				   </td>
   			</tr>
		</c:forEach>
	</c:if>	
	</tbody>
</table>
