<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2023/05/10
  Time: 19:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Upload file</title>
</head>
<body>
<h1>Đây là trang Hello</h1>
<h2>${id}</h2>
<h2>${name}</h2>
<h2>Form Upload file</h2>
<form action="<%=request.getContextPath()%>/upload" method="post" enctype="multipart/form-data">
    <input type="file" name="image">
    <button type="submit">Upload</button>
</form>
</body>
</html>
