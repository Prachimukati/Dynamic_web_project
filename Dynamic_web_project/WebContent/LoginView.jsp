<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<!--  <form action="LoginCtl" method="post">
		<center>
		<table>
		
			<tr>
				<th>FirstName :</th>
				<td><input type="text" name="firstName"></td>
			</tr>
			<tr>
				<th>LastName: </th>
				<td><input type="text" name="lastName"></td>
			</tr>
			<tr>
				<th></th>
				<td><input type="submit"></td>
			</tr>
		</table>
		</center>
	</form>-->


	<%
		String msg = (String) request.getAttribute("msg");
	%>
	<%@ include file="Header.jsp"%>

	<form action="LoginCtl" method="post">

		<%
			if (msg != null) {
		%>
		<h3>
			<font color="red"><%=msg%></font>
		</h3>
		<%
			}
		%>
		<table>
			<tr>
				<th>LoginId :</th>
				<td><input type="text" name="loginId"></td>
			</tr>
			<tr>
				<th>Password:</th>
				<td><input type="text" name="password"></td>
			</tr>
			<tr>
				<th></th>
				<td><input type="submit"></td>
			</tr>
		</table>
	</form>
</body>
</html>