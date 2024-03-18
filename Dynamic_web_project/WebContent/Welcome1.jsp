<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<% 
	
	String fname = request.getParameter("firstName");
	String lname = request.getParameter("lastName");
	String loginid = request.getParameter("loginId");
	String pass = request.getParameter("password");
	String dob = request.getParameter("dob");
	String add = request.getParameter("address");

	%>
	
		<h1> <%=fname %></h1>
		<h1> <%=lname %></h1>
		<h1> <%=loginid %></h1>
		<h1> <%=pass %></h1>
		<h1> <%=dob %></h1>
		<h1> <%=add %></h1>

</body>
</html>