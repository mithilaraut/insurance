<%@ taglib uri="http://java.sun.com/jsp/jstl/core" 
prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" 
prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" 
prefix="form" %>
<%@ page session="true" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:url var="addAction" value="/vehicles/plans/calculate" ></c:url>
<form:form action="${addAction}" modelAttribute="premium">

<h3>Your Calculated Premium Amount is</h3>
<%= session.getAttribute("premium")%>


<input type="submit"
					value="<spring:message 
					text="Click here to pay "/>" />
	
	
	</form:form>
</body>
</html>