<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>    
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath %>">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="<%=basePath %>static/js/jquery.min.js?version=0" charset="utf-8"></script>
<script type="text/javascript" src="<%=basePath %>static/js/jquery.json-2.4.js?version=0" charset="utf-8"></script>
<script type="text/javascript" src="<%=basePath %>static/js/index.page.js?version=0" charset="utf-8"></script>
</head>
<body>
	<!-- 使用jsonp查询当天的天气情况 -->
	<div id="weather"></div>
	
	<br/>
	<button id="btn01">添加用户</button>
	<button id="btn02">根据ID查询用户</button>
</body>
</html>