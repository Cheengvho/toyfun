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
</head>
<body>
	<h2>商品信息修改-${upproduct[0].name }</h2>
	<form action="UpdateProductInfo" method="post">
		<table class="table table-default table-hover">
			<tr>
				<th>ID</th>
				<td>${upproduct[0].id }</td>
			</tr>
			<tr class="hidden">
				<th>ID</th>
				<td><input type="text" name="p_id" value="${upproduct[0].id }"></td>
			</tr>
			<tr>
				<th>商品名</th>
				<td><input type="text" name="p_name" value="${upproduct[0].name }"></td>
			</tr>
			<tr>
				<th>原价</th>
				<td><input type="text" name="old_price" value="${upproduct[0].oldprice }"></td>
			</tr>
			<tr>
				<th>现价</th>
				<td><input type="text" name="now_price" value="${upproduct[0].nowprice }"></td>
			</tr>
			<tr>
				<th>主图</th>
				<td><img src="/res/images/goods/goods_main/${upproduct[0].id }-800x800.jpg" style="width: 60px; height: 60px;"></td>
			</tr>
			<tr>
				<th>描述</th>
				<td><input type="text" name="p_description" value="${upproduct[0].description }"></td>
			</tr>
			<tr>
				<th>是否热卖</th>
				<td><input type="text" name="discount" value="${upproduct[0].discount }"></td>
			</tr>
			<tr>
				<th>上架时间</th>
				<td><input type="text" name="p_time" value="${upproduct[0].time }"></td>
			</tr>
			<tr>
				<th>所属分类</th>
				<td><input type="text" name="" value="${upproduct[0].c_name }" disabled="disabled"></td>
			</tr>
			<tr class="hidden">
				<th>分类ID</th>
				<td><input type="text" name="c_id" value="${upproduct[0].c_id }" ></td>
			</tr>
			
			<tr>
				<th>操作</th>
				<td><input class="btn btn-default" type="submit" value="提交"></td>
			</tr>
		</table>
	</form>
</body>
</html>