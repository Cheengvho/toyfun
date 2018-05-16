<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<%@include file="head.jsp"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">

<html lang="zh-CN">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Home | ToyFun</title>

<script type='text/javascript' src='/res/js/jquery/jquery-1.12.4.js'></script>
<script type='text/javascript' src='/res/js/js.cookie.min.js'></script>
<script type='text/javascript' src='/res/js/plugins.js'></script>
<script type='text/javascript' src='/res/bootstrap/js/bootstrap.min.js'></script>
<script type='text/javascript' src='/res/js/owl.carousel.min.js'></script>
<script type='text/javascript' src='/res/js/theme.js'></script>


<style type="text/css">
.orderInfoCol {
	border-top: 1px solid #aaa;
	border-bottom: 1px solid #aaa;
}

.media {
	padding: 10px;
	border-bottom: 1px solid #aaa;
}

.media-heading {
	padding: 10px;
}

.media-object {
	max-width: 200px !important;
	width: 120px;
	height: auto;
}
</style>



<!-- 重要，需要保存 GALLERY部分 -->
<script type='text/javascript'>
	/* <![CDATA[ */
	var onepress_js_settings = {
		"onepress_disable_animation" : "",
		"onepress_disable_sticky_header" : "",
		"onepress_vertical_align_menu" : "1",
		"hero_animation" : "flipInX",
		"hero_speed" : "5000",
		"hero_fade" : "750",
		"hero_duration" : "5000",
		"is_home" : "1",
		"gallery_enable" : "1"
	};
	/* $(document).ready(function() {
		$("#onepress-gallery-lightgallery-css").lightGallery();
		}); */
	/* ]]> */
</script>




</head>

<body class="home page-template page-template-template-frontpage page-template-template-frontpage-php page page-id-105 wp-custom-logo group-blog sticky-header header-transparent">
	<div id="page" class="hfeed site">
		<a class="skip-link screen-reader-text" href="#content">Skip to content</a>
		<header id="masthead" class="site-header" role="banner">
		<div class="container">
			<div class="site-branding">
				<div class="site-brand-inner has-logo-img no-desc">
					<div class="site-logo-div">
						<a href="/Index.jsp" class="custom-logo-link" rel="home" itemprop="url"><img width="160" height="30" src="/res/img/logo_toyfun.png" class="custom-logo" alt="ToyFun" itemprop="logo" /></a>
					</div>
				</div>
			</div>
			<!-- .site-branding -->

			<div class="header-right-wrapper">
				<a href="#0" id="nav-toggle">Menu<span></span></a>
				<nav id="site-navigation" class="main-navigation" role="navigation">
				<ul class="onepress-menu">
					<li id="menu-item-966"
						class="menu-item menu-item-type-post_type menu-item-object-page menu-item-966"><a
						href="/Index.jsp">Home</a></li>
					<li id="menu-item-51"
						class="menu-item menu-item-type-post_type menu-item-object-page menu-item-has-children menu-item-51"><a
						href="/Products.jsp">Products</a>
						<ul class="sub-menu">
							<c:forEach var="classify" items="${classify }">
								<li id="menu-item-54"
									class="menu-item menu-item-type-post_type menu-item-object-page menu-item-54"><a
									href="/Products.jsp?c_id=${classify.id }">${classify.name }</a></li>
							</c:forEach>
						</ul></li>
					<li id="menu-item-1978"
						class="menu-item menu-item-type-post_type menu-item-object-page menu-item-1978"><a
						href="/Cart.jsp">Cart</a></li>
					<li id="menu-item-722"
						class="menu-item menu-item-type-post_type menu-item-object-page menu-item-722"><a
						href="/Orders.jsp">Orders</a></li>
					<c:if test="${user eq null}">
						<li id="menu-item-49"
						class="menu-item menu-item-type-post_type menu-item-object-page menu-item-49"><a
						href="login.jsp">To Login</a></li>
					</c:if>
					<c:if test="${user ne null}">
						<li id="menu-item-71"
						class="menu-item menu-item-type-post_type menu-item-object-page menu-item-has-children menu-item-71"><a
						href="#">${user.username }</a>
						<ul class="sub-menu">
							<li id="menu-item-281"
								class="menu-item menu-item-type-custom menu-item-object-custom menu-item-281"><a
								target="_blank" href="/Mine?username=${user.username }">Mine</a></li>
							<li id="menu-item-67"
								class="menu-item menu-item-type-post_type menu-item-object-page menu-item-67"><a
								href="/loginout.jsp">Login Out</a></li>
						</ul>
					</li>
					</c:if>
				</ul>
				</nav>
				<!-- #site-navigation -->
			</div>
		</div>
		</header>
		<!-- #masthead -->

		<div id="content" class="site-content">
			<main id="main" class="site-main" role="main"> <section id="hero"
				data-images="[&quot;\/res\/img\/Poster-test-_ship2-compressor.jpg&quot;,&quot;\/res\/img\/Poster-test-_clock-small.jpg&quot;,&quot;\/res\/img\/Morphun-Hi-Qube-Imagination-Poster-Flower-compressor.jpg&quot;]"
				class="hero-slideshow-wrapper  hero-slideshow-normal">

			<div class="slider-spinner">
				<div class="double-bounce1"></div>
				<div class="double-bounce2"></div>
			</div>
			<div class="container" style="padding-top: 10%; padding-bottom: 10%;">
				<div class="hero__content hero-content-style1">
					<!-- 巨幕中间标题 -->
					<h2 class="hero-large-text">Create Orders</h2>
					<!-- 巨幕下方描述文字 -->
					<p class="hero-small-text">Choose Your Happy</p>
					<!-- 巨幕白色按钮 -->
					<!-- <a href="#"
								class="btn btn-secondary-outline btn-lg">About Us</a> 
							巨幕蓝色按钮	
							<a
								href="#"
								class="btn btn-theme-primary btn-lg">Our Products</a> -->
				</div>
			</div>
			</section> <!-- 中间内容 -->
			<div class="container">
				<div class="row" style="margin-top: 20px;">
					<h3 style="padding-left: 20px; padding-bottom: 10px; border-bottom: 1px solid #aaa;">请填写以下信息</h3>

					<div class="form-group col-md-6">
						<label>收货人</label> <input class="form-control" type="text" name="" value="" placeholder="收货人">
					</div>
					<div class="form-group col-md-6">
						<label>联系电话</label> <input class="form-control" type="text" name="" value="" placeholder="联系电话">
					</div>
					<div class="form-group col-md-6">
						<label>邮编</label> <input class="form-control" type="text" name="" value="" placeholder="邮编">
					</div>
					<div class="form-group col-md-6">
						<label>城市</label> <input class="form-control" type="text" name="" value="" placeholder="城市">
					</div>
					<div class="form-group col-md-12">
						<label>收货地址</label> <input class="form-control" type="text" name="" value="" placeholder="收货地址">
					</div>
				</div>
				<div class="row">
					<h3 style="padding-left: 20px; padding-bottom: 10px; border-bottom: 1px solid #aaa;">订单中商品</h3>
					<div class="media">
						<div class="media-left">
							<a href="#"> <img class="media-object" src="/res/images/1/1_800×800.jpg" alt="...">
							</a>
						</div>
						<div class="media-body">
							<div class="col-md-6">
								<h4 class="media-heading">六子连芳</h4>
								<h5 class="media-heading">
									<span>种类：</span>鲁班锁
								</h5>
							</div>

							<div class="col-md-6" style="height: 120px; text-align: right;">
								<div>
									<span>数量：</span><span>2</span>
								</div>
								<div>
									<span>单价：</span><span>12.00</span>
								</div>
							</div>

						</div>
					</div>
				</div>
				<div class="row" style="margin-top: 20px; margin-bottom: 20px;">
					<div class="col-md-9"></div>
					<div class="col-md-3">
						<table style="border: none;">
							<tr>
								<th style="text-align: right; border: none;">总件数：</th>
								<td>2</td>
							</tr>
							<tr>
								<th style="text-align: right; border: none;">总价：</th>
								<td>24.00</td>
							</tr>

						</table>
					</div>
				</div>
				<div class="row" style="margin-top: 20px; margin-bottom: 20px;">
					<div class="col-md-9"></div>
					<div class="col-md-3">
						<a href="#" class="btn btn-default btn-lg" style="margin-right: 15px;">取消</a><input class="btn btn-primary" type="submit" value="提交订单">
					</div>
				</div>
			</main>
			<!-- #main -->
		</div>
		<!-- #content -->

		<footer id="colophon" class="site-footer" role="contentinfo">
		<div class="footer-connect">
			<div class="container">
				<div class="row">
					<div class="col-sm-2"></div>

					<div class="col-sm-8">
						<div class="footer-social">
							<div class="footer-social-icons">
								<a target="_blank" href="#" title="Facebook"><i class="fa  fa-facebook"></i></a><a target="_blank" href="https://www.youtube.com/channel/UC8gFjqAtLFZBfn4cQ_WnjGw" title="YouTube"><i class="fa  fa-youtube"></i></a><a target="_blank"
									href="#" title="Twitter"><i class="fa  fa-twitter"></i></a><a target="_blank" href="#" title="Instagram"><i class="fa  fa-instagram"></i></a>
							</div>
						</div>
					</div>
					<div class="col-sm-2"></div>
				</div>
			</div>
		</div>

		<div class="site-info">
			<div class="container">
				<div class="btt">
					<a class="back-top-top" href="#page" title="Back To Top"><i
						class="fa fa-angle-double-up wow flash" data-wow-duration="2s"></i></a>
				</div>
				<div class="col-sm-12">
					<p style="text-align: center"><a href="http://www.miitbeian.gov.cn/" target="_blank">蜀ICP备18013005号  </a>© ToyFun.</p>
					<p
						style="text-align: center; color: white; text-decoration: underline">
						<a href="contact-us.jsp">Contact Us</a>
					</p>
				</div>
			</div>
		</div>
		<!-- .site-info --> </footer>
		<!-- #colophon -->
	</div>
	<!-- #page -->






</body>
</html>
