<%@ page import="java.util.List" %>
<%@ page import="org.lyx.pojo.FoodInfo" %><%--
  Created by IntelliJ IDEA.
  User: 44401
  Date: 2020/4/15
  Time: 11:16
  To change this template use File | Settings | File Templates.
<%--
  Created by IntelliJ IDEA.
  User: 44401
  Date: 2020/4/11
  Time: 16:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <link href="css/find.css" rel="stylesheet"/>
    <%--<script type="text/javascript" src="js/jquery-3.4.1.js"></script>--%>
    <script type="text/javascript">
        function funDel(id) {
            if(window.confirm("您确定要删除吗？")){
                window.location="delete?foodId="+id;
            }
        }
    </script>
</head>
<body>
<div class="dv">
    <a href="insert.jsp">添加</a><p/>
    <table border="1">
        <caption><h2>菜品基本信息</h2></caption>
        <tr>
            <td>编号</td>
            <td>菜名</td>
            <td>材料</td>
            <td>价格</td>
            <td>描述</td>
            <td>图片</td>
        </tr>
        <c:forEach var="food" items="${pageInfo.list}">
            <tr>
                <td>${food.foodId}</td>
                <td>${food.foodName}</td>
                <td>${food.remark}</td>
                <td>${food.foodPrice}</td>
                <td>${food.description}</td>
                <td>${food.foodImage}</td>
                <td>
                    <a href="${pageContext.request.contextPath}/find?foodId=${food.foodId}">详情</a>
                    <a href="${pageContext.request.contextPath}/fupdate?foodId=${food.foodId}">修改</a>
                    <a href="javascript:funDel(${food.foodId})">删除</a></td>
            </tr>
        </c:forEach>



    </table>
    <p>
    第${pageInfo.pageNum}/${pageInfo.pages}页,总共${pageInfo.total}条&nbsp;

    <a href="list?pageCurrent=1">首页</a>&nbsp;
    <a href="list?pageCurrent=${pageInfo.prePage}">上一页</a>&nbsp;

        <c:forEach var="i" begin="1" end="${pageInfo.pages}">
            <a href="list?pageCurrent=${i}">${i}</a>&nbsp;
        </c:forEach>

    <a href="list?pageCurrent=${pageInfo.nextPage}">下一页</a>&nbsp;
    <a href="list?pageCurrent=${pageInfo.pages}">尾页</a>&nbsp;


</p>
</div>
</body>
</html>
