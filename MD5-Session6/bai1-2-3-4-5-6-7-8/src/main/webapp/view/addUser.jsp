<%--
  Created by IntelliJ IDEA.
  User: LENOVO
  Date: 2025/08/06
  Time: 17:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h2>Thêm người dùng mới</h2>
<form action="/users" method="post">
    <label for="name">Tên người dùng:</label><br>
    <input type="text" id="name" name="name" required><br><br>

    <label for="age">Tuổi:</label><br>
    <input type="number" id="age" name="age" required><br><br>

    <label for="birthday">Ngày sinh:</label><br>
    <input type="date" id="birthday" name="birthday"><br><br>

    <label for="email">Email:</label><br>
    <input type="email" id="email" name="email"><br><br>

    <label for="phone">Số điện thoại:</label><br>
    <input type="tel" id="phone" name="phone"><br><br>

    <button type="submit">Lưu</button>
</form>

<br>
<a href="/users">Quay lại danh sách</a>
</body>
</html>
