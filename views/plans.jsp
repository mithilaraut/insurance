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
<h1>
	
</h1>
<c:url var="addAction" value="/vehicles/plans/adds" ></c:url>
<form:form action="${addAction}" modelAttribute="plan">

<form:label path="planType">
				<spring:message text="Choose Your Type: "/>
			</form:label>
			<form:select path="planType" items="${plantypes}"/>
			<form:errors path="planType" cssClass="errors"></form:errors>
<br><br>	  


<form:label path="planYear">
				<spring:message text="Choose Year of Plan: "/>
			</form:label>
			<form:select path="planYear" items="${planyears}"/>
			<form:errors path="planYear" cssClass="errors"></form:errors>
<br><br>	  


	<input type="submit"
					value="<spring:message 
					text="Select Plan"/>" />

</form:form>
</body>
</html>