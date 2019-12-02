<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Record Confirmation</title>
</head>
<body>
The student recording is confirmed: 
<br><br>
First Name:${student.firstName} 
<br><br>
Last Name:${student.lastName}
<br><br>
Student's Country:${student.country}
<br><br>
Favourite Language:${student.favouriteLanguage} 
<br><br>
Operating Systems:
<ul>
<c:forEach var="temp" items="${student.operatingSystems}">
<li>${temp}</li>
</c:forEach>
</ul>
</body>
</html>