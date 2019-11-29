<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>    
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Records</title>
</head>
<body>
<form:form action="processForm" modelAttribute="student">
First name:<form:input path="firstName" />
<br><br>
Last name:<form:input path="lastName"/>
<br><br>
<input type="submit" value="Submit"/>
</form:form>
</body>
</html>