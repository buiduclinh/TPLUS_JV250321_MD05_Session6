<%--
  Created by IntelliJ IDEA.
  User: LENOVO
  Date: 2025/08/06
  Time: 14:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Thêm sản phẩm mới</title>
</head>
<body>
<h2>Thêm sản phẩm mới</h2>
<form action="/products" method="post">
    <label for="name">Tên sản phẩm:</label><br>
    <input type="text" id="name" name="name" required><br><br>

    <label for="price">Giá:</label><br>
    <input type="number" id="price" name="price" step="0.01" required><br><br>

    <label for="description">Mô tả:</label><br>
    <textarea id="description" name="description"></textarea><br><br>

    <button type="submit">Lưu</button>
</form>

<br>
<a href="/products">Quay lại danh sách</a>
</body>
</html>
</body>
</html>
