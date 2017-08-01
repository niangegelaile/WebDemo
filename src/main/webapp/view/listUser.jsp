<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>user_list</title>
</head>
<body>
	<p>user_list</p>
	<table border="1" width="70%">
		<tr>
			<td>id</td>
			<td>user_name</td>
			<td>password</td>
			<td>age</td>
			<td>update</td>
			<td>delete</td>
		</tr>
		<c:forEach items="${listUser}" var="user">
			<tr>
				<td>${user.id}</td>
				<td>${user.user_name}</td>
				<td>${user.password}</td>
				<td>${user.age}</td>
				<td><a href="<%=path%>/user/UIupdateUser.do?id=${user.id}">update</a></td>
				<td><a href="<%=path%>/user/deleteUser.do?id=${user.id}">delete</a></td>
			</tr>
		</c:forEach>
	</table>
	
	 <a href="<%=path %>/user/UIaddUser.do">add_User</a>
</body>
</html>