<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<body>


<h2>Employee INFO</h2>
<br>
<br>

<form:form action="saveEmployee" modelAttribute="employee">
    
    <form:hidden path="id"/>
    
    Name <form:input path="name"/>
    <br>
    <br>
    Surname <form:input path="surname"/>
    <br>
    <br>
    Department <form:input path="department"/>
    <br>
    <br>
    Salary <form:input path="salary"/>
    <br>
    <br>
    <br>

    <input type="submit" value="OKE">

</form:form>


</body>


</html>