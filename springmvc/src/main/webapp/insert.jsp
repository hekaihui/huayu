<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2019/4/9
  Time: 17:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/hehe.stu" method="post" >
   订单编号:<input type="text" name="indentid"><br>
   下单时间:<input type="date" name="time"><br>
   用户id:  <input type="text" name="userid"><br>
   总金额:  <input type="text" name="money"><br>
   总数量:  <input type="text" name="nomber"><br>
    <input type="submit" value="添加"><br>
</form>
<c:forEach items="${errors}" var="e">
    ${e.defaultMessage}<br>
</c:forEach>
</body>
</html>
