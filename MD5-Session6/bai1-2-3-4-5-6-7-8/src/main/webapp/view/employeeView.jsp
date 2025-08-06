<%--
  Created by IntelliJ IDEA.
  User: LENOVO
  Date: 2025/08/06
  Time: 19:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h2>Danh sách nhân viên</h2>
<table border="1">
    <thead>
    <tr>
        <th>STT</th>
        <th>ID</th>
        <th>Tên</th>
        <th>Email</th>
        <th>Vị trí</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="employee" items="${employeeList}" varStatus="loop">
        <tr>
            <td>${loop.index + 1}</td>
            <td>${employee.id}</td>
            <td>${employee.name}</td>
            <td>${employee.email}</td>
            <td>${employee.position}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>

<br>
<a href="addEmployee.jsp">Thêm nhân viên mới</a>
</body>
</html>
