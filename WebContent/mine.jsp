<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="head.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>User Information Manage</title>
</head>
<body>
	<div class="container-fluid">
		<div class="row">
			<div style="padding: 30px;">
				<h3 class="pull-left">欢迎您！&nbsp;&nbsp;${userInfo.username }</h3>
				<div class="pull-right" style="">
					<a href="javascript:self.close()">关闭此页</a>
				</div>
				<div class="clearfix"></div>
			</div>
		</div>
		<div class="row">
			<form action="UserInfoUpdate" method="post">
				<div class="form-group col-md-4">
					<label>姓名</label> <input class="form-control" type="text" name="name" value="${userInfo.name }" placeholder="姓名" />
				</div>
				<input class="form-control hidden" type="text" name="username" value="${userInfo.username }" placeholder="用户名" />
				<!-- <div class="form-group col-md-4">
					<label>密码</label> <input class="form-control" type="password" name="password" value="" placeholder="密码" />
				</div> -->
				<div class="form-group col-md-4">
					<label>城市</label> <input class="form-control" type="text" name="city" value="${userInfo.city }" placeholder="城市" />
				</div>
				<div class="form-group col-md-4">
					<label>手机号</label> <input class="form-control" type="text" name="phone" value="${userInfo.phone }" placeholder="手机号" />
				</div>
				<div class="form-group col-md-4">
					<label>邮箱</label> <input class="form-control" type="text" name="email" value="${userInfo.email }" placeholder="邮箱" />
				</div>
				<div class="form-group col-md-4">
					<label>邮编</label> <input class="form-control" type="text" name="poscode" value="${userInfo.email }" placeholder="邮编" />
				</div>
				<div class="form-group col-md-4">
					<label>详细地址</label> <input class="form-control" type="text" name="address" value="${userInfo.address }" placeholder="详细地址" />
				</div>
				<div style="text-align:center;">
					<input type="submit" value="提交修改" />
				</div>
			</form>
			<!-- <table>
			<tr>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
			</tr>
			<tr>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
			</tr>
			<tr>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
			</tr>
		</table> -->
		</div>
	</div>
</body>
</html>