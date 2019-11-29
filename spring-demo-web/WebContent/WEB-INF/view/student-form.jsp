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
Country:
<form:select path="country">
<form:options items="${student.countryOptions}" />
</form:select>
<br><br>
Favourite Programming Language:
Java<form:radiobutton path="favouriteLanguage" value="Java"/>
C#<form:radiobutton path="favouriteLanguage" value="C#"/>
PHP<form:radiobutton path="favouriteLanguage" value="PHP"/>
Perl<form:radiobutton path="favouriteLanguage" value="Perl"/>
<br><br>
Operating Systems:
Linux<form:checkbox path="operatingSystems" value="Linux"/>
macOS<form:checkbox path="operatingSystems" value="macOS"/>
Windows<form:checkbox path="operatingSystems" value="Windows"/>

<input type="submit" value="Submit"/>
</form:form>
</body>
</html>