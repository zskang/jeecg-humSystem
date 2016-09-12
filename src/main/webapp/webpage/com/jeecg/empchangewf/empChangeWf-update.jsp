<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<!DOCTYPE html>
<html>
 <head>
  <title>员工异动流程表</title>
  <t:base type="jquery,easyui,tools,DatePicker"></t:base>
  <script type="text/javascript">
  //编写自定义JS代码
  </script>
 </head>
 <body>
		<t:formvalid formid="formobj" dialog="true" usePlugin="password" layout="table" action="empChangeWfController.do?doUpdate" tiptype="1" >
					<input id="id" name="id" type="hidden" value="${empChangeWfPage.id }">
					<input id="createName" name="createName" type="hidden" value="${empChangeWfPage.createName }">
					<input id="createBy" name="createBy" type="hidden" value="${empChangeWfPage.createBy }">
					<input id="createDate" name="createDate" type="hidden" value="${empChangeWfPage.createDate }">
					<input id="updateName" name="updateName" type="hidden" value="${empChangeWfPage.updateName }">
					<input id="updateBy" name="updateBy" type="hidden" value="${empChangeWfPage.updateBy }">
					<input id="updateDate" name="updateDate" type="hidden" value="${empChangeWfPage.updateDate }">
					<input id="sysOrgCode" name="sysOrgCode" type="hidden" value="${empChangeWfPage.sysOrgCode }">
					<input id="sysCompanyCode" name="sysCompanyCode" type="hidden" value="${empChangeWfPage.sysCompanyCode }">
					<input id="bpmStatus" name="bpmStatus" type="hidden" value="${empChangeWfPage.bpmStatus }">
		<table style="width: 600px;" cellpadding="0" cellspacing="1" class="formtable">
					<tr>
						<td align="right">
							<label class="Validform_label">
								员工编号:
							</label>
						</td>
						<td class="value">
						     	 <input id="empno" name="empno" type="text" style="width: 150px" class="inputxt"  value='${empChangeWfPage.empno}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">员工编号</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								性别:
							</label>
						</td>
						<td class="value">
						     	 <input id="sex" name="sex" type="text" style="width: 150px" class="inputxt"  value='${empChangeWfPage.sex}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">性别</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								入职日期:
							</label>
						</td>
						<td class="value">
						     	 <input id="ruzhiDate" name="ruzhiDate" type="text" style="width: 150px" class="inputxt"  value='${empChangeWfPage.ruzhiDate}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">入职日期</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								生效日期:
							</label>
						</td>
						<td class="value">
						     	 <input id="sxDate" name="sxDate" type="text" style="width: 150px" class="inputxt"  value='${empChangeWfPage.sxDate}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">生效日期</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								异动原因类型:
							</label>
						</td>
						<td class="value">
									<t:dictSelect field="changeType" type="list"
										typeGroupCode="" defaultVal="${empChangeWfPage.changeType}" hasLabel="false"  title="异动原因类型"></t:dictSelect>     
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">异动原因类型</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								异动前部门:
							</label>
						</td>
						<td class="value">
						     	 <input id="org1" name="org1" type="text" style="width: 150px" class="inputxt"  value='${empChangeWfPage.org1}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">异动前部门</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								异动前岗位:
							</label>
						</td>
						<td class="value">
						     	 <input id="dept1" name="dept1" type="text" style="width: 150px" class="inputxt"  value='${empChangeWfPage.dept1}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">异动前岗位</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								异动前薪资:
							</label>
						</td>
						<td class="value">
						     	 <input id="salary1" name="salary1" type="text" style="width: 150px" class="inputxt"  value='${empChangeWfPage.salary1}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">异动前薪资</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								异动前补贴:
							</label>
						</td>
						<td class="value">
						     	 <input id="butie1" name="butie1" type="text" style="width: 150px" class="inputxt"  value='${empChangeWfPage.butie1}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">异动前补贴</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								异动前其他:
							</label>
						</td>
						<td class="value">
						     	 <input id="other1" name="other1" type="text" style="width: 150px" class="inputxt"  value='${empChangeWfPage.other1}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">异动前其他</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								异动后部门:
							</label>
						</td>
						<td class="value">
						     	 <input id="org2" name="org2" type="text" style="width: 150px" class="inputxt"  value='${empChangeWfPage.org2}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">异动后部门</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								异动后岗位:
							</label>
						</td>
						<td class="value">
						     	 <input id="dept2" name="dept2" type="text" style="width: 150px" class="inputxt"  value='${empChangeWfPage.dept2}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">异动后岗位</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								异动后薪资:
							</label>
						</td>
						<td class="value">
						     	 <input id="salary2" name="salary2" type="text" style="width: 150px" class="inputxt"  value='${empChangeWfPage.salary2}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">异动后薪资</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								异动后补贴:
							</label>
						</td>
						<td class="value">
						     	 <input id="butie2" name="butie2" type="text" style="width: 150px" class="inputxt"  value='${empChangeWfPage.butie2}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">异动后补贴</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								异动后其他:
							</label>
						</td>
						<td class="value">
						     	 <input id="other2" name="other2" type="text" style="width: 150px" class="inputxt"  value='${empChangeWfPage.other2}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">异动后其他</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								具体原因:
							</label>
						</td>
						<td class="value">
						     	 <input id="reason" name="reason" type="text" style="width: 150px" class="inputxt"  value='${empChangeWfPage.reason}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">具体原因</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								申请人名称:
							</label>
						</td>
						<td class="value">
						     	 <input id="reqName" name="reqName" type="text" style="width: 150px" class="inputxt"  value='${empChangeWfPage.reqName}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">申请人名称</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								申请人电话:
							</label>
						</td>
						<td class="value">
						     	 <input id="reqMobile" name="reqMobile" type="text" style="width: 150px" class="inputxt"  value='${empChangeWfPage.reqMobile}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">申请人电话</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								填表时间:
							</label>
						</td>
						<td class="value">
						     	 <input id="reqDate" name="reqDate" type="text" style="width: 150px" class="inputxt"  value='${empChangeWfPage.reqDate}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">填表时间</label>
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
  <script src = "webpage/com/jeecg/empchangewf/empChangeWf.js"></script>		
