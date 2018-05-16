<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!-- jstl -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
			<main id="main" class="site-main" role="main"> <section
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
					<h2 class="hero-large-text">There's More to ToyFun</h2>
					<!-- 巨幕下方描述文字 -->
					<p class="hero-small-text">... international award winning
						educational construction toys for the classroom</p>
					<!-- 巨幕白色按钮 -->
					<a href="#"
						class="btn btn-secondary-outline btn-lg">About Us</a> 
					<!-- 巨幕蓝色按钮 -->	
					<a
						href="/Products.jsp"
						class="btn btn-theme-primary btn-lg">Our Products</a>
				</div>
			</div>
			</section> 
			<!-- 巨幕下方描述 -->
			<section id="sid1496143613565"
				class="section-sid1496143613565 onepage-section section-meta section-padding">
			<div class="container">
				<div class="section-content-area custom-section-content">
					<!-- 描述标题 -->
					<h2 style="font-size: 16pt; text-align: center; font-weight: 600">ToyFun
						CREATES INTERNATIONAL AWARD WINNING EDUCATIONAL PRODUCTS</h2>
					<hr style="border-color: #1c6dca; border-style: solid; width: 60%">
					<!-- 描述正文 -->
					<p style="font-size: 12pt; text-align: left">
						ToyFun is created by British toy designers and manufactured by us
						in Europe. We have a wide range of patented side joining plastic
						bricks for <a href="#"
							target="_blank" rel="noopener noreferrer">ages 3-10 years</a> and
						all sets can be supplied with extensive Teacher supporting
						materials making them perfect for the classroom. ToyFun’s growing
						range includes our main construction sets plus sets for literacy,
						numeracy, physics of movement with gears perfect for STEM subjects
						and even Braille Bricks for partially and non sighted users.
					</p>
					<p style="font-size: 12pt; text-align: left">ToyFun products
						have won ten GOLD or winners awards and twelve other major
						educational or retail product awards and are available in over 50
						countries world wide.</p>
					<!-- 描述正文最末小字 -->
					<p style="font-size: 10pt; text-align: left">
						<em>All products are made in the Europe and have EN71 and
							ASTM as well as Phthalate Certificates, conform to all facets of
							the new European Toy Directive</em>
					</p>
				</div>
			</div>
			</section> 
			
			<!-- 三个带描述的缩略图 -->
			<section id="about"
				class="section-about section-padding onepage-section">

			<div class="container">
				<div class="row">
					<div class="col-lg-4 col-sm-4  wow slideInUp">
						<div class="about-image">
							<a href="#"><img
								width="640" height="400"
								src="/res/img/MG_9434-1-640x400.jpg"
								class="attachment-onepress-medium size-onepress-medium wp-post-image"
								alt="ToyFun Bricks Gears Set - Train Against White Background"
								srcset="/res/img/MG_9434-1-640x400.jpg 640w, /res/img/MG_9434-1-480x300.jpg 480w"
								sizes="(max-width: 640px) 100vw, 640px" /></a>
						</div>
						<h3>
							<a href="#">ToyFun
								Product Ranges</a>
						</h3>
						<p>A range of educational and creative products These award
							winning patented British designed bricks in prime colours
							transform the use and educational value of traditional plastic
							bricks. Manipulative and construction &#8230;</p>
					</div>
					<div class="col-lg-4 col-sm-4  wow slideInUp">
						<div class="about-image">
							<a href="#"><img width="640"
								height="400"
								src="/res/img/Morphun-Education-Games-Wordphun-Screenshot-640x400.png"
								class="attachment-onepress-medium size-onepress-medium wp-post-image"
								alt="ToyFun Education Games - Wordphun Screenshot"
								srcset="/res/img/Morphun-Education-Games-Wordphun-Screenshot-640x400.png 640w, /res/img/Morphun-Education-Games-Wordphun-Screenshot-480x300.png 480w"
								sizes="(max-width: 640px) 100vw, 640px" /></a>
						</div>
						<h3>
							<a href="#">ToyFun Interactive
								&#8211; Games, Videos and Downloads</a>
						</h3>
						<p>ToyFun Interactive. As always, there is more to ToyFun.
							Alongside our award winning products you can get interactive.
							Play our free educational ToyFun games,&nbsp;watch instructional
							3D videos that show you &#8230;</p>
					</div>
					<div class="col-lg-4 col-sm-4  wow slideInUp">
						<div class="about-image">
							<img width="640" height="400"
								src="/res/img/Screen-Shot-2017-01-19-at-18.29.34-640x400.png"
								class="attachment-onepress-medium size-onepress-medium wp-post-image"
								alt="ToyFun Models PDF Instructions - Example"
								srcset="/res/img/Screen-Shot-2017-01-19-at-18.29.34-640x400.png 640w, /res/img/Screen-Shot-2017-01-19-at-18.29.34-480x300.png 480w"
								sizes="(max-width: 640px) 100vw, 640px" />
						</div>
						<h3>Downloads</h3>
						<p>Resources to Download Downloads on this page include
							example instruction sheets to make our brick models, example
							instructions to play some of our educational games, and example
							dealer resources. Simply &#8230;</p>
					</div>
				</div>
			</div>
			</section>
			<div id="parallax-videolightbox" class="section-parallax">
				<div class="parallax-bg" data-stellar-ratio="0.1"
					style="background-image: url(/res/img/Children-using-Wordphun-Workcards-compressor.jpg);"></div>
				<section id="videolightbox"
					class="section-videolightbox section-padding section-padding-larger section-inverse onepage-section">
				<div class="container">
					<div class="videolightbox__icon videolightbox-popup">
						<a href="#"
							data-scr="#"
							class="popup-video"> <span class="video_icon"><i
								class="fa fa-play"></i></span>
						</a>
					</div>
					<h2 class="videolightbox__heading">See ToyFun in Action</h2>
				</div>
				</section>
			</div>
			<section id="gallery"
				class="section-gallery section-padding section-meta onepage-section">

			<div class="g-layout-default container">
				<div class="section-title-area">
					<h2 class="section-title">Gallery</h2>
				</div>
				<div class="gallery-content">
					<div data-col="4"
						class="g-zoom-in gallery-carousel enable-lightbox ">
						<a
							href="/res/img/Morphun-Bricks-with-Girl.jpg"
							class="g-item" title="Girl Looking from Behind ToyFun Bricks"><span
							class="inner"><span class="inner-content"><img
									src="/res/img/Morphun-Bricks-with-Girl-480x300.jpg"
									alt=""></span></span></a><a
							href="/res/img/41035B-or-41036B-Junior-Starter-any-set-kids-Awards-1.jpg"
							class="g-item"
							title="ToyFun Junior Starter Smallest Set and Awards_Small"><span
							class="inner"><span class="inner-content"><img
									src="/res/img/41035B-or-41036B-Junior-Starter-any-set-kids-Awards-1-480x300.jpg"
									alt=""></span></span></a><a
							href="/res/img/Junior-starter-Flowers-with-girl-2.jpg"
							class="g-item" title="ToyFun Junior starter Flowers with girl"><span
							class="inner"><span class="inner-content"><img
									src="/res/img/Junior-starter-Flowers-with-girl-2-480x300.jpg"
									alt=""></span></span></a><a
							href="/res/img/Age-Range-Chart-v1-02-small-compressor.png"
							class="g-item" title="Age-Range-Chart-v1-02-small-compressor"><span
							class="inner"><span class="inner-content"><img
									src="/res/img/Age-Range-Chart-v1-02-small-compressor-480x300.png"
									alt=""></span></span></a><a
							href="/res/img/cars_poster_test3.jpg"
							class="g-item" title="ToyFun Junior - 3D Car Line Up"><span
							class="inner"><span class="inner-content"><img
									src="/res/img/cars_poster_test3-480x300.jpg"
									alt=""></span></span></a><a
							href="/res/img/Morphun-Junior-Finished-Model-Classroom-Children_small.jpg"
							class="g-item"
							title="ToyFun Junior Finished Model - Classroom Children_small"><span
							class="inner"><span class="inner-content"><img
									src="/res/img/Morphun-Junior-Finished-Model-Classroom-Children_small-480x300.jpg"
									alt=""></span></span></a><a
							href="/res/img/MG_9440-1.jpg"
							class="g-item"
							title="ToyFun Bricks Gears Set - Shark Against Blue Background"><span
							class="inner"><span class="inner-content"><img
									src="/res/img/MG_9440-1-480x300.jpg"
									alt=""></span></span></a><a
							href="/res/img/44204-Mathsphun-Addition-with-kids-1.jpg"
							class="g-item"
							title="ToyFun Mathsphun Addition and Board with Kids"><span
							class="inner"><span class="inner-content"><img
									src="/res/img/44204-Mathsphun-Addition-with-kids-1-480x300.jpg"
									alt=""></span></span></a><a
							href="/res/img/Boy-and-Girl-with-advanced-Crocodile.jpg"
							class="g-item" title="Boy and Girl with advanced Crocodile"><span
							class="inner"><span class="inner-content"><img
									src="/res/img/Boy-and-Girl-with-advanced-Crocodile-480x300.jpg"
									alt=""></span></span></a><a
							href="/res/img/drive0007.jpg"
							class="g-item" title="ToyFun Junior - 3D Single Car"><span
							class="inner"><span class="inner-content"><img
									src="/res/img/drive0007-480x300.jpg"
									alt=""></span></span></a>
					</div>
				</div>

			</div>
			</section> </main>
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
