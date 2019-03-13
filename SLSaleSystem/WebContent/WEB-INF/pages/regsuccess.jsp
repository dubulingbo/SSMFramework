<%@ page language="java" contentType="text/html;charset=UTF-8" 
	pageEncoding="UTF-8"%>

<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"
						+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML>
<html>
  <head>
    <title>Home</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
    
    <!-- Custom Theme Style 
    <link href="" rel="stylesheet">
    -->
  </head>
  
<body>
	<h1>register success!</h1><br>
	<span>
		loginCode: ${user.loginCode }<br>
		userName : ${user.userName }<br>
		password : ${user.password }<br>
	</span>
	<a href="login.html">去登录</a>
</body>


</html>