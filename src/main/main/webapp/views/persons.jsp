<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Person</title>
</head>
<body>
	<h1>Persons</h1>
	<table>
		<tr>
			<td>${persons.getFirstName}${person.getLastName}</td>
			<td>${persons.getEmail}</td>
			<td>
	</table>
	<form id="PersonsId" name="persons" method="Get">
		<input id="submit" type="submit" value="persons">
	</form>
</body>
</html>