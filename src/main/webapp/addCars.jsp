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
		Specifications -
		Horsepower: <input type ="text" name = "hp">
		Torque: <input type ="text" name = "torque">
		Displacement: <input type ="text" name = "displacement">
		Miles Per Gallon: <input type ="text" name = "mpg">
		
		<input type = "submit" value = "Add Car">
	</form>


</body>
</html>