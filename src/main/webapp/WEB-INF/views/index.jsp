<%@ page language="java" contentType="text/html; charset=ISO-8859-1"  pageEncoding="ISO-8859-1" %>

<html>
<body>
<h2>Hello World!</h2>
</body>

<%
	String name = (String)request.getAttribute("name");
%>

<h2>Name is <%= name %></h2>
</html>