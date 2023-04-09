<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!doctype html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>Product Details</title>
</head>
<body>
	<h1>Product Details</h1>


	<table>
		<tr>
			<th>Image</th>
			<th>Name</th>
			<th>Category</th>
			<th>Price</th>
		</tr>
		<c:forEach items="${products}" var="x">
			<tr>
				<td><img alt="Image " src="${x.image}" width="200" height="100"></td>
				<td><p>"${x.name}"</p></td>
				<td><p>"${x.category}"</p></td>
				<td><p>"${x.price}"</p></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>
