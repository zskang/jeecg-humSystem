<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<!DOCTYPE html>
<html>
 <head>
  <title>员工基本信息表</title>
  <t:base type="jquery,easyui,tools,DatePicker"></t:base>
  <script type="text/javascript">
  //编写自定义JS代码
	function changeAge(){ 
	  $("#age").val('');  
	 if($("#brthdate").val()!=null && $("#brthdate").val() !=""){  
			 $("#age").val(ages($("#brthdate").val()));
		}
	  }   
	 function   ages(str)   
	  {   
	        var   r   =   str.match(/^(\d{1,4})(-|\/)(\d{1,2})\2(\d{1,2})$/);     
	        if(r==null)return   false;     
	        var   d=   new   Date(r[1],   r[3]-1,   r[4]);     
	        if   (d.getFullYear()==r[1]&&(d.getMonth()+1)==r[3]&&d.getDate()==r[4])   
	        {   
	              var   Y   =   new   Date().getFullYear();   
	              var g=Y-r[1];
	              return g;   
	        }else{
	        	return -1;
	        }  
	        
	  }    
  </script>
 </head>
 <body>
		<t:formvalid formid="formobj" dialog="true" usePlugin="password" layout="table" action="empBaseInfoController.do?doUpdate" tiptype="1" >
					<input id="id" name="id" type="hidden" value="${empBaseInfoPage.id }">
					<input id="createName" name="createName" type="hidden" value="${empBaseInfoPage.createName }">
					<input id="createDate" name="createDate" type="hidden" value="${empBaseInfoPage.createDate }">
					<input id="updateName" name="updateName" type="hidden" value="${empBaseInfoPage.updateName }">
					<input id="updateDate" name="updateDate" type="hidden" value="${empBaseInfoPage.updateDate }">
		<table style="width: 600px;" cellpadding="0" cellspacing="1" class="formtable">
					<tr> 
						<td align="right">
							<label class="Validform_label">
								员工名称:
							</label>
						</td>
						<td class="value">
						     	 <input id="empName" name="empName" type="text" style="width: 150px" class="inputxt" datatype="*" value='${empBaseInfoPage.empName}'  readonly="readonly">
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">员工名称</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								员工编号:
							</label>
						</td>
						<td class="value">
						     	 <input id="empNo" name="empNo" type="text" style="width: 150px" class="inputxt" datatype="*" value='${empBaseInfoPage.empNo}'  readonly="readonly">
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">员工编号</label>
						</td>
					</tr>
					<tr> 
					   <td align="right">
							<label class="Validform_label">
								所属部门:
							</label>
						</td>
						<td class="value">
						  <input id="departname" name="departname" type="text" readonly="readonly" class="inputxt" datatype="*" value="${departname}">
						  <input id="sysOrgCode" name="sysOrgCode"   value='${empBaseInfoPage.sysOrgCode}' type="hidden" >
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">所属部门</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								职务等级:
							</label>
						</td>
						<td class="value">
									<t:dictSelect field="postion" type="list"
										typeGroupCode="postion" defaultVal="${empBaseInfoPage.postion}" hasLabel="false"  title="职务等级"></t:dictSelect>     
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">职务等级</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								性别:
							</label>
						</td>
						<td class="value">
									<t:dictSelect field="sex" type="list"
										typeGroupCode="sex" defaultVal="${empBaseInfoPage.sex}" hasLabel="false"  title="性别"></t:dictSelect>     
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">性别</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								婚姻状况:
							</label>
						</td>
						<td class="value">
									<t:dictSelect field="marry" type="list"
										typeGroupCode="marry" defaultVal="${empBaseInfoPage.marry}" hasLabel="false"  title="婚姻状况"></t:dictSelect>     
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">婚姻状况</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								出生日期:
							</label>
						</td>
						<td class="value">
									  <input id="brthdate" name="brthdate" type="text" style="width: 150px"  class="Wdate" onClick="WdatePicker()" value='<fmt:formatDate value='${empBaseInfoPage.brthdate}' type="date" pattern="yyyy-MM-dd"/>'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">出生日期</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								民 族:
							</label>
						</td>
						<td class="value">
									<t:dictSelect field="minzu" type="list"
										typeGroupCode="minzu" defaultVal="${empBaseInfoPage.minzu}" hasLabel="false"  title="民 族"></t:dictSelect>     
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">民 族</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								政治面貌:
							</label>
						</td>
						<td class="value">
									<t:dictSelect field="zzmm" type="list"
										typeGroupCode="zzmm" defaultVal="${empBaseInfoPage.zzmm}" hasLabel="false"  title="政治面貌"></t:dictSelect>     
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">政治面貌</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								年龄:
							</label>
						</td>
						<td class="value">
						     	 <input id="age" name="age" type="text" style="width: 150px" class="inputxt"  value='${empBaseInfoPage.age}' readonly="readonly">
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">年龄</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								外语:
							</label>
						</td>
						<td class="value">
									<t:dictSelect field="langtype" type="list"
										typeGroupCode="langtype" defaultVal="${empBaseInfoPage.langtype}" hasLabel="false"  title="外语"></t:dictSelect>     
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">外语</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								外语水平:
							</label>
						</td>
						<td class="value">
									<t:dictSelect field="langgrade" type="list"
										typeGroupCode="langgrade" defaultVal="${empBaseInfoPage.langgrade}" hasLabel="false"  title="外语水平"></t:dictSelect>     
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">外语水平</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								员工类别:
							</label>
						</td>
						<td class="value">
						     	 <input id="emptype" name="emptype" type="text" style="width: 150px" class="inputxt"  value='${empBaseInfoPage.emptype}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">员工类别</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								籍 贯:
							</label>
						</td>
						<td class="value">
									<t:dictSelect field="jiguan" type="list"
										typeGroupCode="jiguan" defaultVal="${empBaseInfoPage.jiguan}" hasLabel="false"  title="籍 贯"></t:dictSelect>     
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">籍 贯</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								户口性质:
							</label>
						</td>
						<td class="value">
						 <t:dictSelect field="hukouType" type="list"
									typeGroupCode="hukou_yupe" defaultVal="${empBaseInfoPage.hukouType}" hasLabel="false"  title="户口性质"></t:dictSelect>     
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">户口性质</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								核定薪资:
							</label>
						</td>
						<td class="value">
						     	 <input id="xinzi" name="xinzi" type="text" style="width: 150px" class="inputxt"  value='${empBaseInfoPage.xinzi}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">核定薪资</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								特长:
							</label>
						</td>
						<td class="value">
						     	 <input id="techang" name="techang" type="text" style="width: 150px" class="inputxt"  value='${empBaseInfoPage.techang}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">特长</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								执业资格证:
							</label>
						</td>
						<td class="value">
						     	 <input id="zyzgz" name="zyzgz" type="text" style="width: 150px" class="inputxt"  value='${empBaseInfoPage.zyzgz}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">执业资格证</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								身份证号码:
							</label>
						</td>
						<td class="value">
						     	 <input id="cradNo" name="cradNo" type="text" style="width: 150px" class="inputxt"  value='${empBaseInfoPage.cradNo}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">身份证号码</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								职称:
							</label>
						</td>
						<td class="value">
						     	 <input id="zhicheng" name="zhicheng" type="text" style="width: 150px" class="inputxt"  value='${empBaseInfoPage.zhicheng}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">职称</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								户籍地址:
							</label>
						</td>
						<td class="value">
						     	 <input id="hujiAddress" name="hujiAddress" type="text" style="width: 150px" class="inputxt"  value='${empBaseInfoPage.hujiAddress}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">户籍地址</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								邮政编码:
							</label>
						</td>
						<td class="value">
						     	 <input id="post1" name="post1" type="text" style="width: 150px" class="inputxt"  value='${empBaseInfoPage.post1}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">邮政编码</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								现 住 址:
							</label>
						</td>
						<td class="value">
						     	 <input id="nowAddress" name="nowAddress" type="text" style="width: 150px" class="inputxt"  value='${empBaseInfoPage.nowAddress}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">现 住 址</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								邮政编码:
							</label>
						</td>
						<td class="value">
						     	 <input id="post2" name="post2" type="text" style="width: 150px" class="inputxt"  value='${empBaseInfoPage.post2}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">邮政编码</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								联络电话:
							</label>
						</td>
						<td class="value">
						     	 <input id="tel" name="tel" type="text" style="width: 150px" class="inputxt"  value='${empBaseInfoPage.tel}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">联络电话</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								手机:
							</label>
						</td>
						<td class="value">
						     	 <input id="mobile" name="mobile" type="text" style="width: 150px" class="inputxt"  value='${empBaseInfoPage.mobile}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">手机</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								E_mail:
							</label>
						</td>
						<td class="value">
						     	 <input id="email" name="email" type="text" style="width: 150px" class="inputxt"  value='${empBaseInfoPage.email}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">E_mail</label>
						</td>
				<td align="right">
					<label class="Validform_label">
					</label>
				</td>
				<td class="value">
				</td>
					</tr>
			</table>
		</t:formvalid>
 </body>
  <script src = "webpage/com/jeecg/empbaseinfo/empBaseInfo.js"></script>		
