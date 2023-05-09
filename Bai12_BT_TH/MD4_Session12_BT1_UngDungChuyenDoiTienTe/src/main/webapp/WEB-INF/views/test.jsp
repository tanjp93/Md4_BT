<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 5/6/2023
  Time: 10:40 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<p>Nhập số tiền</p>
<form action="/test" method="post">
    <input type="number" name="money">
    <select name="convert" id="">
        <option value="VND">VND</option>
        <option value="USD">USD</option>
    </select>
    <input type="submit" value="convert">
    <p>Kết quả: ${s}</p>
</form>

</body>
</html>
