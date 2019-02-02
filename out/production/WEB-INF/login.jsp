<%--
  Created by IntelliJ IDEA.
  User: nickolaykartaviy
  Date: 2019-02-02
  Time: 09:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1><p>Welcome to your random number generator</p></h1>
<form action='Randomizer' method='post'>
    <label for="numb"><b>Max number</b></label>
    <input type="number" min="1" placeholder="Enter Number" name="nmb" required>

    <label for="numb-count"><b>Amount of numbers</b></label>
    <input type="number" min="1" placeholder="Enter amount of numbers" name="nmb_cnt" required>
    <button type="submit">Generate</button>
</form>
</body>
</html>
