<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>USER REGISTRATION</title>
</head>
<body>

	<h2 style="color: red; text-align: center">USER REGISTRATION FORM
	</h2>
	<form:form action="regUser" method="POST" modelAttribute="user">

USERNAME::<form:input path="userName" /><br>
PASSWORD::<form:password path="passWord" /><br>
Email::<form:input path="email" /><br>

		<input type="Submit" value="REGISTER" />

	</form:form>
</body>
</html>