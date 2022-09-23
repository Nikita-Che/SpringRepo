<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>

<body>

<h2>Dear employee, Please enter your details</h2>

<br>
<br>


<form:form action="showDetails" modelAttribute="employee">

    Name <form:input path="name"/>
    <form:errors path="name"/>
    <br>
    <br>
    Surname <form:input path="surname"/>
    <form:errors path="surname"/>
    <br>
    <br>
    Salary <form:input path="salary"/>
    <form:errors path="salary"/>
    <br>
    <br>
    Department <form:select path="department">
    <form:options items="${employee.departments}"/>
    </form:select>
    <br>
    <br>

    which car do you want?
    <form:radiobuttons path="carBrand" items="${employee.carBrands}"/>
<%--    BMV <form:radiobutton path="carBrand" value="BMW"/>--%>
<%--    AUDI <form:radiobutton path="carBrand" value="AUDI"/>--%>
<%--    MB <form:radiobutton path="carBrand" value="MERSEDES BENS"/>--%>
    <br>
    <br>
    Foreign language(s)
<%--    EN <form:checkbox path="languages" value="Eanglish"/>--%>
<%--    RU <form:checkbox path="languages" value="Russian"/>--%>
<%--    DE <form:checkbox path="languages" value="German"/>--%>

    <form:checkboxes path="languages" items="${employee.languageList}"/>
    <br>
    <br>
    PhoneNumber <form:input path="phoneNumber"/>
    <form:errors path="phoneNumber"/>
    <br>
    <br>
    <input type="submit" value="OK">



</form:form>


<%--<form action="showDetails" method="get">--%>
<%--    <input type="text" name="employeeName"--%>
<%--           placeholder="Write your name"/>--%>
<%--    <input type="submit"/>--%>


<%--</form>--%>

</body>

</html>