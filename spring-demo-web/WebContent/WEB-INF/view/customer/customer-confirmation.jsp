<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>    

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer Confirmation</title>
</head>
<body>
Thank you for registering !
<br>
<br>
Customer recording is confirmed: ${customer.firstName} ${customer.lastName}
<br>
Free Passes:${customer.freePasses}
<br>
Postal Code:${customer.postalCode}
<br>
Product Code:${customer.productCode}

</body>
</html>