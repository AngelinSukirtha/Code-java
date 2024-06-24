<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Login</title>
<style>
body {
	background-color: rgb(32, 32, 32);
	color: white;
	margin-top: 50px;
	margin: 0;
}

.container {
	max-width: 400px;
	margin: 50px auto;
	padding: 20px;
	background-color: black;
	border-radius: 8px;
	box-shadow: 0 0 10px rgba(0, 0, 0, 0.5);
}

h2 {
	text-align: center;
	color: white;
}

label {
	display: block;
	margin-bottom: 10px;
	font-weight: bold;
	color: white;
}

input[type="text"], input[type="password"], input[type="email"] {
	width: 100%;
	padding: 10px;
	margin-bottom: 20px;
	border: 1px solid #444;
	border-radius: 5px;
	box-sizing: border-box;
	background-color: #333;
	color: white;
}

button[type="submit"] {
	width: 100%;
	padding: 10px;
	background-color: #007bff;;
	color: white;
	border: none;
	border-radius: 5px;
	cursor: pointer;
	transition: background-color 0.3s;
}

button[type="submit"]:hover {
	background-color: #0056b3;;
}

.register {
	text-align: center;
	margin-top: 20px;
}

.register a {
	color: blue;
	text-decoration: none;
}
</style>
</head>
<body>
	<div class="container">
		<h2>Login</h2>
		<form action="UserDetailsServlet" method="post">
			Email: <input type="email" id="email" name="email"
				pattern="[a-z0-9]+@[a-z]+\.[a-z]{2,}$" required> Password: <input
				type="password" id="userPassword" name="userPassword"
				pattern="[A-z a-z 0-9]{8}" required><input type="hidden"
				name="action" value="login">
			<button type="submit">Login</button>
		</form>
		<div class="register">
			<p>
				Don't have an account? <a href="index.jsp">Register</a>
			</p>
		</div>
	</div>
</body>
</html>
