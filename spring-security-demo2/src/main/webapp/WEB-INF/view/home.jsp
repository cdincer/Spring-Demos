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
<p>
<a href="${pageContext.request.contextPath}/leaders">Managers Page</a>
(Only for Managers)
</p>

<p>
<a href="${pageContext.request.contextPath}/admins">Admins Page</a>
(Only for Managers)
</p>


<form:form action="${pageContext.request.contextPath}/logout" method="POST">

<input type="submit" value="Logout">

</form:form>

</body>
</html>