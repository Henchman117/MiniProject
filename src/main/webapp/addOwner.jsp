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
	Owner Name: <input type = "text" name = "ownerName">
	
	Add Cars to Garage: <br />
	 
	<select name="allcars" multiple size="6">
	<c:forEach items="${requestScope.allcars}" var="Car">
		<option value = "${Car.id}">${Car.manufacturer} | ${Car.model}</option>
	</c:forEach>
	</select>
	<br />
	<input type = "submit" value = "Add Owner">
	</form>
	<a href = "/MiniProject/index.jsp"> Return to Home Page</a>
	
</body>
</html>