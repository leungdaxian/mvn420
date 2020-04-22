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
<%--<form action="${pageContext.request.contextPath}/save" method="post">--%>
    <div class="hezi" style="height:320px;">
        <p>添加新菜</p><br />
        <hr /><br />
        <form action="${pageContext.request.contextPath}/save" method="post" enctype="multipart/form-data">
            <table>
                <tr>
                    <td>号&nbsp;&nbsp;码：</td>
                    <td><input type="text" name="foodId" class="tname" /></td>
                </tr>
                <tr>
                    <td>菜&nbsp;&nbsp;名：</td>
                    <td><input type="text" name="foodName" class="tname" /></td>
                </tr>
                <tr>
                    <td>食&nbsp;&nbsp;材：</td>
                    <td><input type="text" name="remark" class="tname" /></td>
                </tr>
                <tr>
                    <td>价&nbsp;&nbsp;格：</td>
                    <td><input type="text" name="foodPrice" class="tname" /></td>
                </tr>
                <tr>
                    <td>描&nbsp;&nbsp;述：</td>
                    <td><input type="text" name="description"  class="tname"/></td>
                </tr>
                <tr>
                    <td>上传图片：</td>
                    <td><input type="file" name="file" class="tname" /></td>
                </tr>
                <tr>
                    <td colspan="2" align="center">
                        <input type="submit" value="添加" class="btn" />
                    </td>
                </tr>
            </table>
        </form>
    </div>
</body>
</html>
