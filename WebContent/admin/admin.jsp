<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>后台管理系统|ToyFun</title>
</head>
<frameset rows="50px,*,50px" cols="*" frameborder="no" framespacing="0" border="0">
	<frame src="/admin/adminTop.jsp" name="adminTopFrame" id="adminTopFrame">
	<frameset cols="200px,*" rows="*">
		<frame src="/admin/adminLeft.jsp" name="adminLeftFrame" id="adminLeftFrame" scrolling="auto" noresize frameborder="no" />
		<frame src="/admin/adminMain.jsp" name="adminMainFrame" id="adminMainFrame" scrolling="auto" noresize frameborder="no" />
	</frameset>
	<frame src="/admin/adminBottom.jsp" name="adminBottomFrame" id="adminBottomFrame">
</frameset>
</html>