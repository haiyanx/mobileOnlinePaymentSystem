<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/11/25
  Time: 13:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>addResources</title>
    <script type="text/javascript" src="js/jquery-1.8.3.min.js"></script>
    <%
        String path = request.getContextPath();
        String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
    %>
</head>
<body style="position: relative">
<div style="border-bottom: 2px solid #283132">您现在的位置: >>新增资源</div>

<div style="color: red">${numError}</div>

<div style="border-bottom: 2px solid #283132;position: absolute;top: 40px;height: 150px;width: 100%">
    <form action="<c:url value="/mobilesServlet?method=addResources"/>" method="post" style="height: 280px">
        <table>
            <tr style="height: 50px">
                <td>号码类型：</td>
                <td>
                    <input type="radio" name="mobileType" value="SIM" checked/>SIM
                    <input type="radio" name="mobileType" value="UIM"/>UIM
                </td>
            </tr>
            <tr style="height: 50px">
                <td>指定号段：</td>
                <td>
                    从<input type="text" name="numberFrom" id="numFrom"/>
                    到<input type="text" name="numberTo" id="numTo"/>
                </td>
            </tr>
        </table>
        <input type="submit" value="提交">
        <input type="reset" value="全部重写">
    </form>
</div>
<div style="position: absolute;top: 230px;height: 150px;width: 100%">
    <form action="<c:url value="/mobilesServlet?method=addTxtResources"/>" method="post" name="f_upload" enctype="multipart/form-data" style="height: 80px">
        从制定文件中导入：
        <input type="file" name="filename" value="浏览.."/><br/>
        <input type="submit" value="提交">
        <input type="reset" value="全部重写">
    </form>
    <p>说明:1.只支持txt文档导入！</p>
    <p>2.请在导入文档的第一行注明号码类型位SIM或UIM！</p>
    <p><a href="<%=basePath%>test123" target="_top">3.查看示例</a></p>
</div>

</body>
<script>
    $(function () {
        $("#numFrom").blur(function () {
            var patrn = /^(-)?\d+(\.\d+)?$/;
            var value = $(this).val();
            if(value.length != 11){
                alert("输入的号码长度必须为11位")
            }else {
                if (patrn.exec(value) == null || value == "") {
                    alert("输入的号码不是纯数字")
                }
            }
        })
        $("#numTo").blur(function () {
            var patrn = /^(-)?\d+(\.\d+)?$/;
            var to = $(this).val();
            var from = $("#numFrom").val();
            if(to.length != 11){
                alert("输入的号码长度必须为11位")
            }else {
                if (patrn.exec(to) == null || value == "") {
                    alert("输入的号码不是纯数字")
                }
            }
        })
    })
</script>

</html>
