<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
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

	<header style="display: flex; justify-content: center; margin: 2%">
		<!-- Navbar -->
		<nav class="navbar navbar-expand-lg navbar-light"
			style="background-color: skyblue;">
			<div class="container-fluid">
				<button class="navbar-toggler" type="button"
					data-mdb-toggle="collapse" data-mdb-target="#navbarExample01"
					aria-controls="navbarExample01" aria-expanded="false"
					aria-label="Toggle navigation">
					<i class="fas fa-bars"></i>
				</button>
				<div class="collapse navbar-collapse" id="navbarExample01">
					<ul class="navbar-nav me-auto mb-2 mb-lg-0">
						<li class="nav-item active"><a class="nav-link"
							aria-current="page" href="/adminhome"
							style="font-weight: bold; color: white;">Admin_Home</a></li>
						<li class="nav-item"><a class="nav-link" href="/apwdupdate"
							style="font-weight: bold; color: white;">Password_Update</a></li>
						<li class="nav-item"><a class="nav-link" href="/aproducts"
							style="font-weight: bold; color: white;">Manage_productS</a></li>
						<li class="nav-item"><a class="nav-link" href="/ausers"
							style="font-weight: bold; color: white;">Users_List</a></li>
						<li class="nav-item"><a class="nav-link" href="/abills"
							style="font-weight: bold; color: white;">purchase_reports</a></li>
						<li class="nav-item"><a class="nav-link" href="/adminlogout"
							style="font-weight: bold; color: white;">Log_Out</a></li>
					</ul>
				</div>
			</div>
		</nav>
		<!-- Navbar -->
	</header>

	<div class="row my-4" style="margin-left: 43%">
		${msg}
		<div class="col-md-4">
			<a href="/addproductform"><button type="button"
					class="btn btn-primary" id="search-button">ADD a Product</button></a>
		</div>

	</div>

	<table class="table align-middle mb-0 bg-white"
		style="table-layout: fixed; width: 100%;">
		<thead class="bg-light">
			<tr>
				<th>Product id</th>
				<th>Name</th>
				<th>Image</th>
				<th>Category</th>
				<th>Price</th>
				<th>Status</th>
				<th></th>
			</tr>
		</thead>
		<c:forEach items="${products}" var="product">
			<tr>
				<td>${product.id}</td>
				<td>${product.name}</td>
				<td><img src="${product.image}" alt="${product.name} image"
					style="display: block; width: 75%; height: auto;"></td>
				<td>${product.category}</td>
				<td>${product.price}</td>
				<td
					style="font-size: 16px; font-weight: bold; color: ${product.status == 'available' ? 'green' : 'red'}">${product.status}</td>
				<td><div class="col-md-4">
						<a href="/editproductform/${product.id}"><button type="button"
								class="btn btn-primary" id="search-button">EDIT Info</button></a>
					</div></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>