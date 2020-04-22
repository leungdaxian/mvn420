<%--
  Created by IntelliJ IDEA.
  User: LENOVO
  Date: 2020/4/13
  Time: 10:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/update" method="post">
    <p>
        <input type="hidden" name="foodId" value="${food.foodId}">
    </p>

    <p>菜名：
        <input type="text" name="foodName" value="${food.foodName}">
    </p>

    <p>材料：
        <input type="text" name="remark" value="${food.remark}">
    </p>

    <p>价格：
        <input type="text" name="foodPrice" value="${food.foodPrice}">
    </p>

    <p>描述：
        <input type="text" name="description" value="${food.description}">
    </p>

    <p>图片：
        <input type="text" name="foodImage" value="${food.foodImage}">
    </p>

    <p>
        <input type="submit" name="btn" value="修改">
    </p>
</form>
</body>
</html>
