<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
							<th width="20%"></th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${todos}" var="todo">
							<tr>
								<td>${todo.description}</td>
								<td><fmt:formatDate value="${todo.targetDate}" /></td>
								<td><a type="button" class="btn btn-success" href="">Update</a>
									<a type="button" class="btn btn-warning" href="">Delete</a></td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
		</div>

	</div>
</body>
</html>