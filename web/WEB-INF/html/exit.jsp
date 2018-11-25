<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/11/24
  Time: 17:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>exit</title>
    <%
        String path = request.getContextPath();
        String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
    %>
</head>
<body>
<div style="height: 150px;width: 100%;background:#42c7b3;margin-top: 10px;font-size: 24px;line-height: 150px;text-align: center">退出登陆</div>
<div style="height: 20%;width: 100%;border: 1px solid #8392c7">
    <div style="font-size: 24px;text-align: center;height: 50%">感谢使用本系统，您真的要退出吗？</div>
    <div style="text-align: center;height: 50%">
        <button onclick="history.go(-1)">返回操作</button>
        <button onclick=window.open("index.jsp")>安全退出</button>
    </div>

</div>
</body>
</html>
