<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<%@page import="org.springframework.ui.Model"%>
<%@page import="com.udemy.hvalidation.Customer"%>
<html>


<head>

</head>

<body>
<h2>Spring Demo - Show Form</h2>

	<br/>
	First Name: ${customer.firstName}
	<br/>
	Last Name: ${customer.lastName}  
	<br/>
	

	
	<br/><br/><br/>
	
</body>
</html>