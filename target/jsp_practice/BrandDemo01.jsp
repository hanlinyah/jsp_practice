<%@ page import="pojo.Brand" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: asus
  Date: 2023/3/16
  Time: 下午 03:34
  To change this template use File | Settings | File Templates.
--%>
<%
    System.out.println("jsp處理與展示數據");
    List<Brand> brands=new ArrayList<>();
    brands.add(new Brand(1,"Meta","MetaSoft",20,"So soft..",1));
    brands.add(new Brand(2,"Doo","Doodle",2,"Just Doo it..",0));
    brands.add(new Brand(3,"MaMa","AaLiMaMa",10,"Ur Best Choice..",1));
%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Demo01_jsp</title>
</head>
<body>
<input type="button" value="新增"><br>
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
    <%
        for (int i = 0; i <brands.size() ; i++) {
            Brand brand=brands.get(i);
    %>
        <tr align="center">
        <td><%=brand.getId()%></td>
        <td><%=brand.getBrandName()%></td>
        <td><%=brand.getCompanyName()%></td>
        <td><%=brand.getOrdered()%></td>
        <td><%=brand.getDescription()%></td>
        <td><%=brand.getStatus() == 1?"啟用":"禁用"%></td>
        <td><a href="#">修改</a> <a href="#">刪除</a></td>
    </tr>
    <%
        }
    %>
<%--    <tr align="center">--%>
<%--        <td>1</td>--%>
<%--        <td>Meta</td>--%>
<%--        <td>MetaSoft</td>--%>
<%--        <td>20</td>--%>
<%--        <td>So soft..</td>--%>
<%--        <td>啟用</td>--%>
<%--        <td><a href="#">修改</a> <a href="#">刪除</a></td>--%>
<%--    </tr>--%>
<%--    <tr align="center">--%>
<%--        <td>2</td>--%>
<%--        <td>Doo</td>--%>
<%--        <td>Doodle</td>--%>
<%--        <td>2</td>--%>
<%--        <td>Just Doo it..</td>--%>
<%--        <td>禁用</td>--%>
<%--        <td><a href="#">修改</a> <a href="#">刪除</a></td>--%>
<%--    </tr>--%>
<%--    <tr align="center">--%>
<%--        <td>3</td>--%>
<%--        <td>MaMa</td>--%>
<%--        <td>AaLiMaMa</td>--%>
<%--        <td>10</td>--%>
<%--        <td>Ur Best Choice..</td>--%>
<%--        <td>啟用</td>--%>
<%--        <td><a href="#">修改</a> <a href="#">刪除</a></td>--%>
<%--    </tr>--%>
</table>
<hr>
<a href="index.jsp">回測試首頁</a><br>
</body>
</html>
