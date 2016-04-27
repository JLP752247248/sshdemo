<%@ page language="java"  pageEncoding="UTF-8"%>
<%request.setCharacterEncoding("UTF-8");%>

<html ng-app="myModel">
	<head>
		<meta charset="UTF-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge, chrome=1">
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    	<meta name="renderer" content="webkit">
    	<meta name="viewport" content="width=device-width, initial-scale=1.0">
    	
		<script src="<%=request.getContextPath()%>/plugins/jquery-1.8.3.min.js"></script>
		<script src="<%=request.getContextPath()%>/myjs/service.js"></script>
		<link href="<%=request.getContextPath()%>/style/css/mainpage.css" rel="stylesheet" type="text/css"></link>
	<title>主页</title>
	</head>
	
		
		
	
		
		
		
	
<head>
		<meta charset="UTF-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge, chrome=1">
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    	<meta name="renderer" content="webkit">
    	<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<title>主页</title>
		<link rel="stylesheet" href="css/mainpage.css" />
		<script src="<%=request.getContextPath()%>/plugins/angular-1.4.0/angular.min.js"></script>
    	<script src="<%=request.getContextPath()%>/plugins/restangular-1.4.0/restangular.min.js"></script>
		<script src="<%=request.getContextPath()%>/plugins/lodash.js"></script>
		<script src="<%=request.getContextPath()%>/myjs/controller.js"></script>
		<script type="text/javascript" src="<%=request.getContextPath()%>/plugins/jquery-1.8.3.min.js" ></script>
		<script type="text/javascript" src="<%=request.getContextPath()%>/myjs/menu.js" ></script>
		<script type="text/javascript" src="<%=request.getContextPath()%>/myjs/mainpage.js" ></script>
		
	</head>
	<body>
		<div>
		<a href="${pageContext.request.contextPath}/j_spring_security_logout">logout</a></div>
		<div id="menubox" class="menubox">
			
		</div>
		<div ng-controller="TestController">
			<a href="#" ng-click="post()">post</a>
			<a href="#" ng-click="list()">list</a>
		</div>
	</body>
	
	
</html>

