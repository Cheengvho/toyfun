<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="adminhead.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>订单管理</h2>
	<a href="/admin/addProduct.jsp">新增订单</a>
	<table class="table table-default table-hover">
		<c:forEach var="orders" items="${orders }">
			<tr>
				<td class="col-md-3"><span>订单号：</span><a href="/ManageOrderInfo.jsp?o_id=${orders.id }">${orders.id }</a></td>
				<td class="col-md-5">${orders.time }</td>
				<td class="col-md-1"><span>$${orders.totalPrice }</span></td>
				<td class="tdFunction col-md-3" style="text-align: right;"><a href="/ManageOrderInfo.jsp?o_id=${orders.id }">查看订单</a><a href="#">取消订单</a><a href="#">删除订单</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>