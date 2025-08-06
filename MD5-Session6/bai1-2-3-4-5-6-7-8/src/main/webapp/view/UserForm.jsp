<%--
  Created by IntelliJ IDEA.
  User: LENOVO
  Date: 2025/08/06
  Time: 18:14
  To change this template use File | Settings | File Templates.
--%>
<%--@elvariable id="user" type=""--%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h2>Thêm người dùng mới</h2>

<form:form method="post" modelAttribute="user">
    <label>Tên người dùng:</label><br>
    <form:input path="name"/>
    <form:errors path="name" cssClass="error"/><br><br>

    <label>Tuổi:</label><br>
    <form:input path="age" type="number"/>
    <form:errors path="age" cssClass="error"/><br><br>

    <label>Ngày sinh:</label><br>
    <form:input path="birthday" type="date"/>
    <form:errors path="birthday" cssClass="error"/><br><br>

    <label>Email:</label><br>
    <form:input path="email" type="email"/>
    <form:errors path="email" cssClass="error"/><br><br>

    <label>Số điện thoại:</label><br>
    <form:input path="phone" type="tel"/>
    <form:errors path="phone" cssClass="error"/><br><br>

    <button type="submit">Lưu</button>
</form:form>

<style>
    .error {
        color: red;
        font-size: 0.9em;
    }
</style>
</body>
</html>
