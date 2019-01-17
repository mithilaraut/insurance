<%@ taglib uri="http://java.sun.com/jsp/jstl/core" 
prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" 
prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" 
prefix="form" %>
<%@ page session="true" %>

<html>
<head>
<!-- <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
 $(document).ready(function()
         {
         	var selectedText2 = $("#SelectedCountryId:selected").text();
         } -->
         
	<title>Vehicle Page</title>
	<link href="${pageContext.request.contextPath}/WEB-INF/styles/mystyle.css" rel="stylesheet" />
	<style>
	@import url(https://fonts.googleapis.com/css?family=Roboto:300);
.error {
	color: red;
	font-style: italic;
	font-weight: bold;
}
body
{
background:url(https://designshack.net/wp-content/uploads/gradient-background.jpg);
 background-repeat: no-repeat;
  background-size: 1500px 1500px;
}
h1 {
  color: rgb(103, 167, 153);
  margin-left: 40px;
  text-align:center;
  font-size: 2em;
    color: #fff;
    font-weight: 100;
    letter-spacing: 3px;
    font-family: 'Roboto', sans-serif;
} 

#col2{
text-align: right;
} 
 .tab{
border: 1px solid black;
background-color:grey;
 
  z-index: 1;
  background: rgb(117, 112, 112);
  max-width: 600px;
  margin: 0 auto 100px;
  padding: 80px;
/*   text-align: center; */
  box-shadow: 0 0 20px 0 rgba(0, 0, 0, 0.2), 0 5px 5px 0 rgba(0, 0, 0, 0.24);
 font-family: "Roboto", sans-serif;
  width: 85%;
    margin: 1.5em auto;
  color: #b3b3b3;
  font-size: 16px;
	}
</style>
</head>
<body>
<h1>
	Add vehicle details
</h1>
<c:url var="addAction" value="/vehicles/add" ></c:url>
<br>
<form:form action="${addAction}" modelAttribute="vehicle">
<div class="tab">
		<form:label path="vehicleId"  id="col1">
			<spring:message text="Vehicle Id"/>
			</form:label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			<form:input path="vehicleId"  id="col2"/>
			<form:errors path="vehicleId" cssClass="errors"></form:errors>
<br><br>	


<form:label path="vehicleType">
				<spring:message text="Select type of Vehicle"/>
			</form:label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			<form:select path="vehicleType"  items="${vehicletype}" />
		<%-- 	<form:hidden path="true"/> --%>
			<%-- <form:option selected= ></form:option> --%>
			<form:errors path="vehicleType" cssClass="errors"></form:errors>
<br><br>

<%-- <c:set var="vehicleType" value="2w"></c:set>



<form:label path="brand">
				<spring:message text="Vehicle Brand"/>
			</form:label>			
			<c:choose>
    <c:when test="${vehicletype == '4w'}">
 <form:select path="brand" items="${fwbrands}"/>
			<form:errors path="brand" cssClass="errors"></form:errors>
    </c:when>
    
    
    <c:otherwise>
      <form:select path="brand" items="${twbrands}"/>
			<form:errors path="brand" cssClass="errors"></form:errors>
    
    </c:otherwise>
</c:choose> --%>
			
			
			
			<%-- 
			
			
	<c:if test="${vehicletype eq type2} ">	
			<form:select path="brand" items="${fwbrands}"/>
			<form:errors path="brand" cssClass="errors"></form:errors>
	</c:if> 
	<c:if test="${vehicletype eq type1} ">	
			<form:select path="brand" items="${twbrands}"/>
			<form:errors path="brand" cssClass="errors"></form:errors>
	</c:if>  --%>
			
			<%-- <c:if test="${vehicletype} eq 2w">
			<form:select path="brand" items="${twbrands}"/>
			<form:errors path="brand" cssClass="errors"></form:errors>
			</c:if> --%>
			
<br><br>	 

<form:label path="brand">
				<spring:message text="Enter Vehicle Brand"/>
			</form:label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			<form:select path="brand" items="${fwbrands}"/>
			<form:errors path="brand" cssClass="errors"></form:errors>
<br><br>	  



<form:label path="model">
<spring:message text="Vehicle Model"/></form:label>	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;	
	<form:select path="model" items="${suzukiModel}"/>
			<form:errors path="model" cssClass="errors"></form:errors>
	<br><br>
	
	
			<form:label path="license">
				<spring:message text="Enter Vehicle License"/>
			</form:label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;

			<form:input path="license" />
			<form:errors path="license" cssClass="errors"></form:errors>
	<br><br>
	
		

<form:label path="purchaseMonth">
				<spring:message text="Enter the month in which vehicle was purchased"/>
			</form:label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			<form:select path="purchaseMonth" items="${pmonth}"/>
			<form:errors path="purchaseMonth" cssClass="errors"></form:errors>
<br><br>	  
	<br><br>
	
	
<form:label path="purchaseYear">
				<spring:message text="Enter the year in which vehicle was purchased"/>
			</form:label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			<form:select path="purchaseYear" items="${pyear}"/>
			<form:errors path="purchaseYear" cssClass="errors"></form:errors>
<br><br>	  
	<br><br>
	
	

			<form:label path="regNumber">
				<spring:message text="Enter Vehicle Registration Number"/>
			</form:label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	
			<form:input path="regNumber" />
			<form:errors path="regNumber" cssClass="errors"></form:errors>
<br><br>
	

			<form:label path="engineNum">
					<spring:message text="Enter Vehicle Engine Number"/>
					
			</form:label>
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			<form:input path="engineNum" />
			<form:errors path="engineNum" cssClass="errors"></form:errors>
<br><br>
		

			<form:label path="ChasisNum">
			<spring:message text="Enter Vehicle Chasis Number"/>
			</form:label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;

			<form:input path="ChasisNum" />
			<form:errors path="ChasisNum" cssClass="errors"></form:errors>
			<br><br>
<div class="custom-file">
Upload Driving license:
  <input type="file" class="custom-file-input" id="customFile">
  <label class="custom-file-label" for="customFile"></label>
</div><br>	<div>
Upload Car Documents:
  <input type="file" class="custom-file-input" id="customFile">
  <label class="custom-file-label" for="customFile"></label>
</div><div><br>
				<input type="submit" 
					value="<spring:message 
					text="Add"/>" />
		</div>
</form:form>
</div></div>
</div>
</div>

<br>



</body>
</html>