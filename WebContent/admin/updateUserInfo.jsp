<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title></title>
<style type="text/css">
body {
	
}
</style>
</head>
<body>
	<h2>用户管理</h2>
	<form action="UpdateUserInfo.jsp" method="post">
		<table>
			<tr>
				<th>ID</th>
				<td>${usertemp.id }</td>
			</tr>
			<tr>
				<th>用户名</th>
				<td><input type="text" name="u_username" value="${usertemp.username }" disabled="disabled"></td>
			</tr>
			<tr>
				<th>密码操作</th>
				<td><a href="UpdatePassword.jsp?username=" ${usertemp.username }>修改密码</a></td>
			</tr>
			<tr>
				<th>姓名</th>
				<td><input type="text" name="u_name" value="${usertemp.name }"></td>
			</tr>
			<tr>
				<th>邮箱</th>
				<td><input type="text" name="u_email" value="">${usertemp.email }</td>
			</tr>
			<tr>
				<th>电话</th>
				<td><input type="text" name="u_phone" value="">${usertemp.phone }</td>
			</tr>
			<tr>
				<th>城市</th>
				<td><input type="text" name="u_city" value="">${usertemp.city }</td>
			</tr>
			<tr>
				<th>地址</th>
				<td><input type="text" name="u_address" value="">${usertemp.address }</td>
			</tr>
			<tr>
				<th>邮编</th>
				<td><input type="text" name="u_poscode" value="">${usertemp.poscode }</td>
			</tr>
			<tr>
				<th>头像</th>
				<td><img src="${usertemp.img }" /></td>
			</tr>
			<tr>
				<th>操作</th>
				<td><input type="submit" value="提交"></td>
			</tr>

		</table>
	</form>
</body>
</html>