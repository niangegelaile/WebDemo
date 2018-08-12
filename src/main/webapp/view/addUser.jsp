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
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>addUser</title>
</head>
<body>
	<h1>addUser</h1>
	<form action="<%=path%>/user/addUser.do" method="post" enctype="multipart/form-data">
		<table>
			<tr>
				<td>name:</td>
				<td><input type="text" name="user_name"></td>
			</tr>
			<tr>
				<td>password:</td>
				<td><input type="text" name="password"></td>
			</tr>
			<tr>
				<td>age:</td>
				<td><input type="text" name="age"></td>
			</tr>
			<tr>
				<td>头像:</td>
				<td><input type="file" name="pic"></td>
			</tr>
			<tr>
				<td><input type="submit" value="Save"></td>
				<td><input type="reset" value="Reset"></td>
			</tr>
		</table>
	</form>
</body>
</html>