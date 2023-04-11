<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!doctype html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<html lang="en">
<head>
<meta charset="UTF-8">
<title>Product Details</title>
</head>
<!-- MDB -->
<script type="text/javascript"
	src="https://cdnjs.cloudflare.com/ajax/libs/mdb-ui-kit/6.2.0/mdb.min.js">
	
</script>
<!-- Font Awesome -->
<link
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css"
	rel="stylesheet" />
<!-- Google Fonts -->
<link
	href="https://fonts.googleapis.com/css?family=Roboto:300,400,500,700&display=swap"
	rel="stylesheet" />
<!-- MDB -->
<link
	href="https://cdnjs.cloudflare.com/ajax/libs/mdb-ui-kit/6.2.0/mdb.min.css"
	rel="stylesheet" />
<body>
	<h1 style="text-align: center; margin: auto">
		<a href="/sportyshoes.com">sportyshoes.com</a>
	</h1>

	<header>
		<!-- Navbar -->
		<nav class="navbar navbar-expand-lg navbar-light bg-white">
			<div class="container-fluid">
				<button class="navbar-toggler" type="button"
					data-mdb-toggle="collapse" data-mdb-target="#navbarExample01"
					aria-controls="navbarExample01" aria-expanded="false"
					aria-label="Toggle navigation">
					<i class="fas fa-bars"></i>
				</button>
				<div class="collapse navbar-collapse" id="navbarExample01">
					<ul class="navbar-nav me-auto mb-2 mb-lg-0">
						<li class="nav-item active"><a class="nav-link" aria-current="page" href="/sportyshoes.com">Home</a></li>
						<li class="nav-item"><a class="nav-link" href="#">Offers</a></li>
						<li class="nav-item"><a class="nav-link" href="#">About</a></li>
						<li class="nav-item"><a class="nav-link" href="/userlogout">Logout</a>
						</li>

					</ul>
				</div>
			</div>
		</nav>
		<!-- Navbar -->

		<!-- Category Buttons -->
		<br> <br> <b>Category:</b>
		<div class="container-fluid">
			<div class="row">
				<div class="col-md-12">
					<div class="btn-group btn-group-lg mb-3" role="group">

						<a href="/sportyshoes.com" class="btn btn-primary">All</a> <a
							href="/products/running" class="btn btn-primary">Running</a> <a
							href="/products/formal" class="btn btn-primary">Formal</a> <a
							href="/products/gym" class="btn btn-primary">Gym</a>
					</div>
				</div>
			</div>
		</div>
	</header>
	<br>
	<br>
	<!-- 	<form action="" method=""> -->
	<div class="container">
		<div class="products">
			<c:forEach items="${products}" var="x">
				<div class="product">
					<img alt="Image " src="${x.image}">
					<div class="product-info">
						<h3>${x.name}</h3>
						<p>${x.category}</p>
						<p>Price: ${x.price}</p>
						<a href="/payment/${x.id}"><button type="submit">Buy</button></a>
					</div>
				</div>
			</c:forEach>
			<!-- add more product boxes as needed -->
		</div>
	</div>
	<!-- 	</form> -->

	<!-- 	<table> -->
	<!-- 		<tr> -->
	<!-- 			<th>Image</th> -->
	<!-- 			<th>Name</th> -->
	<!-- 			<th>Category</th> -->
	<!-- 			<th>Price</th> -->
	<!-- 		</tr> -->
	<%-- 		<c:forEach items="${products}" var="x"> --%>
	<!-- 			<tr> -->
	<%-- 				<td><img alt="Image " src="${x.image}" width="275" height="200"></td> --%>
	<%-- 				<td><p>"${x.name}"</p></td> --%>
	<%-- 				<td><p>"${x.category}"</p></td> --%>
	<%-- 				<td><p>"${x.price}"</p></td> --%>
	<!-- 			</tr> -->
	<%-- 		</c:forEach> --%>
	<!-- 	</table> -->
</body>
<style>
.container {
	max-width: 1200px;
	margin: 0 auto;
}

.products {
	display: grid;
	grid-template-columns: repeat(auto-fit, minmax(250px, 1fr));
	gap: 1rem;
}

.product {
	background-color: #fff;
	box-shadow: 0 0 10px rgba(0, 0, 0, 0.2);
	border-radius: 5px;
	overflow: hidden;
}

.product img {
	display: block;
	width: 100%;
	height: auto;
}

.product-info {
	padding: 1rem;
}

.product-info h3 {
	margin: 0;
	font-size: 1.2rem;
}

.product-info p {
	margin: 0;
	color: #999;
}

.product-info button {
	display: block;
	margin-top: 1rem;
	padding: 0.5rem 1rem;
	background-color: #007bff;
	color: #fff;
	border: none;
	border-radius: 5px;
	cursor: pointer;
}

.btn-group a {
	margin-right: 10px;
}
</style>
</html>
