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
		
		<div class="container">
		<H3>Admin Login</H3>
		<br>
		<br>
		<form action="/adminupdate" method="GET">
			<div class="form-group">
				<!-- Email input -->
				<div class="form-outline mb-4">
					<input type="password" name="oldpwd"
						placeholder="Enter OldPassword here" required />
				</div>

				<!-- Password input -->
				<div class="form-outline mb-4">
					<input type="password" name="newpwd"
						placeholder="Enter NewPassword here" required />
				</div>

				${msg}

				<!-- Submit button -->
				<div class="form-outline mb-4 btn-signin">
					<button type="submit" class="btn btn-primary btn-block">Update</button>
				</div>
			</div>
		</form>
	</div>
		
</body>

</html>