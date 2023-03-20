<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="jakarta.tags.core" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Update Brand</title>
</head>
<body>
<%
    System.out.println("jsp接手資料庫數據進行回顯");
%>
<h3>修改品牌</h3>
<form action="./UpdateServlet" method="post">
<%--  隱藏提交的ID  --%>
    <input type="hidden" name="id" value="${brand.id}"><br>
    品牌名稱：<input name="brandName" value="${brand.brandName}"><br>
    企業名稱：<input name="companyName" value="${brand.companyName}"><br>
    訂單：<input name="ordered" value="${brand.ordered}"><br>
    品牌介紹：<textarea name="description" rows="5" cols="20" >${brand.description}</textarea><br>
    狀態：
    <c:if test="${brand.status==1}">
        <input type="radio" name="status" value="0" >禁用
        <input type="radio" name="status" value="1" checked>啟用<br>
    </c:if>

    <c:if test="${brand.status==0}">
        <input type="radio" name="status" value="0" checked>禁用
        <input type="radio" name="status" value="1">啟用<br>
    </c:if>

    <input type="submit" value="提交">
</form>
<hr>
<a href="./selectAllServlet">取消修改</a><br>
</body>
</html>