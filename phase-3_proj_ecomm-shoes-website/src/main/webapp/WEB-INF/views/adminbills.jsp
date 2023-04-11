<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

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

	<div class="row my-4" style="margin-left:20%">
		<div class="col-md-4">
			<select class="form-select" id="category-select">
				<option value="">All Categories</option>
				<option value="gym">Gym</option>
				<option value="running">Running</option>
				<option value="formal">Formal</option>
			</select>
		</div>
		<div class="col-md-4" >
			<input type="date" class="form-control" id="date-input">
		</div>
		<div class="col-md-4">
			<button type="button" class="btn btn-primary" id="search-button">Search</button>
		</div>
	</div>

	<table class="table align-middle mb-0 bg-white">
		<thead class="bg-light">
			<tr>
				<th>bill id</th>
				<th>User Name</th>
				<th>Product Name</th>
				<th>Category</th>
				<th>Ordered Date</th>
				<th>Paid Amount</th>
			</tr>
		</thead>
		<c:forEach items="${abills}" var="bill">
			<tr>
				<td>${bill[0]}</td>
				<td>${bill[1]}</td>
				<td>${bill[2]}</td>
				<td>${bill[3]}</td>
				<td>${bill[4]}</td>
				<td>${bill[5]}</td>

			</tr>
		</c:forEach>
	</table>
</body>
<script>
  document.getElementById("search-button").addEventListener("click", function() {
    var category = document.getElementById("category-select").value;
    var date = document.getElementById("date-input").value;
    
    var rows = document.getElementsByTagName("tr");
    for (var i = 0; i < rows.length; i++) {
      var cells = rows[i].getElementsByTagName("td");
      if (cells.length > 0) {
        var categoryMatch = false;
        var dateMatch = false;
        if (category == "" || cells[3].innerHTML.toLowerCase() == category) {
          categoryMatch = true;
        }
        if (date == "" || cells[4].innerHTML == date) {
          dateMatch = true;
        }
        if (categoryMatch && dateMatch) {
          rows[i].style.display = "";
        } else {
          rows[i].style.display = "none";
        }
      }
    }
  });
</script>

</html>