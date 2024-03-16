<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1> Welcome to Great Learning!, Please fill the form to SignUp</h1>
<form:form action="saveStudentDetails" 	modelAttribute="emptyStudentObject">

	Roll Number :<form:input path="rno" /> <br>
	
	Name :<form:input path="sname"/> <br>
	
	Per :<form:input path="per"/> <br>
	
	<input type="submit" value="Register">

</form:form>
</body>
</html>