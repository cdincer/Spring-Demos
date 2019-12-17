<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>

<!DOCTYPE html>
<html>
<head>
<title>Insert title here</title>
</head>
<body>
<p>Just A Home Page</p>

<hr>
<p>User:<security:authentication property="principal.username"/>
<br><br>
Role(s):<security:authentication property="principal.authorities"/>
 </p>
<hr>



<form:form action="${pageContext.request.contextPath}/logout" method="POST">

<input type="submit" value="Logout">

</form:form>

</body>
</html>