<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/11/24
  Time: 19:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>addOperator</title>
    <script type="text/javascript" src="js/jquery-1.8.3.min.js"></script>
</head>

<body style="position: relative">
<div style="border-bottom: 2px solid #283132">您现在的位置: >>新增操作员</div>

<div style="color: red">${addOperator}</div>

<form action="<c:url value="/operatorServlet?method=addOperator"/>" method="post">
    <table border="1px" style="position: absolute;top: 100px;left: 200px;">
        <tr>
            <th width="200px">登陆ID：</th>
            <th width="300px">
                <input type="text" name="operatorId" width="100px" id="uname"/> *至少四位字母
            </th>
        </tr>
        <tr>
            <th>姓名：</th>
            <th>
                <input type="text" name="operatorName" width="100px" /> *不超过20位
            </th>
        </tr>
        <tr>
            <th>密码：</th>
            <th>
                <input type="text" name="operatorPwd" width="100px" id="pass_word1"/> *至少六位数字
            </th>
        </tr>
        <tr>
            <th>确认密码</th>
            <th>
                <input type="text" width="100px" id="pass_word2" /> *至少六位数字
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
        <input type="reset" value="全部重写">
    </div>

</form>
</body>
<script>
    $(function () {
        // 判断用户名输入是否规范
        $("#uname").blur(function () {
            var name = $(this).val().trim();
            if(name==""||name==null){
                alert("用户名不能为空")
            }
        });

        // 判断密码输入是否规范
        $("#pass_word1").blur(function () {
            var password = $(this).val().trim();
            if(password==""||password==null){
                alert("密码不能为空")
            }
        });

        //判断两次输入的密码是否一致
        $("#pass_word2").blur(function () {
            var password1 = $(this).val().trim();
            var password2 = $("#pass_word1").val().trim();
            if(password1 != password2){
                alert("两次输入的密码不一致，请重新输入！")
            }
        })
    })
</script>
</html>
