<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<%@page import="org.springframework.ui.Model"%>
<%@page import="com.udemy.springmvc.mvc.Student"%>
<html>


<head>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/my-test.css">
    <script src="${pageContext.request.contextPath}/resources/js/simple-test.js"></script>
</head>

<body>
<h2>Spring Demo - Show Form</h2>

	<br/>
	Student's First Name: ${student.firstName}
	<br/>
	Student's Last Name: ${student.lastName}  
	<br/>
	Student's Country: ${student.country}  
	<br/>	
	Student's Favorite Language: ${student.favoriteLanguage}  
	<br/>
	
	<c:forEach var="temp" items="${student.operatingSystems}">
		<c:out value="${temp}"></c:out>
	</c:forEach>
	
	<!-- %
		Student student=(Student) request.getAttribute("student");
		for(String os:student.getOperatingSystems())
		{
			out.println(os);
		}
	% -->
	
	<br/><br/><br/>
	
	<input type="button" onclick="doSomeWork()" value="Click Me"/>
	<img src="${pageContext.request.contextPath}/resources/images/spring-logo.png" />	
	
</body>
</html>