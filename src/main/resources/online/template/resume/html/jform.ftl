<html xmlns:m="http://schemas.microsoft.com/office/2004/12/omml">
<head>
	<title>档案信息管理</title>
	<style type="text/css">body{font-size:12px;}table{border: 1px solid #000000;padding:0; margin:0 auto;border-collapse: collapse;width:100%;align:right;}td {border: 1px solid #000000;background: #fff;font-size:12px;padding: 3px 3px 3px 8px;color: #000000;word-break: keep-all;}
	   p { margin:10 5 5 5px !important; }
	   input { height:30px !important;}
	</style>
	${config_iframe}
	<link rel="stylesheet" href="plug-in/Formdesign/js/ueditor/formdesign/bootstrap/css/bootstrap.css">
</head>
 <body>
 	<form id="formobj" action="cgFormBuildController.do?saveOrUpdateMore" name="formobj" method="post">
		<input type="hidden" id="btn_sub" class="btn_sub"/>
		<input type="hidden" name="tableName" value="${tableName?if_exists?html}" >
		<input type="hidden" name="id" value="${id?if_exists?html}" >
		<#list columnhidden as po>
		  <input type="hidden" id="${po.field_name}" name="${po.field_name}" value="${data['${tableName}']['${po.field_name}']?if_exists?html}" >
		</#list>
		<table border="0" cellpadding="0" cellspacing="0" class="MsoNormalTable" style="width:675.75pt;" width="901">
		<tbody>
			<tr style="mso-yfti-irow:0;mso-yfti-firstrow:yes;height:8.25pt">
				<td colspan="7" nowrap="nowrap" style="width: 675.75pt; padding: 0cm 5.4pt; height: 8.25pt; background-color: rgb(0, 176, 240);" width="901">
				<p align="center" class="MsoNormal" style="text-align:center;mso-pagination:widow-orphan"><span style="font-size: 11pt; font-family: 宋体;">　<span lang="EN-US"><o:p></o:p></span></span></p>
				</td>
			</tr>
			<tr style="mso-yfti-irow:1;height:36.75pt">
				<td colspan="6" nowrap="nowrap" style="width:675.75pt;padding:0cm 5.4pt 0cm 5.4pt;height:36.75pt" width="901">
					<p align="center" class="MsoNormal" style="text-align:center;mso-pagination:widow-orphan"><span style="font-size:18.0pt;font-family:&quot;微软雅黑&quot;,&quot;sans-serif&quot;;mso-bidi-font-family:
  					宋体;color:#00B0F0;mso-font-kerning:0pt">员工档案信息表<span lang="EN-US"><o:p></o:p></span></span></p>
			    </td>
		    </tr>
		    <tr style="mso-yfti-irow:9;height:26.25pt">
			<td colspan="6" nowrap="nowrap" style="width: 675.75pt; border-top-style: none; border-bottom-color: rgb(0, 176, 240); border-bottom-width: 1.5pt; border-left-style: none; border-bottom-color: rgb(0, 176, 240); border-bottom-width: 1.5pt; padding: 0cm 5.4pt; height: 26.25pt;" width="901">
				<p align="left" class="MsoNormal"><b><span style="font-size: 11pt; font-family: 微软雅黑, sans-serif;">基本信息<span lang="EN-US"><o:p></o:p></span></span></b></p>
			</td>
			</tr>
		    <tr style="mso-yfti-irow:4;height:24.75pt">
			<td nowrap="nowrap" style="width: 92.9pt; border-right-color: rgb(165, 165, 165); border-bottom-color: rgb(165, 165, 165); border-left-color: rgb(165, 165, 165); border-right-width: 1pt; border-bottom-width: 1pt; border-left-width: 1pt; border-top-style: none; padding: 0cm 5.4pt; height: 24.75pt; background-color: rgb(242, 242, 242);" width="124">
			<p align="center" class="MsoNormal" style="text-align:center;mso-pagination:widow-orphan"><span style="font-size: 11pt; font-family: 微软雅黑, sans-serif;">姓名<span lang="EN-US"><o:p></o:p></span></span></p>
			</td>
			<td style="width: 160px; border-top-style: none; border-left-style: none; border-bottom-color: rgb(165, 165, 165); border-bottom-width: 1pt; border-right-color: rgb(165, 165, 165); border-right-width: 1pt; padding: 0cm 5.4pt; height: 24px; white-space: nowrap;">
			<p align="left" class="MsoNormal"><span lang="EN-US">
			<input type="text" name="name" id="name" datatype="*" class="inputxt input" value="${data['${tableName}']['name']?if_exists?html}" ignore="ignore">
			<span class="Validform_checktip"></span>
			<label class="Validform_label" style="display: none;">姓名</label>
			</span></p>
			</td>
			<td nowrap="nowrap" style="width: 78.8pt; border-top-style: none; border-left-style: none; border-bottom-color: rgb(165, 165, 165); border-bottom-width: 1pt; border-right-color: rgb(165, 165, 165); border-right-width: 1pt; padding: 0cm 5.4pt; height: 24.75pt; background-color: rgb(242, 242, 242);" width="105">
			<p align="center" class="MsoNormal" style="text-align:center;mso-pagination:widow-orphan"><span style="font-size: 11pt; font-family: 微软雅黑, sans-serif;">性别<span lang="EN-US"><o:p></o:p></span></span></p>
			</td>
			<td style="width: 160px; border-top-style: none; border-left-style: none; border-bottom-color: rgb(165, 165, 165); border-bottom-width: 1pt; border-right-color: rgb(165, 165, 165); border-right-width: 1pt; padding: 0cm 5.4pt; height: 24px; white-space: nowrap;">
			<p align="left" class="MsoNormal"><span lang="EN-US">
			<select id="sex" name="sex" datatype="*" ignore="ignore" style="width: 206px;">
				<option value="">请选择</option>
				<@DictData name="sex" var="dataList">
					<#list dataList as dictdata>
						<option value="${dictdata.typecode?if_exists?html}" <#if dictdata.typecode?if_exists?html=="${data['${tableName}']['sex']?if_exists?html}">selected</#if>>${dictdata.typename?if_exists?html}</option>
					</#list>
				</@DictData>
			</select>
			<span class="Validform_checktip"></span>
			<label class="Validform_label" style="display: none;">性别</label>
			</span></p>
			</td>
			<td nowrap="nowrap" style="width: 78.8pt; border-top-style: none; border-left-style: none; border-bottom-color: rgb(165, 165, 165); border-bottom-width: 1pt; border-right-color: rgb(165, 165, 165); border-right-width: 1pt; padding: 0cm 5.4pt; height: 24.75pt; background-color: rgb(242, 242, 242);" width="105">
			<p align="center" class="MsoNormal" style="text-align:center;mso-pagination:widow-orphan"><span style="font-size: 11pt; font-family: 微软雅黑, sans-serif;">出生日期<span lang="EN-US"><o:p></o:p></span></span></p>
			</td>
			<td style="width: 160px; border-top-style: none; border-left-style: none; border-bottom-color: rgb(165, 165, 165); border-bottom-width: 1pt; border-right-color: rgb(165, 165, 165); border-right-width: 1pt; padding: 0cm 5.4pt; height: 24px; white-space: nowrap;">
			<p align="left" class="MsoNormal"><span lang="EN-US">
			<input type="text" name="birthday" id="birthday" datatype="*" class="Wdate" onClick="WdatePicker({dateFmt:'yyyy-MM-dd'})"  value="${data['${tableName}']['birthday']?if_exists?html}" ignore="ignore">
			<span class="Validform_checktip"></span>
			<label class="Validform_label" style="display: none;">出生日期</label>
			</span></p>
			</td>
		</tr>
		<tr style="mso-yfti-irow:4;height:24.75pt">
			<td nowrap="nowrap" style="width: 92.9pt; border-right-color: rgb(165, 165, 165); border-bottom-color: rgb(165, 165, 165); border-left-color: rgb(165, 165, 165); border-right-width: 1pt; border-bottom-width: 1pt; border-left-width: 1pt; border-top-style: none; padding: 0cm 5.4pt; height: 24.75pt; background-color: rgb(242, 242, 242);" width="124">
			<p align="center" class="MsoNormal" style="text-align:center;mso-pagination:widow-orphan"><span style="font-size: 11pt; font-family: 微软雅黑, sans-serif;">民族<span lang="EN-US"><o:p></o:p></span></span></p>
			</td>
			<td style="width: 160px; border-top-style: none; border-left-style: none; border-bottom-color: rgb(165, 165, 165); border-bottom-width: 1pt; border-right-color: rgb(165, 165, 165); border-right-width: 1pt; padding: 0cm 5.4pt; height: 24px; white-space: nowrap;">
			<p align="left" class="MsoNormal"><span lang="EN-US">
			<input type="text" name="mz" id="mz" datatype="*" class="inputxt input" value="${data['${tableName}']['mz']?if_exists?html}" ignore="ignore">
			<span class="Validform_checktip"></span>
			<label class="Validform_label" style="display: none;">名族</label>
			</span></p>
			</td>
			<td nowrap="nowrap" style="width: 78.8pt; border-top-style: none; border-left-style: none; border-bottom-color: rgb(165, 165, 165); border-bottom-width: 1pt; border-right-color: rgb(165, 165, 165); border-right-width: 1pt; padding: 0cm 5.4pt; height: 24.75pt; background-color: rgb(242, 242, 242);" width="105">
			<p align="center" class="MsoNormal" style="text-align:center;mso-pagination:widow-orphan"><span style="font-size: 11pt; font-family: 微软雅黑, sans-serif;">籍贯<span lang="EN-US"><o:p></o:p></span></span></p>
			</td>
			<td style="width: 160px; border-top-style: none; border-left-style: none; border-bottom-color: rgb(165, 165, 165); border-bottom-width: 1pt; border-right-color: rgb(165, 165, 165); border-right-width: 1pt; padding: 0cm 5.4pt; height: 24px; white-space: nowrap;">
			<p align="left" class="MsoNormal"><span lang="EN-US">
			<select id="jg" name="jg" datatype="*" ignore="ignore" style="width: 206px;">
				<option value="">请选择</option>
				<@DictData name="jg" var="dataList">
					<#list dataList as dictdata>
						<option value="${dictdata.typecode?if_exists?html}" <#if dictdata.typecode?if_exists?html=="${data['${tableName}']['jg']?if_exists?html}">selected</#if>>${dictdata.typename?if_exists?html}</option>
					</#list>
				</@DictData>
			</select>
			<span class="Validform_checktip"></span>
			<label class="Validform_label" style="display: none;">籍贯</label>
			</span></p>
			</td>
			<td nowrap="nowrap" style="width: 78.8pt; border-top-style: none; border-left-style: none; border-bottom-color: rgb(165, 165, 165); border-bottom-width: 1pt; border-right-color: rgb(165, 165, 165); border-right-width: 1pt; padding: 0cm 5.4pt; height: 24.75pt; background-color: rgb(242, 242, 242);" width="105">
			<p align="center" class="MsoNormal" style="text-align:center;mso-pagination:widow-orphan"><span style="font-size: 11pt; font-family: 微软雅黑, sans-serif;">政治面貌<span lang="EN-US"><o:p></o:p></span></span></p>
			</td>
			<td style="width: 160px; border-top-style: none; border-left-style: none; border-bottom-color: rgb(165, 165, 165); border-bottom-width: 1pt; border-right-color: rgb(165, 165, 165); border-right-width: 1pt; padding: 0cm 5.4pt; height: 24px; white-space: nowrap;">
			<p align="left" class="MsoNormal"><span lang="EN-US">
			<input type="text" name="zzmm" id="zzmm" datatype="*" value="${data['${tableName}']['zzmm']?if_exists?html}" ignore="ignore">
			<span class="Validform_checktip"></span>
			<label class="Validform_label" style="display: none;">政治面貌</label>
			</span></p>
			</td>
		</tr>
		<tr style="mso-yfti-irow:4;height:24.75pt">
			<td nowrap="nowrap" style="width: 92.9pt; border-right-color: rgb(165, 165, 165); border-bottom-color: rgb(165, 165, 165); border-left-color: rgb(165, 165, 165); border-right-width: 1pt; border-bottom-width: 1pt; border-left-width: 1pt; border-top-style: none; padding: 0cm 5.4pt; height: 24.75pt; background-color: rgb(242, 242, 242);" width="124">
			<p align="center" class="MsoNormal" style="text-align:center;mso-pagination:widow-orphan"><span style="font-size: 11pt; font-family: 微软雅黑, sans-serif;">手机号<span lang="EN-US"><o:p></o:p></span></span></p>
			</td>
			<td style="width: 160px; border-top-style: none; border-left-style: none; border-bottom-color: rgb(165, 165, 165); border-bottom-width: 1pt; border-right-color: rgb(165, 165, 165); border-right-width: 1pt; padding: 0cm 5.4pt; height: 24px; white-space: nowrap;">
			<p align="left" class="MsoNormal"><span lang="EN-US">
			<input type="text" name="telnum" id="telnum" datatype="*" class="inputxt" value="${data['${tableName}']['telnum']?if_exists?html}" ignore="ignore">
			<span class="Validform_checktip"></span>
			<label class="Validform_label" style="display: none;">手机号</label>
			</span></p>
			</td>
			<td nowrap="nowrap" style="width: 78.8pt; border-top-style: none; border-left-style: none; border-bottom-color: rgb(165, 165, 165); border-bottom-width: 1pt; border-right-color: rgb(165, 165, 165); border-right-width: 1pt; padding: 0cm 5.4pt; height: 24.75pt; background-color: rgb(242, 242, 242);" width="105">
			<p align="center" class="MsoNormal" style="text-align:center;mso-pagination:widow-orphan"><span style="font-size: 11pt; font-family: 微软雅黑, sans-serif;">Email<span lang="EN-US"><o:p></o:p></span></span></p>
			</td>
			<td style="width: 160px; border-top-style: none; border-left-style: none; border-bottom-color: rgb(165, 165, 165); border-bottom-width: 1pt; border-right-color: rgb(165, 165, 165); border-right-width: 1pt; padding: 0cm 5.4pt; height: 24px; white-space: nowrap;">
			<p align="left" class="MsoNormal"><span lang="EN-US">
			<input type="text" name="email" id="email" datatype="*" class="inputxt" value="${data['${tableName}']['email']?if_exists?html}" ignore="ignore">
			<span class="Validform_checktip"></span>
			<label class="Validform_label" style="display: none;">Email</label>
			</span></p>
			</td>
			<td nowrap="nowrap" style="width: 78.8pt; border-top-style: none; border-left-style: none; border-bottom-color: rgb(165, 165, 165); border-bottom-width: 1pt; border-right-color: rgb(165, 165, 165); border-right-width: 1pt; padding: 0cm 5.4pt; height: 24.75pt; background-color: rgb(242, 242, 242);" width="105">
			<p align="center" class="MsoNormal" style="text-align:center;mso-pagination:widow-orphan"><span style="font-size: 11pt; font-family: 微软雅黑, sans-serif;">最高学历<span lang="EN-US"><o:p></o:p></span></span></p>
			</td>
			<td style="width: 160px; border-top-style: none; border-left-style: none; border-bottom-color: rgb(165, 165, 165); border-bottom-width: 1pt; border-right-color: rgb(165, 165, 165); border-right-width: 1pt; padding: 0cm 5.4pt; height: 24px; white-space: nowrap;">
			<p align="left" class="MsoNormal"><span lang="EN-US">
			<input type="text" name="degree" id="degree" datatype="*" class="inputxt" value="${data['${tableName}']['degree']?if_exists?html}" ignore="ignore">
			<span class="Validform_checktip"></span>
			<label class="Validform_label" style="display: none;">最高学历</label>
			</span></p>
			</td>
		</tr>
		<tr style="mso-yfti-irow:4;height:24.75pt">
			<td nowrap="nowrap" style="width: 92.9pt; border-right-color: rgb(165, 165, 165); border-bottom-color: rgb(165, 165, 165); border-left-color: rgb(165, 165, 165); border-right-width: 1pt; border-bottom-width: 1pt; border-left-width: 1pt; border-top-style: none; padding: 0cm 5.4pt; height: 24.75pt; background-color: rgb(242, 242, 242);" width="124">
			<p align="center" class="MsoNormal" style="text-align:center;mso-pagination:widow-orphan"><span style="font-size: 11pt; font-family: 微软雅黑, sans-serif;">工作年限<span lang="EN-US"><o:p></o:p></span></span></p>
			</td>
			<td style="width: 160px; border-top-style: none; border-left-style: none; border-bottom-color: rgb(165, 165, 165); border-bottom-width: 1pt; border-right-color: rgb(165, 165, 165); border-right-width: 1pt; padding: 0cm 5.4pt; height: 24px; white-space: nowrap;">
			<p align="left" class="MsoNormal"><span lang="EN-US">
			<input type="text" name="workyear" id="workyear" datatype="*" class="inputxt" value="${data['${tableName}']['workyear']?if_exists?html}" ignore="ignore">
			<span class="Validform_checktip"></span>
			<label class="Validform_label" style="display: none;">工作年限</label>
			</span></p>
			</td>
			<td nowrap="nowrap" style="width: 78.8pt; border-top-style: none; border-left-style: none; border-bottom-color: rgb(165, 165, 165); border-bottom-width: 1pt; border-right-color: rgb(165, 165, 165); border-right-width: 1pt; padding: 0cm 5.4pt; height: 24.75pt; background-color: rgb(242, 242, 242);" width="105">
			<p align="center" class="MsoNormal" style="text-align:center;mso-pagination:widow-orphan"><span style="font-size: 11pt; font-family: 微软雅黑, sans-serif;">身份证<span lang="EN-US"><o:p></o:p></span></span></p>
			</td>
			<td colspan="3" style="width: 160px; border-top-style: none; border-left-style: none; border-bottom-color: rgb(165, 165, 165); border-bottom-width: 1pt; border-right-color: rgb(165, 165, 165); border-right-width: 1pt; padding: 0cm 5.4pt; height: 24px; white-space: nowrap;">
			<p align="left" class="MsoNormal"><span lang="EN-US">
			<input type="text" name="cardid" id="cardid" datatype="*" class="inputxt" value="${data['${tableName}']['cardid']?if_exists?html}" ignore="ignore">
			<span class="Validform_checktip"></span>
			<label class="Validform_label" style="display: none;">身份证</label>
			</span></p>
			</td>
		</tr>
		<tr style="mso-yfti-irow:4;height:24.75pt">
			<td nowrap="nowrap" style="width: 78.8pt; border-top-style: none; border-left-style: none; border-bottom-color: rgb(165, 165, 165); border-bottom-width: 1pt; border-right-color: rgb(165, 165, 165); border-right-width: 1pt; padding: 0cm 5.4pt; height: 24.75pt; background-color: rgb(242, 242, 242);" width="105">
			<p align="center" class="MsoNormal" style="text-align:center;mso-pagination:widow-orphan"><span style="font-size: 11pt; font-family: 微软雅黑, sans-serif;">居住地<span lang="EN-US"><o:p></o:p></span></span></p>
			</td>
			<td colspan="3" style="width: 160px; border-top-style: none; border-left-style: none; border-bottom-color: rgb(165, 165, 165); border-bottom-width: 1pt; border-right-color: rgb(165, 165, 165); border-right-width: 1pt; padding: 0cm 5.4pt; height: 24px; white-space: nowrap;">
			<p align="left" class="MsoNormal"><span lang="EN-US">
			<input type="text" name="habitation" id="habitation" datatype="*" class="inputxt" value="${data['${tableName}']['habitation']?if_exists?html}" ignore="ignore">
			<span class="Validform_checktip"></span>
			<label class="Validform_label" style="display: none;">居住地</label>
			</span></p>
			</td>
			<td nowrap="nowrap" style="width: 92.9pt; border-right-color: rgb(165, 165, 165); border-bottom-color: rgb(165, 165, 165); border-left-color: rgb(165, 165, 165); border-right-width: 1pt; border-bottom-width: 1pt; border-left-width: 1pt; border-top-style: none; padding: 0cm 5.4pt; height: 24.75pt; background-color: rgb(242, 242, 242);" width="124">
			<p align="center" class="MsoNormal" style="text-align:center;mso-pagination:widow-orphan"><span style="font-size: 11pt; font-family: 微软雅黑, sans-serif;">户口所在地<span lang="EN-US"><o:p></o:p></span></span></p>
			</td>
			<td style="width: 160px; border-top-style: none; border-left-style: none; border-bottom-color: rgb(165, 165, 165); border-bottom-width: 1pt; border-right-color: rgb(165, 165, 165); border-right-width: 1pt; padding: 0cm 5.4pt; height: 24px; white-space: nowrap;">
			<p align="left" class="MsoNormal"><span lang="EN-US">
			<input type="text" name="residence" id="residence" datatype="*" class="inputxt" value="${data['${tableName}']['residence']?if_exists?html}" ignore="ignore">
			<span class="Validform_checktip"></span>
			<label class="Validform_label" style="display: none;">户口所在地</label>
			</span></p>
			</td>
		</tr>
			<tr style="mso-yfti-irow:4;height:24.75pt">
			<td nowrap="nowrap" style="width: 78.8pt; border-top-style: none; border-left-style: none; border-bottom-color: rgb(165, 165, 165); border-bottom-width: 1pt; border-right-color: rgb(165, 165, 165); border-right-width: 1pt; padding: 0cm 5.4pt; height: 24.75pt; background-color: rgb(242, 242, 242);" width="105">
			<p align="center" class="MsoNormal" style="text-align:center;mso-pagination:widow-orphan"><span style="font-size: 11pt; font-family: 微软雅黑, sans-serif;">期望薪资<span lang="EN-US"><o:p></o:p></span></span></p>
			</td>
			<td colspan="5" style="width: 160px; border-top-style: none; border-left-style: none; border-bottom-color: rgb(165, 165, 165); border-bottom-width: 1pt; border-right-color: rgb(165, 165, 165); border-right-width: 1pt; padding: 0cm 5.4pt; height: 24px; white-space: nowrap;">
			<p align="left" class="MsoNormal"><span lang="EN-US">
			<input type="text" name="salary" id="salary" datatype="*" class="inputxt" value="${data['${tableName}']['salary']?if_exists?html}" ignore="ignore">
			<span class="Validform_checktip"></span>
			<label class="Validform_label" style="display: none;">期望薪资</label>
			</span></p>
			</td>
		</tr>
		
		<tr style="mso-yfti-irow:9;height:26.25pt">
		<td colspan="6" nowrap="nowrap" style="width: 675.75pt; border-top-style: none; border-bottom-color: rgb(0, 176, 240); border-bottom-width: 1.5pt; border-left-style: none; border-bottom-color: rgb(0, 176, 240); border-bottom-width: 1.5pt; padding: 0cm 5.4pt; height: 26.25pt;" width="901">
			<p align="left" class="MsoNormal"><b><span style="font-size: 11pt; font-family: 微软雅黑, sans-serif;">教育经历<span lang="EN-US"><o:p></o:p></span></span></b></p>
		</td>
		</tr>
		<tr>
			<td colspan="6" nowrap="nowrap" style="width: 675.75pt; border-top-style: none; border-bottom-color: rgb(0, 176, 240); border-bottom-width: 1.5pt; border-left-style: none; border-bottom-color: rgb(0, 176, 240); border-bottom-width: 1.5pt; padding: 0cm 5.4pt; height: 26.25pt;" width="901">
				<table class="MsoTableGrid" style="border-collapse:collapse; width:99%;margin-left:5.6500pt;mso-table-layout-alt:fixed;mso-padding-alt:0.0000pt 5.4000pt 0.0000pt 5.4000pt ;">
					<thead>
						<tr>
							<td colspan="8" style="padding: 1px;border:solid #add9c0; border-left-width: 1px; border-left-color: rgb(164, 164, 164); border-right-width: 1px; border-right-color: rgb(164, 164, 164); border-top-style: none; border-bottom-width: 1px; border-bottom-color: rgb(164, 164, 164);" valign="top" width="689">
							<p class="MsoNormal" style="mso-pagination:widow-orphan;text-align:right;vertical-align:middle;"><span style="mso-spacerun:'yes';font-family:微软雅黑;color:rgb(0,0,0);font-style:normal;font-size:11.0000pt;mso-font-kerning:0.0000pt;">
								<button class="btn btn-small btn-success listAdd" type="button" onclick="addDegree('degreeTab','add_degreeTab_template')">添加一行</button>
							</span></p>
							</td>
						</tr>
						<tr>
							<td style="width:17%;padding: 1px;border:solid #add9c0; border-left-width: 1px; border-left-color: rgb(164, 164, 164); border-right-width: 1px; border-right-color: rgb(164, 164, 164); border-top-style: none; border-bottom-width: 1px; border-bottom-color: rgb(164, 164, 164);" valign="top" width="114">
							<p class="MsoNormal" style="mso-pagination:widow-orphan;text-align:center;vertical-align:middle;"><span style="mso-spacerun:'yes';font-family:微软雅黑;color:rgb(0,0,0);font-style:normal;font-size:11.0000pt;mso-font-kerning:0.0000pt;">开始时间</span></p>
							</td>
							<td style="width:17%;padding: 1px;border:solid #add9c0; border-left-width: 1px; border-left-color: rgb(164, 164, 164); border-right-width: 1px; border-right-color: rgb(164, 164, 164); border-top-style: none; border-bottom-width: 1px; border-bottom-color: rgb(164, 164, 164);" valign="top" width="114">
							<p class="MsoNormal" style="mso-pagination:widow-orphan;text-align:center;vertical-align:middle;"><span style="mso-spacerun:'yes';font-family:微软雅黑;color:rgb(0,0,0);font-style:normal;font-size:11.0000pt;mso-font-kerning:0.0000pt;">结束时间</span></p>
							</td>
							<td style="width:17%;padding: 1px;border:solid #add9c0; border-left-width: 1px; border-left-color: rgb(164, 164, 164); border-right-width: 1px; border-right-color: rgb(164, 164, 164); border-top-style: none; border-bottom-width: 1px; border-bottom-color: rgb(164, 164, 164);" valign="top" width="114">
							<p class="MsoNormal" style="mso-pagination:widow-orphan;text-align:center;vertical-align:middle;"><span style="mso-spacerun:'yes';font-family:微软雅黑;color:rgb(0,0,0);font-style:normal;font-size:11.0000pt;mso-font-kerning:0.0000pt;">学校名称</span></p>
							</td>
							<td style="width:17%;padding: 1px;border:solid #add9c0; border-left-width: 1px; border-left-color: rgb(164, 164, 164); border-right-width: 1px; border-right-color: rgb(164, 164, 164); border-top-style: none; border-bottom-width: 1px; border-bottom-color: rgb(164, 164, 164);" valign="top" width="114">
							<p class="MsoNormal" style="mso-pagination:widow-orphan;text-align:center;vertical-align:middle;"><span style="mso-spacerun:'yes';font-family:微软雅黑;color:rgb(0,0,0);font-style:normal;font-size:11.0000pt;mso-font-kerning:0.0000pt;">所学专业</span></p>
							</td>
							<td style="width:17%;padding: 1px;border:solid #add9c0; border-left-width: 1px; border-left-color: rgb(164, 164, 164); border-right-width: 1px; border-right-color: rgb(164, 164, 164); border-top-style: none; border-bottom-width: 1px; border-bottom-color: rgb(164, 164, 164);" valign="top" width="114">
							<p class="MsoNormal" style="mso-pagination:widow-orphan;text-align:center;vertical-align:middle;"><span style="mso-spacerun:'yes';font-family:微软雅黑;color:rgb(0,0,0);font-style:normal;font-size:11.0000pt;mso-font-kerning:0.0000pt;">学历／学位</span></p>
							</td>	
					    	<td style="width:17%;padding: 1px;border:solid #add9c0; border-left-width: 1px; border-left-color: rgb(164, 164, 164); border-right-width: 1px; border-right-color: rgb(164, 164, 164); border-top-style: none; border-bottom-width: 1px; border-bottom-color: rgb(164, 164, 164);" valign="top" width="114">
							<p class="MsoNormal" style="mso-pagination:widow-orphan;text-align:center;vertical-align:middle;"><span style="mso-spacerun:'yes';font-family:微软雅黑;color:rgb(0,0,0);font-style:normal;font-size:11.0000pt;mso-font-kerning:0.0000pt;">学历性质</span></p>
							</td>	
							<td style="width:17%;padding: 1px;border:solid #add9c0; border-left-width: 1px; border-left-color: rgb(164, 164, 164); border-right-width: 1px; border-right-color: rgb(164, 164, 164); border-top-style: none; border-bottom-width: 1px; border-bottom-color: rgb(164, 164, 164);" valign="top" width="114">
							<p class="MsoNormal" style="mso-pagination:widow-orphan;text-align:center;vertical-align:middle;"><span style="mso-spacerun:'yes';font-family:微软雅黑;color:rgb(0,0,0);font-style:normal;font-size:11.0000pt;mso-font-kerning:0.0000pt;">所获得证书</span></p>
							</td>
							<td style="width:15%;padding: 1px;border:solid #add9c0; border-left-width: 1px; border-left-color: rgb(164, 164, 164); border-right-width: 1px; border-right-color: rgb(164, 164, 164); border-top-style: none; border-bottom-width: 1px; border-bottom-color: rgb(164, 164, 164);" valign="top" width="114">
							<p class="MsoNormal" style="mso-pagination:widow-orphan;text-align:center;vertical-align:middle;"><span style="mso-spacerun:'yes';font-family:微软雅黑;color:rgb(0,0,0);font-style:normal;font-size:11.0000pt;mso-font-kerning:0.0000pt;width:60px;display:block;">操作</span></p>
							</td>
						</tr>
					</thead>
					<tbody id="degreeTab">
						<#assign subTableStr>${head.subTableStr?if_exists?html}</#assign>
						<#assign subtablelist=subTableStr?split(",")>
						<#list subtablelist as sub >
						<#if sub?index_of("degree")!=-1 && data['${sub}']?exists&&(data['${sub}']?size>0) >
					    <#list data['${sub}']  as subTableData>
							<tr class="first-child">
								<td style="width:17%;padding: 1px;border:solid #add9c0; border-left-width: 1px; border-left-color: rgb(164, 164, 164); border-right-width: 1px; border-right-color: rgb(164, 164, 164); border-top-style: none; border-bottom-width: 1px; border-bottom-color: rgb(164, 164, 164);" valign="top" width="114">
									<p class="MsoNormal" style="mso-pagination:widow-orphan;text-align:center;vertical-align:middle;"><span style="font-family:微软雅黑;color:rgb(0,0,0);font-style:normal;font-size:11.0000pt;mso-font-kerning:0.0000pt;">
										<input type="text" name="jform_resume_degree_info[${subTableData_index}].begin_date" datatype="*" class="Wdate" onClick="WdatePicker({dateFmt:'yyyy-MM-dd'})"  value="${subTableData['begin_date']?if_exists?html}" ignore="ignore">
									</span></p>
								</td>
								<td style="width:17%;padding: 1px;border:solid #add9c0; border-left-width: 1px; border-left-color: rgb(164, 164, 164); border-right-width: 1px; border-right-color: rgb(164, 164, 164); border-top-style: none; border-bottom-width: 1px; border-bottom-color: rgb(164, 164, 164);" valign="top" width="114">
									<p class="MsoNormal" style="mso-pagination:widow-orphan;text-align:center;vertical-align:middle;"><span style="font-family:微软雅黑;color:rgb(0,0,0);font-style:normal;font-size:11.0000pt;mso-font-kerning:0.0000pt;">
										<input name="jform_resume_degree_info[${subTableData_index}].end_date" datatype="*" class="Wdate" onClick="WdatePicker({dateFmt:'yyyy-MM-dd'})"  value="${subTableData['end_date']?if_exists?html}" ignore="ignore">
									</span></p>
								</td>
								<td style="width:17%;padding: 1px;border:solid #add9c0; border-left-width: 1px; border-left-color: rgb(164, 164, 164); border-right-width: 1px; border-right-color: rgb(164, 164, 164); border-top-style: none; border-bottom-width: 1px; border-bottom-color: rgb(164, 164, 164);" valign="top" width="114">
									<p class="MsoNormal" style="mso-pagination:widow-orphan;text-align:center;vertical-align:middle;"><span style="font-family:微软雅黑;color:rgb(0,0,0);font-style:normal;font-size:11.0000pt;mso-font-kerning:0.0000pt;">
										<input type="text" name="jform_resume_degree_info[${subTableData_index}].school_name"  datatype="*" class="inputxt"  value="${subTableData['school_name']?if_exists?html}" ignore="ignore">
									</span></p>
								</td>
								<td style="width:17%;padding: 1px;border:solid #add9c0; border-left-width: 1px; border-left-color: rgb(164, 164, 164); border-right-width: 1px; border-right-color: rgb(164, 164, 164); border-top-style: none; border-bottom-width: 1px; border-bottom-color: rgb(164, 164, 164);" valign="top" width="114">
									<p class="MsoNormal" style="mso-pagination:widow-orphan;text-align:center;vertical-align:middle;"><span style="font-family:微软雅黑;color:rgb(0,0,0);font-style:normal;font-size:11.0000pt;mso-font-kerning:0.0000pt;">
										<input type="text" name="jform_resume_degree_info[${subTableData_index}].major"  datatype="*" class="inputxt"  value="${subTableData['major']?if_exists?html}" ignore="ignore">
									</span></p>
								</td>
								<td style="width:17%;padding: 1px;border:solid #add9c0; border-left-width: 1px; border-left-color: rgb(164, 164, 164); border-right-width: 1px; border-right-color: rgb(164, 164, 164); border-top-style: none; border-bottom-width: 1px; border-bottom-color: rgb(164, 164, 164);" valign="top" width="114">
									<p class="MsoNormal" style="mso-pagination:widow-orphan;text-align:center;vertical-align:middle;"><span style="font-family:微软雅黑;color:rgb(0,0,0);font-style:normal;font-size:11.0000pt;mso-font-kerning:0.0000pt;">
										<input type="text" name="jform_resume_degree_info[${subTableData_index}].degree"  datatype="*" class="inputxt"  value="${subTableData['degree']?if_exists?html}" ignore="ignore">
									</span></p>
								</td>
			             	<td style="width:17%;padding: 1px;border:solid #add9c0; border-left-width: 1px; border-left-color: rgb(164, 164, 164); border-right-width: 1px; border-right-color: rgb(164, 164, 164); border-top-style: none; border-bottom-width: 1px; border-bottom-color: rgb(164, 164, 164);" valign="top" width="114">
									<p class="MsoNormal" style="mso-pagination:widow-orphan;text-align:center;vertical-align:middle;"><span style="font-family:微软雅黑;color:rgb(0,0,0);font-style:normal;font-size:11.0000pt;mso-font-kerning:0.0000pt;">
										<input type="text" name="jform_resume_degree_info[${subTableData_index}].degree_type"  datatype="*" class="inputxt"  value="${subTableData['degree_type']?if_exists?html}" ignore="ignore">
									</span></p>
								</td>
				            	<td style="width:17%;padding: 1px;border:solid #add9c0; border-left-width: 1px; border-left-color: rgb(164, 164, 164); border-right-width: 1px; border-right-color: rgb(164, 164, 164); border-top-style: none; border-bottom-width: 1px; border-bottom-color: rgb(164, 164, 164);" valign="top" width="114">
									<p class="MsoNormal" style="mso-pagination:widow-orphan;text-align:center;vertical-align:middle;"><span style="font-family:微软雅黑;color:rgb(0,0,0);font-style:normal;font-size:11.0000pt;mso-font-kerning:0.0000pt;">
										<input type="text" name="jform_resume_degree_info[${subTableData_index}].certissure"  datatype="*" class="inputxt"  value="${subTableData['certissure']?if_exists?html}" ignore="ignore">
									</span></p>
								</td> 
								<td style="width:15%;"><button class='btn btn-small btn-success degreeRow' type='button'>删除</button></td>
							</tr>
						</#list>
						<#elseif sub?index_of("degree")!=-1 >
							<tr class="first-child">
								<td style="width:17%;padding: 1px;border:solid #add9c0; border-left-width: 1px; border-left-color: rgb(164, 164, 164); border-right-width: 1px; border-right-color: rgb(164, 164, 164); border-top-style: none; border-bottom-width: 1px; border-bottom-color: rgb(164, 164, 164);" valign="top" width="114">
									<p class="MsoNormal" style="mso-pagination:widow-orphan;text-align:center;vertical-align:middle;"><span style="font-family:微软雅黑;color:rgb(0,0,0);font-style:normal;font-size:11.0000pt;mso-font-kerning:0.0000pt;">
										<input type="text" name="jform_resume_degree_info[0].begin_date" datatype="*" class="Wdate" onClick="WdatePicker({dateFmt:'yyyy-MM-dd'})"  value="" ignore="ignore">
									</span></p>
								</td>
								<td style="width:17%;padding: 1px;border:solid #add9c0; border-left-width: 1px; border-left-color: rgb(164, 164, 164); border-right-width: 1px; border-right-color: rgb(164, 164, 164); border-top-style: none; border-bottom-width: 1px; border-bottom-color: rgb(164, 164, 164);" valign="top" width="114">
									<p class="MsoNormal" style="mso-pagination:widow-orphan;text-align:center;vertical-align:middle;"><span style="font-family:微软雅黑;color:rgb(0,0,0);font-style:normal;font-size:11.0000pt;mso-font-kerning:0.0000pt;">
										<input type="text" name="jform_resume_degree_info[0].end_date" datatype="*" class="Wdate" onClick="WdatePicker({dateFmt:'yyyy-MM-dd'})"  ignore="ignore">
									</span></p>
								</td>
								<td style="width:17%;padding: 1px;border:solid #add9c0; border-left-width: 1px; border-left-color: rgb(164, 164, 164); border-right-width: 1px; border-right-color: rgb(164, 164, 164); border-top-style: none; border-bottom-width: 1px; border-bottom-color: rgb(164, 164, 164);" valign="top" width="114">
									<p class="MsoNormal" style="mso-pagination:widow-orphan;text-align:center;vertical-align:middle;"><span style="font-family:微软雅黑;color:rgb(0,0,0);font-style:normal;font-size:11.0000pt;mso-font-kerning:0.0000pt;">
										<input type="text" name="jform_resume_degree_info[0].school_name"  datatype="*" class="inputxt"  value="" ignore="ignore">
									</span></p>
								</td>
								<td style="width:17%;padding: 1px;border:solid #add9c0; border-left-width: 1px; border-left-color: rgb(164, 164, 164); border-right-width: 1px; border-right-color: rgb(164, 164, 164); border-top-style: none; border-bottom-width: 1px; border-bottom-color: rgb(164, 164, 164);" valign="top" width="114">
									<p class="MsoNormal" style="mso-pagination:widow-orphan;text-align:center;vertical-align:middle;"><span style="font-family:微软雅黑;color:rgb(0,0,0);font-style:normal;font-size:11.0000pt;mso-font-kerning:0.0000pt;">
										<input type="text" name="jform_resume_degree_info[0].major"  datatype="*" class="inputxt"  value="" ignore="ignore">
									</span></p>
								</td>
								<td style="width:17%;padding: 1px;border:solid #add9c0; border-left-width: 1px; border-left-color: rgb(164, 164, 164); border-right-width: 1px; border-right-color: rgb(164, 164, 164); border-top-style: none; border-bottom-width: 1px; border-bottom-color: rgb(164, 164, 164);" valign="top" width="114">
									<p class="MsoNormal" style="mso-pagination:widow-orphan;text-align:center;vertical-align:middle;"><span style="font-family:微软雅黑;color:rgb(0,0,0);font-style:normal;font-size:11.0000pt;mso-font-kerning:0.0000pt;">
										<input type="text" name="jform_resume_degree_info[0].degree"  datatype="*" class="inputxt"  value="" ignore="ignore">
									</span></p>
								</td>
							 	<td style="width:17%;padding: 1px;border:solid #add9c0; border-left-width: 1px; border-left-color: rgb(164, 164, 164); border-right-width: 1px; border-right-color: rgb(164, 164, 164); border-top-style: none; border-bottom-width: 1px; border-bottom-color: rgb(164, 164, 164);" valign="top" width="114">
									<p class="MsoNormal" style="mso-pagination:widow-orphan;text-align:center;vertical-align:middle;"><span style="font-family:微软雅黑;color:rgb(0,0,0);font-style:normal;font-size:11.0000pt;mso-font-kerning:0.0000pt;">
										<input type="text" name="jform_resume_degree_info[0].degree_type"  datatype="*" class="inputxt"  value="" ignore="ignore">
									</span></p>
								</td>
							 	<td style="width:17%;padding: 1px;border:solid #add9c0; border-left-width: 1px; border-left-color: rgb(164, 164, 164); border-right-width: 1px; border-right-color: rgb(164, 164, 164); border-top-style: none; border-bottom-width: 1px; border-bottom-color: rgb(164, 164, 164);" valign="top" width="114">
									<p class="MsoNormal" style="mso-pagination:widow-orphan;text-align:center;vertical-align:middle;"><span style="font-family:微软雅黑;color:rgb(0,0,0);font-style:normal;font-size:11.0000pt;mso-font-kerning:0.0000pt;">
										<input type="text" name="jform_resume_degree_info[0].certissure"  datatype="*" class="inputxt"  value="" ignore="ignore">
									</span></p>
								</td>
								<td style="width:15%;"><button class='btn btn-small btn-success degreeRow' type='button'>删除</button></td>
							</tr>
						</#if>
					  </#list>
					</tbody>
				</table>
			</td>
		</tr>
		
		<tr style="mso-yfti-irow:9;height:26.25pt">
		<td colspan="6" nowrap="nowrap" style="width: 675.75pt; border-top-style: none; border-bottom-color: rgb(0, 176, 240); border-bottom-width: 1.5pt; border-left-style: none; border-bottom-color: rgb(0, 176, 240); border-bottom-width: 1.5pt; padding: 0cm 5.4pt; height: 26.25pt;" width="901">
			<p align="left" class="MsoNormal"><b><span style="font-size: 11pt; font-family: 微软雅黑, sans-serif;">培训经历<span lang="EN-US"><o:p></o:p></span></span></b></p>
		</td>
		</tr>
		<tr>
			<td colspan="6" nowrap="nowrap" style="width: 675.75pt; border-top-style: none; border-bottom-color: rgb(0, 176, 240); border-bottom-width: 1.5pt; border-left-style: none; border-bottom-color: rgb(0, 176, 240); border-bottom-width: 1.5pt; padding: 0cm 5.4pt; height: 26.25pt;" width="901">
				<table class="MsoTableGrid" style="border-collapse:collapse; width:99%;margin-left:5.6500pt;mso-table-layout-alt:fixed;mso-padding-alt:0.0000pt 5.4000pt 0.0000pt 5.4000pt ;">
					<thead>
						<tr>
							<td colspan="5" style="padding: 1px;border:solid #add9c0; border-left-width: 1px; border-left-color: rgb(164, 164, 164); border-right-width: 1px; border-right-color: rgb(164, 164, 164); border-top-style: none; border-bottom-width: 1px; border-bottom-color: rgb(164, 164, 164);" valign="top" width="689">
							<p class="MsoNormal" style="mso-pagination:widow-orphan;text-align:right;vertical-align:middle;"><span style="mso-spacerun:'yes';font-family:微软雅黑;color:rgb(0,0,0);font-style:normal;font-size:11.0000pt;mso-font-kerning:0.0000pt;">
								<button class="btn btn-small btn-success listAdd" type="button" onclick="addTrain('trainTab','add_TrainTab_template')">添加一行</button>
							</span></p>
							</td>
						</tr>
						<tr>
							<td style="width:17%;padding: 1px;border:solid #add9c0; border-left-width: 1px; border-left-color: rgb(164, 164, 164); border-right-width: 1px; border-right-color: rgb(164, 164, 164); border-top-style: none; border-bottom-width: 1px; border-bottom-color: rgb(164, 164, 164);" valign="top" width="114">
							<p class="MsoNormal" style="mso-pagination:widow-orphan;text-align:center;vertical-align:middle;"><span style="mso-spacerun:'yes';font-family:微软雅黑;color:rgb(0,0,0);font-style:normal;font-size:11.0000pt;mso-font-kerning:0.0000pt;">开始时间</span></p>
							</td>
							<td style="width:17%;padding: 1px;border:solid #add9c0; border-left-width: 1px; border-left-color: rgb(164, 164, 164); border-right-width: 1px; border-right-color: rgb(164, 164, 164); border-top-style: none; border-bottom-width: 1px; border-bottom-color: rgb(164, 164, 164);" valign="top" width="114">
							<p class="MsoNormal" style="mso-pagination:widow-orphan;text-align:center;vertical-align:middle;"><span style="mso-spacerun:'yes';font-family:微软雅黑;color:rgb(0,0,0);font-style:normal;font-size:11.0000pt;mso-font-kerning:0.0000pt;">结束时间</span></p>
							</td>
							<td style="width:17%;padding: 1px;border:solid #add9c0; border-left-width: 1px; border-left-color: rgb(164, 164, 164); border-right-width: 1px; border-right-color: rgb(164, 164, 164); border-top-style: none; border-bottom-width: 1px; border-bottom-color: rgb(164, 164, 164);" valign="top" width="114">
							<p class="MsoNormal" style="mso-pagination:widow-orphan;text-align:center;vertical-align:middle;"><span style="mso-spacerun:'yes';font-family:微软雅黑;color:rgb(0,0,0);font-style:normal;font-size:11.0000pt;mso-font-kerning:0.0000pt;">培训组织单位</span></p>
							</td>
							<td style="width:17%;padding: 1px;border:solid #add9c0; border-left-width: 1px; border-left-color: rgb(164, 164, 164); border-right-width: 1px; border-right-color: rgb(164, 164, 164); border-top-style: none; border-bottom-width: 1px; border-bottom-color: rgb(164, 164, 164);" valign="top" width="114">
							<p class="MsoNormal" style="mso-pagination:widow-orphan;text-align:center;vertical-align:middle;"><span style="mso-spacerun:'yes';font-family:微软雅黑;color:rgb(0,0,0);font-style:normal;font-size:11.0000pt;mso-font-kerning:0.0000pt;">受训课程</span></p>
							</td>
							<td style="width:17%;padding: 1px;border:solid #add9c0; border-left-width: 1px; border-left-color: rgb(164, 164, 164); border-right-width: 1px; border-right-color: rgb(164, 164, 164); border-top-style: none; border-bottom-width: 1px; border-bottom-color: rgb(164, 164, 164);" valign="top" width="114">
							<p class="MsoNormal" style="mso-pagination:widow-orphan;text-align:center;vertical-align:middle;"><span style="mso-spacerun:'yes';font-family:微软雅黑;color:rgb(0,0,0);font-style:normal;font-size:11.0000pt;mso-font-kerning:0.0000pt;">所获证书</span></p>
							</td>	 
						</tr>
					</thead>
					<tbody id="trainTab">
						<#assign subTableStr>${head.subTableStr?if_exists?html}</#assign>
						<#assign subtablelist=subTableStr?split(",")>
						<#list subtablelist as sub >
						<#if sub?index_of("train")!=-1 && data['${sub}']?exists&&(data['${sub}']?size>0) >
					    <#list data['${sub}']  as subTableData>
							<tr class="first-child">
								<td style="width:17%;padding: 1px;border:solid #add9c0; border-left-width: 1px; border-left-color: rgb(164, 164, 164); border-right-width: 1px; border-right-color: rgb(164, 164, 164); border-top-style: none; border-bottom-width: 1px; border-bottom-color: rgb(164, 164, 164);" valign="top" width="114">
									<p class="MsoNormal" style="mso-pagination:widow-orphan;text-align:center;vertical-align:middle;"><span style="font-family:微软雅黑;color:rgb(0,0,0);font-style:normal;font-size:11.0000pt;mso-font-kerning:0.0000pt;">
										<input type="text" name="jform_resume_train_info[${subTableData_index}].begin_date" datatype="*" class="Wdate" onClick="WdatePicker({dateFmt:'yyyy-MM-dd'})"  value="${subTableData['begin_date']?if_exists?html}" ignore="ignore">
									</span></p>
								</td>
								<td style="width:17%;padding: 1px;border:solid #add9c0; border-left-width: 1px; border-left-color: rgb(164, 164, 164); border-right-width: 1px; border-right-color: rgb(164, 164, 164); border-top-style: none; border-bottom-width: 1px; border-bottom-color: rgb(164, 164, 164);" valign="top" width="114">
									<p class="MsoNormal" style="mso-pagination:widow-orphan;text-align:center;vertical-align:middle;"><span style="font-family:微软雅黑;color:rgb(0,0,0);font-style:normal;font-size:11.0000pt;mso-font-kerning:0.0000pt;">
										<input name="jform_resume_train_info[${subTableData_index}].end_date" datatype="*" class="Wdate" onClick="WdatePicker({dateFmt:'yyyy-MM-dd'})"  value="${subTableData['end_date']?if_exists?html}" ignore="ignore">
									</span></p>
								</td>
								<td style="width:17%;padding: 1px;border:solid #add9c0; border-left-width: 1px; border-left-color: rgb(164, 164, 164); border-right-width: 1px; border-right-color: rgb(164, 164, 164); border-top-style: none; border-bottom-width: 1px; border-bottom-color: rgb(164, 164, 164);" valign="top" width="114">
									<p class="MsoNormal" style="mso-pagination:widow-orphan;text-align:center;vertical-align:middle;"><span style="font-family:微软雅黑;color:rgb(0,0,0);font-style:normal;font-size:11.0000pt;mso-font-kerning:0.0000pt;">
										<input type="text" name="jform_resume_train_info[${subTableData_index}].school_name"  datatype="*" class="inputxt"  value="${subTableData['school_name']?if_exists?html}" ignore="ignore">
									</span></p>
								</td>
								<td style="width:17%;padding: 1px;border:solid #add9c0; border-left-width: 1px; border-left-color: rgb(164, 164, 164); border-right-width: 1px; border-right-color: rgb(164, 164, 164); border-top-style: none; border-bottom-width: 1px; border-bottom-color: rgb(164, 164, 164);" valign="top" width="114">
									<p class="MsoNormal" style="mso-pagination:widow-orphan;text-align:center;vertical-align:middle;"><span style="font-family:微软雅黑;color:rgb(0,0,0);font-style:normal;font-size:11.0000pt;mso-font-kerning:0.0000pt;">
										<input type="text" name="jform_resume_train_info[${subTableData_index}].class_name"  datatype="*" class="inputxt"  value="${subTableData['class_name']?if_exists?html}" ignore="ignore">
									</span></p>
								</td>
								<td style="width:17%;padding: 1px;border:solid #add9c0; border-left-width: 1px; border-left-color: rgb(164, 164, 164); border-right-width: 1px; border-right-color: rgb(164, 164, 164); border-top-style: none; border-bottom-width: 1px; border-bottom-color: rgb(164, 164, 164);" valign="top" width="114">
									<p class="MsoNormal" style="mso-pagination:widow-orphan;text-align:center;vertical-align:middle;"><span style="font-family:微软雅黑;color:rgb(0,0,0);font-style:normal;font-size:11.0000pt;mso-font-kerning:0.0000pt;">
										<input type="text" name="jform_resume_train_info[${subTableData_index}].cert_book"  datatype="*" class="inputxt"  value="${subTableData['cert_book']?if_exists?html}" ignore="ignore">
									</span></p>
								</td> 
								<td style="width:15%;"><button class='btn btn-small btn-success trainRow' type='button'>删除</button></td>
							</tr>
						</#list>
						<#elseif sub?index_of("train")!=-1 >
							<tr class="first-child">
								<td style="width:17%;padding: 1px;border:solid #add9c0; border-left-width: 1px; border-left-color: rgb(164, 164, 164); border-right-width: 1px; border-right-color: rgb(164, 164, 164); border-top-style: none; border-bottom-width: 1px; border-bottom-color: rgb(164, 164, 164);" valign="top" width="114">
									<p class="MsoNormal" style="mso-pagination:widow-orphan;text-align:center;vertical-align:middle;"><span style="font-family:微软雅黑;color:rgb(0,0,0);font-style:normal;font-size:11.0000pt;mso-font-kerning:0.0000pt;">
										<input type="text" name="jform_resume_train_info[0].begin_date" datatype="*" class="Wdate" onClick="WdatePicker({dateFmt:'yyyy-MM-dd'})"  value="" ignore="ignore">
									</span></p>
								</td>
								<td style="width:17%;padding: 1px;border:solid #add9c0; border-left-width: 1px; border-left-color: rgb(164, 164, 164); border-right-width: 1px; border-right-color: rgb(164, 164, 164); border-top-style: none; border-bottom-width: 1px; border-bottom-color: rgb(164, 164, 164);" valign="top" width="114">
									<p class="MsoNormal" style="mso-pagination:widow-orphan;text-align:center;vertical-align:middle;"><span style="font-family:微软雅黑;color:rgb(0,0,0);font-style:normal;font-size:11.0000pt;mso-font-kerning:0.0000pt;">
										<input type="text" name="jform_resume_train_info[0].end_date" datatype="*" class="Wdate" onClick="WdatePicker({dateFmt:'yyyy-MM-dd'})"  ignore="ignore">
									</span></p>
								</td>
								<td style="width:17%;padding: 1px;border:solid #add9c0; border-left-width: 1px; border-left-color: rgb(164, 164, 164); border-right-width: 1px; border-right-color: rgb(164, 164, 164); border-top-style: none; border-bottom-width: 1px; border-bottom-color: rgb(164, 164, 164);" valign="top" width="114">
									<p class="MsoNormal" style="mso-pagination:widow-orphan;text-align:center;vertical-align:middle;"><span style="font-family:微软雅黑;color:rgb(0,0,0);font-style:normal;font-size:11.0000pt;mso-font-kerning:0.0000pt;">
										<input type="text" name="jform_resume_train_info[0].school_name"  datatype="*" class="inputxt"  value="" ignore="ignore">
									</span></p>
								</td>
								<td style="width:17%;padding: 1px;border:solid #add9c0; border-left-width: 1px; border-left-color: rgb(164, 164, 164); border-right-width: 1px; border-right-color: rgb(164, 164, 164); border-top-style: none; border-bottom-width: 1px; border-bottom-color: rgb(164, 164, 164);" valign="top" width="114">
									<p class="MsoNormal" style="mso-pagination:widow-orphan;text-align:center;vertical-align:middle;"><span style="font-family:微软雅黑;color:rgb(0,0,0);font-style:normal;font-size:11.0000pt;mso-font-kerning:0.0000pt;">
										<input type="text" name="jform_resume_train_info[0].class_name"  datatype="*" class="inputxt"  value="" ignore="ignore">
									</span></p>
								</td>
								<td style="width:17%;padding: 1px;border:solid #add9c0; border-left-width: 1px; border-left-color: rgb(164, 164, 164); border-right-width: 1px; border-right-color: rgb(164, 164, 164); border-top-style: none; border-bottom-width: 1px; border-bottom-color: rgb(164, 164, 164);" valign="top" width="114">
									<p class="MsoNormal" style="mso-pagination:widow-orphan;text-align:center;vertical-align:middle;"><span style="font-family:微软雅黑;color:rgb(0,0,0);font-style:normal;font-size:11.0000pt;mso-font-kerning:0.0000pt;">
										<input type="text" name="jform_resume_train_info[0].cert_book"  datatype="*" class="inputxt"  value="" ignore="ignore">
									</span></p>
								</td>
 
								<td style="width:15%;"><button class='btn btn-small btn-success trainRow' type='button'>删除</button></td>
							</tr>
						</#if>
					  </#list>
					</tbody>
				</table>
			</td>
		</tr>
		
		<tr style="mso-yfti-irow:9;height:26.25pt">
		<td colspan="6" nowrap="nowrap" style="width: 675.75pt; border-top-style: none; border-bottom-color: rgb(0, 176, 240); border-bottom-width: 1.5pt; border-left-style: none; border-bottom-color: rgb(0, 176, 240); border-bottom-width: 1.5pt; padding: 0cm 5.4pt; height: 26.25pt;" width="901">
			<p align="left" class="MsoNormal"><b><span style="font-size: 11pt; font-family: 微软雅黑, sans-serif;">工作经验<span lang="EN-US"><o:p></o:p></span></span></b></p>
		</td>
		</tr>
		<tr style="mso-yfti-irow:9;height:26.25pt">
		<td colspan="6" nowrap="nowrap" style="width: 675.75pt; border-top-style: none; border-bottom-color: rgb(0, 176, 240); border-bottom-width: 1.5pt; border-left-style: none; border-bottom-color: rgb(0, 176, 240); border-bottom-width: 1.5pt; padding: 0cm 5.4pt; height: 26.25pt;" width="901">
			<table class="MsoTableGrid" style="border-collapse:collapse; width:99%;margin-left:5.6500pt;mso-table-layout-alt:fixed;mso-padding-alt:0.0000pt 5.4000pt 0.0000pt 5.4000pt ;">
			  <thead>	
				<tr>
					<td colspan="6" style="padding: 1px;border:solid #add9c0; border-left-width: 1px; border-left-color: rgb(164, 164, 164); border-right-width: 1px; border-right-color: rgb(164, 164, 164); border-top-style: none; border-bottom-width: 1px; border-bottom-color: rgb(164, 164, 164);" valign="top" width="689">
					<p class="MsoNormal" style="mso-pagination:widow-orphan;text-align:right;vertical-align:middle;"><span style="mso-spacerun:'yes';font-family:微软雅黑;color:rgb(0,0,0);font-style:normal;font-size:11.0000pt;mso-font-kerning:0.0000pt;">
						<button class="btn btn-small btn-success listAdd" type="button" onclick="addRow('expTab','add_expTab_template')">添加工作经验</button>
					</span></p>
					</td>
				</tr>
			 </thead>
			 <tbody id="expTab"> 
				<#assign subTableStr>${head.subTableStr?if_exists?html}</#assign>
					<#assign subtablelist=subTableStr?split(",")>
					<#list subtablelist as sub >
					<#if sub?index_of("exp")!=-1 && data['${sub}']?exists&&(data['${sub}']?size>0) >
					<#list data['${sub}']  as subTableData>
					    <tr class="first-child">
					        <td colspan="6" nowrap="nowrap" style="width: 675.75pt; border-top-style: none; border-bottom-color: rgb(0, 176, 240); border-bottom-width: 1.5pt; border-left-style: none; border-bottom-color: rgb(0, 176, 240); border-bottom-width: 1.5pt; padding: 0cm 5.4pt; height: 26.25pt;" width="901">
						    	<table class="MsoTableGrid" style="border-collapse:collapse; width:99%;margin-left:5.6500pt;mso-table-layout-alt:fixed;mso-padding-alt:0.0000pt 5.4000pt 0.0000pt 5.4000pt;">
										<tbody>
											<tr>
												<td colspan=6 style="width:15%;">
													工作经验(<span name="index">${subTableData_index+1}</span>)<span style="float:right;"><button class='btn btn-small btn-success delrow' type='button'>删除</button></span>
												</td>
											</tr>
											<tr style="mso-yfti-irow:4;height:24.75pt">
													<td nowrap="nowrap" style="width: 92.9pt; border-right-color: rgb(165, 165, 165); border-bottom-color: rgb(165, 165, 165); border-left-color: rgb(165, 165, 165); border-right-width: 1pt; border-bottom-width: 1pt; border-left-width: 1pt; border-top-style: none; padding: 0cm 5.4pt; height: 24.75pt; background-color: rgb(242, 242, 242);" width="124">
														<p align="center" class="MsoNormal" style="text-align:center;mso-pagination:widow-orphan"><span style="font-size: 11pt; font-family: 微软雅黑, sans-serif;">开始时间<span lang="EN-US"><o:p></o:p></span></span></p>
													</td>
													<td style="width: 160px; border-top-style: none; border-left-style: none; border-bottom-color: rgb(165, 165, 165); border-bottom-width: 1pt; border-right-color: rgb(165, 165, 165); border-right-width: 1pt; padding: 0cm 5.4pt; height: 24px; white-space: nowrap;">
														<p align="left" class="MsoNormal"><span lang="EN-US">
														<input type="text" name="jform_resume_exp_info[${subTableData_index}].begin_date"  datatype="*" class="Wdate" onClick="WdatePicker({dateFmt:'yyyy-MM-dd'})"  value="${subTableData['begin_date']?if_exists?html}" ignore="ignore">
														<span class="Validform_checktip"></span>
														<label class="Validform_label" style="display: none;">开始时间</label>
														</span></p>
													</td>
													<td nowrap="nowrap" style="width: 78.8pt; border-top-style: none; border-left-style: none; border-bottom-color: rgb(165, 165, 165); border-bottom-width: 1pt; border-right-color: rgb(165, 165, 165); border-right-width: 1pt; padding: 0cm 5.4pt; height: 24.75pt; background-color: rgb(242, 242, 242);" width="105">
														<p align="center" class="MsoNormal" style="text-align:center;mso-pagination:widow-orphan"><span style="font-size: 11pt; font-family: 微软雅黑, sans-serif;">结束时间<span lang="EN-US"><o:p></o:p></span></span></p>
													</td>
													<td style="width: 160px; border-top-style: none; border-left-style: none; border-bottom-color: rgb(165, 165, 165); border-bottom-width: 1pt; border-right-color: rgb(165, 165, 165); border-right-width: 1pt; padding: 0cm 5.4pt; height: 24px; white-space: nowrap;">
														<p align="left" class="MsoNormal"><span lang="EN-US">
														<input type="text" name="jform_resume_exp_info[${subTableData_index}].end_date" datatype="*" class="Wdate" onClick="WdatePicker({dateFmt:'yyyy-MM-dd'})"  value="${subTableData['end_date']?if_exists?html}" ignore="ignore">
														<span class="Validform_checktip"></span>
														<label class="Validform_label" style="display: none;">结束时间</label>
														</span></p>
													</td>
													<td nowrap="nowrap" style="width: 78.8pt; border-top-style: none; border-left-style: none; border-bottom-color: rgb(165, 165, 165); border-bottom-width: 1pt; border-right-color: rgb(165, 165, 165); border-right-width: 1pt; padding: 0cm 5.4pt; height: 24.75pt; background-color: rgb(242, 242, 242);" width="105">
														<p align="center" class="MsoNormal" style="text-align:center;mso-pagination:widow-orphan"><span style="font-size: 11pt; font-family: 微软雅黑, sans-serif;">公司<span lang="EN-US"><o:p></o:p></span></span></p>
													</td>
													<td style="width: 160px; border-top-style: none; border-left-style: none; border-bottom-color: rgb(165, 165, 165); border-bottom-width: 1pt; border-right-color: rgb(165, 165, 165); border-right-width: 1pt; padding: 0cm 5.4pt; height: 24px; white-space: nowrap;">
														<p align="left" class="MsoNormal"><span lang="EN-US">
														<input type="text" name="jform_resume_exp_info[${subTableData_index}].company_name" datatype="*" class="inputxt" value="${subTableData['company_name']?if_exists?html}" ignore="ignore">
														<span class="Validform_checktip"></span>
														<label class="Validform_label" style="display: none;">公司</label>
														</span></p>
													</td>
											</tr>
											<tr style="mso-yfti-irow:4;height:24.75pt">
													<td nowrap="nowrap" style="width: 92.9pt; border-right-color: rgb(165, 165, 165); border-bottom-color: rgb(165, 165, 165); border-left-color: rgb(165, 165, 165); border-right-width: 1pt; border-bottom-width: 1pt; border-left-width: 1pt; border-top-style: none; padding: 0cm 5.4pt; height: 24.75pt; background-color: rgb(242, 242, 242);" width="124">
														<p align="center" class="MsoNormal" style="text-align:center;mso-pagination:widow-orphan"><span style="font-size: 11pt; font-family: 微软雅黑, sans-serif;">所在部门<span lang="EN-US"><o:p></o:p></span></span></p>
													</td>
													<td style="width: 160px; border-top-style: none; border-left-style: none; border-bottom-color: rgb(165, 165, 165); border-bottom-width: 1pt; border-right-color: rgb(165, 165, 165); border-right-width: 1pt; padding: 0cm 5.4pt; height: 24px; white-space: nowrap;">
														<p align="left" class="MsoNormal"><span lang="EN-US">
														<input type="text" name="jform_resume_exp_info[${subTableData_index}].depart_name" datatype="*" class="inputxt" value="${subTableData['depart_name']?if_exists?html}" ignore="ignore">
														<span class="Validform_checktip"></span>
														<label class="Validform_label" style="display: none;">所在部门</label>
													</span></p>
													</td>
													<td nowrap="nowrap" style="width: 78.8pt; border-top-style: none; border-left-style: none; border-bottom-color: rgb(165, 165, 165); border-bottom-width: 1pt; border-right-color: rgb(165, 165, 165); border-right-width: 1pt; padding: 0cm 5.4pt; height: 24.75pt; background-color: rgb(242, 242, 242);" width="105">
													<p align="center" class="MsoNormal" style="text-align:center;mso-pagination:widow-orphan"><span style="font-size: 11pt; font-family: 微软雅黑, sans-serif;">职位<span lang="EN-US"><o:p></o:p></span></span></p>
													</td>
													<td colspan="3" style="width: 160px; border-top-style: none; border-left-style: none; border-bottom-color: rgb(165, 165, 165); border-bottom-width: 1pt; border-right-color: rgb(165, 165, 165); border-right-width: 1pt; padding: 0cm 5.4pt; height: 24px; white-space: nowrap;">
													<p align="left" class="MsoNormal"><span lang="EN-US">
													<input type="text" name="jform_resume_exp_info[${subTableData_index}].post" datatype="*" class="inputxt" value="${subTableData['post']?if_exists?html}" ignore="ignore">
													<span class="Validform_checktip"></span>
													<label class="Validform_label" style="display: none;">职位</label>
													</span></p>
													</td>
												</tr>
												<tr style="mso-yfti-irow:4;height:24.75pt">
													<td nowrap="nowrap" style="width: 92.9pt; border-right-color: rgb(165, 165, 165); border-bottom-color: rgb(165, 165, 165); border-left-color: rgb(165, 165, 165); border-right-width: 1pt; border-bottom-width: 1pt; border-left-width: 1pt; border-top-style: none; padding: 0cm 5.4pt; height: 24.75pt; background-color: rgb(242, 242, 242);" width="124">
														<p align="center" class="MsoNormal" style="text-align:center;mso-pagination:widow-orphan"><span style="font-size: 11pt; font-family: 微软雅黑, sans-serif;">证明人姓名<span lang="EN-US"><o:p></o:p></span></span></p>
													</td>
													<td style="width: 160px; border-top-style: none; border-left-style: none; border-bottom-color: rgb(165, 165, 165); border-bottom-width: 1pt; border-right-color: rgb(165, 165, 165); border-right-width: 1pt; padding: 0cm 5.4pt; height: 24px; white-space: nowrap;">
														<p align="left" class="MsoNormal"><span lang="EN-US">
														<input type="text" name="jform_resume_exp_info[${subTableData_index}].cert_man_name" datatype="*" class="inputxt" value="${subTableData['cert_man_name']?if_exists?html}" ignore="ignore">
														<span class="Validform_checktip"></span>
														<label class="Validform_label" style="display: none;">证明人姓名</label>
													</span></p>
													</td>
													<td nowrap="nowrap" style="width: 78.8pt; border-top-style: none; border-left-style: none; border-bottom-color: rgb(165, 165, 165); border-bottom-width: 1pt; border-right-color: rgb(165, 165, 165); border-right-width: 1pt; padding: 0cm 5.4pt; height: 24.75pt; background-color: rgb(242, 242, 242);" width="105">
													<p align="center" class="MsoNormal" style="text-align:center;mso-pagination:widow-orphan"><span style="font-size: 11pt; font-family: 微软雅黑, sans-serif;">证明人电话<span lang="EN-US"><o:p></o:p></span></span></p>
													</td>
													<td colspan="3" style="width: 160px; border-top-style: none; border-left-style: none; border-bottom-color: rgb(165, 165, 165); border-bottom-width: 1pt; border-right-color: rgb(165, 165, 165); border-right-width: 1pt; padding: 0cm 5.4pt; height: 24px; white-space: nowrap;">
													<p align="left" class="MsoNormal"><span lang="EN-US">
													<input type="text" name="jform_resume_exp_info[${subTableData_index}].cert_man_phone" datatype="*" class="inputxt" value="${subTableData['cert_man_phone']?if_exists?html}" ignore="ignore">
													<span class="Validform_checktip"></span>
													<label class="Validform_label" style="display: none;">证明人电话</label>
													</span></p>
													</td>
												</tr>
												<tr>
													<td nowrap="nowrap" style="width: 78.8pt; border-top-style: none; border-left-style: none; border-bottom-color: rgb(165, 165, 165); border-bottom-width: 1pt; border-right-color: rgb(165, 165, 165); border-right-width: 1pt; padding: 0cm 5.4pt; height: 24.75pt; background-color: rgb(242, 242, 242);" width="105">
														<p align="center" class="MsoNormal" style="text-align:center;mso-pagination:widow-orphan"><span style="font-size: 11pt; font-family: 微软雅黑, sans-serif;">离职原因<span lang="EN-US"><o:p></o:p></span></span></p>
														</td>
														<td colspan="5" style="width: 160px; border-top-style: none; border-left-style: none; border-bottom-color: rgb(165, 165, 165); border-bottom-width: 1pt; border-right-color: rgb(165, 165, 165); border-right-width: 1pt; padding: 0cm 5.4pt; height: 24px; white-space: nowrap;">
														<p align="left" class="MsoNormal"><span lang="EN-US">
														<textarea name="jform_resume_exp_info[${subTableData_index}].reason_go" datatype="*" class="inputxt" ignore="ignore" rows="3" cols="1000">${subTableData['reason_go']?if_exists?html}</textarea>
														<span class="Validform_checktip"></span>
														<label class="Validform_label" style="display: none;">离职原因</label>
														</span></p>
													</td>
											</tr>
						 				</tbody>
									</table>
									</td>
								</tr>
						    </#list>
						<#elseif sub?index_of("exp")!=-1 >
							<tr class="first-child">
					          <td colspan="6" nowrap="nowrap" style="width: 675.75pt; border-top-style: none; border-bottom-color: rgb(0, 176, 240); border-bottom-width: 1.5pt; border-left-style: none; border-bottom-color: rgb(0, 176, 240); border-bottom-width: 1.5pt; padding: 0cm 5.4pt; height: 26.25pt;" width="901">
								<table class="MsoTableGrid" style="border-collapse:collapse; width:99%;margin-left:5.6500pt;mso-table-layout-alt:fixed;mso-padding-alt:0.0000pt 5.4000pt 0.0000pt 5.4000pt;">
										<tbody>
											<tr>
												<td colspan=6 style="width:15%;">
													工作经验(<span name="index">1</span>)<span style="float:right;"><button class='btn btn-small btn-success delrow' type='button'>删除</button></span>
												</td>
											</tr>
											<tr style="mso-yfti-irow:4;height:24.75pt">
													<td nowrap="nowrap" style="width: 92.9pt; border-right-color: rgb(165, 165, 165); border-bottom-color: rgb(165, 165, 165); border-left-color: rgb(165, 165, 165); border-right-width: 1pt; border-bottom-width: 1pt; border-left-width: 1pt; border-top-style: none; padding: 0cm 5.4pt; height: 24.75pt; background-color: rgb(242, 242, 242);" width="124">
														<p align="center" class="MsoNormal" style="text-align:center;mso-pagination:widow-orphan"><span style="font-size: 11pt; font-family: 微软雅黑, sans-serif;">开始时间<span lang="EN-US"><o:p></o:p></span></span></p>
													</td>
													<td style="width: 160px; border-top-style: none; border-left-style: none; border-bottom-color: rgb(165, 165, 165); border-bottom-width: 1pt; border-right-color: rgb(165, 165, 165); border-right-width: 1pt; padding: 0cm 5.4pt; height: 24px; white-space: nowrap;">
														<p align="left" class="MsoNormal"><span lang="EN-US">
														<input type="text" name="jform_resume_exp_info[0].begin_date" datatype="*" class="Wdate" onClick="WdatePicker({dateFmt:'yyyy-MM-dd'})"  value="" ignore="ignore">
														<span class="Validform_checktip"></span>
														<label class="Validform_label" style="display: none;">开始时间</label>
														</span></p>
													</td>
													<td nowrap="nowrap" style="width: 78.8pt; border-top-style: none; border-left-style: none; border-bottom-color: rgb(165, 165, 165); border-bottom-width: 1pt; border-right-color: rgb(165, 165, 165); border-right-width: 1pt; padding: 0cm 5.4pt; height: 24.75pt; background-color: rgb(242, 242, 242);" width="105">
														<p align="center" class="MsoNormal" style="text-align:center;mso-pagination:widow-orphan"><span style="font-size: 11pt; font-family: 微软雅黑, sans-serif;">结束时间<span lang="EN-US"><o:p></o:p></span></span></p>
													</td>
													<td style="width: 160px; border-top-style: none; border-left-style: none; border-bottom-color: rgb(165, 165, 165); border-bottom-width: 1pt; border-right-color: rgb(165, 165, 165); border-right-width: 1pt; padding: 0cm 5.4pt; height: 24px; white-space: nowrap;">
														<p align="left" class="MsoNormal"><span lang="EN-US">
														<input type="text" name="jform_resume_exp_info[0].end_date" datatype="*" class="Wdate" onClick="WdatePicker({dateFmt:'yyyy-MM-dd'})"  value="" ignore="ignore">
														<span class="Validform_checktip"></span>
														<label class="Validform_label" style="display: none;">结束时间</label>
														</span></p>
													</td>
													<td nowrap="nowrap" style="width: 78.8pt; border-top-style: none; border-left-style: none; border-bottom-color: rgb(165, 165, 165); border-bottom-width: 1pt; border-right-color: rgb(165, 165, 165); border-right-width: 1pt; padding: 0cm 5.4pt; height: 24.75pt; background-color: rgb(242, 242, 242);" width="105">
														<p align="center" class="MsoNormal" style="text-align:center;mso-pagination:widow-orphan"><span style="font-size: 11pt; font-family: 微软雅黑, sans-serif;">公司<span lang="EN-US"><o:p></o:p></span></span></p>
													</td>
													<td style="width: 160px; border-top-style: none; border-left-style: none; border-bottom-color: rgb(165, 165, 165); border-bottom-width: 1pt; border-right-color: rgb(165, 165, 165); border-right-width: 1pt; padding: 0cm 5.4pt; height: 24px; white-space: nowrap;">
														<p align="left" class="MsoNormal"><span lang="EN-US">
														<input type="text" name="jform_resume_exp_info[0].company_name" datatype="*" class="inputxt" value="" ignore="ignore">
														<span class="Validform_checktip"></span>
														<label class="Validform_label" style="display: none;">所在公司</label>
														</span></p>
													</td>
											</tr>
											<tr style="mso-yfti-irow:4;height:24.75pt">
													<td nowrap="nowrap" style="width: 92.9pt; border-right-color: rgb(165, 165, 165); border-bottom-color: rgb(165, 165, 165); border-left-color: rgb(165, 165, 165); border-right-width: 1pt; border-bottom-width: 1pt; border-left-width: 1pt; border-top-style: none; padding: 0cm 5.4pt; height: 24.75pt; background-color: rgb(242, 242, 242);" width="124">
														<p align="center" class="MsoNormal" style="text-align:center;mso-pagination:widow-orphan"><span style="font-size: 11pt; font-family: 微软雅黑, sans-serif;">所在部门<span lang="EN-US"><o:p></o:p></span></span></p>
													</td>
													<td style="width: 160px; border-top-style: none; border-left-style: none; border-bottom-color: rgb(165, 165, 165); border-bottom-width: 1pt; border-right-color: rgb(165, 165, 165); border-right-width: 1pt; padding: 0cm 5.4pt; height: 24px; white-space: nowrap;">
														<p align="left" class="MsoNormal"><span lang="EN-US">
														<input type="text" name="jform_resume_exp_info[0].depart_name" datatype="*" class="inputxt" value="" ignore="ignore">
														<span class="Validform_checktip"></span>
														<label class="Validform_label" style="display: none;">所在部门</label>
													</span></p>
													</td>
													<td nowrap="nowrap" style="width: 78.8pt; border-top-style: none; border-left-style: none; border-bottom-color: rgb(165, 165, 165); border-bottom-width: 1pt; border-right-color: rgb(165, 165, 165); border-right-width: 1pt; padding: 0cm 5.4pt; height: 24.75pt; background-color: rgb(242, 242, 242);" width="105">
													<p align="center" class="MsoNormal" style="text-align:center;mso-pagination:widow-orphan"><span style="font-size: 11pt; font-family: 微软雅黑, sans-serif;">职位<span lang="EN-US"><o:p></o:p></span></span></p>
													</td>
													<td colspan="3" style="width: 160px; border-top-style: none; border-left-style: none; border-bottom-color: rgb(165, 165, 165); border-bottom-width: 1pt; border-right-color: rgb(165, 165, 165); border-right-width: 1pt; padding: 0cm 5.4pt; height: 24px; white-space: nowrap;">
													<p align="left" class="MsoNormal"><span lang="EN-US">
													<input type="text" name="jform_resume_exp_info[0].post" datatype="*" class="inputxt" value="" ignore="ignore">
													<span class="Validform_checktip"></span>
													<label class="Validform_label" style="display: none;">职位</label>
													</span></p>
													</td>
											</tr>
											<tr style="mso-yfti-irow:4;height:24.75pt">
													<td nowrap="nowrap" style="width: 92.9pt; border-right-color: rgb(165, 165, 165); border-bottom-color: rgb(165, 165, 165); border-left-color: rgb(165, 165, 165); border-right-width: 1pt; border-bottom-width: 1pt; border-left-width: 1pt; border-top-style: none; padding: 0cm 5.4pt; height: 24.75pt; background-color: rgb(242, 242, 242);" width="124">
														<p align="center" class="MsoNormal" style="text-align:center;mso-pagination:widow-orphan"><span style="font-size: 11pt; font-family: 微软雅黑, sans-serif;">证明人姓名<span lang="EN-US"><o:p></o:p></span></span></p>
													</td>
													<td style="width: 160px; border-top-style: none; border-left-style: none; border-bottom-color: rgb(165, 165, 165); border-bottom-width: 1pt; border-right-color: rgb(165, 165, 165); border-right-width: 1pt; padding: 0cm 5.4pt; height: 24px; white-space: nowrap;">
														<p align="left" class="MsoNormal"><span lang="EN-US">
														<input type="text" name="jform_resume_exp_info[0].cert_man_name" datatype="*" class="inputxt" value="" ignore="ignore">
														<span class="Validform_checktip"></span>
														<label class="Validform_label" style="display: none;">证明人姓名</label>
													</span></p>
													</td>
													<td nowrap="nowrap" style="width: 78.8pt; border-top-style: none; border-left-style: none; border-bottom-color: rgb(165, 165, 165); border-bottom-width: 1pt; border-right-color: rgb(165, 165, 165); border-right-width: 1pt; padding: 0cm 5.4pt; height: 24.75pt; background-color: rgb(242, 242, 242);" width="105">
													<p align="center" class="MsoNormal" style="text-align:center;mso-pagination:widow-orphan"><span style="font-size: 11pt; font-family: 微软雅黑, sans-serif;">证明人电话<span lang="EN-US"><o:p></o:p></span></span></p>
													</td>
													<td colspan="3" style="width: 160px; border-top-style: none; border-left-style: none; border-bottom-color: rgb(165, 165, 165); border-bottom-width: 1pt; border-right-color: rgb(165, 165, 165); border-right-width: 1pt; padding: 0cm 5.4pt; height: 24px; white-space: nowrap;">
													<p align="left" class="MsoNormal"><span lang="EN-US">
													<input type="text" name="jform_resume_exp_info[0].cert_man_phone" datatype="*" class="inputxt" value="" ignore="ignore">
													<span class="Validform_checktip"></span>
													<label class="Validform_label" style="display: none;">证明人电话</label>
													</span></p>
													</td>
											</tr>
												
											<tr>
													<td nowrap="nowrap" style="width: 78.8pt; border-top-style: none; border-left-style: none; border-bottom-color: rgb(165, 165, 165); border-bottom-width: 1pt; border-right-color: rgb(165, 165, 165); border-right-width: 1pt; padding: 0cm 5.4pt; height: 24.75pt; background-color: rgb(242, 242, 242);" width="105">
														<p align="center" class="MsoNormal" style="text-align:center;mso-pagination:widow-orphan"><span style="font-size: 11pt; font-family: 微软雅黑, sans-serif;">离职原因<span lang="EN-US"><o:p></o:p></span></span></p>
														</td>
														<td colspan="5" style="width: 160px; border-top-style: none; border-left-style: none; border-bottom-color: rgb(165, 165, 165); border-bottom-width: 1pt; border-right-color: rgb(165, 165, 165); border-right-width: 1pt; padding: 0cm 5.4pt; height: 24px; white-space: nowrap;">
														<p align="left" class="MsoNormal"><span lang="EN-US">
														<textarea name="jform_resume_exp_info[0].reason_go" datatype="*" class="inputxt" ignore="ignore" rows="3" cols="500"></textarea>
														<span class="Validform_checktip"></span>
														<label class="Validform_label" style="display: none;">离职原因</label>
														</span></p>
													</td>
											</tr>
						 				</tbody>
									</table>
								</td>
							</tr>
						</#if>
					</#list>
			   </tbody>
			</table>
		</td>
		</tr>
		<tr style="mso-yfti-irow:9;height:26.25pt">
		<td colspan="6" nowrap="nowrap" style="width: 675.75pt; border-top-style: none; border-bottom-color: rgb(0, 176, 240); border-bottom-width: 1.5pt; border-left-style: none; border-bottom-color: rgb(0, 176, 240); border-bottom-width: 1.5pt; padding: 0cm 5.4pt; height: 26.25pt;" width="901">
			<p align="left" class="MsoNormal"><b><span style="font-size: 11pt; font-family: 微软雅黑, sans-serif;">家庭情况<span lang="EN-US"><o:p></o:p></span></span></b></p>
		</td>
		</tr>
		<tr>
			<td colspan="6" nowrap="nowrap" style="width: 675.75pt; border-top-style: none; border-bottom-color: rgb(0, 176, 240); border-bottom-width: 1.5pt; border-left-style: none; border-bottom-color: rgb(0, 176, 240); border-bottom-width: 1.5pt; padding: 0cm 5.4pt; height: 26.25pt;" width="901">
				<table class="MsoTableGrid" style="border-collapse:collapse; width:99%;margin-left:5.6500pt;mso-table-layout-alt:fixed;mso-padding-alt:0.0000pt 5.4000pt 0.0000pt 5.4000pt ;">
					<thead>
						<tr>
							<td colspan=“7” style="padding: 1px;border:solid #add9c0; border-left-width: 1px; border-left-color: rgb(164, 164, 164); border-right-width: 1px; border-right-color: rgb(164, 164, 164); border-top-style: none; border-bottom-width: 1px; border-bottom-color: rgb(164, 164, 164);" valign="top" width="689">
							<p class="MsoNormal" style="mso-pagination:widow-orphan;text-align:right;vertical-align:middle;"><span style="mso-spacerun:'yes';font-family:微软雅黑;color:rgb(0,0,0);font-style:normal;font-size:11.0000pt;mso-font-kerning:0.0000pt;">
								<button class="btn btn-small btn-success listAdd" type="button" onclick="addFamily('familyTab','add_familyTab_template')">添加一行</button>
							</span></p>
							</td>
						</tr>
						<tr>
							<td style="width:17%;padding: 1px;border:solid #add9c0; border-left-width: 1px; border-left-color: rgb(164, 164, 164); border-right-width: 1px; border-right-color: rgb(164, 164, 164); border-top-style: none; border-bottom-width: 1px; border-bottom-color: rgb(164, 164, 164);" valign="top" width="114">
							<p class="MsoNormal" style="mso-pagination:widow-orphan;text-align:center;vertical-align:middle;"><span style="mso-spacerun:'yes';font-family:微软雅黑;color:rgb(0,0,0);font-style:normal;font-size:11.0000pt;mso-font-kerning:0.0000pt;">姓名</span></p>
							</td>
							<td style="width:17%;padding: 1px;border:solid #add9c0; border-left-width: 1px; border-left-color: rgb(164, 164, 164); border-right-width: 1px; border-right-color: rgb(164, 164, 164); border-top-style: none; border-bottom-width: 1px; border-bottom-color: rgb(164, 164, 164);" valign="top" width="114">
							<p class="MsoNormal" style="mso-pagination:widow-orphan;text-align:center;vertical-align:middle;"><span style="mso-spacerun:'yes';font-family:微软雅黑;color:rgb(0,0,0);font-style:normal;font-size:11.0000pt;mso-font-kerning:0.0000pt;">称谓</span></p>
							</td>
							<td style="width:17%;padding: 1px;border:solid #add9c0; border-left-width: 1px; border-left-color: rgb(164, 164, 164); border-right-width: 1px; border-right-color: rgb(164, 164, 164); border-top-style: none; border-bottom-width: 1px; border-bottom-color: rgb(164, 164, 164);" valign="top" width="114">
							<p class="MsoNormal" style="mso-pagination:widow-orphan;text-align:center;vertical-align:middle;"><span style="mso-spacerun:'yes';font-family:微软雅黑;color:rgb(0,0,0);font-style:normal;font-size:11.0000pt;mso-font-kerning:0.0000pt;">年龄</span></p>
							</td>
							<td style="width:17%;padding: 1px;border:solid #add9c0; border-left-width: 1px; border-left-color: rgb(164, 164, 164); border-right-width: 1px; border-right-color: rgb(164, 164, 164); border-top-style: none; border-bottom-width: 1px; border-bottom-color: rgb(164, 164, 164);" valign="top" width="114">
							<p class="MsoNormal" style="mso-pagination:widow-orphan;text-align:center;vertical-align:middle;"><span style="mso-spacerun:'yes';font-family:微软雅黑;color:rgb(0,0,0);font-style:normal;font-size:11.0000pt;mso-font-kerning:0.0000pt;">工作单位</span></p>
							</td>
							<td style="width:17%;padding: 1px;border:solid #add9c0; border-left-width: 1px; border-left-color: rgb(164, 164, 164); border-right-width: 1px; border-right-color: rgb(164, 164, 164); border-top-style: none; border-bottom-width: 1px; border-bottom-color: rgb(164, 164, 164);" valign="top" width="114">
							<p class="MsoNormal" style="mso-pagination:widow-orphan;text-align:center;vertical-align:middle;"><span style="mso-spacerun:'yes';font-family:微软雅黑;color:rgb(0,0,0);font-style:normal;font-size:11.0000pt;mso-font-kerning:0.0000pt;">职位</span></p>
							</td>	
					    	<td style="width:17%;padding: 1px;border:solid #add9c0; border-left-width: 1px; border-left-color: rgb(164, 164, 164); border-right-width: 1px; border-right-color: rgb(164, 164, 164); border-top-style: none; border-bottom-width: 1px; border-bottom-color: rgb(164, 164, 164);" valign="top" width="114">
							<p class="MsoNormal" style="mso-pagination:widow-orphan;text-align:center;vertical-align:middle;"><span style="mso-spacerun:'yes';font-family:微软雅黑;color:rgb(0,0,0);font-style:normal;font-size:11.0000pt;mso-font-kerning:0.0000pt;">联系电话</span></p>
							</td>	 
							<td style="width:15%;padding: 1px;border:solid #add9c0; border-left-width: 1px; border-left-color: rgb(164, 164, 164); border-right-width: 1px; border-right-color: rgb(164, 164, 164); border-top-style: none; border-bottom-width: 1px; border-bottom-color: rgb(164, 164, 164);" valign="top" width="114">
							<p class="MsoNormal" style="mso-pagination:widow-orphan;text-align:center;vertical-align:middle;"><span style="mso-spacerun:'yes';font-family:微软雅黑;color:rgb(0,0,0);font-style:normal;font-size:11.0000pt;mso-font-kerning:0.0000pt;width:60px;display:block;">操作</span></p>
							</td>
						</tr>
					</thead>
					<tbody id="familyTab">
						<#assign subTableStr>${head.subTableStr?if_exists?html}</#assign>
						<#assign subtablelist=subTableStr?split(",")>
						<#list subtablelist as sub >
						<#if sub?index_of("family")!=-1 && data['${sub}']?exists&&(data['${sub}']?size>0) >
					    <#list data['${sub}']  as subTableData>
							<tr class="first-child">
								<td style="width:17%;padding: 1px;border:solid #add9c0; border-left-width: 1px; border-left-color: rgb(164, 164, 164); border-right-width: 1px; border-right-color: rgb(164, 164, 164); border-top-style: none; border-bottom-width: 1px; border-bottom-color: rgb(164, 164, 164);" valign="top" width="114">
									<p class="MsoNormal" style="mso-pagination:widow-orphan;text-align:center;vertical-align:middle;"><span style="font-family:微软雅黑;color:rgb(0,0,0);font-style:normal;font-size:11.0000pt;mso-font-kerning:0.0000pt;">
										<input type="text" name="jform_resume_family_info[${subTableData_index}].name" datatype="*"  value="${subTableData['name']?if_exists?html}" ignore="ignore">
									</span></p>
								</td>
								<td style="width:17%;padding: 1px;border:solid #add9c0; border-left-width: 1px; border-left-color: rgb(164, 164, 164); border-right-width: 1px; border-right-color: rgb(164, 164, 164); border-top-style: none; border-bottom-width: 1px; border-bottom-color: rgb(164, 164, 164);" valign="top" width="114">
									<p class="MsoNormal" style="mso-pagination:widow-orphan;text-align:center;vertical-align:middle;"><span style="font-family:微软雅黑;color:rgb(0,0,0);font-style:normal;font-size:11.0000pt;mso-font-kerning:0.0000pt;">
										<input name="jform_resume_family_info[${subTableData_index}].alliase" datatype="*"    value="${subTableData['alliase']?if_exists?html}" ignore="ignore">
									</span></p>
								</td>
								<td style="width:17%;padding: 1px;border:solid #add9c0; border-left-width: 1px; border-left-color: rgb(164, 164, 164); border-right-width: 1px; border-right-color: rgb(164, 164, 164); border-top-style: none; border-bottom-width: 1px; border-bottom-color: rgb(164, 164, 164);" valign="top" width="114">
									<p class="MsoNormal" style="mso-pagination:widow-orphan;text-align:center;vertical-align:middle;"><span style="font-family:微软雅黑;color:rgb(0,0,0);font-style:normal;font-size:11.0000pt;mso-font-kerning:0.0000pt;">
										<input type="text" name="jform_resume_family_info[${subTableData_index}].age" datatype="*" class="inputxt"  value="${subTableData['age']?if_exists?html}" ignore="ignore">
									</span></p>
								</td>
								<td style="width:17%;padding: 1px;border:solid #add9c0; border-left-width: 1px; border-left-color: rgb(164, 164, 164); border-right-width: 1px; border-right-color: rgb(164, 164, 164); border-top-style: none; border-bottom-width: 1px; border-bottom-color: rgb(164, 164, 164);" valign="top" width="114">
									<p class="MsoNormal" style="mso-pagination:widow-orphan;text-align:center;vertical-align:middle;"><span style="font-family:微软雅黑;color:rgb(0,0,0);font-style:normal;font-size:11.0000pt;mso-font-kerning:0.0000pt;">
										<input type="text" name="jform_resume_family_info[${subTableData_index}].work_address"  datatype="*" class="inputxt"  value="${subTableData['work_address']?if_exists?html}" ignore="ignore">
									</span></p>
								</td>
								<td style="width:17%;padding: 1px;border:solid #add9c0; border-left-width: 1px; border-left-color: rgb(164, 164, 164); border-right-width: 1px; border-right-color: rgb(164, 164, 164); border-top-style: none; border-bottom-width: 1px; border-bottom-color: rgb(164, 164, 164);" valign="top" width="114">
									<p class="MsoNormal" style="mso-pagination:widow-orphan;text-align:center;vertical-align:middle;"><span style="font-family:微软雅黑;color:rgb(0,0,0);font-style:normal;font-size:11.0000pt;mso-font-kerning:0.0000pt;">
										<input type="text" name="jform_resume_family_info[${subTableData_index}].post" datatype="*" class="inputxt"  value="${subTableData['post']?if_exists?html}" ignore="ignore">
									</span></p>
								</td>
			             	    <td style="width:17%;padding: 1px;border:solid #add9c0; border-left-width: 1px; border-left-color: rgb(164, 164, 164); border-right-width: 1px; border-right-color: rgb(164, 164, 164); border-top-style: none; border-bottom-width: 1px; border-bottom-color: rgb(164, 164, 164);" valign="top" width="114">
									<p class="MsoNormal" style="mso-pagination:widow-orphan;text-align:center;vertical-align:middle;"><span style="font-family:微软雅黑;color:rgb(0,0,0);font-style:normal;font-size:11.0000pt;mso-font-kerning:0.0000pt;">
										<input type="text" name="jform_resume_family_info[${subTableData_index}].mobile"  datatype="*" class="inputxt"  value="${subTableData['mobile']?if_exists?html}" ignore="ignore">
									</span></p>
								</td>
				            	 	<td style="width:15%;"><button class='btn btn-small btn-success familyRow' type='button'>删除</button></td>
							</tr>
						</#list>
						<#elseif sub?index_of("family")!=-1 >
							<tr class="first-child">
								<td style="width:17%;padding: 1px;border:solid #add9c0; border-left-width: 1px; border-left-color: rgb(164, 164, 164); border-right-width: 1px; border-right-color: rgb(164, 164, 164); border-top-style: none; border-bottom-width: 1px; border-bottom-color: rgb(164, 164, 164);" valign="top" width="114">
									<p class="MsoNormal" style="mso-pagination:widow-orphan;text-align:center;vertical-align:middle;"><span style="font-family:微软雅黑;color:rgb(0,0,0);font-style:normal;font-size:11.0000pt;mso-font-kerning:0.0000pt;">
										<input type="text" name="jform_resume_family_info[0].name" datatype="*"  value="" ignore="ignore">
									</span></p>
								</td>
								<td style="width:17%;padding: 1px;border:solid #add9c0; border-left-width: 1px; border-left-color: rgb(164, 164, 164); border-right-width: 1px; border-right-color: rgb(164, 164, 164); border-top-style: none; border-bottom-width: 1px; border-bottom-color: rgb(164, 164, 164);" valign="top" width="114">
									<p class="MsoNormal" style="mso-pagination:widow-orphan;text-align:center;vertical-align:middle;"><span style="font-family:微软雅黑;color:rgb(0,0,0);font-style:normal;font-size:11.0000pt;mso-font-kerning:0.0000pt;">
										<input name="jform_resume_family_info[0].alliase" datatype="*"    value="" ignore="ignore">
									</span></p>
								</td>
								<td style="width:17%;padding: 1px;border:solid #add9c0; border-left-width: 1px; border-left-color: rgb(164, 164, 164); border-right-width: 1px; border-right-color: rgb(164, 164, 164); border-top-style: none; border-bottom-width: 1px; border-bottom-color: rgb(164, 164, 164);" valign="top" width="114">
									<p class="MsoNormal" style="mso-pagination:widow-orphan;text-align:center;vertical-align:middle;"><span style="font-family:微软雅黑;color:rgb(0,0,0);font-style:normal;font-size:11.0000pt;mso-font-kerning:0.0000pt;">
										<input type="text" name="jform_resume_family_info[0].age" datatype="*" class="inputxt"  value="" ignore="ignore">
									</span></p>
								</td>
								<td style="width:17%;padding: 1px;border:solid #add9c0; border-left-width: 1px; border-left-color: rgb(164, 164, 164); border-right-width: 1px; border-right-color: rgb(164, 164, 164); border-top-style: none; border-bottom-width: 1px; border-bottom-color: rgb(164, 164, 164);" valign="top" width="114">
									<p class="MsoNormal" style="mso-pagination:widow-orphan;text-align:center;vertical-align:middle;"><span style="font-family:微软雅黑;color:rgb(0,0,0);font-style:normal;font-size:11.0000pt;mso-font-kerning:0.0000pt;">
										<input type="text" name="jform_resume_family_info[0].work_address"  datatype="*" class="inputxt"  value="" ignore="ignore">
									</span></p>
								</td>
								<td style="width:17%;padding: 1px;border:solid #add9c0; border-left-width: 1px; border-left-color: rgb(164, 164, 164); border-right-width: 1px; border-right-color: rgb(164, 164, 164); border-top-style: none; border-bottom-width: 1px; border-bottom-color: rgb(164, 164, 164);" valign="top" width="114">
									<p class="MsoNormal" style="mso-pagination:widow-orphan;text-align:center;vertical-align:middle;"><span style="font-family:微软雅黑;color:rgb(0,0,0);font-style:normal;font-size:11.0000pt;mso-font-kerning:0.0000pt;">
										<input type="text" name="jform_resume_family_info[0].post" datatype="*" class="inputxt"  value="" ignore="ignore">
									</span></p>
								</td>
			             	<td style="width:17%;padding: 1px;border:solid #add9c0; border-left-width: 1px; border-left-color: rgb(164, 164, 164); border-right-width: 1px; border-right-color: rgb(164, 164, 164); border-top-style: none; border-bottom-width: 1px; border-bottom-color: rgb(164, 164, 164);" valign="top" width="114">
									<p class="MsoNormal" style="mso-pagination:widow-orphan;text-align:center;vertical-align:middle;"><span style="font-family:微软雅黑;color:rgb(0,0,0);font-style:normal;font-size:11.0000pt;mso-font-kerning:0.0000pt;">
										<input type="text" name="jform_resume_family_info[0].mobile"  datatype="*" class="inputxt"  value="" ignore="ignore">
									</span></p>
								</td>
								<td style="width:15%;"><button class='btn btn-small btn-success familyRow' type='button'>删除</button></td>
							</tr>
						</#if>
					  </#list>
					</tbody>
				</table>
			</td>
		</tr>
		
		<tr style="mso-yfti-irow:9;height:26.25pt">
		<td colspan="6" nowrap="nowrap" style="width: 675.75pt; border-top-style: none; border-bottom-color: rgb(0, 176, 240); border-bottom-width: 1.5pt; border-left-style: none; border-bottom-color: rgb(0, 176, 240); border-bottom-width: 1.5pt; padding: 0cm 5.4pt; height: 26.25pt;" width="901">
			<p align="left" class="MsoNormal"><b><span style="font-size: 11pt; font-family: 微软雅黑, sans-serif;">求职意向<span lang="EN-US"><o:p></o:p></span></span></b></p>
		</td>
		</tr>
		<tr style="mso-yfti-irow:4;height:24.75pt">
			<td nowrap="nowrap" style="width: 92.9pt; border-right-color: rgb(165, 165, 165); border-bottom-color: rgb(165, 165, 165); border-left-color: rgb(165, 165, 165); border-right-width: 1pt; border-bottom-width: 1pt; border-left-width: 1pt; border-top-style: none; padding: 0cm 5.4pt; height: 24.75pt; background-color: rgb(242, 242, 242);" width="124">
				<p align="center" class="MsoNormal" style="text-align:center;mso-pagination:widow-orphan"><span style="font-size: 11pt; font-family: 微软雅黑, sans-serif;">期望工作地点<span lang="EN-US"><o:p></o:p></span></span></p>
			</td>
			<td style="width: 160px; border-top-style: none; border-left-style: none; border-bottom-color: rgb(165, 165, 165); border-bottom-width: 1pt; border-right-color: rgb(165, 165, 165); border-right-width: 1pt; padding: 0cm 5.4pt; height: 24px; white-space: nowrap;">
				<p align="left" class="MsoNormal"><span lang="EN-US">
				<input type="text" name="work_place" id="work_place" datatype="*" class="inputxt" value="${data['${tableName}']['work_place']?if_exists?html}" ignore="ignore">
				<span class="Validform_checktip"></span>
				<label class="Validform_label" style="display: none;">期望工作地点</label>
				</span></p>
			</td>
			<td nowrap="nowrap" style="width: 78.8pt; border-top-style: none; border-left-style: none; border-bottom-color: rgb(165, 165, 165); border-bottom-width: 1pt; border-right-color: rgb(165, 165, 165); border-right-width: 1pt; padding: 0cm 5.4pt; height: 24.75pt; background-color: rgb(242, 242, 242);" width="105">
				<p align="center" class="MsoNormal" style="text-align:center;mso-pagination:widow-orphan"><span style="font-size: 11pt; font-family: 微软雅黑, sans-serif;">工作类型<span lang="EN-US"><o:p></o:p></span></span></p>
			</td>
			<td style="width: 160px; border-top-style: none; border-left-style: none; border-bottom-color: rgb(165, 165, 165); border-bottom-width: 1pt; border-right-color: rgb(165, 165, 165); border-right-width: 1pt; padding: 0cm 5.4pt; height: 24px; white-space: nowrap;">
				<p align="left" class="MsoNormal"><span lang="EN-US">
				<input type="text" name="work_type" id="work_type" datatype="*" class="inputxt" value="${data['${tableName}']['work_type']?if_exists?html}" ignore="ignore">
				<span class="Validform_checktip"></span>
				<label class="Validform_label" style="display: none;">工作类型</label>
				</span></p>
			</td>
			<td nowrap="nowrap" style="width: 78.8pt; border-top-style: none; border-left-style: none; border-bottom-color: rgb(165, 165, 165); border-bottom-width: 1pt; border-right-color: rgb(165, 165, 165); border-right-width: 1pt; padding: 0cm 5.4pt; height: 24.75pt; background-color: rgb(242, 242, 242);" width="105">
				<p align="center" class="MsoNormal" style="text-align:center;mso-pagination:widow-orphan"><span style="font-size: 11pt; font-family: 微软雅黑, sans-serif;">到岗时间<span lang="EN-US"><o:p></o:p></span></span></p>
			</td>
			<td style="width: 160px; border-top-style: none; border-left-style: none; border-bottom-color: rgb(165, 165, 165); border-bottom-width: 1pt; border-right-color: rgb(165, 165, 165); border-right-width: 1pt; padding: 0cm 5.4pt; height: 24px; white-space: nowrap;">
				<p align="left" class="MsoNormal"><span lang="EN-US">
				<input type="text" name="arrival_time" id="arrival_time" datatype="*" class="Wdate" onClick="WdatePicker({dateFmt:'yyyy-MM-dd'})"  value="${data['${tableName}']['arrival_time']?if_exists?html}" ignore="ignore">
				<span class="Validform_checktip"></span>
				<label class="Validform_label" style="display: none;">到岗时间</label>
				</span></p>
			</td>
		</tr>
		<tr>
			<td nowrap="nowrap" style="width: 78.8pt; border-top-style: none; border-left-style: none; border-bottom-color: rgb(165, 165, 165); border-bottom-width: 1pt; border-right-color: rgb(165, 165, 165); border-right-width: 1pt; padding: 0cm 5.4pt; height: 24.75pt; background-color: rgb(242, 242, 242);" width="105">
				<p align="center" class="MsoNormal" style="text-align:center;mso-pagination:widow-orphan"><span style="font-size: 11pt; font-family: 微软雅黑, sans-serif;">自我评价<span lang="EN-US"><o:p></o:p></span></span></p>
				</td>
				<td colspan="5" style="width: 160px; border-top-style: none; border-left-style: none; border-bottom-color: rgb(165, 165, 165); border-bottom-width: 1pt; border-right-color: rgb(165, 165, 165); border-right-width: 1pt; padding: 0cm 5.4pt; height: 24px; white-space: nowrap;">
				<p align="left" class="MsoNormal"><span lang="EN-US">
				<textarea name="introduction" id="introduction" datatype="*" class="inputxt" ignore="ignore" rows="3" cols="1000">${data['${tableName}']['introduction']?if_exists?html}</textarea>
				<span class="Validform_checktip"></span>
				<label class="Validform_label" style="display: none;">自我评价</label>
				</span></p>
			</td>
		</tr>
		<tr style="mso-yfti-irow:23;mso-yfti-lastrow:yes;height:6.0pt">
			<td colspan="6" nowrap="nowrap" style="width: 675.75pt; padding: 0cm 5.4pt; height: 6pt; background-color: rgb(0, 176, 240);" width="901">
			<p align="center" class="MsoNormal" style="text-align:center;mso-pagination:widow-orphan"><span style="font-size: 11pt; font-family: 微软雅黑, sans-serif;">　<span lang="EN-US"><o:p></o:p></span></span></p>
			</td>
		</tr>
	</tbody>
  </table>
  <script type="text/javascript">$(function(){$("#formobj").Validform({tiptype:1,btnSubmit:"#btn_sub",btnReset:"#btn_reset",ajaxPost:true,usePlugin:{passwordstrength:{minLen:6,maxLen:18,trigger:function(obj,error){if(error){obj.parent().next().find(".Validform_checktip").show();obj.find(".passwordStrength").hide();}else{$(".passwordStrength").show();obj.parent().next().find(".Validform_checktip").hide();}}}},callback:function(data){if(data.success==true){uploadFile(data);}else{if(data.responseText==''||data.responseText==undefined){$.messager.alert('错误', data.msg);$.Hidemsg();}else{try{var emsg = data.responseText.substring(data.responseText.indexOf('错误描述'),data.responseText.indexOf('错误信息')); $.messager.alert('错误',emsg);$.Hidemsg();}catch(ex){$.messager.alert('错误',data.responseText+'');}} return false;}if(!neibuClickFlag){var win = frameElement.api.opener; win.reloadTable();}}});});</script>
	</form>
	<script type="text/javascript">
		function uploadFile(data){
				frameElement.api.opener.reloadTable();
				frameElement.api.close();

		}
		function getChecked(checkName,inputID){
			var checkObj=  $("input[type='checkbox'][name='"+checkName+"']:checked");
			var val="";
			$.each(checkObj,function(i,f){
				val+=","+ f.value;
			});
			$("#"+inputID).val(val);
		}
	   $(function(){
		//查看模式情况下,删除和上传附件功能禁止使用
		if(location.href.indexOf("load=detail")!=-1){
			$(".jeecgDetail").hide();
		}
		
		if(location.href.indexOf("mode=read")!=-1){
			//查看模式控件禁用
			$("#formobj").find(":input").attr("disabled","disabled");
		}
		if(location.href.indexOf("mode=onbutton")!=-1){
			//其他模式显示提交按钮
			$("#sub_tr").show();
		}
		
		$(".delrow").click(function(){
			var tabid = $(this).parent().parent().parent().parent().parent().parent().parent().parent().attr('id');
			console.debug(tabid);
			$(this).parent().parent().parent().parent().parent().parent().parent().remove();resetTrNum(tabid);
		});
		
		$(".degreeRow").click(function(){
			var tabid = $(this).parent().parent().parent().attr('id');
			$(this).parent().parent().remove();resetTrNum(tabid);
		});

		$(".familyRow").click(function(){
			var tabid = $(this).parent().parent().parent().attr('id');
			$(this).parent().parent().remove();resetTrNum(tabid);
		});
		
		$(".trainRow").click(function(){
			var tabid = $(this).parent().parent().parent().attr('id');
			$(this).parent().parent().remove();resetTrNum(tabid);
		});
	   
	 });
		
	  function addRow(tabid,templateid){
	  		var tbHtml =$("#"+templateid).html();
	  		$("#"+tabid).append(tbHtml);
			$(".delrow").die().live("click",function(){
				var curtabid = $(this).parent().parent().parent().parent().parent().parent().parent().parent().attr('id');
				console.debug(curtabid);
			    $(this).parent().parent().parent().parent().parent().parent().parent().remove();resetTrNum(curtabid);
			});
			resetTrNum(tabid);
	  }

	  function addDegree(tabid,templateid){
	  		var tbHtml =$("#"+templateid).html();
	  		$("#"+tabid).append(tbHtml);
			$(".degreeRow").die().live("click",function(){
				var curtabid = $(this).parent().parent().parent().attr('id');
			    $(this).parent().parent().remove();resetTrNum(curtabid);
			});
			resetTrNum(tabid);
	  }
	  

	  function addFamily(tabid,templateid){
	  		var tbHtml =$("#"+templateid).html();
	  		$("#"+tabid).append(tbHtml);
			$(".familyRow").die().live("click",function(){
				var curtabid = $(this).parent().parent().parent().attr('id');
			    $(this).parent().parent().remove();resetTrNum(curtabid);
			});
			resetTrNum(tabid);
	  }
	  
	  function addTrain(tabid,templateid){
	  		var tbHtml =$("#"+templateid).html();
	  		$("#"+tabid).append(tbHtml);
			$(".trainRow").die().live("click",function(){
				var curtabid = $(this).parent().parent().parent().attr('id');
			    $(this).parent().parent().remove();resetTrNum(curtabid);
			});
			resetTrNum(tabid);
	  }
	  
		
	  var neibuClickFlag = false;
	  function neibuClick() {
		  neibuClickFlag = true; 
		  $('#btn_sub').trigger('click');
	  }
	  
	  function resetTrNum(tableId) {
		$("#"+tableId + " tr[class='first-child']").each(function(i) {
			
			if(tableId.indexOf('exp')>=0){
	    		$(this).find("span[name='index']").eq(0).html(i+1);
	    	}
		
	    	$(':input, select,a', this).each(function() {
	    	var $this = $(this), name = $this.attr('name'), val = $this.val();
	    	
			if (name != null) {
				if (name.indexOf("#index#") >= 0){
						$this.attr("name",name.replace('#index#',i));
				} else {
					var s = name.indexOf("[");
					var e = name.indexOf("]");
					var new_name = name.substring(s+1,e);
					$this.attr("name",name.replace(new_name,i));
				}
			 }
		 });
		});
	}

		$.dialog.setting.zIndex =1990;
		function del(url,obj){
			$.dialog.confirm("确认删除该条记录?", function(){
				$.ajax({
					async : false,
					cache : false,
					type : 'POST',
					url : url,// 请求的action路径
					error : function() {// 请求失败处理函数
					},
					success : function(data) {
						var d = $.parseJSON(data);
						if (d.success) {
							var msg = d.msg;
							tip(msg);
							$(obj).closest("tr").hide("slow");
						}
					}
				});  
			}, function(){
		});
	}
 
	/**树形列表数据转换**/
	function convertTreeData(rows, textField) {
		for(var i = 0; i < rows.length; i++) {
			var row = rows[i];
			row.text = row[textField];
			if(row.children) {
				row.state = "open";
				convertTreeData(row.children, textField);
			}
		}
	}
	/**树形列表加入子元素**/
	function joinTreeChildren(arr1, arr2) {
		for(var i = 0; i < arr1.length; i++) {
			var row1 = arr1[i];
			for(var j = 0; j < arr2.length; j++) {
				if(row1.id == arr2[j].id) {
					var children = arr2[j].children;
					if(children) {
						row1.children = children;
					}
					
				}
			}
		}
	}
	</script>
	<script type="text/javascript">${js_plug_in?if_exists}</script>	
	
	<table style="display:none">
	 <tbody id="add_trainTab_template">
			<tr class="first-child">
					<td style="width:17%;padding: 1px;border:solid #add9c0; border-left-width: 1px; border-left-color: rgb(164, 164, 164); border-right-width: 1px; border-right-color: rgb(164, 164, 164); border-top-style: none; border-bottom-width: 1px; border-bottom-color: rgb(164, 164, 164);" valign="top" width="114">
						 <p class="MsoNormal" style="mso-pagination:widow-orphan;text-align:center;vertical-align:middle;"><span style="font-family:微软雅黑;color:rgb(0,0,0);font-style:normal;font-size:11.0000pt;mso-font-kerning:0.0000pt;">
										<input type="text" name="jform_resume_train_info[#index#].begin_date" datatype="*" class="Wdate" onClick="WdatePicker({dateFmt:'yyyy-MM-dd'})"  value="" ignore="ignore">
									</span></p>
						 </td>
						 <td style="width:17%;padding: 1px;border:solid #add9c0; border-left-width: 1px; border-left-color: rgb(164, 164, 164); border-right-width: 1px; border-right-color: rgb(164, 164, 164); border-top-style: none; border-bottom-width: 1px; border-bottom-color: rgb(164, 164, 164);" valign="top" width="114">
									<p class="MsoNormal" style="mso-pagination:widow-orphan;text-align:center;vertical-align:middle;"><span style="font-family:微软雅黑;color:rgb(0,0,0);font-style:normal;font-size:11.0000pt;mso-font-kerning:0.0000pt;">
										<input type="text" name="jform_resume_train_info[#index#].end_date" datatype="*" class="Wdate" onClick="WdatePicker({dateFmt:'yyyy-MM-dd'})"  ignore="ignore">
									</span></p>
						 </td>
						 <td style="width:17%;padding: 1px;border:solid #add9c0; border-left-width: 1px; border-left-color: rgb(164, 164, 164); border-right-width: 1px; border-right-color: rgb(164, 164, 164); border-top-style: none; border-bottom-width: 1px; border-bottom-color: rgb(164, 164, 164);" valign="top" width="114">
									<p class="MsoNormal" style="mso-pagination:widow-orphan;text-align:center;vertical-align:middle;"><span style="font-family:微软雅黑;color:rgb(0,0,0);font-style:normal;font-size:11.0000pt;mso-font-kerning:0.0000pt;">
										<input type="text" name="jform_resume_train_info[#index#].school_name"  datatype="*" class="inputxt"  value="" ignore="ignore">
									</span></p>
					     </td>
					 	<td style="width:17%;padding: 1px;border:solid #add9c0; border-left-width: 1px; border-left-color: rgb(164, 164, 164); border-right-width: 1px; border-right-color: rgb(164, 164, 164); border-top-style: none; border-bottom-width: 1px; border-bottom-color: rgb(164, 164, 164);" valign="top" width="114">
									<p class="MsoNormal" style="mso-pagination:widow-orphan;text-align:center;vertical-align:middle;"><span style="font-family:微软雅黑;color:rgb(0,0,0);font-style:normal;font-size:11.0000pt;mso-font-kerning:0.0000pt;">
										<input type="text" name="jform_resume_train_info[#index#].class_name"  datatype="*" class="inputxt"  value="" ignore="ignore">
									</span></p>
						 </td>
					    <td style="width:17%;padding: 1px;border:solid #add9c0; border-left-width: 1px; border-left-color: rgb(164, 164, 164); border-right-width: 1px; border-right-color: rgb(164, 164, 164); border-top-style: none; border-bottom-width: 1px; border-bottom-color: rgb(164, 164, 164);" valign="top" width="114">
									<p class="MsoNormal" style="mso-pagination:widow-orphan;text-align:center;vertical-align:middle;"><span style="font-family:微软雅黑;color:rgb(0,0,0);font-style:normal;font-size:11.0000pt;mso-font-kerning:0.0000pt;">
										<input type="text" name="jform_resume_train_info[#index#].cert_book"  datatype="*" class="inputxt"  value="" ignore="ignore">
									</span></p>
					 </td>	
			 <td style="width:15%;"><button class='btn btn-small btn-success trainRow' type='button'>删除</button></td>
			</tr>
		</tbody>
	 
		<tbody id="add_familyTab_template">
			<tr class="first-child">
				<td style="width:17%;padding: 1px;border:solid #add9c0; border-left-width: 1px; border-left-color: rgb(164, 164, 164); border-right-width: 1px; border-right-color: rgb(164, 164, 164); border-top-style: none; border-bottom-width: 1px; border-bottom-color: rgb(164, 164, 164);" valign="top" width="114">
					<p class="MsoNormal" style="mso-pagination:widow-orphan;text-align:center;vertical-align:middle;"><span style="font-family:微软雅黑;color:rgb(0,0,0);font-style:normal;font-size:11.0000pt;mso-font-kerning:0.0000pt;">
						<input type="text" name="jform_resume_family_info[#index#].name" datatype="*"   class="inputxt"    ignore="ignore">
					</span></p>
				</td>
				<td style="width:17%;padding: 1px;border:solid #add9c0; border-left-width: 1px; border-left-color: rgb(164, 164, 164); border-right-width: 1px; border-right-color: rgb(164, 164, 164); border-top-style: none; border-bottom-width: 1px; border-bottom-color: rgb(164, 164, 164);" valign="top" width="114">
					<p class="MsoNormal" style="mso-pagination:widow-orphan;text-align:center;vertical-align:middle;"><span style="font-family:微软雅黑;color:rgb(0,0,0);font-style:normal;font-size:11.0000pt;mso-font-kerning:0.0000pt;">
						<input type="text" name="jform_resume_family_info[#index#].alliase" datatype="*" class="inputxt"     ignore="ignore">
					</span></p>
				</td>
				<td style="width:17%;padding: 1px;border:solid #add9c0; border-left-width: 1px; border-left-color: rgb(164, 164, 164); border-right-width: 1px; border-right-color: rgb(164, 164, 164); border-top-style: none; border-bottom-width: 1px; border-bottom-color: rgb(164, 164, 164);" valign="top" width="114">
					<p class="MsoNormal" style="mso-pagination:widow-orphan;text-align:center;vertical-align:middle;"><span style="font-family:微软雅黑;color:rgb(0,0,0);font-style:normal;font-size:11.0000pt;mso-font-kerning:0.0000pt;">
						<input type="text" name="jform_resume_family_info[#index#].age"  datatype="*" class="inputxt"   ignore="ignore">
					</span></p>
				</td>
				<td style="width:17%;padding: 1px;border:solid #add9c0; border-left-width: 1px; border-left-color: rgb(164, 164, 164); border-right-width: 1px; border-right-color: rgb(164, 164, 164); border-top-style: none; border-bottom-width: 1px; border-bottom-color: rgb(164, 164, 164);" valign="top" width="114">
					<p class="MsoNormal" style="mso-pagination:widow-orphan;text-align:center;vertical-align:middle;"><span style="font-family:微软雅黑;color:rgb(0,0,0);font-style:normal;font-size:11.0000pt;mso-font-kerning:0.0000pt;">
						<input type="text" name="jform_resume_family_info[#index#].post"  datatype="*" class="inputxt"   ignore="ignore">
					</span></p>
				</td>
				<td style="width:17%;padding: 1px;border:solid #add9c0; border-left-width: 1px; border-left-color: rgb(164, 164, 164); border-right-width: 1px; border-right-color: rgb(164, 164, 164); border-top-style: none; border-bottom-width: 1px; border-bottom-color: rgb(164, 164, 164);" valign="top" width="114">
					<p class="MsoNormal" style="mso-pagination:widow-orphan;text-align:center;vertical-align:middle;"><span style="font-family:微软雅黑;color:rgb(0,0,0);font-style:normal;font-size:11.0000pt;mso-font-kerning:0.0000pt;">
						<input type="text" name="jform_resume_family_info[#index#].work_address"  datatype="*" class="inputxt"   ignore="ignore">
					</span></p>
				</td>			
					<td style="width:17%;padding: 1px;border:solid #add9c0; border-left-width: 1px; border-left-color: rgb(164, 164, 164); border-right-width: 1px; border-right-color: rgb(164, 164, 164); border-top-style: none; border-bottom-width: 1px; border-bottom-color: rgb(164, 164, 164);" valign="top" width="114">
					<p class="MsoNormal" style="mso-pagination:widow-orphan;text-align:center;vertical-align:middle;"><span style="font-family:微软雅黑;color:rgb(0,0,0);font-style:normal;font-size:11.0000pt;mso-font-kerning:0.0000pt;">
						<input type="text" name="jform_resume_family_info[#index#].mobile" datatype="*" class="inputxt"   ignore="ignore">
					</span></p>
				</td>				
			 <td style="width:15%;"><button class='btn btn-small btn-success familyRow' type='button'>删除</button></td>
			</tr>
		</tbody>
		<tbody id="add_degreeTab_template">
			<tr class="first-child">
				<td style="width:17%;padding: 1px;border:solid #add9c0; border-left-width: 1px; border-left-color: rgb(164, 164, 164); border-right-width: 1px; border-right-color: rgb(164, 164, 164); border-top-style: none; border-bottom-width: 1px; border-bottom-color: rgb(164, 164, 164);" valign="top" width="114">
					<p class="MsoNormal" style="mso-pagination:widow-orphan;text-align:center;vertical-align:middle;"><span style="font-family:微软雅黑;color:rgb(0,0,0);font-style:normal;font-size:11.0000pt;mso-font-kerning:0.0000pt;">
						<input type="text" name="jform_resume_degree_info[#index#].begin_date" datatype="*" class="Wdate" onClick="WdatePicker({dateFmt:'yyyy-MM-dd'})"   ignore="ignore">
					</span></p>
				</td>
				<td style="width:17%;padding: 1px;border:solid #add9c0; border-left-width: 1px; border-left-color: rgb(164, 164, 164); border-right-width: 1px; border-right-color: rgb(164, 164, 164); border-top-style: none; border-bottom-width: 1px; border-bottom-color: rgb(164, 164, 164);" valign="top" width="114">
					<p class="MsoNormal" style="mso-pagination:widow-orphan;text-align:center;vertical-align:middle;"><span style="font-family:微软雅黑;color:rgb(0,0,0);font-style:normal;font-size:11.0000pt;mso-font-kerning:0.0000pt;">
						<input type="text" name="jform_resume_degree_info[#index#].end_date" datatype="*" class="Wdate" onClick="WdatePicker({dateFmt:'yyyy-MM-dd'})"   ignore="ignore">
					</span></p>
				</td>
				<td style="width:17%;padding: 1px;border:solid #add9c0; border-left-width: 1px; border-left-color: rgb(164, 164, 164); border-right-width: 1px; border-right-color: rgb(164, 164, 164); border-top-style: none; border-bottom-width: 1px; border-bottom-color: rgb(164, 164, 164);" valign="top" width="114">
					<p class="MsoNormal" style="mso-pagination:widow-orphan;text-align:center;vertical-align:middle;"><span style="font-family:微软雅黑;color:rgb(0,0,0);font-style:normal;font-size:11.0000pt;mso-font-kerning:0.0000pt;">
						<input type="text" name="jform_resume_degree_info[#index#].school_name"  datatype="*" class="inputxt"   ignore="ignore">
					</span></p>
				</td>
				<td style="width:17%;padding: 1px;border:solid #add9c0; border-left-width: 1px; border-left-color: rgb(164, 164, 164); border-right-width: 1px; border-right-color: rgb(164, 164, 164); border-top-style: none; border-bottom-width: 1px; border-bottom-color: rgb(164, 164, 164);" valign="top" width="114">
					<p class="MsoNormal" style="mso-pagination:widow-orphan;text-align:center;vertical-align:middle;"><span style="font-family:微软雅黑;color:rgb(0,0,0);font-style:normal;font-size:11.0000pt;mso-font-kerning:0.0000pt;">
						<input type="text" name="jform_resume_degree_info[#index#].major"  datatype="*" class="inputxt"   ignore="ignore">
					</span></p>
				</td>
				<td style="width:17%;padding: 1px;border:solid #add9c0; border-left-width: 1px; border-left-color: rgb(164, 164, 164); border-right-width: 1px; border-right-color: rgb(164, 164, 164); border-top-style: none; border-bottom-width: 1px; border-bottom-color: rgb(164, 164, 164);" valign="top" width="114">
					<p class="MsoNormal" style="mso-pagination:widow-orphan;text-align:center;vertical-align:middle;"><span style="font-family:微软雅黑;color:rgb(0,0,0);font-style:normal;font-size:11.0000pt;mso-font-kerning:0.0000pt;">
						<input type="text" name="jform_resume_degree_info[#index#].degree"  datatype="*" class="inputxt"   ignore="ignore">
					</span></p>
				</td>			
					<td style="width:17%;padding: 1px;border:solid #add9c0; border-left-width: 1px; border-left-color: rgb(164, 164, 164); border-right-width: 1px; border-right-color: rgb(164, 164, 164); border-top-style: none; border-bottom-width: 1px; border-bottom-color: rgb(164, 164, 164);" valign="top" width="114">
					<p class="MsoNormal" style="mso-pagination:widow-orphan;text-align:center;vertical-align:middle;"><span style="font-family:微软雅黑;color:rgb(0,0,0);font-style:normal;font-size:11.0000pt;mso-font-kerning:0.0000pt;">
						<input type="text" name="jform_resume_degree_info[#index#].degree_type"  datatype="*" class="inputxt"   ignore="ignore">
					</span></p>
				</td>				
				<td style="width:17%;padding: 1px;border:solid #add9c0; border-left-width: 1px; border-left-color: rgb(164, 164, 164); border-right-width: 1px; border-right-color: rgb(164, 164, 164); border-top-style: none; border-bottom-width: 1px; border-bottom-color: rgb(164, 164, 164);" valign="top" width="114">
					<p class="MsoNormal" style="mso-pagination:widow-orphan;text-align:center;vertical-align:middle;"><span style="font-family:微软雅黑;color:rgb(0,0,0);font-style:normal;font-size:11.0000pt;mso-font-kerning:0.0000pt;">
						<input type="text" name="jform_resume_degree_info[#index#].certissure"  datatype="*" class="inputxt"   ignore="ignore">
					</span></p>
				</td>
				<td style="width:15%;"><button class='btn btn-small btn-success degreeRow' type='button'>删除</button></td>
			</tr>
		</tbody>
		<tbody id="add_expTab_template">
			<tr class="first-child">
				<td colspan="6" nowrap="nowrap" style="width: 675.75pt; border-top-style: none; border-bottom-color: rgb(0, 176, 240); border-bottom-width: 1.5pt; border-left-style: none; border-bottom-color: rgb(0, 176, 240); border-bottom-width: 1.5pt; padding: 0cm 5.4pt; height: 26.25pt;" width="901">
					<table class="MsoTableGrid" style="border-collapse:collapse; width:99%;margin-left:5.6500pt;mso-table-layout-alt:fixed;mso-padding-alt:0.0000pt 5.4000pt 0.0000pt 5.4000pt;">
						<tbody>
							<tr>
								<td colspan=6 style="width:15%;">
									工作经验(<span name="index">1</span>)<span style="float:right;"><button class='btn btn-small btn-success delrow' type='button'>删除</button></span>
								</td>
							</tr>
							<tr style="mso-yfti-irow:4;height:24.75pt">
									<td nowrap="nowrap" style="width: 92.9pt; border-right-color: rgb(165, 165, 165); border-bottom-color: rgb(165, 165, 165); border-left-color: rgb(165, 165, 165); border-right-width: 1pt; border-bottom-width: 1pt; border-left-width: 1pt; border-top-style: none; padding: 0cm 5.4pt; height: 24.75pt; background-color: rgb(242, 242, 242);" width="124">
										<p align="center" class="MsoNormal" style="text-align:center;mso-pagination:widow-orphan"><span style="font-size: 11pt; font-family: 微软雅黑, sans-serif;">开始时间<span lang="EN-US"><o:p></o:p></span></span></p>
									</td>
									<td style="width: 160px; border-top-style: none; border-left-style: none; border-bottom-color: rgb(165, 165, 165); border-bottom-width: 1pt; border-right-color: rgb(165, 165, 165); border-right-width: 1pt; padding: 0cm 5.4pt; height: 24px; white-space: nowrap;">
										<p align="left" class="MsoNormal"><span lang="EN-US">
										<input type="text" name="jform_resume_exp_info[#index#].begin_date"  datatype="*" class="Wdate" onClick="WdatePicker({dateFmt:'yyyy-MM-dd'})"   ignore="ignore">
										<span class="Validform_checktip"></span>
										<label class="Validform_label" style="display: none;">开始时间</label>
										</span></p>
									</td>
									<td nowrap="nowrap" style="width: 78.8pt; border-top-style: none; border-left-style: none; border-bottom-color: rgb(165, 165, 165); border-bottom-width: 1pt; border-right-color: rgb(165, 165, 165); border-right-width: 1pt; padding: 0cm 5.4pt; height: 24.75pt; background-color: rgb(242, 242, 242);" width="105">
										<p align="center" class="MsoNormal" style="text-align:center;mso-pagination:widow-orphan"><span style="font-size: 11pt; font-family: 微软雅黑, sans-serif;">结束时间<span lang="EN-US"><o:p></o:p></span></span></p>
									</td>
									<td style="width: 160px; border-top-style: none; border-left-style: none; border-bottom-color: rgb(165, 165, 165); border-bottom-width: 1pt; border-right-color: rgb(165, 165, 165); border-right-width: 1pt; padding: 0cm 5.4pt; height: 24px; white-space: nowrap;">
										<p align="left" class="MsoNormal"><span lang="EN-US">
										<input type="text" name="jform_resume_exp_info[#index#].end_date" datatype="*" class="Wdate" onClick="WdatePicker({dateFmt:'yyyy-MM-dd'})"   ignore="ignore">
										<span class="Validform_checktip"></span>
										<label class="Validform_label" style="display: none;">结束时间</label>
										</span></p>
									</td>
									<td nowrap="nowrap" style="width: 78.8pt; border-top-style: none; border-left-style: none; border-bottom-color: rgb(165, 165, 165); border-bottom-width: 1pt; border-right-color: rgb(165, 165, 165); border-right-width: 1pt; padding: 0cm 5.4pt; height: 24.75pt; background-color: rgb(242, 242, 242);" width="105">
										<p align="center" class="MsoNormal" style="text-align:center;mso-pagination:widow-orphan"><span style="font-size: 11pt; font-family: 微软雅黑, sans-serif;">公司<span lang="EN-US"><o:p></o:p></span></span></p>
									</td>
									<td style="width: 160px; border-top-style: none; border-left-style: none; border-bottom-color: rgb(165, 165, 165); border-bottom-width: 1pt; border-right-color: rgb(165, 165, 165); border-right-width: 1pt; padding: 0cm 5.4pt; height: 24px; white-space: nowrap;">
										<p align="left" class="MsoNormal"><span lang="EN-US">
										<input type="text" name="jform_resume_exp_info[#index#].company_name" datatype="*" class="inputxt"  ignore="ignore">
										<span class="Validform_checktip"></span>
										<label class="Validform_label" style="display: none;">公司</label>
										</span></p>
									</td>
							</tr>
							<tr style="mso-yfti-irow:4;height:24.75pt">
									<td nowrap="nowrap" style="width: 92.9pt; border-right-color: rgb(165, 165, 165); border-bottom-color: rgb(165, 165, 165); border-left-color: rgb(165, 165, 165); border-right-width: 1pt; border-bottom-width: 1pt; border-left-width: 1pt; border-top-style: none; padding: 0cm 5.4pt; height: 24.75pt; background-color: rgb(242, 242, 242);" width="124">
										<p align="center" class="MsoNormal" style="text-align:center;mso-pagination:widow-orphan"><span style="font-size: 11pt; font-family: 微软雅黑, sans-serif;">所在部门<span lang="EN-US"><o:p></o:p></span></span></p>
									</td>
									<td style="width: 160px; border-top-style: none; border-left-style: none; border-bottom-color: rgb(165, 165, 165); border-bottom-width: 1pt; border-right-color: rgb(165, 165, 165); border-right-width: 1pt; padding: 0cm 5.4pt; height: 24px; white-space: nowrap;">
										<p align="left" class="MsoNormal"><span lang="EN-US">
										<input type="text" name="jform_resume_exp_info[#index#].depart_name" datatype="*" class="inputxt"  ignore="ignore">
										<span class="Validform_checktip"></span>
										<label class="Validform_label" style="display: none;">所在部门</label>
									</span></p>
									</td>
									<td nowrap="nowrap" style="width: 78.8pt; border-top-style: none; border-left-style: none; border-bottom-color: rgb(165, 165, 165); border-bottom-width: 1pt; border-right-color: rgb(165, 165, 165); border-right-width: 1pt; padding: 0cm 5.4pt; height: 24.75pt; background-color: rgb(242, 242, 242);" width="105">
									<p align="center" class="MsoNormal" style="text-align:center;mso-pagination:widow-orphan"><span style="font-size: 11pt; font-family: 微软雅黑, sans-serif;">职位<span lang="EN-US"><o:p></o:p></span></span></p>
									</td>
									<td colspan="3" style="width: 160px; border-top-style: none; border-left-style: none; border-bottom-color: rgb(165, 165, 165); border-bottom-width: 1pt; border-right-color: rgb(165, 165, 165); border-right-width: 1pt; padding: 0cm 5.4pt; height: 24px; white-space: nowrap;">
									<p align="left" class="MsoNormal"><span lang="EN-US">
									<input type="text" name="jform_resume_exp_info[#index#].post" datatype="*" class="inputxt"  ignore="ignore">
									<span class="Validform_checktip"></span>
									<label class="Validform_label" style="display: none;">职位</label>
									</span></p>
									</td>
							</tr>
							<tr style="mso-yfti-irow:4;height:24.75pt">
													<td nowrap="nowrap" style="width: 92.9pt; border-right-color: rgb(165, 165, 165); border-bottom-color: rgb(165, 165, 165); border-left-color: rgb(165, 165, 165); border-right-width: 1pt; border-bottom-width: 1pt; border-left-width: 1pt; border-top-style: none; padding: 0cm 5.4pt; height: 24.75pt; background-color: rgb(242, 242, 242);" width="124">
														<p align="center" class="MsoNormal" style="text-align:center;mso-pagination:widow-orphan"><span style="font-size: 11pt; font-family: 微软雅黑, sans-serif;">证明人姓名<span lang="EN-US"><o:p></o:p></span></span></p>
													</td>
													<td style="width: 160px; border-top-style: none; border-left-style: none; border-bottom-color: rgb(165, 165, 165); border-bottom-width: 1pt; border-right-color: rgb(165, 165, 165); border-right-width: 1pt; padding: 0cm 5.4pt; height: 24px; white-space: nowrap;">
														<p align="left" class="MsoNormal"><span lang="EN-US">
														<input type="text" name="jform_resume_exp_info[#index#].cert_man_name" datatype="*" class="inputxt" value="" ignore="ignore">
														<span class="Validform_checktip"></span>
														<label class="Validform_label" style="display: none;">证明人姓名</label>
													</span></p>
													</td>
													<td nowrap="nowrap" style="width: 78.8pt; border-top-style: none; border-left-style: none; border-bottom-color: rgb(165, 165, 165); border-bottom-width: 1pt; border-right-color: rgb(165, 165, 165); border-right-width: 1pt; padding: 0cm 5.4pt; height: 24.75pt; background-color: rgb(242, 242, 242);" width="105">
													<p align="center" class="MsoNormal" style="text-align:center;mso-pagination:widow-orphan"><span style="font-size: 11pt; font-family: 微软雅黑, sans-serif;">证明人电话<span lang="EN-US"><o:p></o:p></span></span></p>
													</td>
													<td colspan="3" style="width: 160px; border-top-style: none; border-left-style: none; border-bottom-color: rgb(165, 165, 165); border-bottom-width: 1pt; border-right-color: rgb(165, 165, 165); border-right-width: 1pt; padding: 0cm 5.4pt; height: 24px; white-space: nowrap;">
													<p align="left" class="MsoNormal"><span lang="EN-US">
													<input type="text" name="jform_resume_exp_info[#index#].cert_man_phone" datatype="*" class="inputxt" value="" ignore="ignore">
													<span class="Validform_checktip"></span>
													<label class="Validform_label" style="display: none;">证明人电话</label>
													</span></p>
													</td>
				        	</tr>
							<tr>
									<td nowrap="nowrap" style="width: 78.8pt; border-top-style: none; border-left-style: none; border-bottom-color: rgb(165, 165, 165); border-bottom-width: 1pt; border-right-color: rgb(165, 165, 165); border-right-width: 1pt; padding: 0cm 5.4pt; height: 24.75pt; background-color: rgb(242, 242, 242);" width="105">
										<p align="center" class="MsoNormal" style="text-align:center;mso-pagination:widow-orphan"><span style="font-size: 11pt; font-family: 微软雅黑, sans-serif;">工作描述<span lang="EN-US"><o:p></o:p></span></span></p>
										</td>
										<td colspan="5" style="width: 160px; border-top-style: none; border-left-style: none; border-bottom-color: rgb(165, 165, 165); border-bottom-width: 1pt; border-right-color: rgb(165, 165, 165); border-right-width: 1pt; padding: 0cm 5.4pt; height: 24px; white-space: nowrap;">
										<p align="left" class="MsoNormal"><span lang="EN-US">
										<textarea name="jform_resume_exp_info[#index#].experience" datatype="*" class="inputxt" ignore="ignore" rows="3" cols="1000"></textarea>
										<span class="Validform_checktip"></span>
										<label class="Validform_label" style="display: none;">工作描述</label>
										</span></p>
									</td>
							</tr>
		 				</tbody>
					</table>
				</td>
			</tr>
		</tbody>
	</table>
	
</form>
 </body>
</html>