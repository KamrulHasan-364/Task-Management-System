<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List of Member's</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">

</head>
<body>


	<div class=-"container">
		<div class="container">
			<a type="button" class="btn btn-primary btn-md"
				href="/memberform.jsp">Add Member</a>
		</div>
		<br>
		<div class="panel panel-primary">
			<div class="panel-heading">
				<h3>List of Member's</h3>
			</div>
			<div class="panel-body">
				<table class="table table-striped  table-bordered">
					<thead>
						<tr>
							<th width="40%">Member Name</th>
							<th width="40%">Phone Number</th>

						</tr>
					</thead>
					<tbody>
						<c:forEach var="mem" items="${memberList}">
							<tr>
								<td>${mem.memberName}</td>
								<td>${mem.memberPhone}</td>
								<td><button id="btnTask">Task</button></td>

							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
		</div>

	</div>
	
	<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js" integrity="sha512-3P8rXCuGJdNZOnUx/03c1jOTnMn3rP63nBip5gOP2qmUh5YAdVAvFZ1E+QLZZbC1rtMrQb+mah3AfYW11RUrWA==" crossorigin="anonymous" referrerpolicy="no-referrer"></script>
	
	<script type="text/javascript" src="member.js"></script>
</body>
</html>