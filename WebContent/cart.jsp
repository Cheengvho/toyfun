<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<%@include file="head.jsp" %>
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


<style>
	.media{padding:10px; border-bottom:1px solid #aaa;}
	.media-heading{padding:10px;}
	.media-object{max-width:200px !important; width:120px; height:auto;}
</style>	

<script type="text/javascript">
function selectALLNO() {
    // 获取要操作的复选框
    var chooseall=document.getElementById("chooseall");
    //checked判断是否选中
    if(chooseall.checked==true)
    {
        selectAll();
    }
    else
    {
        SelectNO();
    }
}
function selectAll() {
    // 获取要操作的复选框
    var productChose=document.getElementsByName("productChose");
    //checked判断是否选中
    for(var x=0;x<productChose.length;x++)
    {
        var productChoseValue=productChose[x];
        productChoseValue.checked=true;
    }
}
function SelectNO(){
    // 获取要操作的复选框
    var productChose = document.getElementsByName("productChose");
     //checked判断是否选中
   for (var x = 0; x < productChose.length; x++) {
       var productChoseValue=productChose[x];
       productChoseValue.checked=false;
    }
}
</script>


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

<body
	class="home page-template page-template-template-frontpage page-template-template-frontpage-php page page-id-105 wp-custom-logo group-blog sticky-header header-transparent">
	<div id="page" class="hfeed site">
		<a class="skip-link screen-reader-text" href="#content">Skip to
			content</a>
		<header id="masthead" class="site-header" role="banner">
		<div class="container">
			<div class="site-branding">
				<div class="site-brand-inner has-logo-img no-desc">
					<div class="site-logo-div">
						<a href="/Index.jsp" class="custom-logo-link" rel="home"
							itemprop="url"><img width="160" height="30"
							src="/res/img/logo_toyfun.png"
							class="custom-logo" alt="ToyFun" itemprop="logo" /></a>
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
						href="#">Orders</a></li>
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
								target="_blank" href="#">Mine</a></li>
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
			<main id="main" class="site-main" role="main"> 
				<section
				id="hero"
				data-images="[&quot;\/res\/img\/Poster-test-_ship2-compressor.jpg&quot;,&quot;\/res\/img\/Poster-test-_clock-small.jpg&quot;,&quot;\/res\/img\/Morphun-Hi-Qube-Imagination-Poster-Flower-compressor.jpg&quot;]"
				class="hero-slideshow-wrapper  hero-slideshow-normal">

					<div class="slider-spinner">
						<div class="double-bounce1"></div>
						<div class="double-bounce2"></div>
					</div>
					<div class="container" style="padding-top: 10%; padding-bottom: 10%;">
						<div class="hero__content hero-content-style1">
							<!-- 巨幕中间标题 -->
							<h2 class="hero-large-text">Cart</h2>
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
					</section>
					
					
					<!-- 中间内容 -->
					<div class="container">
						<form action="#" method="post">
							<div class="row" style="margin-top:20px;">
								<div class="cartTop" >
									<input type="checkbox" id="chooseall" onclick="selectALLNO()"><span>选择全部</span>
								</div>
								<div class="listBorder">
									<c:if test="${deletecartms ne null}">
										${deletecartms }
									</c:if>
									<c:if test="${deletecartms eq null}">
									<c:forEach var="cartproducts" items="${cartproducts }">
									<div class="media">
									  <input type="checkbox" name="productChose" value="${cartproducts.id }">
									  <div class="media-left">
									    <a href="/ProductInfo.jsp?id=${cartproducts.id }">
									      <img class="media-object" src="/res/images/goods/goods_main/${cartproducts.id }-800x800.jpg" alt="${cartproducts.name }" >
									    </a>
									  </div>
									  <div class="media-body">
									    <div class="col-md-6">
									    	<h4 class="media-heading"><a href="/ProductInfo.jsp?id=${cartproducts.id }">${cartproducts.name }</a></h4>
									    	<h5 class="media-heading"><span>种类：</span>${cartproducts.c_name }</h5>
									    </div>
									    <div class="col-md-3" style="height:120px; text-align:center; ">
									    	<input type="number" id="cartproducts.cp_count" value="${cartproducts.cp_count }" style="width:70px;" >
									    </div>
									    <div class="col-md-1" style="height:120px; text-align:right;">
									    	<span>$</span><span class="">${cartproducts.nowprice*cartproducts.cp_count }</span>
									    </div>
									    <div class="col-md-2" style="height:120px; text-align:right;">
									    	<a href="DeleteCart?p_id=${cartproducts.id }" class="btn btn-default" ><span class="glyphicon glyphicon-remove"></span></a>
									    </div>
									    
									  </div>
									</div>
									</c:forEach>
									<input class="btn btn-primary pull-right" type="submit" value="生成订单">
									<div class="clearfix"></div>
									</c:if>
									
									
									<c:if test="${deletecartms ne null}">
										<div class="" style="padding:20px; text-align:right;">
											<a href="#" class="btn btn-lg btn-default" style="margin-right:10px;">上一页</a><input class="btn btn-theme-primary" type="submit" value="To Check">
										</div>
									</c:if>
								</div>
								
								
							</div>
						</form>
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
								<a target="_blank" href="#"
									title="Facebook"><i class="fa  fa-facebook"></i></a><a
									target="_blank"
									href="https://www.youtube.com/channel/UC8gFjqAtLFZBfn4cQ_WnjGw"
									title="YouTube"><i class="fa  fa-youtube"></i></a><a
									target="_blank" href="#"
									title="Twitter"><i class="fa  fa-twitter"></i></a><a
									target="_blank"
									href="#"
									title="Instagram"><i class="fa  fa-instagram"></i></a>
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
				<div class="col-sm-6">
					<p style="text-align: left">© ToyFun. </p>
				</div>
				<div class="col-sm-6">

					<p
						style="text-align: right; color: white; text-decoration: underline">
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
