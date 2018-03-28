<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@include file="adminhead.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title></title>





</head>
<body>
	<h2>用户管理</h2>
	<table class="table table-default table-hover">
		<tr>
			<th>ID</th>
			<th>用户名</th>
			<th>密码操作</th>
			<th>姓名</th>
			<th>邮箱</th>
			<th>电话</th>
			<th>城市</th>
			<th>地址</th>
			<th>邮编</th>
			<th>头像</th>
			<th colspan="2">操作</th>
		</tr>
		<c:forEach var="users" items="${users }">
			<tr>
				<td>${users.id }</td>
				<td>${users.username }</td>
				<td><a href="UpdatePassword.jsp?username=${users.username }">修改密码</a></td>
				<td>${users.name }</td>
				<td>${users.email }</td>
				<td>${users.phone }</td>
				<td>${users.city }</td>
				<td>${users.address }</td>
				<td>${users.poscode }</td>
				<td><img src="${users.img }" style="width:60px;height:60px;"/></td>
				<td><a href="FindUserInfo.jsp?username=${users.username }">修改用户信息</a></td>
				<td><a href="DeleteUserServlet?username=${users.username }">删除用户</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>