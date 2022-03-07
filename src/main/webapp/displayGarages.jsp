<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Garages</title>
</head>
<body>
	<h1>Garages</h1>
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
		
		<a href="index.jsp">Home</a>
		
		</form>
	

</body>
</html>