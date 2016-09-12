<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<script type="text/javascript">
	$('#addJformResumeDegreeInfoBtn').linkbutton({   
	    iconCls: 'icon-add'  
	});  
	$('#delJformResumeDegreeInfoBtn').linkbutton({   
	    iconCls: 'icon-remove'  
	}); 
	$('#addJformResumeDegreeInfoBtn').bind('click', function(){   
 		 var tr =  $("#add_jformResumeDegreeInfo_table_template tr").clone();
	 	 $("#add_jformResumeDegreeInfo_table").append(tr);
	 	 resetTrNum('add_jformResumeDegreeInfo_table');
	 	 return false;
    });  
	$('#delJformResumeDegreeInfoBtn').bind('click', function(){   
      	$("#add_jformResumeDegreeInfo_table").find("input:checked").parent().parent().remove();   
        resetTrNum('add_jformResumeDegreeInfo_table'); 
        return false;
    }); 
    $(document).ready(function(){
    	$(".datagrid-toolbar").parent().css("width","auto");
    	if(location.href.indexOf("load=detail")!=-1){
			$(":input").attr("disabled","true");
			$(".datagrid-toolbar").hide();
		}
		//将表格的表头固定
	    $("#jformResumeDegreeInfo_table").createhftable({
	    	height:'300px',
			width:'auto',
			fixFooter:false
			});
    });
</script>
<div style="padding: 3px; height: 25px;width:auto;" class="datagrid-toolbar">
	<a id="addJformResumeDegreeInfoBtn" href="#">添加</a> <a id="delJformResumeDegreeInfoBtn" href="#">删除</a> 
</div>
<table border="0" cellpadding="2" cellspacing="0" id="jformResumeDegreeInfo_table">
	<tr bgcolor="#E6E6E6">
		<td align="center" bgcolor="#EEEEEE" style="width: 25px;">序号</td>
		<td align="center" bgcolor="#EEEEEE" style="width: 25px;">操作</td>
				  <td align="left" bgcolor="#EEEEEE" style="width: 126px;">
						开始时间
				  </td>
				  <td align="left" bgcolor="#EEEEEE" style="width: 126px;">
						结束时间
				  </td>
				  <td align="left" bgcolor="#EEEEEE" style="width: 126px;">
						学校名称
				  </td>
				  <td align="left" bgcolor="#EEEEEE" style="width: 126px;">
						专业
				  </td>
				  <td align="left" bgcolor="#EEEEEE" style="width: 126px;">
						学历学位
				  </td>
				  <td align="left" bgcolor="#EEEEEE" style="width: 126px;">
						所获得证书
				  </td>
				  <td align="left" bgcolor="#EEEEEE" style="width: 126px;">
						学历性质
				  </td>
	</tr>
	<tbody id="add_jformResumeDegreeInfo_table">
	<c:if test="${fn:length(jformResumeDegreeInfoList)  > 0 }">
		<c:forEach items="${jformResumeDegreeInfoList}" var="poVal" varStatus="stuts">
			<tr>
				<td align="center"><div style="width: 25px;" name="xh">${stuts.index+1 }</div></td>
				<td align="center"><input style="width:20px;"  type="checkbox" name="ck" /></td>
					<input name="jformResumeDegreeInfoList[${stuts.index }].id" type="hidden" value="${poVal.id }"/>
					<input name="jformResumeDegreeInfoList[${stuts.index }].resumeId" type="hidden" value="${poVal.resumeId }"/>
				   <td align="left">
							<input name="jformResumeDegreeInfoList[${stuts.index }].beginDate" maxlength="0" 
					  		type="text" class="Wdate" onClick="WdatePicker()"  style="width:120px;"    value="<fmt:formatDate value='${poVal.beginDate}' type="date" pattern="yyyy-MM-dd"/>">
					  <label class="Validform_label" style="display: none;">开始时间</label>
				   </td>
				   <td align="left">
							<input name="jformResumeDegreeInfoList[${stuts.index }].endDate" maxlength="0" 
					  		type="text" class="Wdate" onClick="WdatePicker()"  style="width:120px;"    value="<fmt:formatDate value='${poVal.endDate}' type="date" pattern="yyyy-MM-dd"/>">
					  <label class="Validform_label" style="display: none;">结束时间</label>
				   </td>
				   <td align="left">
					  	<input name="jformResumeDegreeInfoList[${stuts.index }].schoolName" maxlength="100" 
					  		type="text" class="inputxt"  style="width:120px;"  value="${poVal.schoolName }">
					  <label class="Validform_label" style="display: none;">学校名称</label>
				   </td>
				   <td align="left">
							<t:dictSelect field="jformResumeDegreeInfoList[${stuts.index }].major" type="list"
										typeGroupCode="" defaultVal="${poVal.major }" hasLabel="false"  title="专业"></t:dictSelect>     
					  <label class="Validform_label" style="display: none;">专业</label>
				   </td>
				   <td align="left">
					  	<input name="jformResumeDegreeInfoList[${stuts.index }].degree" maxlength="30" 
					  		type="text" class="inputxt"  style="width:120px;"  value="${poVal.degree }">
					  <label class="Validform_label" style="display: none;">学历学位</label>
				   </td>
				   <td align="left">
					  	<input name="jformResumeDegreeInfoList[${stuts.index }].certissure" maxlength="32" 
					  		type="text" class="inputxt"  style="width:120px;"  value="${poVal.certissure }">
					  <label class="Validform_label" style="display: none;">所获得证书</label>
				   </td>
				   <td align="left">
							<t:dictSelect field="jformResumeDegreeInfoList[${stuts.index }].degreeType" type="list"
										typeGroupCode="" defaultVal="${poVal.degreeType }" hasLabel="false"  title="学历性质"></t:dictSelect>     
					  <label class="Validform_label" style="display: none;">学历性质</label>
				   </td>
   			</tr>
		</c:forEach>
	</c:if>	
	</tbody>
</table>
