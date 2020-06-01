<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 01/06/2020
  Time: 17:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
  <head>
    <title>Create a new employee</title>
  </head>
  <body>
  <h3>Welcom, Enter the employee details</h3>
  <form:form method="post" action="/result" modelAttribute="employee">
    <table>
      <tr>
        <td><form:label path="id">Employee ID:</form:label></td>
        <td><form:input path="id"/></td>
      </tr>
      <tr>
        <td><form:label path="name">Employee's name:</form:label></td>
        <td><form:input path="name"/></td>
      </tr>
      <tr>
        <td><form:label path="contactNumber">Contact's number:</form:label></td>
        <td><form:input path="contactNumber"/></td>
      </tr>
      <tr>
        <td><input type="submit" value="Submit"></td>
      </tr>
    </table>
  </form:form>
  </body>
</html>
