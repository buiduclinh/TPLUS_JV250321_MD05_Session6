<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Danh sách sản phẩm</title>
</head>
<body>
<h2>Danh sách sản phẩm</h2>
<table border="1">
    <thead>
    <tr>
        <th>STT</th>
        <th>ID</th>
        <th>Tên</th>
        <th>Giá</th>
        <th>Mô tả</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="product" items="${products}" varStatus="loop">
        <tr>
            <td>${loop.index + 1}</td>
            <td>${product.id}</td>
            <td>${product.name}</td>
            <td>${product.price}</td>
            <td>${product.description}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>

<br>
<a href="addProduct.jsp">Thêm sản phẩm mới</a>
</body>
</html>