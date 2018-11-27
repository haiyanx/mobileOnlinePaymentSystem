<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/11/26
  Time: 21:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body style="position: relative">
<div style="border-bottom: 2px solid #283132">您现在的位置: >>配置业务</div>

<div style="color: red">${123}</div>

<div style="border-bottom: 2px solid #283132;position: absolute;top: 40px;height: 150px;width: 100%">
    <h2>收费细项</h2>
    <form action="<c:url value="/chargeServlet?method=chargeMoney"/>" method="post" style="height: 280px">
        收费项目：
        <select name="chargeName" style="width: 40px">
            <option>1111111</option>
            <option>2222222</option>
            <option>3333333</option>
        </select>
        收费金额：<input type="text" style="width: 40px" value="请输入收费金额"/>
        <input type="submit" value="提交收费金额">
        <input type="reset" value="全部重写">
    </form>
</div>
<div style="position: absolute;top: 230px;height: 150px;width: 100%">
    <h2>业务收费</h2>
    <form action="<c:url value="/chargeRulesServlet?method="/>" method="post" name="f_upload" enctype="multipart/form-data" style="height: 80px">
        业务：
        <select name="funcName" style="width: 40px">
            <option>2</option>
            <option>3</option>
            <option>4</option>
        </select><br/>
        收费项目:
        <input type="checkbox" name="isChecked" value="A">开户费
        <input type="checkbox" name="isChecked" value="B">漫游费
        <input type="checkbox" name="isChecked" value="C">押金
        <input type="checkbox" name="isChecked" value="D">入网费
        <input type="checkbox" name="isChecked" value="E">选号费
    </form>


</div>
</body>
</html>
