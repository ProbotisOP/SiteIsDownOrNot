<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<html>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">
<body>



	<br>
	<h2 style="text-align: center;">IS DOWN OR NOT ?</h2>

	<br>
	<br>
	<center>
		<form action="check" method="post">
			SITE : <input type="url" name="site" required="required" placeholder="including http/https"> 
			<input type="submit"
				value="submit">
		</form>

		<br>

	</center>

</body>
</html>


