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
	<h2>商品管理</h2><a href="">新增商品</a>
	<table>
		<tr>
			<th>ID</th>
			<th>商品名</th>
			<th>原价</th>
			<th>现价</th>
			<th>主图</th>
			<th>描述</th>
			<th>是否热卖</th>
			<th>上架时间</th>
			<th>所属分类</th>
			<th colspan="2">操作</th>
		</tr>
		<c:forEach var="users" items="${users }">
			<tr>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				<td><a href="#">修改商品信息</a></td>
				<td><a href="#">删除商品</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>