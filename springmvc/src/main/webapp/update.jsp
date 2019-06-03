<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2019/4/10
  Time: 9:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/update.stu">
    订单编号：   <input type="text" name="indentid" value="${list.indentid}" readonly><br>
    下单时间： <input type="date" name="time" value="${list.time}"><br>
    用户id  <input type="text" name="userid" value="${list.userid}"><br>
    总金额 <input type="text" name="money" value="${list.money}"><br>
    总数量 <input type="text" name="nomber" value="${list.nomber}"><br>
    <input type="submit" value="修改"><br>
</form>
</body>
</html>
