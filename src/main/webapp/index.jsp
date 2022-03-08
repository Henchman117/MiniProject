<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Garage Manager</title>
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
	<form method = "post" action = "/MiniProject/navServlet">
		<h1>Welcome to Garage Manager</h1>
		<p style = "background-color: rgb(160, 188, 232);" >This program stores information on the owners of different garages, their  cars, and the performance specifications for each car</p>
		<h3 style = "background-color: rgb(201, 205, 212);">Make a Selection Below: </h3><br />
		<input type = "submit" value = "Add New Owner" name = "selection" style = "background-color: rgb(196, 220, 255);">
		<input type = "submit" value = "Display Garage Owners" name = "selection" style = "background-color: rgb(196, 220, 255);">
		<input type = "submit" value = "Add New Cars" name = "selection" style = "background-color: rgb(196, 220, 255);">
	</form>
</div>
</body>
</html>