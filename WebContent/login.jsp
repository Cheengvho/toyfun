<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login | ToyFun</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="author" content="Cheen">

<link rel='stylesheet' id='onepress-bootstrap-css' href='/res/bootstrap/css/bootstrap.min.css' type='text/css' media='all' />
<link rel='stylesheet' href='/res/font-awesome/css/font-awesome.min.css' type='text/css' media='all' />
<link rel='stylesheet' href='/res/css/newStyle.css' type='text/css' media='all' />

<script type='text/javascript' src='/res/js/jquery/jquery-1.12.4.js'></script>
<script type='text/javascript' src='/res/bootstrap/js/bootstrap.min.js'></script>

<style type="text/css">
.registerCol {
	height: 400px;
	background-color: #37BEFE;
}

h3 {
	text-align: center;
	color: #FFF;
	padding-bottom: 10px;
	border-bottom: 2px solid #FFF;
}

a {
	color: #FFF;
	font-size: 16px;
	padding: 10px;
}
</style>
</head>
<body style="background-color: #f0f3ef;">
	<div class="container-fluid">
		<div class="row" style="text-align: center; margin-top: 200px; margin-bottom: 20px;">
			<a href="index.jsp" title="Back to Home"><img src="/res/img/logo_toyfun.png" style="height: 100%;"></a>
		</div>
		<div class="row registerCol">
			<div class="col-md-12">
				<h3>用户登录</h3>
				<form action="Login" method="post">
					<div class="form-group col-md-4 col-md-offset-4">
						<input class="form-control" type="text" name="username" value="" placeholder="用户名">
					</div>
					<div class="form-group col-md-4 col-md-offset-4">
						<input class="form-control" type="password" name="password" value="" placeholder="密码">
					</div>
					<div class="col-md-4 col-md-offset-4" style="text-align: center;">
						<input class="btn btn-primary" type="submit" value="登录">
					</div>
					<div class="col-md-12" style="text-align: center;">
						<span><font color="red">${loginms }</font></span>
						<h3></h3>
					</div>
					<div class="col-md-12" style="text-align: center; margin-top: 10px;">
						<a href="index.jsp">忘记密码？</a> <a href="register.jsp">前去注册</a>
					</div>
				</form>
			</div>
		</div>
	</div>
</body>
</html>