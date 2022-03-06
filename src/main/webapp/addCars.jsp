<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add New Cars</title>
</head>
<body>
	<h1>Add A New Car:</h1>
	<form action ="addCarsServlet" method = "post">
		Model: <input type ="text" name = "model">
		Manufacturer: <input type ="text" name = "manufacturer">
		<br />
		<h3>Specifications -</h3><br />
		Horsepower: <input type ="text" name = "hp">
		Torque: <input type ="text" name = "torque">
		Displacement: <input type ="text" name = "displacement">
		Miles Per Gallon: <input type ="text" name = "mpg">
		<br />
		<input type = "submit" value = "Add Car">
	</form>
	<form method = "post" action = "navServlet">
		<h4>Navigation: </h4><br />
		<input type = "submit" value = "Home Page" name = "selection">
		<input type = "submit" value = "Add New Owner" name = "selection">
		<input type = "submit" value = "Display Garage Owners" name = "selection">
	</form>

</body>
</html>