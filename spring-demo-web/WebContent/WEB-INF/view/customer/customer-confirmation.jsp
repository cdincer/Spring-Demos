<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>    

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer Confirmation</title>
</head>
<body>
Customer recording is confirmed: ${customer.firstName} ${customer.lastName}
Free Passes:${customer.freePasses}
Postal Code:${customer.postalCode}
</body>
</html>