<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Liste des Clients</title>
</head>
<body>
	
		<c:forEach items="${clients}" var="client">
			<pre>
				${client.idClient} 
				${client.nomCompletClient} 
				${client.adresseClient} 
				${client.numTelephoneClient}
			</pre>
		</c:forEach>
	
	
</body>
</html>