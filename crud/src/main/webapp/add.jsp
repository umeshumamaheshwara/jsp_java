<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add</title>
</head>
<body>
	<div align="center">
		<h1>Add Record</h1>

		<form action="/crud/create" method="post">
			Name: <input type="text" name="name"><br>
			<br> Email: <input type="email" name="email"><br>
			<br> Mobile: <input type="number" name="mobile"><br>
			<br> Age: <input type="number" name="age"><br>
			<br>
			<button>Add</button>
		</form>
		<br> <a href="/crud"><button>Back</button></a>
	</div>
</body>
</html>
