<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<!-- 重要，需要保留 -->
<link rel='stylesheet' id='onepress-bootstrap-css' href='/res/bootstrap/css/bootstrap.min.css' type='text/css' media='all' />
<link rel='stylesheet' href='/res/font-awesome/css/font-awesome.min.css' type='text/css' media='all' />
<link rel='stylesheet' id='onepress-gallery-lightgallery-css'  href='/res/css/lightgallery.css' type='text/css' media='all' />
<link rel='stylesheet' id='onepress-style-css' href='/res/css/styles.css' type='text/css' media='all' />
<link rel='stylesheet' href='/res/css/newStyle.css' type='text/css' media='all' />
	
<style id='onepress-style-inline-css' type='text/css'>
#main .video-section section.hero-slideshow-wrapper {
	background: transparent
}

.hero-slideshow-wrapper:after {
	position: absolute;
	top: 0px;
	left: 0px;
	width: 100%;
	height: 100%;
	background-color: rgba(0, 0, 0, 0.3);
	display: block;
	content: ""
}

.body-desktop .parallax-hero .hero-slideshow-wrapper:after {
	display: none !important
}

#parallax-hero>.parallax-bg::before {
	background-color: rgba(0, 0, 0, 0.3);
	opacity: 1
}

.body-desktop .parallax-hero .hero-slideshow-wrapper:after {
	display: none !important
}

.site-header, .no-sticky-header.no-header-transparent .site-header {
	background: #ffffff;
	border-bottom: 0px none
}

.onepress-menu>li>a {
	color: #ffffff
}

.onepress-menu>li>a:hover, .onepress-menu>li.onepress-current-item>a {
	color: #eeee22;
	-webkit-transition: all 0.5s ease-in-out;
	-moz-transition: all 0.5s ease-in-out;
	-o-transition: all 0.5s ease-in-out;
	transition: all 0.5s ease-in-out
}

.site-footer {
	background-color: #3163a0
}

.site-footer .footer-connect .follow-heading {
	color: rgba(255, 255, 255, 0.9)
}

.gallery-carousel .g-item {
	padding: 0px 10px
}

.gallery-carousel {
	margin-left: -10px;
	margin-right: -10px
}

.gallery-grid .g-item, .gallery-masonry .g-item .inner {
	padding: 10px
}

.gallery-grid, .gallery-masonry {
	margin: -10px
}

.bgimage-videolightbox {
	background-image:
		url("/res/img/Children-using-Wordphun-Workcards-compressor.jpg");
}

#parallax-videolightbox .parallax-bg::before {
	background-color: rgba(0, 0, 0, 0);
}

.section-cta {
	padding-top: 4%;
	padding-bottom: 4%;
	background-color: rgba(119, 119, 119, 1);
}

.section-sid1496143613565 {
	padding-top: 30px;
	padding-bottom: 20px;
	background-color: rgba(229, 229, 229, 1);
}

.section-team {
	padding-top: 10px;
	padding-bottom: 10px;
}

.section-videolightbox {
	background-color: rgba(0, 0, 0, 0)
}

.section-gallery {
	background-color: rgba(243, 243, 243, 1);
}

.section-sid1497338747232 {
	background-color: rgba(255, 255, 255, 1);
}
</style>




<!-- 暂时留存，影响到footer部分蓝色条的高度。 -->
<style type="text/css" id="wp-custom-css">
/*
You can add your own CSS here.

Click the help icon above to learn more.
*/

/*------------------------------
	Smaller header bar on phones
------------------------------*/
@media only screen and (max-width: 500px) {
	.site-branding .site-logo-div {
		line-height: 60px;
	}
	.site-header {
		line-height: 60px;
	}
	.sticky-header .header-fixed {
		top: 0px;
		left: 0px;
		height: 60px;
	}
	.onepress-menu.onepress-menu-mobile {
		display: block !important;
		position: absolute;
		top: 60px;
	}
}

/*------------------------------
	Logo smaller on phones
------------------------------*/
@media only screen and (max-width: 500px) {
	.custom-logo {
		max-width: 150px;
	}
}

@media only screen and (max-width: 500px) {
	.header-transparent #hero .container .hero__content {
		margin-top: 50px;
	}
}

/*------------------------------
	Change Hamburger to "menu" button
------------------------------*/
#nav-toggle span {
	display: none;
}

#nav-toggle {
	width: auto;
	color: #FFF;
	text-transform: uppercase;
	font-size: 16px;
}

/*------------------------------
	Main Menu Font
------------------------------*/
.onepress-menu a {
	padding-left: 15px;
	padding-right: 15px;
	font-size: 13px;
	font-weight: 400;
}

/*------------------------------
	Front page header text
------------------------------*/
.section-title-area .section-title {
	font-size: 26px;
	letter-spacing: 1px;
}

/*------------------------------
	Footer Smaller
------------------------------*/
.site-footer .footer-connect {
	padding: 1.2rem 0px;
}

/*------------------------------
	Header - ToyFun Background
------------------------------*/
.site-header {
	background-image:
		url(/res/img/Blue-Background-Header.png);
}

.page-header {
	display: none;
}

/*------------------------------
	Woo Commerce Settings
------------------------------*/
.woocommerce div.product .product_title {
	clear: none;
	margin-top: 0;
	padding: 0;
	font-size: 16px;
}

.product_meta {
	margin-top: 40px;
	font-size: 11px;
	color: #111111
}

.woocommerce table.shop_attributes {
	max-width: 500px;
	text-align: left;
}

.woocommerce table.shop_attributes td p {
	text-align: left;
	text-indent: 15px;
}

.woocommerce table.shop_attributes th {
	text-align: left;
}

.woocommerce div.product .woocommerce-tabs .h2 {
	font-size: 12px;
}

.related.products {
	background-color: #f2f2f2;
	padding: 20px;
	padding-bottom: 0px;
}

.woocommerce ul.products li.product h3 {
	font-size: 14px;
	margin-bottom: 0px;
}

.product_meta a {
	color: #666666;
}

.product_meta a:hover {
	color: #03c4eb;
}

.tagged_as {
	display: block;
	padding-top: 10px;
}

.posted_in {
	display: block;
	padding-top: 10px;
}

/*------------------------------
	Woo Commerce Top Filter - no show
------------------------------*/
.orderby {
	display: none;
}

/*------------------------------
	Distributor Table Hide Lines
------------------------------*/
table>tbody>tr>td {
	border: 0px solid #ffffff;
}

table {
	border: 0px solid #ffffff;
	border-bottom: 1px solid #777777;
	border-collapse: separate;
}

/*------------------------------
	Distributor Table Not Centred Text
------------------------------*/
table>thead>tr>th, table>tbody>tr>th, table>tfoot>tr>th, table>thead>tr>td,
	table>tbody>tr>td, table>tfoot>tr>td {
	text-align: left;
	vertical-align: top;
	padding: 2px;
	padding-bottom: 5px;
}

table {
	margin-bottom: 10px;
}
/*------------------------------
	Contact Form Darker Form Elements
------------------------------*/
textarea, input[type="date"], input[type="datetime"], input[type="datetime-local"],
	input[type="email"], input[type="month"], input[type="number"], input[type="password"],
	input[type="search"], input[type="tel"], input[type="text"], input[type="time"],
	input[type="url"], input[type="week"] {
	background-color: #e1e1e1;
}


</style>

</head>
<body>

</body>
</html>