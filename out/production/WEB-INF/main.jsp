<%--
  Created by IntelliJ IDEA.
  User: nickolaykartaviy
  Date: 2019-02-02
  Time: 09:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action='Login' method='post'>
    <div class="container">
        <label for="login"><b>Username</b></label>
        <input type="text" placeholder="Enter Username" name="uname" required>

        <label for="password"><b>Password</b></label>
        <input type="password" placeholder="Enter Password" name="psw" required>

        <button type="submit">Login</button>
    </div>
</form>
</body>
</html>
