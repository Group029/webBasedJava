<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
	<meta charset="ISO-8859-1">
	<title>Insert title here</title>
	</head>
	<body>
		<%-- Instantiating a Java Bean: Course --%>
		<jsp:useBean id="c1" class="example.beans.Course" scope="session"/>
		<%--Setting the properties of the course using the values coming from HTML --%>
		<jsp:setProperty property="*" name="c1"/>
		<h2>Course created successfully. To view the details please
			<a href = "showCreatedCourse.jsp">Click Here</a>
		 </h2>
	</body>
</html>












