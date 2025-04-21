<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update</title>
</head>
<body>
	<div align="center">
		<h1>Update Record</h1>

		<form action="/crud/update" method="post">
			Id: <input type="text" name="id"><br>
			<br> Name: <input type="text" name="name"><br> <br>
			Email: <input type="email" name="email"><br> <br>
			Mobile: <input type="number" name="mobile"><br> <br>
			Age: <input type="number" name="age"><br> <br>
			<button>Update</button>
		</form>
		<br> <a href="/crud"><button>Back</button></a>
	</div>
</body>
</html>