<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<script type="text/javascript">
	$('#addJformResumeFamilyInfoBtn').linkbutton({   
	    iconCls: 'icon-add'  
	});  
	$('#delJformResumeFamilyInfoBtn').linkbutton({   
	    iconCls: 'icon-remove'  
	}); 
	$('#addJformResumeFamilyInfoBtn').bind('click', function(){   
 		 var tr =  $("#add_jformResumeFamilyInfo_table_template tr").clone();
	 	 $("#add_jformResumeFamilyInfo_table").append(tr);
	 	 resetTrNum('add_jformResumeFamilyInfo_table');
	 	 return false;
    });  
	$('#delJformResumeFamilyInfoBtn').bind('click', function(){   
      	$("#add_jformResumeFamilyInfo_table").find("input:checked").parent().parent().remove();   
        resetTrNum('add_jformResumeFamilyInfo_table'); 
        return false;
    }); 
    $(document).ready(function(){
    	$(".datagrid-toolbar").parent().css("width","auto");
    	if(location.href.indexOf("load=detail")!=-1){
			$(":input").attr("disabled","true");
			$(".datagrid-toolbar").hide();
		}
		//将表格的表头固定
	    $("#jformResumeFamilyInfo_table").createhftable({
	    	height:'300px',
			width:'auto',
			fixFooter:false
			});
    });
</script>
<div style="padding: 3px; height: 25px;width:auto;" class="datagrid-toolbar">
	<a id="addJformResumeFamilyInfoBtn" href="#">添加</a> <a id="delJformResumeFamilyInfoBtn" href="#">删除</a> 
</div>
<table border="0" cellpadding="2" cellspacing="0" id="jformResumeFamilyInfo_table">
	<tr bgcolor="#E6E6E6">
		<td align="center" bgcolor="#EEEEEE" style="width: 25px;">序号</td>
		<td align="center" bgcolor="#EEEEEE" style="width: 25px;">操作</td>
				  <td align="left" bgcolor="#EEEEEE" style="width: 126px;">
						姓名
				  </td>
				  <td align="left" bgcolor="#EEEEEE" style="width: 126px;">
						称谓
				  </td>
				  <td align="left" bgcolor="#EEEEEE" style="width: 126px;">
						年龄
				  </td>
				  <td align="left" bgcolor="#EEEEEE" style="width: 126px;">
						工作单位
				  </td>
				  <td align="left" bgcolor="#EEEEEE" style="width: 126px;">
						职务
				  </td>
				  <td align="left" bgcolor="#EEEEEE" style="width: 126px;">
						联系电话
				  </td>
				  <td align="left" bgcolor="#EEEEEE" style="width: 126px;">
						档案编号
				  </td>
	</tr>
	<tbody id="add_jformResumeFamilyInfo_table">
	<c:if test="${fn:length(jformResumeFamilyInfoList)  > 0 }">
		<c:forEach items="${jformResumeFamilyInfoList}" var="poVal" varStatus="stuts">
			<tr>
				<td align="center"><div style="width: 25px;" name="xh">${stuts.index+1 }</div></td>
				<td align="center"><input style="width:20px;"  type="checkbox" name="ck" /></td>
					<input name="jformResumeFamilyInfoList[${stuts.index }].id" type="hidden" value="${poVal.id }"/>
					<input name="jformResumeFamilyInfoList[${stuts.index }].createName" type="hidden" value="${poVal.createName }"/>
					<input name="jformResumeFamilyInfoList[${stuts.index }].createBy" type="hidden" value="${poVal.createBy }"/>
					<input name="jformResumeFamilyInfoList[${stuts.index }].createDate" type="hidden" value="${poVal.createDate }"/>
					<input name="jformResumeFamilyInfoList[${stuts.index }].updateName" type="hidden" value="${poVal.updateName }"/>
					<input name="jformResumeFamilyInfoList[${stuts.index }].updateBy" type="hidden" value="${poVal.updateBy }"/>
					<input name="jformResumeFamilyInfoList[${stuts.index }].updateDate" type="hidden" value="${poVal.updateDate }"/>
				   <td align="left">
					  	<input name="jformResumeFamilyInfoList[${stuts.index }].name" maxlength="50" 
					  		type="text" class="inputxt"  style="width:120px;"  value="${poVal.name }">
					  <label class="Validform_label" style="display: none;">姓名</label>
				   </td>
				   <td align="left">
							<t:dictSelect field="jformResumeFamilyInfoList[${stuts.index }].alliase" type="list"
										typeGroupCode="" defaultVal="${poVal.alliase }" hasLabel="false"  title="称谓"></t:dictSelect>     
					  <label class="Validform_label" style="display: none;">称谓</label>
				   </td>
				   <td align="left">
					  	<input name="jformResumeFamilyInfoList[${stuts.index }].age" maxlength="32" 
					  		type="text" class="inputxt"  style="width:120px;"  value="${poVal.age }">
					  <label class="Validform_label" style="display: none;">年龄</label>
				   </td>
				   <td align="left">
					  	<input name="jformResumeFamilyInfoList[${stuts.index }].workAddress" maxlength="32" 
					  		type="text" class="inputxt"  style="width:120px;"  value="${poVal.workAddress }">
					  <label class="Validform_label" style="display: none;">工作单位</label>
				   </td>
				   <td align="left">
					  	<input name="jformResumeFamilyInfoList[${stuts.index }].post" maxlength="32" 
					  		type="text" class="inputxt"  style="width:120px;"  value="${poVal.post }">
					  <label class="Validform_label" style="display: none;">职务</label>
				   </td>
				   <td align="left">
					  	<input name="jformResumeFamilyInfoList[${stuts.index }].mobile" maxlength="32" 
					  		type="text" class="inputxt"  style="width:120px;"  value="${poVal.mobile }">
					  <label class="Validform_label" style="display: none;">联系电话</label>
				   </td>
				   <td align="left">
					  	<input name="jformResumeFamilyInfoList[${stuts.index }].resumeId" maxlength="32" 
					  		type="text" class="inputxt"  style="width:120px;"  value="${poVal.resumeId }">
					  <label class="Validform_label" style="display: none;">档案编号</label>
				   </td>
   			</tr>
		</c:forEach>
	</c:if>	
	</tbody>
</table>
