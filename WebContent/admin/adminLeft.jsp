<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@include file="adminhead.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
	body{margin:0; padding:0;}
	.leftBar{list-style-type:none;}
	
</style>
</head>

<body>
<div style="width:200px; height:auto;">
	<ul class="leftBar">
		<li><a href="/ManageUser.jsp" target="adminMainFrame">用户管理</a></li>
		<li><a href="/ManageProduct.jsp" target="adminMainFrame">商品管理</a></li>
		<li><a href="/ManageCart.jsp" target="adminMainFrame">购物车管理</a></li>
		<li><a href="/ManageOrder.jsp" target="adminMainFrame">订单管理</a></li>
	</ul>
</div>
</body>
</html>