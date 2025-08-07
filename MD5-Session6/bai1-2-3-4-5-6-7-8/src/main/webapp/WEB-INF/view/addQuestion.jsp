<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Thêm câu hỏi mới</title>
</head>
<body>
<h2>Thêm câu hỏi mới</h2>

<form action="/question" method="post">
    <label for="imageUrl">URL hình ảnh:</label><br>
    <input type="text" id="imageUrl" name="imageUrl"><br><br>

    <label for="answer">Đáp án:</label><br>
    <input type="text" id="answer" name="answer" required><br><br>

    <button type="submit">Lưu câu hỏi</button>
</form>

<a href="/question">Quay lại danh sách câu hỏi</a>
</body>
</html>