<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="java.util.List"%>
<%@ page import="com.chainsys.model.*"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Login Success</title>
<style>
body {
	margin: 0;
}

.center {
	text-align: center;
	margin: auto;
	font-size: 15px;
}

table {
	margin-top: 20px;
	margin-left: 100px;
	border-collapse: collapse;
	width: 80%;
}

.btn1 {
	display: block;
	width: 80px;
	margin: 5px 5px;
	padding: 10px 20px;
	text-align: center;
	background-color: rgb(253, 220, 54);
	color: black;
	text-decoration: none;
	border-radius: 5px;
	transition: background-color 0.3s;
}

.btn1:hover {
	background-color: rgba(253, 220, 54, 0.854);
	color: black;
}
</style>
</head>
<body>
	<div class="center">
		<h1 style="color: black;">USER DETAILS</h1>
	</div>
	<table border="1">
		<tr style="background-color: rgb(253, 220, 54); height: 40px;">
			<th style="color: black;">User Id</th>
			<th style="color: black;">Name</th>
			<th style="color: black;">Password</th>
			<th style="color: black;">Phone Number</th>
			<th style="color: black;">Email</th>
			<th style="color: black;" colspan="2">Actions</th>
		</tr>
		<%
		List<UserDetails> list = (ArrayList<UserDetails>) request.getAttribute("list");
		if (list != null) {
			for (UserDetails userDetails : list) {
		%>
		<tr style="color: black; background-color: white; text-align: center;">
			<td><%=userDetails.getUserId()%></td>
			<td><%=userDetails.getUserName()%></td>
			<td><%=userDetails.getUserPassword()%></td>
			<td><%=userDetails.getPhoneNumber()%></td>
			<td><%=userDetails.getEmail()%></td>
			<td><input type="hidden" name="email"
				value="<%=userDetails.getEmail()%>"> <a
				href="update.jsp?editUserName=<%=userDetails.getUserName()%>">
					<button type="button"
						style="border-color: rgb(253, 220, 54); background-color: white">Update</button>
			</a></td>
			<td><form action="UserDetailsServlet" method="get">
					<input type="hidden" name="delete"
						value="<%=userDetails.getEmail()%>">
					<button type="submit"
						style="border-color: rgb(253, 220, 54); background-color: white"
						title="delete">Delete</button>
				</form></td>
		</tr>
		<%
		}
		}
		%>
	</table>
	<br>
	<div style="text-align: center;">
		<form action="login.jsp">
			<button type="submit"
				style="border-color: rgb(253, 220, 54); background-color: rgb(253, 220, 54); width: 117px; height: 37px;"
				title="logout">Back</button>
		</form>
	</div>
</body>
</html>
