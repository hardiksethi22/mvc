<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false" %>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Success</title>
</head>
<body>
<h3 class="text-center">${head }</h3>
<h1>Welcome, ${user.username }</h1>
<h2>Your Email Address ${user.email }</h2>
<h3>Your Password ${user.password }</h3>
<h3 style="color:green">${msg }</h3>
</body>
</html>