<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Hello!! Welocome to Spring MVC</h1>
	
	<%
// 		Integer id = (Integer) request.getAttribute("id");
		out.println("Id: "+request.getAttribute("id")+"<br>");
		out.println("Name: "+request.getAttribute("name")+"<br>");
		out.println("Salary: "+request.getAttribute("salary")+"<br>");
	%>
	
	<p>id:${id}</p>
	<p>Name:${name}</p>
	<p>Salary:${salary}</p>
	
	<p>${employee}</p>
	
</body>
</html>