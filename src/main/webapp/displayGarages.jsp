<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Garages</title>
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
	<h1 style = "color: rgb(45, 53, 66); background-color: rgb(207, 224, 250);"> Garages</h1>
		<form method = "post" action = "ownerNavigationServlet">
		
		<table>
		<c:forEach var="Owners" items="${requestScope.allowners}" >
		<tr>
			<td><input type="radio" name="id" value="${Owners.id}"></td>
			
			<tr><td colspan="3">Owner: ${Owners.ownerName.ownerName}</td></tr>
				<td><p>cars:</p></td>
				<c:forEach var = "Car" items = "${Owners.cars}">
					<tr><td></td><td colspan="3">${Car.model},${Car.manufacturer}</td></tr>
					<tr><td></td><td colspan="3">Horsepower: ${Car.specs.horsepower}, Torque: ${Car.specs.torque}, Displacement: ${Car.specs.displacement}, MPG: ${Car.specs.milesPerGallon}</td></tr>
				</c:forEach>
		</c:forEach>
		</table>
		<input type = "submit" value = "delete" name="doThisToCars">
		<input type="submit" value = "add" name = "doThisToCars">
		
		
		</form>
		<form method = "post" action = "navServlet">
		<h4 style = "background-color: rgb(201, 205, 212);">Navigation: </h4><br />
		<input type = "submit" value = "Home Page" name = "selection" style = "background-color: rgb(196, 220, 255);">
		<input type = "submit" value = "Add New Owner" name = "selection" style = "background-color: rgb(196, 220, 255);">
		<input type = "submit" value = "Add New Cars" name = "selection" style = "background-color: rgb(196, 220, 255);">
		</form>
</div>	

</body>
</html>