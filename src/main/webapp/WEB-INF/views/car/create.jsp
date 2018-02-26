<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style> .error{color:red;}</style>
</head>
<body>

<h1> Add Car</h1>
     <form:form action="${pageContext.request.contextPath }/car/create" method="POST" modelAttribute="carModel">
     
     Car make : <form:input path="make"/><br><form:errors path="make" cssClass="error"/> <br>
     car model : <form:input path="model"/><br><form:errors path="model" cssClass="error"/> <br>
     car color :
     <form:select path="color">
     <form:option value="RED">red</form:option>
     <form:option value="BLACK">black</form:option>
     <form:option value="WHITE">white</form:option>
     <form:option value="YELLOW">yellow</form:option>
    <form:option value="PINK">pink</form:option>
    
     </form:select>
     
     <input type="submit" value="add Car">
     
     </form:form>

</body>
</html>