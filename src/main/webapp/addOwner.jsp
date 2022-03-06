<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add New Garage Owners</title>
</head>
<body>
	<h1> Add A New Garage Owner</h1>
	
	<form action = "addOwnerServlet" method = "post">
	Garage Owner Name: <input type = "text" name = "owner"> <br />
	
	Add Cars to Garage: <br />
	 
	<select name = "allCars" multiple size = "10">
		<c:forEach items = "${requestScope.cars}" var = "car">
			<option value = "${car.id}"> ${car.manufacturer} ${car.model}</option>
		</c:forEach>
	</select>
	<br />
	<input type = "submit" value = "Add Owner">
	</form>
	
	<form method = "post" action = "navServlet">
		<h4>Navigation: </h4><br />
		<input type = "submit" value = "Home Page" name = "selection">
		<input type = "submit" value = "Display Garage Owners" name = "selection">
		<input type = "submit" value = "Add New Cars" name = "selection">
	</form>
	
</body>
</html>