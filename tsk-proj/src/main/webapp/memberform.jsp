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
				<form:form action="savemem" method="post">

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

						<label class="col-md-2 control-lable" for="userProfiles">Tasks</label>
						<div class="col-md-7">
							<form:select path="userProfiles" items="${roles}" multiple="true"
								itemValue="id" itemLabel="type" class="form-control input-sm" />
						</div>

					</div>

					<div class="text-center">
						<button type="submit" class="btn btn-primary">Submit</button>
					</div>
				</form:form>
			</div>
		</div>
	</div>
</body>
</html>