<!DOCTYPE html>
<html>


<head>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/my-test.css">
    <script src="${pageContext.request.contextPath}/resources/js/simple-test.js"></script>
</head>

<body>
<h2>Spring Demo - Show Form</h2>

	<br/>
	Student name: ${param.name}
	<br/>
	Student surname: ${param.surname}  
	<br/>
	My String is: ${myString} 	
	
	<br/><br/><br/>
	
	<input type="button" onclick="doSomeWork()" value="Click Me"/>
	<img src="${pageContext.request.contextPath}/resources/images/spring-logo.png" />	
	
</body>
</html>