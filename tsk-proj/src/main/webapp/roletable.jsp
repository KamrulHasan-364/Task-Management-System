<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Task's List Table</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
</head>
<body>
	<div class="container">
		<div>
			<a type="button" class="btn btn-primary btn-md" href="/roleform.jsp">Add
				Role</a>
		</div>
		<br>
		<div class="panel panel-primary">
			<div class="panel-heading">
				<h3>List of Task's</h3>
			</div>
			<div class="panel-body">
				<table
					class="table table-striped table-hover table-condensed table-bordered">
					<thead>
						<tr>
						<th>Id</th>
						<th>Name</th>
					</tr>
					</thead>
					
					<tbody>
					<c:forEach var="role" items="${dataList}">
						<tr>
							<td>${role.id}</td>
							<td>${role.name}</td>
						</tr>
					</c:forEach>
					</tbody>
				</table>
			</div>
		</div>

	</div>

</body>
</html>