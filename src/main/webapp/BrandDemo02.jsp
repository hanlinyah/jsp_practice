<%--JSTL 3.0 引入標籤庫--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Demo02_Servlet+JSTL</title>
</head>
<body>
<input type="button" value="新增"><br>
<%
    System.out.println("jsp接手展示數據");
%>
<hr>
<table border="1" cellspacing="0" width="800">
    <tr>
        <th>序號</th>
        <th>品牌名稱</th>
        <th>企業名稱</th>
        <th>訂單</th>
        <th>品牌介紹</th>
        <th>狀態</th>
        <th>操作</th>
    </tr>

<%--        <c:forEach items="${brands}" var="brand">--%>
    <c:forEach items="${brands}" var="brand" varStatus="status">

        <tr align="center">
<%--            <td>${brand.id}</td>--%>
            <td>${status.count}</td>
            <td>${brand.brandName}</td>
            <td>${brand.companyName}</td>
            <td>${brand.ordered}</td>
            <td>${brand.description}</td>

            <c:if test="${brand.status==1}">
                <td>啟用</td>
            </c:if>

            <c:if test="${brand.status==0}">
                <td>禁用</td>
            </c:if>
            <td><a href="#">修改</a> <a href="#">刪除</a></td>
        </tr>

    </c:forEach>

</table>
<hr>
<a href="index.jsp">回測試首頁</a><br>
</body>
</html>
