<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="adminhead.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<div class="container-fluid">
		<h2>订单详情管理</h2>
		<div class="row" style="margin-top: 20px;">
			<table class="table table-hover">
				<tr>
					<td>收货人：${orderInfo.name }</td>
					<td>手机号：${orderInfo.phone }</td>
					<td>邮箱：${orderInfo.email }</td>
				</tr>
				<tr>
					<td>城市：${orderInfo.city }</td>
					<td>邮编：${orderInfo.poscode }</td>
					<td>详细地址：${orderInfo.address }</td>
				</tr>
			</table>
		</div>
		<div class="row" style="margin-top: 20px;">
			<table class="table table-striped table-hover orderTable">

				<tr>
					<td class="col-md-3"><span>订单号：</span><a href="/ManageOrderInfo.jsp?o_id=${orderInfo.id }">${orderInfo.id }</a></td>
					<td class="col-md-5">${orderInfo.time }</td>
					<td class="col-md-1"><span>$${orderInfo.totalPrice }</span></td>
					<td class="tdFunction col-md-3" style="text-align: right;"><a href="/ManageOrderInfo.jsp?o_id=${orderInfo.id }">查看订单</a><a href="#">取消订单</a><a href="#">删除订单</a></td>
				</tr>
				<c:forEach var="products" items="${products }">
					<tr class="productColspan">
						<td><a href="/ProductInfo.jsp?id=${products.id }"><img src="/res/images/goods/goods_main/${products.id }-800x800.jpg" style="width:80px;"></a></td>
						<td class="productColspanText"><a href="/ProductInfo.jsp?id=${products.id }">${products.name }</a></td>
						<td class="productColspanText">X${products.orderitem.item_count }</td>
						<td class="productColspanText" style="text-align: right;">$${products.orderitem.item_totalPrice }</td>
					</tr>

				</c:forEach>
			</table>
		</div>
	</div>
</body>
</html>