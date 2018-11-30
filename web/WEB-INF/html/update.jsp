<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/11/25
  Time: 11:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>updateOperator</title>
    <%
        String path = request.getContextPath();
        String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
    %>
</head>
<body style="position: relative">
<div style="border-bottom: 2px solid #283132">您现在的位置: >>操作员列表2-修改操作员信息</div>
<form action="<%=basePath%>/operatorController/updateOperator.action" method="post">
    <table border="1px" style="position: absolute;top: 100px;left: 200px;">
        <tr>
            <th width="200px">登陆ID：</th>
            <th width="300px">
                <input type="text" name="operatorId" width="100px" id="uname" value="${checkOperator.operatorId}"/>
            </th>
        </tr>
        <tr>
            <th>姓名：</th>
            <th>
                <input type="text" name="operatorName" width="100px" value="${checkOperator.operatorName}" />
            </th>
        </tr>
        <tr>
            <th>密码：</th>
            <th>
                <input type="text" name="operatorPwd" width="100px" id="pass_word1" value="${checkOperator.operatorPwd}"/>
            </th>
        </tr>
        <tr>
            <th>是否管理员</th>
            <th>
                <input type="radio" name="isAdmin" value="Y" /> 是
                <input type="radio" name="isAdmin" value="N" checked /> 否
            </th>
        </tr>
    </table>

    <div style="position: absolute;left: 38%;top: 300px">
        <input type="submit" value="提交">
    </div>

</form>

</body>
</html>
