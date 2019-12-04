<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 

<!DOCTYPE html>
<html>
 <head>
 	<style>
		.error{color:red}
	</style>
 </head>

	<body>
		<h2>Spring Demo - Input Form</h2>
		<form:form action="processModelForm" method="GET" modelAttribute="customer">
		
			<form:input type="text" path="firstName" placeHolder="What's your name"/>
			
			<br/><br/>
			
			<form:input type="text" path="lastName" placeHolder="What's your surname"/>
			<form:errors path="lastName" cssClass="error"/>
			
			<br/><br/>
	
	
			<input type="submit"/>
		
		</form:form>
	</body>
</html>

	