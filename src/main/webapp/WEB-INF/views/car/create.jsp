<%@ page language="java" contentType="text/html; UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; UTF-8">
<style>
	.error{
		color: red;
	}
</style>
<title>Insert title here</title>
</head>
<body>
	<h1>Add Car</h1>
	
	<form:form action="${pageContext.request.contextPath}/car/create"
				method="POST"
				modelAtribute="carModel">
		Car make: <form:input path="make"/><form:errors path="make" class="error"/> <br/>
		Car model: <form:input path="model"/><form:errors path="model" class="error"/> <br/>
		Car collor: <form:select path="color">
			<form:option value="RED">RED</form:option> <br/>
			<form:option value="BLACK">BLACK</form:option> <br/>
			<form:option value="BLUE">BLUE</form:option> <br/>
			<form:option value="WHITE">WHITE</form:option> <br/>
			<form:option value="YELOW">YELOW</form:option> <br/>
			<form:option value="PINK">PINK</form:option> <br/>
		</form:select>	
		
		<input type="submit" value="Add car">
		
	</form:form>
</body>
</html>