<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: LENOVO
  Date: 2025/08/06
  Time: 17:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Danh sách người dùng</h2>
<table border="1">
  <thead>
  <tr>
    <th>STT</th>
    <th>ID</th>
    <th>Tên</th>
    <th>Tuổi</th>
    <th>Ngày sinh</th>
    <th>Email</th>
    <th>Số điện thoại</th>
  </tr>
  </thead>
  <tbody>
  <c:forEach items="${users}"  var="user" varStatus="loop">
    <tr>
      <td>${loop.index + 1}</td>
      <td>${user.id}</td>
      <td>${user.name}</td>
      <td>${user.age}</td>
      <td>${user.birthday}</td>
      <td>${user.email}</td>
      <td>${user.phone}</td>
    </tr>
  </c:forEach>
  </tbody>
</table>

<br>
<a href="addUser.jsp">Thêm người dùng mới</a>
</body>
</html>
