<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>First View</title>
<link type="text/css"rel="stylesheet" 
href="${pageContext.request.contextPath}/resources/css/style.css"/>
</head>
<body>

<div id="wrapper">
<div id="header">
<h2> CRM- Customer Relationship Manager</h2>
</div>
</div>

<div id="container">
<div id="content">
<input type="button" value="Add Customer" onclick="window.location.href='showFormForAdd'"
class="add-button"
/>
<table>
<tr>
<th>First Name</th>
<th>Last Name</th>
<th>Email</th>
<th>Action</th>
</tr>
<c:forEach var="tempCustomer" items="${customers}">
<!-- UPDATE STUFF -->
<c:url var="updateLink" value="/customer/showFormForUpdate">
<c:param name="customerId" value="${tempCustomer.id}"/>
</c:url>

<!--  DELETE STUFF -->
<c:url var="deleteLink" value="/customer/delete">
<c:param name="customerId" value="${tempCustomer.id}"/>
</c:url>

<tr>
<td>${tempCustomer.firstName}</td>
<td>${tempCustomer.lastName}</td>
<td>${tempCustomer.email}</td>
<td>
<a href="${updateLink}">Update</a> |
<!--  JAVASCRIPT DELETE CONFIRMATION -->

<a href="${deleteLink}" onclick="if(!(confirm('Are you sure you want to delete this customer ?'))) return false"


>Delete</a> 
</td>
</tr>
</c:forEach>

</table>


</div>
</div>

</body>
</html>