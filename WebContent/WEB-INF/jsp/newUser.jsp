<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>New/Edit User</title>
</head>
<body>
	<div align="center">
		<h1>New User</h1>
		<form:form action="saveUser" method="post" modelAttribute="newUser">
		<table>
			<form:hidden path="portal_user_id"/>
			<tr>
				<td>Email:</td>
				<td><form:input path="portal_email" /></td>
			</tr>
			<tr>
				<td>Mobile:</td>
				<td><form:input path="portal_mobile" /></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><form:input path="portal_password" /></td>
			</tr>
			<tr>
				<td>GSTIN:</td>
				<td><form:input path="portal_gstin" /></td>
			</tr>
			<tr>
				<td>GroupID:</td>
				<td><form:input path="portal_group_id" /></td>
			</tr>
			<tr>
				<td>State:</td>
				<td><form:input path="portal_state" /></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit" value="Save"></td>
			</tr>
		</table>
		</form:form>
	</div>
</body>
</html>