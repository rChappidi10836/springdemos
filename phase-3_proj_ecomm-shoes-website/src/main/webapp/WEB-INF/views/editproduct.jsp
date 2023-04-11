<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
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
<style>
.container {
	border: 1px solid blue;
	max-width: 400px;
	margin: 15% auto;
	padding: 20px;
	display: flex;
	flex-direction: column;
	justify-content: center;
	align-items: center;
	height: auto;
}

.form-group {
	display: flex;
	flex-direction: column;
	justify-content: center;
	align-items: center;
}

.btn-signin {
	width: 140px;
	height: 38px;
	display: flex;
	justify-content: center;
	align-items: center;
}

.form-outline {
	display: flex;
	flex-direction: column;
	justify-content: center;
	align-items: center;
	margin-bottom: 20px;
}

.form-control {
	border: 4px solid blue;
}

.form-outline input[type=text], .form-outline input[type=password] {
	border: none;
	border-bottom: 2px solid blue;
	outline: none;
}
</style>
</head>
<body>

	<div class="container">
		<H3>Editing Product Data</H3>
		<br> <br>
		<form action="/editproduct" method="GET">
			<div class="form-group">
				<!-- Email input -->
				<input name="id" value="${product.id}" type="hidden" />
				<div class="form-outline mb-4">
					<input type="text" name="name" placeholder="Enter Name here"
						value="${product.name}" required />
				</div>

				<!-- Password input -->
				<div class="form-outline mb-4">
					<input type="url" name="image"
						placeholder="Enter working Image URL here"
						value="${product.image}" required />
				</div>

				<div class="form-outline mb-4">
					<select class="form-select" id="category-select" name="category">
						<option value="" disabled>--Select Category</option>
						<option value="Gym" ${product.category =='Gym' ? 'selected' : ''}>Gym</option>
						<option value="Running"
							${product.category == 'Running' ? 'selected' : ''}>Running</option>
						<option value="Formal"
							${product.category == 'Formal' ? 'selected' : ''}>Formal</option>
					</select>
				</div>


				<div class="form-outline mb-4">
					<input type="text" name="price" placeholder="Enter Price here"
						value="${product.price}" required />
				</div>

				<div class="form-outline mb-4">
					<select class="form-select" id="status-select" name="status">
						<option value="" disabled>--Select Status</option>
						<option value="available" ${product.status == 'available' ? 'selected' : ''}>Available</option>
						<option value="out of stock" ${product.status == 'out of stock' ? 'selected' : ''}>Out of Stock</option>
					</select>
				</div>




				<!-- Submit button -->
				<div class="form-outline mb-4 btn-signin">
					<button type="submit" class="btn btn-primary btn-block">APPLY</button>
				</div>
			</div>
		</form>
	</div>
</body>

</html>