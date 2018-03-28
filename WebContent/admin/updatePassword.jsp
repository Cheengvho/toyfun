<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@include file="adminhead.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title></title>
<style type="text/css">
body {
	
}
</style>

<script type="text/javascript">
	function checkPsw2() {
		var pwd1 = $("#newpassword").val();
		var pwd2 = $("#renewpassword").val();
		if (pwd1 == pwd2) {
			$("#pswcation")
					.html(
							"<font color='green'><span class='glyphicon glyphicon-ok'></span></font>");
			return true;
			console.log(1);
			document.getElementById("submit").disabled = false;
		} else {
			$("#pswcation").html("<font color='red'>两次密码不相同</font>");
			return false;
			console.log(2);
			document.getElementById("submit").disabled = true;
		}
	};
</script>
</head>
<body>
	<div class="container-fluid">
		<div class="row">
			<h2>修改用户“${upuser.username }”密码</h2>
			<form action="UpdatePasswordServlet" method="post">
				<table class="table table-default table-hover">
					<tr class="hidden">
						<td>新密码</td>
						<td><input type="text" name="username" value="${upuser.username }"></td>
						<td></td>
					</tr>
					<tr>
						<td class="col-md-4">新密码</td>
						<td class="col-md-4"><input type="password" name="newpassword" id="newpassword" onchange="checkPsw2()"></td>
						<td class="col-md-4"></td>
					</tr>
					<tr>
						<td>确认新密码</td>
						<td><input type="password" name="renewpassword" id="renewpassword" onchange="checkPsw2()"></td>
						<td><span id="pswcation"></span></td>
					</tr>
					<tr>
						<td>操作</td>
						<td><input class="btn btn-default" type="submit" value="提交"></td>
						<td></td>
					</tr>
				</table>
			</form>
		</div>
	</div>
</body>
</html>