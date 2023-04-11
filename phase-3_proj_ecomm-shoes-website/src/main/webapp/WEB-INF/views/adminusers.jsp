<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
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

	<input type="text" id="searchInput" placeholder="Enter Required Search..." style="display: block; margin: 0 auto;">

	

	<table class="table align-middle mb-0 bg-white">
		<thead class="bg-light">
			<tr>
				<th>user id</th>
				<th>Name</th>
				<th>Phone Number</th>
				<th>Address</th>
			</tr>
		</thead>
		<c:forEach items="${users}" var="user">
			<tr>
				<td>${user.uid}</td>
				<td>${user.name}</td>
				<td>${user.phno}</td>
				<td>${user.address}</td>
			</tr>
		</c:forEach>
	</table>

</body>
<script>
		const searchInput = document.getElementById("searchInput");
		const tableRows = document.getElementsByTagName("tr");

		// Add event listener for input changes
		searchInput.addEventListener("input", function() {
			const filterText = searchInput.value.toLowerCase();
			for (let i = 1; i < tableRows.length; i++) { // Start at 1 to skip table header row
				const tableData = tableRows[i].getElementsByTagName("td");
				let found = false;
				for (let j = 0; j < tableData.length; j++) {
					if (tableData[j].textContent.toLowerCase().includes(
							filterText)) {
						found = true;
						break;
					}
				}
				if (found) {
					tableRows[i].style.display = "";
				} else {
					tableRows[i].style.display = "none";
				}
			}
		});
	</script>
</html>