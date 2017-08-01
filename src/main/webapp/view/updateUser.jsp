<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>

<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>updateUser</title>
</head>
<body>
<h1>updateUser</h1>
	<form action="<%=path%>/user/updateUser.do" method="post">
		<input type="hidden" name="id" value="${user.id}">
		<table>
			<tr>
				<td>name:</td>
				<td><input type="text" name="user_name" value="${user.user_name}"></td>
			</tr>
			<tr>
				<td>password:</td>
				<td><input type="text" name="password" value="${user.password}"></td>
			</tr>
			<tr>
				<td>age:</td>
				<td><input type="text" name="age" value="${user.age}"></td>
			</tr>
			<tr>
				<td><input type="submit" value="Update"></td>
				<td><input type="reset" value="Reset"></td>
			</tr>
		</table>

	</form>
</body>
</html>