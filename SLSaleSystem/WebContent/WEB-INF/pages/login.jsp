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
	<h1>User log In</h1>
	<form action="dologin.html" method="post">
		loginCode:<input type="text" name="loginCode"><br>
		password :<input type="password" name="password"><br>
		<input type="submit" value="登 录">
	</form>
</body>
</html>