<%@page import="java.time.LocalDate"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
	<meta charset="ISO-8859-1">
	<title>Insert title here</title>
	</head>
	<body>
		<h1>Welcome to the demonstration of JSP Tags</h1>
		<%-- Including a resource: greeting.html --%>
		<%@ include file="greeting.html" %>
		<%-- Declaring some variable, defining some method using a Declaration Section --%>
		<%!
			int num = 5;
			public String sayWelcome(String name){
				return "Welcome " + name;
			}
		%>
		<h2>Printing HELLO 5 times</h2>
		<%-- This needs some loop, which is a Java Code and that can be written inside a Scriptlet --%>
		<%
			for(int a=1;a<=5;a++){
		%>
				<h2>HELLO</h2>
		<%
			}
		
			LocalDate systemDate = LocalDate.now();
		%>
		
		<h2>The value of num is <%=num %></h2>
		<h2>The square of <%=num %> is <%=(num * num) %></h2>
		<h2>Reply from method sayWelcome is <%=sayWelcome("Joker") %></h2>
		<h2>Today's date is <%=systemDate %></h2>
	
	</body>
</html>






