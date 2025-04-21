<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
</head>
<body>
	<div align="center">
		<h1>Crud using MVC</h1>
		<h3 style="color: green">${success}</h3>
		<h3 style="color: red">${failure}</h3>
		<a href="/crud/create"><button>Create</button></a><br> <br>
		<a href="/crud/read"><button>Read</button></a><br> <br> <a
			href="/crud/update"><button>Update</button></a><br> <br> <a
			href="/crud/delete"><button>Delete</button></a><br> <br>
	</div>
</body>
</html>
