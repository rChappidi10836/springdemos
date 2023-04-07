<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product</title>
</head>
<body>
	<h1>manage Products</h1>
	
	<form action="products" method="post">
		<pre>
		Name     	   :<input type="text" name="name"/><br>
		Description    :<input type="text" name="desc"/><br>
		Price 		   :<input type="text" name="price"/><br>
		<input type="submit" name="Add Product"/>
		</pre>
	</form>

	
	<ul>
		<c:forEach items="${products}" var="product">
			<li>${product.id}  | ${product.name} | ${product.desc} | ${product.price}</li>
		</c:forEach>
	</ul>
	
	
</body>
</html>