<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form action = "editCarServlet" method="post">
	Horsepower: <input type = "text" name = "hp" value = "${specsToEdit.horsepower}">
	Torque: <input type = "text" name = "torque" value = "${specsToEdit.torque}">
	Displacement: <input type = "text" name = "displacement" value = "${specsToEdit.displacement}">
	MPG: <input type = "text" name = "mpg" value = "${specsToEdit.milesPerGallon}">
	<input type = "hidden" name = "id" value = "${specsToEdit.id}">
	<input type = "submit" value = "Save Edited Item">
	</form>

</body>
</html>