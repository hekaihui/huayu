<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2019/4/25
  Time: 10:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <meta http-equiv="content-type" content="text/html" charset="UTF-8">
</head>
<body style="background: url(timg.jpg)">
<h1 align="center"  style="">
${msg}
     <form action="/login.stu">
        用户： <input type="text" name="name"><br>
        密码： <input type="text" name="password"><br>
         <input type="submit" value="登录">
     </form></h1>
</body>
</html>
