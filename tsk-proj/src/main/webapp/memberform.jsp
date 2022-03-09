<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Member's Register Form</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">


</head>
<body>
	<div class="container">
		<h1>Member's Register Form</h1>
		<div class="card">
			<div class="card-body">
				<form:form action="/member/savemem" method="post" modelAttribute="memberEntity">

					<div class="form-group row">
						<label for="memberName" class="col-sm-2 col-form-label">
							Member Name</label>
						<div class="col-sm-7">
							<input type="text" class="form-control" name="memberName"
								placeholder="Enter member name">
						</div>
					</div>
					<div class="form-group row">
						<label for="memberPhone" class="col-sm-2 col-form-label">Contact
							No</label>
						<div class="col-sm-7">
							<input id="memberPhone" type="text" class="form-control"
								name="memberPhone" placeholder="Enter member's phone number">
						</div>
					</div>
					<div class="row">

						<label class="col-md-2 control-lable" for="">Tasks</label>
						<div class="col-md-7">
							<select name="roleId" id="taskSel" class="form-control">
							</select>
						</div>

					</div>

					<div class="text-center">
						<button type="submit" id ="saveBtn" class="btn btn-primary">Submit</button>
					</div>
				</form:form>
			</div>
		</div>
	</div>
	
	<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js" integrity="sha512-3P8rXCuGJdNZOnUx/03c1jOTnMn3rP63nBip5gOP2qmUh5YAdVAvFZ1E+QLZZbC1rtMrQb+mah3AfYW11RUrWA==" crossorigin="anonymous" referrerpolicy="no-referrer"></script>
	
	<script type="text/javascript" src="member.js"></script>
	
</body>
</html>