<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<title>Insert title here</title>
</head>
<body>
<form action="./LogoutController">
<a href="LogoutController">Logout</a> 
<a href="login.html">Login</a> 
</form>

<%
//response.setHeader("Cache-Control", "no-cache , no-store , must-revalidate");
response.setHeader("Cache-Control", "no-cache , no-store , must-revalidate");
 response.setHeader("Cache-Control","no-cache"); 
response.setHeader("Cache-Control","no-store"); 
response.setDateHeader("Expires", 0); 
response.sendRedirect("login.html"); 


%>

<iframe width="560" height="315" src="https://www.youtube.com/embed/gQLQ0t9B5yk" frameborder="0" allow="accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>
</body>
</html>
