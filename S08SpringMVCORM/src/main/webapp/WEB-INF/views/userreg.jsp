<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Hello!! Welcome to Spring MVC</h1>
	
	<form action="registeruser" method="post">
		<pre>
		Name     :<input type="text" name="name"/><br>
		Email    :<input type="text" name="email"/><br>
		Password :<input type="password" name="password"/><br>
		<input type="submit" name="Signup"/>
		</pre>
		
		
	</form>

	<p>${message}</p>
	
	<ul>
		<c:forEach items="${users}" var="user">
			<li>${user.id}  | ${user.name} | ${user.email} </li>
		</c:forEach>
	</ul>
</body>
</html>