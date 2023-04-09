<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Product Details</title>
</head>
<body>
    <h1>Product Details</h1>
    <%
        String pic = (String)request.getAttribute("pic");
        if(pic != null) {
    %>
        <img src="data:image/png;base64,${product.pic}" alt="Product Image" />

    <%
        }
    %>
</body>
</html>
