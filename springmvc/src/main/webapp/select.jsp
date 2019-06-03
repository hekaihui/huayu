<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2019/4/9
  Time: 10:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-3.3.1.min.js"></script>
<script type="text/javascript">
      function click1(v) {
          $.get({
              url:"${pageContext.request.contextPath}/test/Action_hekaihui?particular.indentid="+v,
              success:function (data) {
                  var par=JSON.parse(data);
                  var a='';
                      for (var i = 0; i < par.length; i++) {
                          alert("商品id：" + par[i].productid + " " + "商品名称：" + par[i].productname + " " + "单价：" + par[i].price + " " + "购买数量：" + par[i].quantity + " " + "订单编号：" + par[i].indentid);
                          a += ("<tr>" + par[i].productid + par[i].productname + par[i].price + par[i].quantity + par[i].indentid + "</tr>")
                  }
               $("#ss").html(a);
              }
          });
      }
</script>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table border="1">
    <tr>
        <td>订单编号</td>
        <td>下单时间</td>
        <td>用户id</td>
        <td>总金额</td>
        <td>总数量</td>
        <td>时间</td>
        <td><a href="/insert.jsp">添加</a></td>

    </tr>

    <c:forEach items="${list}" var="l">
        <tr>
            <td ><a href="#" onclick="click1(${l.indentid})">${l.indentid}</a></td>
            <td>${l.time}</td>
            <td>${l.userid}</td>
            <td>${l.money}</td>
            <td>${l.nomber}</td>
            <td>${l.date}</td>
            <td><a href="delete.stu?indentid=${l.indentid}">删除</a></td>
            <td><a href="hehe/${l.indentid}.stu">修改</a></td>
            <td><a href="test/Action_se?indent.indentid=${l.indentid}">添加明细</a></td>
        </tr>
    </c:forEach>
</table>



<div >
    <span id="ss" >
heaikeiahui
    </span>
</div>
</body>
</html>
