<%@ page language="java" import="java.util.*"
	contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<!DOCTYPE html>
<html>
<head>
<title>六项学科数据信息表</title>
<t:base type="jquery,easyui,tools,DatePicker,comfirm"></t:base>
</head>
<body>
	<t:formvalid formid="formobj" dialog="true" usePlugin="password"
		layout="table" tiptype="1" action="sixDataController.do?save">
		<input id="id" name="id" type="hidden" value="${sixDataPage.id }">
		<input id="year" name="year" type="hidden" value="${sixDataPage.year }">
		<input id="subjectType" name="subjectType" type="hidden" value="${sixDataPage.subjectType }">
		<input id="createName" name="createName" type="hidden" value="${sixDataPage.createName }">
		<input id="createDate" name="createDate" type="hidden" value="${sixDataPage.createDate }">
		<table style="width: 2600px;" cellpadding="0" cellspacing="1"
			class="formtable">
			<tr>
				<td height="100px" colspan="26"  align="center">${sixDataPage.dataTitle}</td>
			</tr>
			<tr>
				<td rowspan="2" width="90px" align="center"> 
						<strong>序号</strong>
				 </td>
				<td rowspan="2" width="150px" align="center"> 
						<strong>项目</strong>
					 </td>
				<td rowspan="2" width="150px" align="center"> 
						<strong>分项</strong>
					 </td>
				<td colspan="4" align="center"> 
						<strong>寒</strong>
					 </td>
				<td colspan="6" align="center"> 
						<strong>春</strong>
				 </td>
				<td colspan="4" align="center"> 
						<strong>暑</strong>
					 </td>
				<td colspan="6" align="center"> 
						<strong>秋</strong>
					 </td>
				<td colspan="3" align="center"> 
						<strong>年度总计</strong>
					 </td>
			</tr>
			<tr>
				<td height="38" align="center">
						<strong>目标量</strong>
					</td>
				<td align="center">
						<strong>1月完成</strong>
					</td>
				<td align="center">
						<strong>2月完成</strong>
					</td>
				<td align="center">
						<strong>完成率</strong>
					</td>
				<td align="center">
						<strong>目标量</strong>
					</td>
				<td align="center">
						<strong>3月完成</strong>
					</td>
				<td align="center">
						<strong>4月完成</strong>
					</td>
				<td align="center">
						<strong>5月完成</strong>
					</td>
				<td align="center">
						<strong>6月完成</strong>
					</td>
				<td align="center">
						<strong>完成率</strong>
					</td>
				<td align="center">
						<strong>目标量</strong>
					</td>
				<td align="center">
						<strong>7月完成</strong>
					</td>
				<td align="center">
						<strong>8月完成</strong>
					</td>
				<td align="center">
						<strong>完成率</strong>
					</td>
				<td align="center">
						<strong>目标量</strong>
					</td>
				<td align="center">
						<strong>9月完成</strong>
					</td>
				<td align="center">
						<strong>10月完成</strong>
					</td>
				<td align="center">
						<strong>11月完成</strong>
					</td>
				<td align="center">
						<strong>12月完成</strong>
					</td>
				<td align="center">
						<strong>完成率</strong>
					</td>
				<td align="center">
						<strong>目标量</strong>
					</td>
				<td align="center">
						<strong>完成量</strong>
					</td>
				<td align="center">
						<strong>完成率</strong>
					</td>
			</tr>
			<tr>
				<td align="center">1</td>
				<td colspan="2" align="center">
						<strong>学员总人数</strong>
					</td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"  
					id="HMB1" name="HMB1" value="${sixDataPage.HMB1}" type="text" onblur="calMB('1','H')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"  
					id="yue11" name="yue11" value="${sixDataPage.yue11}" type="text" onblur="calYUE('1','H')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="yue21" name="yue21" value="${sixDataPage.yue21}" type="text" onblur="calYUE('1','H')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="HWC1" name="HWC1" value="${sixDataPage.HWC1}" type="text" readonly="readonly" > </td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="CMB1" name="CMB1" value="${sixDataPage.CMB1}" type="text"  onblur="calMB('1','C')"> </td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="yue31" name="yue31" value="${sixDataPage.yue31}" type="text" onblur="calYUE('1','C')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="yue41" name="yue41" value="${sixDataPage.yue41}" type="text"  onblur="calYUE('1','C')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="yue51" name="yue51" value="${sixDataPage.yue51}" type="text"  onblur="calYUE('1','C')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="yue61" name="yue61" value="${sixDataPage.yue61}" type="text"  onblur="calYUE('1','C')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="CWC1" name="CWC1" value="${sixDataPage.CWC1}" type="text" readonly="readonly"> </td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="SMB1" name="SMB1" value="${sixDataPage.SMB1}" type="text"  onblur="calMB('1','S')"> </td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="yue71" name="yue71" value="${sixDataPage.yue71}" type="text" onblur="calYUE('1','S')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="yue81" name="yue81" value="${sixDataPage.yue81}" type="text" onblur="calYUE('1','S')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="SWC1" name="SWC1" value="${sixDataPage.SWC1}" type="text" readonly="readonly"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="QMB1" name="QMB1" value="${sixDataPage.QMB1}" type="text"  onblur="calMB('1','Q')"> </td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="yue91" name="yue91" value="${sixDataPage.yue91}" type="text" onblur="calYUE('1','Q')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="yue101" name="yue101" value="${sixDataPage.yue101}" type="text" onblur="calYUE('1','Q')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="yue111" name="yue111" value="${sixDataPage.yue111}" type="text" onblur="calYUE('1','Q')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="yue121" name="yue121" value="${sixDataPage.yue121}" type="text" onblur="calYUE('1','Q')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="QWC1" name="QWC1" value="${sixDataPage.QWC1}" type="text" readonly="readonly"> </td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="totalMb1" name="totalMb1" value="${sixDataPage.totalMb1}" type="text" required="required" onblur="calTotalMb('1')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d" 
					id="totalWc1" name="totalWc1" value="${sixDataPage.totalWc1}" type="text" readonly="readonly"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="totalWcl1" name="totalWcl1" value="${sixDataPage.totalWcl1}" type="text" readonly="readonly"></td>
			</tr>
			<tr>
				<td align="center">2</td>
				<td rowspan="4" align="center">
						<strong>升班率</strong>
					</td>
				<td align="center">
						<strong>计升班总人数</strong>
					</td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="HMB2" name="HMB2" value="${sixDataPage.HMB2}" type="text" onblur="calMB('2','H')"> </td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="yue12" name="yue12" value="${sixDataPage.yue12}" type="text" onblur="calYUE('2','H')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="yue22" name="yue22" value="${sixDataPage.yue22}" type="text" onblur="calYUE('2','H')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="HWC2" name="HWC2" value="${sixDataPage.HWC2}" type="text"> </td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="CMB2" name="CMB2" value="${sixDataPage.CMB2}" type="text" onblur="calMB('2','C')"> </td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="yue32" name="yue32" value="${sixDataPage.yue32}" type="text" onblur="calYUE('2','C')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="yue42" name="yue42" value="${sixDataPage.yue42}" type="text" onblur="calYUE('2','C')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="yue52" name="yue52" value="${sixDataPage.yue52}" type="text" onblur="calYUE('2','C')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="yue62" name="yue62" value="${sixDataPage.yue62}" type="text" onblur="calYUE('2','C')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="CWC2" name="CWC2" value="${sixDataPage.CWC2}" type="text"> </td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="SMB2" name="SMB2" value="${sixDataPage.SMB2}" type="text" onblur="calMB('2','S')"> </td> 
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="yue72" name="yue72" value="${sixDataPage.yue72}" type="text" onblur="calYUE('2','S')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="yue82" name="yue82" value="${sixDataPage.yue82}" type="text" onblur="calYUE('2','S')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="SWC2" name="SWC2" value="${sixDataPage.SWC2}" type="text">
					</td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="QMB2" name="QMB2" value="${sixDataPage.QMB2}" type="text" onblur="calMB('2','Q')"> </td> 
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="yue92" name="yue92" value="${sixDataPage.yue92}" type="text" onblur="calYUE('2','Q')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="yue102" name="yue102" value="${sixDataPage.yue102}" type="text"  onblur="calYUE('2','Q')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="yue112" name="yue112" value="${sixDataPage.yue112}" type="text"  onblur="calYUE('2','Q')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="yue122" name="yue122" value="${sixDataPage.yue122}" type="text"  onblur="calYUE('2','Q')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="QWC2" name="QWC2" value="${sixDataPage.QWC2}" type="text">
					</td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="totalMb2" name="totalMb2" value="${sixDataPage.totalMb2}"
					type="text" onblur="calTotalMb('2')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="totalWc2" name="totalWc2" value="${sixDataPage.totalWc2}" readonly="readonly"
					type="text"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="totalWcl2" name="totalWcl2" value="${sixDataPage.totalWcl2}" readonly="readonly"
					type="text"></td>
			</tr>
			<tr>
				<td align="center">3</td>
				<td align="center">
						<strong>0－5折</strong>
					</td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="HMB3" name="HMB3" value="${sixDataPage.HMB3}" type="text" onblur="calMB('3','H')"> </td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="yue13" name="yue13" value="${sixDataPage.yue13}" type="text"  onblur="calYUE('3','H')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="yue23" name="yue23" value="${sixDataPage.yue23}" type="text"  onblur="calYUE('3','H')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="HWC3" name="HWC3" value="${sixDataPage.HWC3}" type="text" ></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="CMB3" name="CMB3" value="${sixDataPage.CMB3}" type="text"  onblur="calMB('3','C')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="yue33" name="yue33" value="${sixDataPage.yue33}" type="text"  onblur="calYUE('3','C')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="yue43" name="yue43" value="${sixDataPage.yue43}" type="text"  onblur="calYUE('3','C')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="yue53" name="yue53" value="${sixDataPage.yue53}" type="text" onblur="calYUE('3','C')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="yue63" name="yue63" value="${sixDataPage.yue63}" type="text"  onblur="calYUE('3','C')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d" readonly="readonly"
					id="CWC3" name="CWC3" value="${sixDataPage.CWC3}" type="text"> </td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="SMB3" name="SMB3" value="${sixDataPage.SMB3}" type="text"  onblur="calMB('3','S')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="yue73" name="yue73" value="${sixDataPage.yue73}" type="text"  onblur="calYUE('3','S')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="yue83" name="yue83" value="${sixDataPage.yue83}" type="text"  onblur="calYUE('3','S')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d" readonly="readonly"
					id="SWC3" name="SWC3" value="${sixDataPage.SWC3}" type="text"> </td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="QMB3" name="qMb3" value="${sixDataPage.QMB3}" type="text" onblur="calMB('3','Q')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="yue93" name="yue93" value="${sixDataPage.yue93}" type="text"  onblur="calYUE('3','Q')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="yue103" name="yue103" value="${sixDataPage.yue103}" type="text"  onblur="calYUE('3','Q')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="yue113" name="yue113" value="${sixDataPage.yue113}" type="text"  onblur="calYUE('3','Q')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="yue123" name="yue123" value="${sixDataPage.yue123}" type="text"  onblur="calYUE('3','Q')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d" readonly="readonly"
					id="QWC3" name="QWC3" value="${sixDataPage.QWC3}" type="text"> </td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="totalMb3" name="totalMb3" value="${sixDataPage.totalMb3}" type="text" onblur="calTotalMb('3')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="totalWc3" name="totalWc3" value="${sixDataPage.totalWc3}" readonly="readonly" type="text"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="totalWcl3" name="totalWcl3" value="${sixDataPage.totalWcl3}" readonly="readonly" type="text"></td>
			</tr>
			<tr>
				<td align="center">4</td>
				<td align="center">
						<strong>升班人数</strong>
					</td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="HMB4" name="HMB4" value="${sixDataPage.HMB4}" type="text" onblur="calMB('4','H')">
					</td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="yue14" name="yue14" value="${sixDataPage.yue14}" type="text" onblur="calYUE('4','H')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="yue24" name="yue24" value="${sixDataPage.yue24}" type="text" onblur="calYUE('4','H')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d" readonly="readonly"
					id="HWC4" name="HWC4" value="${sixDataPage.HWC4}" type="text">
					</td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="CMB4" name="CMB4" value="${sixDataPage.CMB4}" type="text"  onblur="calMB('4','C')">
					</td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="yue34" name="yue34" value="${sixDataPage.yue34}" type="text" onblur="calYUE('4','C')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="yue44" name="yue44" value="${sixDataPage.yue44}" type="text" onblur="calYUE('4','C')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="yue54" name="yue54" value="${sixDataPage.yue54}" type="text" onblur="calYUE('4','C')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="yue64" name="yue64" value="${sixDataPage.yue64}" type="text" onblur="calYUE('4','C')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d" readonly="readonly"
					id="CWC4" name="CWC4" value="${sixDataPage.CWC4}" type="text">
					</td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="SMB4" name="SMB4" value="${sixDataPage.SMB4}" type="text"  onblur="calMB('4','S')">
					</td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="yue74" name="yue74" value="${sixDataPage.yue74}" type="text" onblur="calYUE('4','S')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="yue84" name="yue84" value="${sixDataPage.yue84}" type="text" onblur="calYUE('4','S')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"  readonly="readonly"
					id="SWC4" name="SWC4" value="${sixDataPage.SWC4}" type="text">
					</td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="QMB4" name="QMB4" value="${sixDataPage.QMB4}" type="text" onblur="calMB('4','Q')">
					</td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="yue94" name="yue94" value="${sixDataPage.yue94}" type="text" onblur="calYUE('4','Q')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="yue104" name="yue104" value="${sixDataPage.yue104}" type="text" onblur="calYUE('4','Q')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="yue114" name="yue114" value="${sixDataPage.yue114}" type="text" onblur="calYUE('4','Q')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="yue124" name="yue124" value="${sixDataPage.yue124}" type="text" onblur="calYUE('4','Q')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"  readonly="readonly"
					id="QWC4" name="QWC4" value="${sixDataPage.QWC4}" type="text" >
					</td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="totalMb4" name="totalMb4" value="${sixDataPage.totalMb4}"
					type="text" onblur="calTotalMb('4')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="totalWc4" name="totalWc4" value="${sixDataPage.totalWc4}"  readonly="readonly"
					type="text"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="totalWcl4" name="totalWcl4" value="${sixDataPage.totalWcl4}"  readonly="readonly"
					type="text"></td>
			</tr>
			<tr>
				<td align="center">5</td>
				<td align="center">
						<strong>升班率</strong>
					</td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="HMB5" name="HMB5" value="${sixDataPage.HMB5}" type="text" onblur="calMB('5','H')">
					</td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="yue15" name="yue15" value="${sixDataPage.yue15}" type="text" onblur="calYUE('5','H')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="yue25" name="yue25" value="${sixDataPage.yue25}" type="text" onblur="calYUE('5','H')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d" readonly="readonly"
					id="HWC5" name="HWC5" value="${sixDataPage.HWC5}" type="text">
					</td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="CMB5" name="CMB5" value="${sixDataPage.CMB5}" type="text" onblur="calMB('5','C')">
					</td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="yue35" name="yue35" value="${sixDataPage.yue35}" type="text" onblur="calYUE('5','C')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="yue45" name="yue45" value="${sixDataPage.yue45}" type="text" onblur="calYUE('5','C')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="yue55" name="yue55" value="${sixDataPage.yue55}" type="text" onblur="calYUE('5','C')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="yue65" name="yue65" value="${sixDataPage.yue65}" type="text" onblur="calYUE('5','C')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d" readonly="readonly"
					id="CWC5" name="CWC5" value="${sixDataPage.CWC5}" type="text">
					</td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="SMB5" name="SMB5" value="${sixDataPage.SMB5}" type="text" onblur="calMB('5','S')">
					</td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="yue75" name="yue75" value="${sixDataPage.yue75}" type="text" onblur="calYUE('5','S')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="yue85" name="yue85" value="${sixDataPage.yue85}" type="text" onblur="calYUE('5','S')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d" readonly="readonly"
					id="SWC5" name="SWC5" value="${sixDataPage.SWC5}" type="text">
					</td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="QMB5" name="QMB5" value="${sixDataPage.QMB5}" type="text" onblur="calMB('5','Q')">
					</td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="yue95" name="yue95" value="${sixDataPage.yue95}" type="text" onblur="calYUE('5','Q')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="yue105" name="yue105" value="${sixDataPage.yue105}" type="text" onblur="calYUE('5','Q')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="yue115" name="yue115" value="${sixDataPage.yue115}" type="text" onblur="calYUE('5','Q')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="yue125" name="yue125" value="${sixDataPage.yue125}" type="text" onblur="calYUE('5','Q')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d" readonly="readonly"
					id="QWC5" name="QWC5" value="${sixDataPage.QWC5}" type="text">
					</td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="totalMb5" name="totalMb5" value="${sixDataPage.totalMb5}" 
					type="text" onblur="calTotalMb('5')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="totalWc5" name="totalWc5" value="${sixDataPage.totalWc5}"  readonly="readonly"
					type="text"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="totalWcl5" name="totalWcl5" value="${sixDataPage.totalWcl5}"  readonly="readonly"
					type="text"></td>
			</tr>
			<tr>
				<td align="center">6</td>
				<td rowspan="3" align="center">
						<strong>平均班额</strong>
					</td>
				<td align="center">
						<strong>总人数</strong>
					</td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="HMB6" name="HMB6" value="${sixDataPage.HMB6}" type="text" onblur="calMB('6','H')">
					</td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="yue16" name="yue16" value="${sixDataPage.yue16}" type="text" onblur="calYUE('6','H')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="yue26" name="yue26" value="${sixDataPage.yue26}" type="text" onblur="calYUE('6','H')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"  readonly="readonly"
					id="HWC6" name="HWC6" value="${sixDataPage.HWC6}" type="text"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="CMB6" name="CMB6" value="${sixDataPage.CMB6}" type="text" onblur="calMB('6','C')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="yue36" name="yue36" value="${sixDataPage.yue36}" type="text" onblur="calYUE('6','C')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="yue46" name="yue46" value="${sixDataPage.yue46}" type="text" onblur="calYUE('6','C')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="yue56" name="yue56" value="${sixDataPage.yue56}" type="text" onblur="calYUE('6','C')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="yue66" name="yue66" value="${sixDataPage.yue66}" type="text" onblur="calYUE('6','C')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"  readonly="readonly"
					id="CWC6" name="CWC6" value="${sixDataPage.CWC6}" type="text">
					</td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="SMB6" name="SMB6" value="${sixDataPage.SMB6}" type="text"  onblur="calMB('6','S')">
					</td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="yue76" name="yue76" value="${sixDataPage.yue76}" type="text" onblur="calYUE('6','S')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="yue86" name="yue86" value="${sixDataPage.yue86}" type="text" onblur="calYUE('6','S')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"  readonly="readonly"
					id="SWC6" name="SWC6" value="${sixDataPage.SWC6}" type="text">
					</td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="QMB6" name="QMB6" value="${sixDataPage.QMB6}" type="text"  onblur="calMB('6','Q')">
					</td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="yue96" name="yue96" value="${sixDataPage.yue96}" type="text" onblur="calYUE('6','Q')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="yue106" name="yue106" value="${sixDataPage.yue106}" type="text" onblur="calYUE('6','Q')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="yue116" name="yue116" value="${sixDataPage.yue116}" type="text" onblur="calYUE('6','Q')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="yue126" name="yue126" value="${sixDataPage.yue126}" type="text" onblur="calYUE('6','Q')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"  readonly="readonly"
					id="QWC6" name="QWC6" value="${sixDataPage.QWC6}" type="text">
					</td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="totalMb6" name="totalMb6" value="${sixDataPage.totalMb6}"
					type="text" onblur="calTotalMb('6')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"  readonly="readonly"
					id="totalWc6" name="totalWc6" value="${sixDataPage.totalWc6}"
					type="text"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"  readonly="readonly"
					id="totalWcl6" name="totalWcl6" value="${sixDataPage.totalWcl6}"
					type="text"></td>
			</tr>
			<tr>
				<td align="center">7</td>
				<td align="center">
						<strong>总班量</strong>
					</td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="HMB7" name="HMB7" value="${sixDataPage.HMB7}" type="text" onblur="calMB('7','H')">
					</td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="yue17" name="yue17" value="${sixDataPage.yue17}" type="text" onblur="calYUE('7','H')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="yue27" name="yue27" value="${sixDataPage.yue27}" type="text" onblur="calYUE('7','H')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"  readonly="readonly"
					id="HWC7" name="hWc7" value="${sixDataPage.HWC7}" type="text">
					</td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d" 
					id="CMB7" name="CMB7" value="${sixDataPage.CMB7}" type="text" onblur="calMB('7','C')">
					</td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="yue37" name="yue37" value="${sixDataPage.yue37}" type="text" onblur="calYUE('7','C')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="yue47" name="yue47" value="${sixDataPage.yue47}" type="text"  onblur="calYUE('7','C')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="yue57" name="yue57" value="${sixDataPage.yue57}" type="text"  onblur="calYUE('7','C')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="yue67" name="yue67" value="${sixDataPage.yue67}" type="text"  onblur="calYUE('7','C')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"  readonly="readonly"
					id="CWC7" name="CWC7" value="${sixDataPage.CWC7}" type="text">
					</td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="SMB7" name="SMB7" value="${sixDataPage.SMB7}" type="text"  onblur="calMB('7','S')">
					</td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="yue77" name="yue77" value="${sixDataPage.yue77}" type="text"  onblur="calYUE('7','S')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="yue87" name="yue87" value="${sixDataPage.yue87}" type="text" onblur="calYUE('7','S')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"  readonly="readonly"
					id="SWC7" name="SWC7" value="${sixDataPage.SWC7}" type="text">
					</td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="QMB7" name="QMB7" value="${sixDataPage.QMB7}" type="text"  onblur="calMB('7','Q')">
					</td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="yue97" name="yue97" value="${sixDataPage.yue97}" type="text" onblur="calYUE('7','Q')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="yue107" name="yue107" value="${sixDataPage.yue107}" type="text" onblur="calYUE('7','Q')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="yue117" name="yue117" value="${sixDataPage.yue117}" type="text" onblur="calYUE('7','Q')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="yue127" name="yue127" value="${sixDataPage.yue127}" type="text" onblur="calYUE('7','Q')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d" readonly="readonly"
					id="QWC7" name="QWC7" value="${sixDataPage.QWC7}" type="text">
					</td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="totalMb7" name="totalMb7" value="${sixDataPage.totalMb7}"
					type="text" onblur="calTotalMb('7')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d" readonly="readonly"
					id="totalWc7" name="totalWc7" value="${sixDataPage.totalWc7}"
					type="text"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d" readonly="readonly"
					id="totalWcl7" name="totalWcl7" value="${sixDataPage.totalWcl7}"
					type="text"></td>
			</tr>
			<tr>
				<td align="center">8</td>
				<td align="center">
						<strong>平均班额</strong>
					</td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="HMB8" name="HMB8" value="${sixDataPage.HMB8}" type="text" onblur="calMB('8','H')">
					</td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="yue18" name="yue18" value="${sixDataPage.yue18}" type="text" onblur="calYUE('8','H')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="yue28" name="yue28" value="${sixDataPage.yue28}" type="text" onblur="calYUE('8','H')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d" readonly="readonly"
					id="HWC8" name="HWC8" value="${sixDataPage.HWC8}" type="text">
					</td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="CMB8" name="CMB8" value="${sixDataPage.CMB8}" type="text"  onblur="calMB('8','C')">
					</td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="yue38" name="yue38" value="${sixDataPage.yue38}" type="text" onblur="calYUE('8','C')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="yue48" name="yue48" value="${sixDataPage.yue48}" type="text"  onblur="calYUE('8','C')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="yue58" name="yue58" value="${sixDataPage.yue58}" type="text"  onblur="calYUE('8','C')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="yue68" name="yue68" value="${sixDataPage.yue68}" type="text"  onblur="calYUE('8','C')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d" readonly="readonly"
					id="CWC8" name="CWC8" value="${sixDataPage.CWC8}" type="text">
					</td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="SMB8" name="SMB8" value="${sixDataPage.SMB8}" type="text"  onblur="calMB('8','S')">
					</td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="yue78" name="yue78" value="${sixDataPage.yue78}" type="text"  onblur="calYUE('8','S')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="yue88" name="yue88" value="${sixDataPage.yue88}" type="text"  onblur="calYUE('8','S')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d" readonly="readonly"
					id="SWC8" name="SWC8" value="${sixDataPage.SWC8}" type="text">
					</td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="QMB8" name="QMB8" value="${sixDataPage.QMB8}" type="text" onblur="calMB('8','Q')"></td> 
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="yue98" name="yue98" value="${sixDataPage.yue98}" type="text"  onblur="calYUE('8','Q')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="yue108" name="yue108" value="${sixDataPage.yue108}" type="text" onblur="calYUE('8','Q')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="yue118" name="yue118" value="${sixDataPage.yue118}" type="text" onblur="calYUE('8','Q')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="yue128" name="yue128" value="${sixDataPage.yue128}" type="text" onblur="calYUE('8','Q')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d" readonly="readonly"
					id="QWC8" name="QWC8" value="${sixDataPage.QWC8}" type="text">
					</td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="totalMb8" name="totalMb8" value="${sixDataPage.totalMb8}"
					type="text"  onblur="calTotalMb('8')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d" readonly="readonly"
					id="totalWc8" name="totalWc8" value="${sixDataPage.totalWc8}"
					type="text"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d" readonly="readonly"
					id="totalWcl8" name="totalWcl8" value="${sixDataPage.totalWcl8}"
					type="text"></td>
			</tr>
			<tr>
				<td align="center">9</td>
				<td rowspan="3" align="center">
						<strong>平均班量</strong>
					</td>
				<td align="center">
						<strong>总班量</strong>
					</td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="HMB9" name="HMB9" value="${sixDataPage.HMB9}" type="text" onblur="calMB('9','H')">
					</td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="yue19" name="yue19" value="${sixDataPage.yue19}" type="text" onblur="calYUE('9','H')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="yue29" name="yue29" value="${sixDataPage.yue29}" type="text" onblur="calYUE('9','H')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d" readonly="readonly"
					id="HWC9" name="HWC9" value="${sixDataPage.HWC9}" type="text">
					</td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="CMB9" name="CMB9" value="${sixDataPage.CMB9}" type="text"  onblur="calMB('9','C')"></td> 
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="yue39" name="yue39" value="${sixDataPage.yue39}" type="text" onblur="calYUE('9','C')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="yue49" name="yue49" value="${sixDataPage.yue49}" type="text" onblur="calYUE('9','C')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="yue59" name="yue59" value="${sixDataPage.yue59}" type="text" onblur="calYUE('9','C')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="yue69" name="yue69" value="${sixDataPage.yue69}" type="text" onblur="calYUE('9','C')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d" readonly="readonly"
					id="CWC9" name="CWC9" value="${sixDataPage.CWC9}" type="text">
					</td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="SMB9" name="SMB9" value="${sixDataPage.SMB9}" type="text"   onblur="calMB('9','S')"></td> 
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="yue79" name="yue79" value="${sixDataPage.yue79}" type="text" onblur="calYUE('9','S')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="yue89" name="yue89" value="${sixDataPage.yue89}" type="text" onblur="calYUE('9','S')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d" readonly="readonly"
					id="SWC9" name="SWC9" value="${sixDataPage.SWC9}" type="text">
					</td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="QMB9" name="QMB9" value="${sixDataPage.QMB9}" type="text"  onblur="calMB('9','Q')"></td> 
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="yue99" name="yue99" value="${sixDataPage.yue99}" type="text" onblur="calYUE('9','Q')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="yue109" name="yue109" value="${sixDataPage.yue109}" type="text"  onblur="calYUE('9','Q')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="yue119" name="yue119" value="${sixDataPage.yue119}" type="text"  onblur="calYUE('9','Q')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="yue129" name="yue129" value="${sixDataPage.yue129}" type="text"  onblur="calYUE('9','Q')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d" readonly="readonly"
					id="QWC9" name="QWC9" value="${sixDataPage.QWC9}" type="text">
					</td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="totalMb9" name="totalMb9" value="${sixDataPage.totalMb9}"
					type="text"  onblur="calTotalMb('9')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d" readonly="readonly"
					id="totalWc9" name="totalWc9" value="${sixDataPage.totalWc9}"
					type="text"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d" readonly="readonly"
					id="totalWcl9" name="totalWcl9" value="${sixDataPage.totalWcl9}"
					type="text"></td>
			</tr>
			<tr>
				<td align="center">10</td>
				<td align="center">
						<strong>教师人数</strong>
					</td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="HMB10" name="HMB10" value="${sixDataPage.HMB10}" type="text" onblur="calMB('10','H')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="yue110" name="yue110" value="${sixDataPage.yue110}" type="text"  onblur="calYUE('10','H')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="yue210" name="yue210" value="${sixDataPage.yue210}" type="text"  onblur="calYUE('10','H')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d" readonly="readonly"
					id="HWC10" name="HWC10" value="${sixDataPage.HWC10}" type="text"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="CMB10" name="CMB10" value="${sixDataPage.CMB10}" type="text"  onblur="calMB('10','C')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="yue310" name="yue310" value="${sixDataPage.yue310}" type="text"  onblur="calYUE('10','C')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="yue410" name="yue410" value="${sixDataPage.yue410}" type="text" onblur="calYUE('10','C')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="yue510" name="yue510" value="${sixDataPage.yue510}" type="text" onblur="calYUE('10','C')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="yue610" name="yue610" value="${sixDataPage.yue610}" type="text" onblur="calYUE('10','C')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d" readonly="readonly"
					id="CWC10" name="CWC10" value="${sixDataPage.CWC10}" type="text"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="SMB10" name="SMB10" value="${sixDataPage.SMB10}" type="text"  onblur="calMB('10','S')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="yue710" name="yue710" value="${sixDataPage.yue710}" type="text" onblur="calYUE('10','S')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="yue810" name="yue810" value="${sixDataPage.yue810}" type="text"  onblur="calYUE('10','S')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d" readonly="readonly"
					id="SWC10" name="SWC10" value="${sixDataPage.SWC10}" type="text"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="QMB10" name="QMB10" value="${sixDataPage.QMB10}" type="text"  onblur="calMB('10','Q')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="yue910" name="yue910" value="${sixDataPage.yue910}" type="text" onblur="calYUE('10','Q')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="yue1010" name="yue1010" value="${sixDataPage.yue1010}" type="text"  onblur="calYUE('10','Q')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="yue1110" name="yue1110" value="${sixDataPage.yue1110}" type="text" onblur="calYUE('10','Q')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="yue1210" name="yue1210" value="${sixDataPage.yue1210}" type="text"  onblur="calYUE('10','Q')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d" readonly="readonly"
					id="QWC10" name="QWC10" value="${sixDataPage.QWC10}" type="text"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d" 
					id="totalMb10" name="totalMb10" value="${sixDataPage.totalMb10}"
					type="text"  onblur="calTotalMb('10')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d" readonly="readonly"
					id="totalWc10" name="totalWc10" value="${sixDataPage.totalWc10}"
					type="text"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d" readonly="readonly"
					id="totalWcl10" name="totalWcl10" value="${sixDataPage.totalWcl10}"
					type="text"></td>
			</tr>
			<tr>
				<td align="center">11</td>
				<td align="center">
						<strong>平均班量</strong>
					</td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="HMB11" name="HMB11" value="${sixDataPage.HMB11}" type="text" onblur="calMB('11','H')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="yue1_11" name="yue1_11" value="${sixDataPage.yue1_11}" type="text"  onblur="calYUE('11','H')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="yue211" name="yue211" value="${sixDataPage.yue211}" type="text" onblur="calYUE('11','H')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d" readonly="readonly"
					id="HWC11" name="HWC11" value="${sixDataPage.HWC11}" type="text"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d" 
					id="CMB11" name="CMB11" value="${sixDataPage.CMB11}" type="text"  onblur="calMB('11','C')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="yue311" name="yue311" value="${sixDataPage.yue311}" type="text" onblur="calYUE('11','C')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="yue411" name="yue411" value="${sixDataPage.yue411}" type="text"  onblur="calYUE('11','C')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="yue511" name="yue511" value="${sixDataPage.yue511}" type="text"  onblur="calYUE('11','C')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="yue611" name="yue611" value="${sixDataPage.yue611}" type="text"  onblur="calYUE('11','C')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d" readonly="readonly"
					id="CWC11" name="CWC11" value="${sixDataPage.CWC11}" type="text"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="SMB11" name="SMB11" value="${sixDataPage.SMB11}" type="text" onblur="calMB('11','S')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="yue711" name="yue711" value="${sixDataPage.yue711}" type="text"  onblur="calYUE('11','S')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="yue811" name="yue811" value="${sixDataPage.yue811}" type="text"  onblur="calYUE('11','S')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d" readonly="readonly"
					id="SWC11" name="SWC11" value="${sixDataPage.SWC11}" type="text"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="QMB11" name="QMB11" value="${sixDataPage.QMB11}" type="text" onblur="calMB('11','Q')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="yue911" name="yue911" value="${sixDataPage.yue911}" type="text"  onblur="calYUE('11','Q')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="yue1011" name="yue1011" value="${sixDataPage.yue1011}"
					type="text" onblur="calYUE('11','Q')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="yue1111" name="yue1111" value="${sixDataPage.yue1111}"
					type="text"  onblur="calYUE('11','Q')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="yue1211" name="yue1211" value="${sixDataPage.yue1211}"
					type="text"  onblur="calYUE('11','Q')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d" readonly="readonly"
					id="QWC11" name="QWC11" value="${sixDataPage.QWC11}" type="text"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="totalMb11" name="totalMb11" value="${sixDataPage.totalMb11}"
					type="text"  onblur="calTotalMb('11')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d" readonly="readonly"
					id="totalWc11" name="totalWc11" value="${sixDataPage.totalWc11}"
					type="text"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d" readonly="readonly"
					id="totalWcl11" name="totalWcl11" value="${sixDataPage.totalWcl11}"
					type="text"></td>
			</tr>
			<tr>
				<td align="center">12</td>
				<td rowspan="2" align="center">
						<strong>离职率</strong>
					</td>
				<td align="center">
						<strong>离职人数</strong>
					</td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="HMB12" name="HMB12" value="${sixDataPage.HMB12}" type="text" onblur="calMB('12','H')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="yue1_12" name="yue1_12" value="${sixDataPage.yue1_12}" type="text"  onblur="calYUE('12','H')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="yue212" name="yue212" value="${sixDataPage.yue212}" type="text"  onblur="calYUE('12','H')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="HWC12" name="HWC12" value="${sixDataPage.HWC12}" type="text"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d" readonly="readonly"
					id="CMB12" name="CMB12" value="${sixDataPage.CMB12}" type="text" onblur="calMB('12','C')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="yue312" name="yue312" value="${sixDataPage.yue312}" type="text"  onblur="calYUE('12','C')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="yue412" name="yue412" value="${sixDataPage.yue412}" type="text"  onblur="calYUE('12','C')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="yue512" name="yue512" value="${sixDataPage.yue512}" type="text"  onblur="calYUE('12','C')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="yue612" name="yue612" value="${sixDataPage.yue612}" type="text"  onblur="calYUE('12','C')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d" readonly="readonly"
					id="CWC12" name="CWC12" value="${sixDataPage.CWC12}" type="text"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="SMB12" name="SMB12" value="${sixDataPage.SMB12}" type="text" onblur="calMB('12','S')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="yue712" name="yue712" value="${sixDataPage.yue712}" type="text"  onblur="calYUE('12','S')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="yue812" name="yue812" value="${sixDataPage.yue812}" type="text"  onblur="calYUE('12','S')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d" readonly="readonly"
					id="SWC12" name="SWC12" value="${sixDataPage.SWC12}" type="text"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="QMB12" name="QMB12" value="${sixDataPage.QMB12}" type="text"  onblur="calMB('12','Q')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="yue912" name="yue912" value="${sixDataPage.yue912}" type="text"  onblur="calYUE('12','Q')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="yue1012" name="yue1012" value="${sixDataPage.yue1012}" type="text"  onblur="calYUE('12','Q')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="yue1112" name="yue1112" value="${sixDataPage.yue1112}" type="text"  onblur="calYUE('12','Q')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="yue1212" name="yue1212" value="${sixDataPage.yue1212}" type="text"  onblur="calYUE('12','Q')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d" readonly="readonly"
					id="QWC12" name="QWC12" value="${sixDataPage.QWC12}" type="text"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="totalMb12" name="totalMb12" value="${sixDataPage.totalMb12}" type="text"  onblur="calTotalMb('12')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d" readonly="readonly"
					id="totalWc12" name="totalWc12" value="${sixDataPage.totalWc12}" type="text"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d" readonly="readonly"
					id="totalWcl12" name="totalWcl12" value="${sixDataPage.totalWcl12}" type="text"></td>
			</tr>
			<tr>
				<td align="center">13</td>
				<td  align="center">
						<strong>离职率</strong>
					 </td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="HMB13" name="HMB13" value="${sixDataPage.HMB13}" type="text" onblur="calMB('13','H')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="yue1_13" name="yue1_13" value="${sixDataPage.yue1_13}" type="text"  onblur="calYUE('13','H')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="yue213" name="yue213" value="${sixDataPage.yue213}" type="text"  onblur="calYUE('13','H')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d" readonly="readonly"
					id="HWC13" name="HWC13" value="${sixDataPage.HWC13}" type="text"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="CMB13" name="CMB13" value="${sixDataPage.CMB13}" type="text" onblur="calMB('13','C')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="yue313" name="yue313" value="${sixDataPage.yue313}" type="text"  onblur="calYUE('13','C')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="yue413" name="yue413" value="${sixDataPage.yue413}" type="text"  onblur="calYUE('13','C')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="yue513" name="yue513" value="${sixDataPage.yue513}" type="text"  onblur="calYUE('13','C')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="yue613" name="yue613" value="${sixDataPage.yue613}" type="text"  onblur="calYUE('13','C')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d" readonly="readonly"
					id="CWC13" name="CWC13" value="${sixDataPage.CWC13}" type="text"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="SMB13" name="SMB13" value="${sixDataPage.SMB13}" type="text"  onblur="calMB('13','S')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="yue713" name="yue713" value="${sixDataPage.yue713}" type="text"  onblur="calYUE('13','S')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="yue813" name="yue813" value="${sixDataPage.yue813}" type="text"   onblur="calYUE('13','S')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d" readonly="readonly"
					id="SWC13" name="SWC13" value="${sixDataPage.SWC13}" type="text"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="QMB13" name="QMB13" value="${sixDataPage.QMB13}" type="text"  onblur="calMB('13','Q')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="yue913" name="yue913" value="${sixDataPage.yue913}" type="text"   onblur="calYUE('13','Q')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="yue1013" name="yue1013" value="${sixDataPage.yue1013}" type="text"   onblur="calYUE('13','Q')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="yue1113" name="yue1113" value="${sixDataPage.yue1113}" type="text"   onblur="calYUE('13','Q')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="yue1213" name="yue1213" value="${sixDataPage.yue1213}" type="text"   onblur="calYUE('13','Q')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d" readonly="readonly"
					id="QWC13" name="QWC13" value="${sixDataPage.QWC13}" type="text"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="totalMb13" name="totalMb13" value="${sixDataPage.totalMb13}" type="text"  onblur="calTotalMb('13')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d" readonly="readonly"
					id="totalWc13" name="totalWc13" value="${sixDataPage.totalWc13}" type="text"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d" readonly="readonly"
					id="totalWcl13" name="totalWcl13" value="${sixDataPage.totalWcl13}" type="text"></td>
			</tr>
			<tr>
				<td align="center">14</td>
				<td colspan="2" align="center">
						<strong>收付营业额</strong>
					 </td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="HMB14" name="HMB14" value="${sixDataPage.HMB14}" type="text" onblur="calMB('14','H')"> </td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="yue1_14" name="yue1_14" value="${sixDataPage.yue1_14}" type="text"   onblur="calYUE('14','H')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="yue214" name="yue214" value="${sixDataPage.yue214}" type="text"   onblur="calYUE('14','H')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d" readonly="readonly"
					id="HWC14" name="HWC14" value="${sixDataPage.HWC14}" type="text"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d" 
					id="CMB14" name="CMB14" value="${sixDataPage.CMB14}" type="text"  onblur="calMB('14','C')"> </td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="yue314" name="yue314" value="${sixDataPage.yue314}" type="text"   onblur="calYUE('14','C')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="yue414" name="yue414" value="${sixDataPage.yue414}" type="text"  onblur="calYUE('14','C')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="yue514" name="yue514" value="${sixDataPage.yue514}" type="text"  onblur="calYUE('14','C')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="yue614" name="yue614" value="${sixDataPage.yue614}" type="text"  onblur="calYUE('14','C')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d" readonly="readonly"
					id="CWC14" name="CWC14" value="${sixDataPage.CWC14}" type="text"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="SMB14" name="SMB14" value="${sixDataPage.SMB14}" type="text"  onblur="calMB('14','S')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="yue714" name="yue714" value="${sixDataPage.yue714}" type="text"  onblur="calYUE('14','S')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="yue814" name="yue814" value="${sixDataPage.yue814}" type="text"  onblur="calYUE('14','S')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d" readonly="readonly"
					id="SWC14" name="SWC14" value="${sixDataPage.SWC14}" type="text"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="QMB14" name="QMB14" value="${sixDataPage.QMB14}" type="text"  onblur="calMB('14','Q')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="yue914" name="yue914" value="${sixDataPage.yue914}" type="text"  onblur="calYUE('14','Q')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="yue1014" name="yue1014" value="${sixDataPage.yue1014}" type="text"  onblur="calYUE('14','Q')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="yue1114" name="yue1114" value="${sixDataPage.yue1114}" type="text"  onblur="calYUE('14','Q')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="yue1214" name="yue1214" value="${sixDataPage.yue1214}" type="text" onblur="calYUE('14','Q')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d" readonly="readonly"
					id="QWC14" name="QWC14" value="${sixDataPage.QWC14}" type="text"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d"
					id="totalMb14" name="totalMb14" value="${sixDataPage.totalMb14}" type="text"  onblur="calTotalMb('14')"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d" readonly="readonly"
					id="totalWc14" name="totalWc14" value="${sixDataPage.totalWc14}" type="text"></td>
				<td class="value"><input style="width: 50px" class="inputxt" dataType="d" readonly="readonly"
					id="totalWcl14" name="totalWcl14" value="${sixDataPage.totalWcl14}" type="text"></td>
			</tr>
		</table>
	</t:formvalid>
</body>
  <script src = "webpage/com/jeecg/sixdata/six.js"></script>		
</html>