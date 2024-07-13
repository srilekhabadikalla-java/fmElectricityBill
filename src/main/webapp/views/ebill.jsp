<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>

<body>

<h1 style="color:red">Electricity Bill</h1>
<form:form action="/bill" method="POST" modelAttribute="bill" >

<table>

<tr>
<td>Customer Id:</td>
<td><form:input path="id"/></td>
</tr>

<tr>
<td>Customer Name:</td>
<td><form:input path="name"/></td>
</tr>

<tr>
<td>Current Reading :</td>
<td><form:input path="cr"/></td>
</tr>

<tr>
<td>Previous Reading :</td>
<td><form:input path="pr"/></td>
</tr>

<tr>
<td> <input type="submit" value="Print Bill"></td>
 </tr>
 
</table>

</form:form>
</body>
</html>