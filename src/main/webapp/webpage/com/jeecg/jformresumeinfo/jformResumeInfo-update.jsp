<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<!DOCTYPE html>
<html>
 <head>
  <title>员工信息表</title>
  <t:base type="jquery,easyui,tools,DatePicker"></t:base>
  <script type="text/javascript">
  $(document).ready(function(){
	$('#tt').tabs({
	   onSelect:function(title){
	       $('#tt .panel-body').css('width','auto');
		}
	});
	$(".tabs-wrap").css('width','100%');
  });
 </script>
 </head>
 <body style="overflow-x: hidden;">
  <t:formvalid formid="formobj" dialog="true" usePlugin="password" layout="table" tiptype="1" action="jformResumeInfoController.do?doUpdate" >
					<input id="id" name="id" type="hidden" value="${jformResumeInfoPage.id }">
					<input id="cardid" name="cardid" type="hidden" value="${jformResumeInfoPage.cardid }">
					<input id="habitation" name="habitation" type="hidden" value="${jformResumeInfoPage.habitation }">
	<table cellpadding="0" cellspacing="1" class="formtable">
		<tr>
			<td align="right">
				<label class="Validform_label">姓名:</label>
			</td>
			<td class="value">
		     	 <input id="name" name="name" type="text" style="width: 150px" class="inputxt" value='${jformResumeInfoPage.name}'>
				<span class="Validform_checktip"></span>
				<label class="Validform_label" style="display: none;">姓名</label>
			</td>
			<td align="right">
				<label class="Validform_label">性别:</label>
			</td>
			<td class="value">
					<t:dictSelect field="sex" type="radio"
						typeGroupCode="sex" defaultVal="${jformResumeInfoPage.sex}" hasLabel="false"  title="性别"></t:dictSelect>     
				<span class="Validform_checktip"></span>
				<label class="Validform_label" style="display: none;">性别</label>
			</td>
		</tr>
		<tr>
			<td align="right">
				<label class="Validform_label">出生年月:</label>
			</td>
			<td class="value">
					  <input id="birthday" name="birthday" type="text" style="width: 150px" 
		      						class="Wdate" onClick="WdatePicker()"  value='<fmt:formatDate value='${jformResumeInfoPage.birthday}' type="date" pattern="yyyy-MM-dd"/>'>
				<span class="Validform_checktip"></span>
				<label class="Validform_label" style="display: none;">出生年月</label>
			</td>
			<td align="right">
				<label class="Validform_label">电子邮箱:</label>
			</td>
			<td class="value">
		     	 <input id="email" name="email" type="text" style="width: 150px" class="inputxt" value='${jformResumeInfoPage.email}'>
				<span class="Validform_checktip"></span>
				<label class="Validform_label" style="display: none;">电子邮箱</label>
			</td>
		</tr>
		<tr>
			<td align="right">
				<label class="Validform_label">最高学历:</label>
			</td>
			<td class="value">
					<t:dictSelect field="degree" type="list"
						typeGroupCode="" defaultVal="${jformResumeInfoPage.degree}" hasLabel="false"  title="最高学历"></t:dictSelect>     
				<span class="Validform_checktip"></span>
				<label class="Validform_label" style="display: none;">最高学历</label>
			</td>
			<td align="right">
				<label class="Validform_label">工作年限:</label>
			</td>
			<td class="value">
					<t:dictSelect field="workyear" type="list"
						typeGroupCode="" defaultVal="${jformResumeInfoPage.workyear}" hasLabel="false"  title="工作年限"></t:dictSelect>     
				<span class="Validform_checktip"></span>
				<label class="Validform_label" style="display: none;">工作年限</label>
			</td>
		</tr>
		<tr>
			<td align="right">
				<label class="Validform_label">户口所在地:</label>
			</td>
			<td class="value">
		     	 <input id="residence" name="residence" type="text" style="width: 150px" class="inputxt" value='${jformResumeInfoPage.residence}'>
				<span class="Validform_checktip"></span>
				<label class="Validform_label" style="display: none;">户口所在地</label>
			</td>
			<td align="right">
				<label class="Validform_label">期望薪资:</label>
			</td>
			<td class="value">
		     	 <input id="salary" name="salary" type="text" style="width: 150px" class="inputxt" value='${jformResumeInfoPage.salary}'>
				<span class="Validform_checktip"></span>
				<label class="Validform_label" style="display: none;">期望薪资</label>
			</td>
		</tr>
		<tr>
			<td align="right">
				<label class="Validform_label">期望工作地点:</label>
			</td>
			<td class="value">
		     	 <input id="workPlace" name="workPlace" type="text" style="width: 150px" class="inputxt" value='${jformResumeInfoPage.workPlace}'>
				<span class="Validform_checktip"></span>
				<label class="Validform_label" style="display: none;">期望工作地点</label>
			</td>
			<td align="right">
				<label class="Validform_label">到岗时间:</label>
			</td>
			<td class="value">
					  <input id="arrivalTime" name="arrivalTime" type="text" style="width: 150px" 
		      						 class="Wdate" onClick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss'})"  value='<fmt:formatDate value='${jformResumeInfoPage.arrivalTime}' type="date" pattern="yyyy-MM-dd hh:mm:ss"/>'>
				<span class="Validform_checktip"></span>
				<label class="Validform_label" style="display: none;">到岗时间</label>
			</td>
		</tr>
		<tr>
			<td align="right">
				<label class="Validform_label">民族:</label>
			</td>
			<td class="value">
					<t:dictSelect field="mz" type="list"
						typeGroupCode="" defaultVal="${jformResumeInfoPage.mz}" hasLabel="false"  title="民族"></t:dictSelect>     
				<span class="Validform_checktip"></span>
				<label class="Validform_label" style="display: none;">民族</label>
			</td>
			<td align="right">
				<label class="Validform_label">籍贯:</label>
			</td>
			<td class="value">
					<t:dictSelect field="jg" type="list"
						typeGroupCode="" defaultVal="${jformResumeInfoPage.jg}" hasLabel="false"  title="籍贯"></t:dictSelect>     
				<span class="Validform_checktip"></span>
				<label class="Validform_label" style="display: none;">籍贯</label>
			</td>
		</tr>
		<tr>
			<td align="right">
				<label class="Validform_label">政治面貌:</label>
			</td>
			<td class="value">
					<t:dictSelect field="zzmm" type="list"
						typeGroupCode="" defaultVal="${jformResumeInfoPage.zzmm}" hasLabel="false"  title="政治面貌"></t:dictSelect>     
				<span class="Validform_checktip"></span>
				<label class="Validform_label" style="display: none;">政治面貌</label>
			</td>
			<td align="right">
				<label class="Validform_label">婚姻状况:</label>
			</td>
			<td class="value">
					<t:dictSelect field="hyzk" type="list"
						typeGroupCode="" defaultVal="${jformResumeInfoPage.hyzk}" hasLabel="false"  title="婚姻状况"></t:dictSelect>     
				<span class="Validform_checktip"></span>
				<label class="Validform_label" style="display: none;">婚姻状况</label>
			</td>
		</tr>
		<tr>
			<td align="right">
				<label class="Validform_label">身高:</label>
			</td>
			<td class="value">
		     	 <input id="sg" name="sg" type="text" style="width: 150px" class="inputxt" value='${jformResumeInfoPage.sg}'>
				<span class="Validform_checktip"></span>
				<label class="Validform_label" style="display: none;">身高</label>
			</td>
			<td align="right">
				<label class="Validform_label">健康状况:</label>
			</td>
			<td class="value">
					<t:dictSelect field="jkzk" type="list"
						typeGroupCode="" defaultVal="${jformResumeInfoPage.jkzk}" hasLabel="false"  title="健康状况"></t:dictSelect>     
				<span class="Validform_checktip"></span>
				<label class="Validform_label" style="display: none;">健康状况</label>
			</td>
		</tr>
		<tr>
			<td align="right">
				<label class="Validform_label">教师资格证:</label>
			</td>
			<td class="value">
					<t:dictSelect field="jszgz" type="list"
						typeGroupCode="" defaultVal="${jformResumeInfoPage.jszgz}" hasLabel="false"  title="教师资格证"></t:dictSelect>     
				<span class="Validform_checktip"></span>
				<label class="Validform_label" style="display: none;">教师资格证</label>
			</td>
			<td align="right">
				<label class="Validform_label">职称等级:</label>
			</td>
			<td class="value">
					<t:dictSelect field="zcdj" type="list"
						typeGroupCode="" defaultVal="${jformResumeInfoPage.zcdj}" hasLabel="false"  title="职称等级"></t:dictSelect>     
				<span class="Validform_checktip"></span>
				<label class="Validform_label" style="display: none;">职称等级</label>
			</td>
		</tr>
		<tr>
			<td align="right">
				<label class="Validform_label">外语等级:</label>
			</td>
			<td class="value">
					<t:dictSelect field="wydj" type="list"
						typeGroupCode="" defaultVal="${jformResumeInfoPage.wydj}" hasLabel="false"  title="外语等级"></t:dictSelect>     
				<span class="Validform_checktip"></span>
				<label class="Validform_label" style="display: none;">外语等级</label>
			</td>
			<td align="right">
				<label class="Validform_label">普通话等级:</label>
			</td>
			<td class="value">
					<t:dictSelect field="pthdj" type="list"
						typeGroupCode="" defaultVal="${jformResumeInfoPage.pthdj}" hasLabel="false"  title="普通话等级"></t:dictSelect>     
				<span class="Validform_checktip"></span>
				<label class="Validform_label" style="display: none;">普通话等级</label>
			</td>
		</tr>
		<tr>
			<td align="right">
				<label class="Validform_label">本人联系电话:</label>
			</td>
			<td class="value">
		     	 <input id="telnum" name="telnum" type="text" style="width: 150px" class="inputxt" value='${jformResumeInfoPage.telnum}'>
				<span class="Validform_checktip"></span>
				<label class="Validform_label" style="display: none;">本人联系电话</label>
			</td>
			<td align="right">
				<label class="Validform_label">紧急联系人姓名:</label>
			</td>
			<td class="value">
		     	 <input id="jjlxrName" name="jjlxrName" type="text" style="width: 150px" class="inputxt" value='${jformResumeInfoPage.jjlxrName}'>
				<span class="Validform_checktip"></span>
				<label class="Validform_label" style="display: none;">紧急联系人姓名</label>
			</td>
		</tr>
		<tr>
			<td align="right">
				<label class="Validform_label">紧急联系人电话:</label>
			</td>
			<td class="value">
		     	 <input id="jjlxrMobile" name="jjlxrMobile" type="text" style="width: 150px" class="inputxt" value='${jformResumeInfoPage.jjlxrMobile}'>
				<span class="Validform_checktip"></span>
				<label class="Validform_label" style="display: none;">紧急联系人电话</label>
			</td>
			<td align="right">
				<label class="Validform_label">爱好与特长:</label>
			</td>
			<td class="value">
		     	 <input id="ahtc" name="ahtc" type="text" style="width: 150px" class="inputxt" value='${jformResumeInfoPage.ahtc}'>
				<span class="Validform_checktip"></span>
				<label class="Validform_label" style="display: none;">爱好与特长</label>
			</td>
		</tr>
		<tr>
			<td align="right">
				<label class="Validform_label">应聘性质:</label>
			</td>
			<td class="value">
					<t:dictSelect field="ypxz" type="list"
						typeGroupCode="" defaultVal="${jformResumeInfoPage.ypxz}" hasLabel="false"  title="应聘性质"></t:dictSelect>     
				<span class="Validform_checktip"></span>
				<label class="Validform_label" style="display: none;">应聘性质</label>
			</td>
			<td align="right">
				<label class="Validform_label">是否接受调动:</label>
			</td>
			<td class="value">
					<t:dictSelect field="isChange" type="list"
						typeGroupCode="" defaultVal="${jformResumeInfoPage.isChange}" hasLabel="false"  title="是否接受调动"></t:dictSelect>     
				<span class="Validform_checktip"></span>
				<label class="Validform_label" style="display: none;">是否接受调动</label>
			</td>
		</tr>
		<tr>
			<td align="right">
				<label class="Validform_label">信息来源:</label>
			</td>
			<td class="value">
					<t:dictSelect field="infoSource" type="list"
						typeGroupCode="" defaultVal="${jformResumeInfoPage.infoSource}" hasLabel="false"  title="信息来源"></t:dictSelect>     
				<span class="Validform_checktip"></span>
				<label class="Validform_label" style="display: none;">信息来源</label>
			</td>
			<td align="right">
				<label class="Validform_label">员工编号:</label>
			</td>
			<td class="value">
		     	 <input id="empNo" name="empNo" type="text" style="width: 150px" class="inputxt" value='${jformResumeInfoPage.empNo}'>
				<span class="Validform_checktip"></span>
				<label class="Validform_label" style="display: none;">员工编号</label>
			</td>
		</tr>
			</table>
			<div style="width: auto;height: 200px;">
				<%-- 增加一个div，用于调节页面大小，否则默认太小 --%>
				<div style="width:800px;height:1px;"></div>
				<t:tabs id="tt" iframe="false" tabPosition="top" fit="false">
				 <t:tab href="jformResumeInfoController.do?jformResumeTrainInfoList&id=${jformResumeInfoPage.id}" icon="icon-search" title="培训" id="jformResumeTrainInfo"></t:tab>
				 <t:tab href="jformResumeInfoController.do?jformResumeDegreeInfoList&id=${jformResumeInfoPage.id}" icon="icon-search" title="学历" id="jformResumeDegreeInfo"></t:tab>
				 <t:tab href="jformResumeInfoController.do?jformResumeExpInfoList&id=${jformResumeInfoPage.id}" icon="icon-search" title="经历" id="jformResumeExpInfo"></t:tab>
				 <t:tab href="jformResumeInfoController.do?jformResumeFamilyInfoList&id=${jformResumeInfoPage.id}" icon="icon-search" title="家庭成员" id="jformResumeFamilyInfo"></t:tab>
				</t:tabs>
			</div>
			</t:formvalid>
			<!-- 添加 附表明细 模版 -->
		<table style="display:none">
		<tbody id="add_jformResumeTrainInfo_table_template">
			<tr>
			 <td align="center"><div style="width: 25px;" name="xh"></div></td>
			 <td align="center"><input style="width:20px;" type="checkbox" name="ck"/></td>
				  <td align="left">
					  	<input name="jformResumeTrainInfoList[#index#].resumeId" maxlength="32" 
					  		type="text" class="inputxt"  style="width:120px;"
					  		>
					  <label class="Validform_label" style="display: none;">档案编号</label>
				  </td>
				  <td align="left">
							<input name="jformResumeTrainInfoList[#index#].startDate" maxlength="32" 
					  		type="text" class="Wdate" onClick="WdatePicker()"  style="width:120px;"
					  		 >
					  <label class="Validform_label" style="display: none;">开始时间</label>
				  </td>
				  <td align="left">
							<input name="jformResumeTrainInfoList[#index#].endDate" maxlength="32" 
					  		type="text" class="Wdate" onClick="WdatePicker()"  style="width:120px;"
					  		 >
					  <label class="Validform_label" style="display: none;">结束时间</label>
				  </td>
				  <td align="left">
					  	<input name="jformResumeTrainInfoList[#index#].schoolName" maxlength="32" 
					  		type="text" class="inputxt"  style="width:120px;"
					  		>
					  <label class="Validform_label" style="display: none;">培训机构名称</label>
				  </td>
				  <td align="left">
					  	<input name="jformResumeTrainInfoList[#index#].className" maxlength="32" 
					  		type="text" class="inputxt"  style="width:120px;"
					  		>
					  <label class="Validform_label" style="display: none;">课程名称</label>
				  </td>
				  <td align="left">
					  	<input name="jformResumeTrainInfoList[#index#].certBook" maxlength="32" 
					  		type="text" class="inputxt"  style="width:120px;"
					  		>
					  <label class="Validform_label" style="display: none;">所获证书</label>
				  </td>
			</tr>
		 </tbody>
		<tbody id="add_jformResumeDegreeInfo_table_template">
			<tr>
			 <td align="center"><div style="width: 25px;" name="xh"></div></td>
			 <td align="center"><input style="width:20px;" type="checkbox" name="ck"/></td>
				  <td align="left">
							<input name="jformResumeDegreeInfoList[#index#].beginDate" maxlength="0" 
					  		type="text" class="Wdate" onClick="WdatePicker()"  style="width:120px;"
					  		 >
					  <label class="Validform_label" style="display: none;">开始时间</label>
				  </td>
				  <td align="left">
							<input name="jformResumeDegreeInfoList[#index#].endDate" maxlength="0" 
					  		type="text" class="Wdate" onClick="WdatePicker()"  style="width:120px;"
					  		 >
					  <label class="Validform_label" style="display: none;">结束时间</label>
				  </td>
				  <td align="left">
					  	<input name="jformResumeDegreeInfoList[#index#].schoolName" maxlength="100" 
					  		type="text" class="inputxt"  style="width:120px;"
					  		>
					  <label class="Validform_label" style="display: none;">学校名称</label>
				  </td>
				  <td align="left">
							<t:dictSelect field="jformResumeDegreeInfoList[#index#].major" type="list"
										typeGroupCode="" defaultVal="" hasLabel="false"  title="专业"></t:dictSelect>     
					  <label class="Validform_label" style="display: none;">专业</label>
				  </td>
				  <td align="left">
					  	<input name="jformResumeDegreeInfoList[#index#].degree" maxlength="30" 
					  		type="text" class="inputxt"  style="width:120px;"
					  		>
					  <label class="Validform_label" style="display: none;">学历学位</label>
				  </td>
				  <td align="left">
					  	<input name="jformResumeDegreeInfoList[#index#].certissure" maxlength="32" 
					  		type="text" class="inputxt"  style="width:120px;"
					  		>
					  <label class="Validform_label" style="display: none;">所获得证书</label>
				  </td>
				  <td align="left">
							<t:dictSelect field="jformResumeDegreeInfoList[#index#].degreeType" type="list"
										typeGroupCode="" defaultVal="" hasLabel="false"  title="学历性质"></t:dictSelect>     
					  <label class="Validform_label" style="display: none;">学历性质</label>
				  </td>
			</tr>
		 </tbody>
		<tbody id="add_jformResumeExpInfo_table_template">
			<tr>
			 <td align="center"><div style="width: 25px;" name="xh"></div></td>
			 <td align="center"><input style="width:20px;" type="checkbox" name="ck"/></td>
				  <td align="left">
							<input name="jformResumeExpInfoList[#index#].beginDate" maxlength="0" 
					  		type="text" class="Wdate" onClick="WdatePicker()"  style="width:120px;"
					  		 >
					  <label class="Validform_label" style="display: none;">开始日期</label>
				  </td>
				  <td align="left">
							<input name="jformResumeExpInfoList[#index#].endDate" maxlength="0" 
					  		type="text" class="Wdate" onClick="WdatePicker()"  style="width:120px;"
					  		 >
					  <label class="Validform_label" style="display: none;">结束日期</label>
				  </td>
				  <td align="left">
					  	<input name="jformResumeExpInfoList[#index#].companyName" maxlength="200" 
					  		type="text" class="inputxt"  style="width:120px;"
					  		>
					  <label class="Validform_label" style="display: none;">公司名称</label>
				  </td>
				  <td align="left">
					  	<input name="jformResumeExpInfoList[#index#].departName" maxlength="100" 
					  		type="text" class="inputxt"  style="width:120px;"
					  		>
					  <label class="Validform_label" style="display: none;">部门名称</label>
				  </td>
				  <td align="left">
							<t:dictSelect field="jformResumeExpInfoList[#index#].post" type="list"
										typeGroupCode="" defaultVal="" hasLabel="false"  title="职位"></t:dictSelect>     
					  <label class="Validform_label" style="display: none;">职位</label>
				  </td>
				  <td align="left">
					  	<input name="jformResumeExpInfoList[#index#].money" maxlength="30" 
					  		type="text" class="inputxt"  style="width:120px;"
					  		>
					  <label class="Validform_label" style="display: none;">月薪</label>
				  </td>
				  <td align="left">
					  	<input name="jformResumeExpInfoList[#index#].certManName" maxlength="32" 
					  		type="text" class="inputxt"  style="width:120px;"
					  		>
					  <label class="Validform_label" style="display: none;">证明人姓名</label>
				  </td>
				  <td align="left">
					  	<input name="jformResumeExpInfoList[#index#].certManPhone" maxlength="32" 
					  		type="text" class="inputxt"  style="width:120px;"
					  		>
					  <label class="Validform_label" style="display: none;">证明人电话</label>
				  </td>
				  <td align="left">
					  	<input name="jformResumeExpInfoList[#index#].reasonGo" maxlength="32" 
					  		type="text" class="inputxt"  style="width:120px;"
					  		>
					  <label class="Validform_label" style="display: none;">离职原因</label>
				  </td>
			</tr>
		 </tbody>
		<tbody id="add_jformResumeFamilyInfo_table_template">
			<tr>
			 <td align="center"><div style="width: 25px;" name="xh"></div></td>
			 <td align="center"><input style="width:20px;" type="checkbox" name="ck"/></td>
				  <td align="left">
					  	<input name="jformResumeFamilyInfoList[#index#].name" maxlength="50" 
					  		type="text" class="inputxt"  style="width:120px;"
					  		>
					  <label class="Validform_label" style="display: none;">姓名</label>
				  </td>
				  <td align="left">
							<t:dictSelect field="jformResumeFamilyInfoList[#index#].alliase" type="list"
										typeGroupCode="" defaultVal="" hasLabel="false"  title="称谓"></t:dictSelect>     
					  <label class="Validform_label" style="display: none;">称谓</label>
				  </td>
				  <td align="left">
					  	<input name="jformResumeFamilyInfoList[#index#].age" maxlength="32" 
					  		type="text" class="inputxt"  style="width:120px;"
					  		>
					  <label class="Validform_label" style="display: none;">年龄</label>
				  </td>
				  <td align="left">
					  	<input name="jformResumeFamilyInfoList[#index#].workAddress" maxlength="32" 
					  		type="text" class="inputxt"  style="width:120px;"
					  		>
					  <label class="Validform_label" style="display: none;">工作单位</label>
				  </td>
				  <td align="left">
					  	<input name="jformResumeFamilyInfoList[#index#].post" maxlength="32" 
					  		type="text" class="inputxt"  style="width:120px;"
					  		>
					  <label class="Validform_label" style="display: none;">职务</label>
				  </td>
				  <td align="left">
					  	<input name="jformResumeFamilyInfoList[#index#].mobile" maxlength="32" 
					  		type="text" class="inputxt"  style="width:120px;"
					  		>
					  <label class="Validform_label" style="display: none;">联系电话</label>
				  </td>
				  <td align="left">
					  	<input name="jformResumeFamilyInfoList[#index#].resumeId" maxlength="32" 
					  		type="text" class="inputxt"  style="width:120px;"
					  		>
					  <label class="Validform_label" style="display: none;">档案编号</label>
				  </td>
			</tr>
		 </tbody>
		</table>
 </body>
 <script src = "webpage/com/jeecg/jformresumeinfo/jformResumeInfo.js"></script>	
