<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form action="processform34" modelAttribute="student">
First Name:<form:input path="firstName" /><br><br>
Last Name:<form:input path="lastName" /><br><br>
Country:<form:select path="country">
<form:options items="${student.countryOptions}" />
<%-- <form:option value="India" label="India" />
<form:option value="France" label="France" />
<form:option value="Germany" label="Germany" /> --%>
</form:select>
<input type="submit" value="submit">
</form:form>
</body>
</html>