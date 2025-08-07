<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Câu hỏi ngẫu nhiên</title>
</head>
<body>
<h2>Câu hỏi ngẫu nhiên</h2>

<c:if test="${not empty question}">
    <p><strong>ID:</strong> ${question.id}</p>

    <c:if test="${not empty question.imageUrl}">
        <p><img src="${question.imageUrl}" alt="Hình ảnh câu hỏi" width="300"/></p>
    </c:if>

    <p><strong>Đáp án:</strong> ${question.answer}</p>
</c:if>

<a href="/question">Tải câu hỏi khác</a>
<br>
<a href="/question/add">Thêm câu hỏi mới</a>
</body>
</html>s