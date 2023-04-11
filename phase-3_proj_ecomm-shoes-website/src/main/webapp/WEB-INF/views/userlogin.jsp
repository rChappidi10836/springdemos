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
		<H3>User Login</H3>
		<br>
		<br>
		<form action="/userauthn" method="GET">
			<div class="form-group">
				<!-- Email input -->
				<div class="form-outline mb-4">
					<input type="text" name="username"
						placeholder="Enter username here" required />
				</div>

				<!-- Password input -->
				<div class="form-outline mb-4">
					<input type="password" name="password"
						placeholder="Enter password here" required />
				</div>

				<p>${msg}</p>

				<!-- Submit button -->
				<div class="form-outline mb-4 btn-signin">
					<button type="submit" class="btn btn-primary btn-block">Sign
						in</button>
				</div>
			</div>
		</form>
	</div>
</body>
</html>