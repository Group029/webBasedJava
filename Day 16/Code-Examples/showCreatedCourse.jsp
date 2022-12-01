<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
	<meta charset="ISO-8859-1">
	<title>Insert title here</title>
	</head>
	<body>
		<%-- Obtaining a bean of type Course with name 'c1' from SESSION scope  --%>
		<jsp:useBean id="c1" class="example.beans.Course" scope="session"/>
		<h2>Printing the details of the created course:</h2>
		<h2>Name: <jsp:getProperty property="name" name="c1"/></h2>
		
		<h2>Duration: <jsp:getProperty property="duration" name="c1"/></h2>
		
		<h2>Fees: <jsp:getProperty property="fees" name="c1"/></h2>
	</body>
</html>











