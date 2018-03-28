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
	<h2>修改用户“${users.username }”密码</h2>
	<form action="UpdatePassword.jsp" method="post">
		<table>
			<tr>
				<td>新密码</td>
				<td><input type="password" name="newpassword"></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="提交"></td>
			</tr>
		</table>
	</form>
</body>
</html>