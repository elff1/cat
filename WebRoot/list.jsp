<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>

<s:form action="add_cat">
	<s:textfield name="cat.name" label="Name" value="" />
	<s:submit value=" Add "></s:submit>
</s:form>

<table>
	<tr>
		<th>ID</th>
		<th>Name</th>
		<th>CreateDate</th>
	</tr>
	<s:iterator value="catList">
		<tr>
			<td><s:property value="id" /></td>
			<td><s:property value="name" /></td>
			<td><s:property value="createDate" /></td>
		</tr>
	</s:iterator>
</table>