<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<title>Insert title here</title>

<script>
setInterval('location.reload()', 50000);
</script> 
</head>
<body>

<%

response.setHeader("Cache-Control", "no-cache , no-store , must-revalidate");
response.setHeader("Pragma", "no-cache");
response.setHeader("Expires", "0");

if(session.getAttribute("name")==null){
	response.sendRedirect("login.html");
}

%>>


<form action="./LogoutController" >
<a href="LogoutController">Logout</a> 
<a href="login.html">Login</a> 
</form>

<iframe width="560" height="315" src="https://www.youtube.com/embed/gQLQ0t9B5yk" frameborder="0" allow="accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>
</body>
</html>
