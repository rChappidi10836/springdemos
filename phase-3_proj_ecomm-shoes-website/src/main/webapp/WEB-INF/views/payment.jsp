<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import="javax.servlet.http.*, java.util.* ,java.text.SimpleDateFormat"%>
<!DOCTYPE html>
<html>
<head>
	<title>Payment Gateway</title>
	<style>
		body {
			display: flex;
			flex-direction: column;
			align-items: center;
			font-family: Arial, sans-serif;
			font-size: 16px;
			color: #333;
		}
		.container {
			display: flex;
			flex-direction: row;
			align-items: flex-start;
			margin-top: 20px;
		}
		.product-details, .user-details {
			margin-left: 20px;
			padding: 20px;
			border: 1px solid #ccc;
			border-radius: 5px;
			background-color: #f9f9f9;
			box-shadow: 0px 0px 5px #ddd;
			width: 400px;
		}
		.product-details h2, .user-details h2 {
			font-size: 24px;
			margin-bottom: 10px;
		}
		.product-details p, .user-details p {
			margin: 10px 0;
			line-height: 1.5;
		}
		.product-image {
			margin-right: 20px;
			max-width: 400px;
			max-height: 400px;
		}
		button {
			background-color: #428bca;
			color: #fff;
			font-size: 20px;
			border: none;
			border-radius: 5px;
			padding: 10px 30px;
			cursor: pointer;
			box-shadow: 0px 0px 5px #ddd;
			margin-top: 20px;
			width: 140px;
		}
	</style>
</head>
<%
java.util.Date currentDate = new java.util.Date();

//Create a SimpleDateFormat instance with the desired date format
SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

//Add 5 days to the current date
Calendar calendar = Calendar.getInstance();
calendar.setTime(currentDate);
calendar.add(Calendar.DATE, 5);

//Get the date 5 days later as a Date object
Date laterDate = calendar.getTime();

//Format the currentDate and laterDate as Strings
String currentDateStr = dateFormat.format(currentDate);
String laterDateStr = dateFormat.format(laterDate);

//Set the current date and later date as session attributes
session.setAttribute("OrderDate", currentDateStr);
session.setAttribute("DeliveryDate", laterDateStr);

%>

<body>
	<div class="container">
		<div class="product-image">
			<img src="${product.image}" alt="${product.name}" height="400">
		</div>
		<div class="product-details">
			<h2>Product Details</h2>
			<p><strong>Name    :</strong> ${product.name}</p>
			<p><strong>Category:</strong> ${product.category}</p>
			<p><strong>Price     :</strong> ${product.price}</p>
		</div>
	</div>
	<div class="user-details" style="margin-top: 20px;">
		<h2>Contact & Delivery</h2>
		<p><strong>Name  :</strong> ${user.name}</p>
		<p><strong>Phone :</strong> ${user.phno}</p>
		<p><strong>Delivery Address :</strong> ${user.address}</p>
		<p><strong>Ordering Date    :</strong> ${OrderDate}</p>
		<p><strong>Delivery Date    :</strong> ${DeliveryDate}</p>
	</div>
	<a href="/savebill/${product.id}/${product.price}">
	<button type="submit" style="margin-top: 20px;">Pay</button></a>
</body>

</html>
