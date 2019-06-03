<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2019/4/10
  Time: 15:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>


</head>
<body>
<form action="test/Action_psave" method="post" >
 订单编号：  <input type="text" name="particular.indentid" value="${indent.indentid}"><br/>
  商品id： <input type="text" name="particular.productid"><br/>
  商品名称： <input type="text" name="particular.productname"><br/>
  单价： <input type="text" name="particular.price"><br/>
   购买数量： <input type="text" name="particular.quantity"><br/>
    <input type="submit" value="添加"><br>
</form>
</body>
</html>
