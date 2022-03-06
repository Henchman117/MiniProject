<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Garage Manager</title>
</head>
<body>
	<form method = "post" action = "navServlet">
		<h1>Welcome to Garage Manager</h1>
		<p>This program stores information on the owners of different garages, their  cars, and the performance specifications for each car</p>
		<h3>Make a Selection Below: </h3><br />
		<input type = "submit" value = "Add New Owner" name = "selection">
		<input type = "submit" value = "Display Garage Owners" name = "selection">
		<input type = "submit" value = "Add New Cars" name = "selection">
	</form>
	
</body>
</html>