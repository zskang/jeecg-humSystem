<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<!DOCTYPE html>
<html>
 <head>
  <title>员工基本信息表</title>
  <t:base type="jquery,easyui,tools,DatePicker"></t:base>
  <script type="text/javascript">
	function openDepartmentSelect() {
		$.dialog.setting.zIndex = 9999; 
		
		var sysOrgCode = $("#sysOrgCode").val();
		
		$.dialog({content: 'url:departController.do?departSelect&orgIds='+sysOrgCode, zIndex: 2100, title: '组织机构列表', lock: true, width: '400px', height: '350px', opacity: 0.4, button: [
		   {name: '<t:mutiLang langKey="common.confirm"/>', callback: callbackDepartmentSelect, focus: true},
		   {name: '<t:mutiLang langKey="common.cancel"/>', callback: function (){}}
	   ]}).zindex();
	}
		
	function callbackDepartmentSelect() {
		  var iframe = this.iframe.contentWindow;
		  var treeObj = iframe.$.fn.zTree.getZTreeObj("departSelect");
		  var nodes = treeObj.getCheckedNodes(true);
		  if(nodes.length>0){
		  var ids='',names='';
		  for(i=0;i<nodes.length;i++){
		     var node = nodes[i];
		     ids += node.id+',';
		    names += node.name+',';
		 }
		 $('#departname').val(names);
		 $('#departname').blur();	 
		 $('#sysOrgCode').val(ids);		
		}
	}
	
	function callbackClean(){
		$('#departname').val('');
		 $('#sysOrgCode').val('');	
	}
	
	function setOrgIds() {}
	$(function(){
		$("#departname").prev().hide();
	});
	
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
	 
	 
	 /*
	 根据〖中华人民共和国国家标准 GB 11643-1999〗中有关公民身份号码的规定，公民身份号码是特征组合码，由十七位数字本体码和一位数字校验码组成。
	 排列顺序从左至右依次为：六位数字地址码，八位数字出生日期码，三位数字顺序码和一位数字校验码。
	     地址码表示编码对象常住户口所在县(市、旗、区)的行政区划代码。
	     出生日期码表示编码对象出生的年、月、日，其中年份用四位数字表示，年、月、日之间不用分隔符。
	     顺序码表示同一地址码所标识的区域范围内，对同年、月、日出生的人员编定的顺序号。顺序码的奇数分给男性，偶数分给女性。
	     校验码是根据前面十七位数字码，按照ISO 7064:1983.MOD 11-2校验码计算出来的检验码。

	 出生日期计算方法。
	     15位的身份证编码首先把出生年扩展为4位，简单的就是增加一个19或18,这样就包含了所有1800-1999年出生的人;
	     2000年后出生的肯定都是18位的了没有这个烦恼，至于1800年前出生的,那啥那时应该还没身份证号这个东东，⊙﹏⊙b汗...
	 下面是正则表达式:
	  出生日期1800-2099  (18|19|20)?\d{2}(0[1-9]|1[12])(0[1-9]|[12]\d|3[01])
	  身份证正则表达式 /^\d{6}(18|19|20)?\d{2}(0[1-9]|1[12])(0[1-9]|[12]\d|3[01])\d{3}(\d|X)$/i            
	  15位校验规则 6位地址编码+6位出生日期+3位顺序号
	  18位校验规则 6位地址编码+8位出生日期+3位顺序号+1位校验位
	  
	  校验位规则     公式:∑(ai×Wi)(mod 11)……………………………………(1)
	                 公式(1)中： 
	                 i----表示号码字符从由至左包括校验码在内的位置序号； 
	                 ai----表示第i位置上的号码字符值； 
	                 Wi----示第i位置上的加权因子，其数值依据公式Wi=2^(n-1）(mod 11)计算得出。
	                 i 18 17 16 15 14 13 12 11 10 9 8 7 6 5 4 3 2 1
	                 Wi 7 9 10 5 8 4 2 1 6 3 7 9 10 5 8 4 2 1

	 */
	 //身份证号合法性验证 
	 //支持15位和18位身份证号
	 //支持地址编码、出生日期、校验位验证
	         function IdentityCodeValid(code) { 
	             var city={11:"北京",12:"天津",13:"河北",14:"山西",15:"内蒙古",21:"辽宁",22:"吉林",23:"黑龙江 ",31:"上海",32:"江苏",33:"浙江",34:"安徽",35:"福建",36:"江西",37:"山东",41:"河南",42:"湖北 ",43:"湖南",44:"广东",45:"广西",46:"海南",50:"重庆",51:"四川",52:"贵州",53:"云南",54:"西藏 ",61:"陕西",62:"甘肃",63:"青海",64:"宁夏",65:"新疆",71:"台湾",81:"香港",82:"澳门",91:"国外 "};
	             var tip = "";
	             var pass= true;
	             
	             if(!code || !/^\d{6}(18|19|20)?\d{2}(0[1-9]|1[12])(0[1-9]|[12]\d|3[01])\d{3}(\d|X)$/i.test(code)){
	                 tip = "身份证号格式错误";
	                 pass = false;
	             }
	             
	            else if(!city[code.substr(0,2)]){
	                 tip = "地址编码错误";
	                 pass = false;
	             }
	             else{
	                 //18位身份证需要验证最后一位校验位
	                 if(code.length == 18){
	                     code = code.split('');
	                     //∑(ai×Wi)(mod 11)
	                     //加权因子
	                     var factor = [ 7, 9, 10, 5, 8, 4, 2, 1, 6, 3, 7, 9, 10, 5, 8, 4, 2 ];
	                     //校验位
	                     var parity = [ 1, 0, 'X', 9, 8, 7, 6, 5, 4, 3, 2 ];
	                     var sum = 0;
	                     var ai = 0;
	                     var wi = 0;
	                     for (var i = 0; i < 17; i++)
	                     {
	                         ai = code[i];
	                         wi = factor[i];
	                         sum += ai * wi;
	                     }
	                     var last = parity[sum % 11];
	                     if(parity[sum % 11] != code[17]){
	                         tip = "校验位错误";
	                         pass =false;
	                     }
	                 }
	             }
	             if(!pass) alert(tip);
	             return pass;
	         }
	          
	 function checksfz(){
       var cradNo=  $("#cradNo").val();  
	   IdentityCodeValid(cradNo); 
	 }
	 
	 function checkName(){
		 var empName=$("#empName").val();
		  var myReg = /^[\u4e00-\u9fa5]+$/;
          if (!myReg.test(empName)) {
        	  alert("请输入中文名称！否则无法生成员工编号！");
        	  $("#empName").val("");
        	  return false;
          }
	 }
  </script>
 </head>
 <body>
  <t:formvalid formid="formobj" dialog="true" usePlugin="password" layout="table" action="empBaseInfoController.do?doAdd" tiptype="1" >
		<input id="id" name="id" type="hidden" value="${empBaseInfoPage.id }">
	    <input id="createName" name="createName" type="hidden" value="${empBaseInfoPage.createName }">
	    <input id="createDate" name="createDate" type="hidden" value="${empBaseInfoPage.createDate }">
	    <input id="updateName" name="updateName" type="hidden" value="${empBaseInfoPage.updateName }">
        <input id="updateDate" name="updateDate" type="hidden" value="${empBaseInfoPage.updateDate }">
		<table style="width: 800px;" cellpadding="0" cellspacing="1" class="formtable">
				<tr>
				<td align="right">
						<label class="Validform_label">
							员工名称:
						</label>
					</td>
					<td class="value" colspan="3">
					     	 <input id="empName" name="empName" type="text" style="width:350px" class="inputxt"  datatype="*" onblur="checkName();">
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">员工名称</label>
						</td> 
					</tr>
			<tr>
					<td align="right">
						<label class="Validform_label">
							员工编号:
						</label>
					</td>
					<td class="value"  colspan="3">
					     	 <input id="empNo" name="empNo" type="text" style="width: 350px" class="inputxt"  readonly="readonly"> 
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
                <input id="sysOrgCode" name="sysOrgCode" type="hidden" value="${sysOrgCode}">
                <a href="#" class="easyui-linkbutton" plain="true" icon="icon-search" id="departSearch" onclick="openDepartmentSelect()">选择</a>
                <a href="#" class="easyui-linkbutton" plain="true" icon="icon-redo" id="departRedo" onclick="callbackClean()">清空</a>
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
							   <input id="brthdate" name="brthdate" type="text" style="width: 150px" 
					      						class="Wdate" onClick="WdatePicker();" onChange="changeAge();">
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
					     	 <input id="age" name="age" type="text" style="width: 150px" class="inputxt" readonly="readonly">
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
					     	  <t:dictSelect field="emptype" type="list"
									typeGroupCode="emptype" defaultVal="${empBaseInfoPage.emptype}" hasLabel="false"  title="职务等级"></t:dictSelect>     
							
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
					     	 <input id="xinzi" name="xinzi" type="text" style="width: 150px" class="inputxt" datatype="n" errormsg="核定薪资格式不正确!"  >
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
					<td class="value" colspan="3">
					       <input id="techang" name="techang" type="text" style="width: 500px" class="inputxt" >
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">特长</label>
						</td> 
					</tr>
					<tr>
					<td align="right">
						<label class="Validform_label">
							执业资格证:
						</label>
					</td>
					<td class="value" colspan="3">
					     	 <input id="zyzgz" name="zyzgz" type="text" style="width: 500px" class="inputxt" >
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
					     	 <input id="cradNo" name="cradNo" type="text" style="width: 350px" class="inputxt" onblur="checksfz()">
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">身份证号码</label>
						</td>
					<td align="right">
						<label class="Validform_label">
							职称:
						</label>
					</td>
					<td class="value">
					  <t:dictSelect field="zhicheng" type="list"
									typeGroupCode="zhicheng" defaultVal="${empBaseInfoPage.zhicheng}" hasLabel="false"  title="职称"></t:dictSelect>     
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
					     	 <input id="hujiAddress" name="hujiAddress" type="text" style="width: 350px" class="inputxt" >
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">户籍地址</label>
						</td>
					<td align="right">
						<label class="Validform_label">
							邮政编码:
						</label>
					</td>
					<td class="value">
					     	 <input id="post1" name="post1" type="text" style="width: 150px" class="inputxt" >
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
					     	 <input id="nowAddress" name="nowAddress" type="text" style="width: 350px" class="inputxt" >
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">现 住 址</label>
						</td>
					<td align="right">
						<label class="Validform_label">
							邮政编码:
						</label>
					</td>
					<td class="value">
					     	 <input id="post2" name="post2" type="text" style="width: 150px" class="inputxt" >
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
					     	 <input id="tel" name="tel" type="text" style="width: 150px" class="inputxt" datatype="m" errormsg="联络电话非法">
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">联络电话</label>
						</td>
					<td align="right">
						<label class="Validform_label">
							手机:
						</label>
					</td>
					<td class="value">
					     	 <input id="mobile" name="mobile" type="text" style="width: 150px" class="inputxt" datatype="m" errormsg="手机号非法">
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
					     	 <input id="email" name="email" type="text" style="width: 150px" class="inputxt" datatype="e" errormsg="邮箱非法">
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
