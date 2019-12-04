<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 

<!DOCTYPE html>
<html>

	<body>
		<h2>Spring Demo - Input Form</h2>
		<form:form action="processModelForm" method="GET" modelAttribute="student">
		
			<form:input type="text" path="firstName" placeHolder="What's your name"/>
			
			<br/><br/>
			
			<form:input type="text" path="lastName" placeHolder="What's your surname"/>
			
			<br/><br/>
			
			<form:select path="country"> 
				<form:options items="${countryOptions}" ></form:options>
			</form:select>
	
			<br/><br/>
	
			Java<form:radiobutton path="favoriteLanguage" value="Java"></form:radiobutton>
			C++<form:radiobutton path="favoriteLanguage" value="C++"></form:radiobutton>
			Ruby<form:radiobutton path="favoriteLanguage" value="Ruby"></form:radiobutton>
	
			<br/><br/>
			Operating System:
			<br/><br/>
			
			Linux<form:checkbox value="Linux" path="operatingSystems"/>
			Windows<form:checkbox value="Windows" path="operatingSystems"/>
			MacOS<form:checkbox value="MacOS" path="operatingSystems"/>
			
			
			<br/><br/>
	
			<input type="submit"/>
		
		</form:form>
	</body>
</html>

	