<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add New Garage Owners</title>
<style>
	body{
		background-color: rgb(123, 142, 156);
	}
	#container{
		width: 90%;
		margin-left: auto;
		margin-right: auto;
		margin-top: 10px;
		background-color: rgb(225, 233, 240);
		padding: 5px;
	}
</style>

</head>
<body>
<div id = "container">
	<h1 style = "color: rgb(45, 53, 66); background-color: rgb(207, 224, 250);"> Add A New Garage Owner</h1>
	
	<form action = "addOwnerServlet" method = "post">
	Garage Owner Name: <input type = "text" name = "owner"> <br />
	
	<h3 style = "background-color: rgb(160, 188, 232);">Add Cars to Garage: </h3>
	 
	<select name = "allCars" multiple size = "10">
		<c:forEach items = "${requestScope.cars}" var = "car">
			<option value = "${car.id}"> ${car.manufacturer} ${car.model}</option>
		</c:forEach>
	</select>
	<br />
	<input type = "submit" value = "Add Owner" style = "margin-top: 10px;">
	</form>
	
	<form method = "post" action = "navServlet">
		<h4 style = "background-color: rgb(201, 205, 212);">Navigation: </h4><br />
		<input type = "submit" value = "Home Page" name = "selection" style = "background-color: rgb(196, 220, 255);">
		<input type = "submit" value = "Display Garage Owners" name = "selection" style = "background-color: rgb(196, 220, 255);">
		<input type = "submit" value = "Add New Cars" name = "selection" style = "background-color: rgb(196, 220, 255);">
	</form>
</div>	
</body>
</html>