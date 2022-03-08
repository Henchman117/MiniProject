<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add New Cars</title>
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
	<h1 style = "color: rgb(45, 53, 66); background-color: rgb(207, 224, 250);" >Add A New Car:</h1>
	<form action ="addCarsServlet" method = "post">
		Model: <input type ="text" name = "model">
		Manufacturer: <input type ="text" name = "manufacturer">
		<br />
		Specifications -
		Horsepower: <input type ="text" name = "hp">
		Torque: <input type ="text" name = "torque">
		Displacement: <input type ="text" name = "displacement">
		Miles Per Gallon: <input type ="text" name = "mpg">
		
		<input type = "submit" value = "Add Car">
	</form>
	<form method = "post" action = "navServlet">
		<h4 style = "background-color:rgb(201, 205, 212);">Navigation: </h4><br />
		<input type = "submit" value = "Home Page" name = "selection" style = "background-color: rgb(196, 220, 255);">
		<input type = "submit" value = "Add New Owner" name = "selection" style = "background-color: rgb(196, 220, 255);">
		<input type = "submit" value = "Display Garage Owners" name = "selection" style = "background-color: rgb(196, 220, 255);">
	</form>
</div>
</body>
</html>