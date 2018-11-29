<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/11/20
  Time: 20:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>

<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">

  <title>登录</title>
  <link rel="stylesheet" href="lib/layui/css/layui.css" media="all" />
  <link rel="stylesheet" href="css/login.css" />
  <script type="text/javascript" src="js/jquery-1.8.3.min.js"></script>
</head>

<body class="beg-login-bg" >
<div class="beg-login-box">
  <header>
    <h1>欢迎登录</h1>
  </header>
  <div class="beg-login-main">
    <div style="color: red">${msg}</div>
    <div style="color: red">${codeMessage}</div>
    <form class="layui-form" id="_form">
      <div class="layui-form-item">
        <label class="beg-login-icon">
          <i class="layui-icon">&#xe612;</i>
        </label>
        <input type="text" name="operator_ID" id="uname" lay-verify="userName" autocomplete="off" placeholder="请输入登录名" class="layui-input">
      </div>
      <div class="layui-form-item">
        <label class="beg-login-icon">
          <i class="layui-icon">&#xe642;</i>
        </label>
        <input type="password" name="operator_Pwd" id="pass_word1" lay-verify="password" autocomplete="off" placeholder="请输入密码" class="layui-input">
      </div>
      <div class="layui-form-item">
        <label class="beg-login-icon">
          <i class="layui-icon">&#xe618;</i>
        </label>
        <input type="text" name="validateCode" id="validateCode" autocomplete="off" placeholder="请输入验证码" class="layui-input">
        <img alt="验证码看不清，换一张" src="imageServlet" id="validateCodeImg" onclick="changeImg()">
        <a href="javascript:void(0)" onclick="changeImg()">看不清，换一张</a>
      </div>
      <div class="layui-form-item">
        <div class="beg-pull-left">
          <button class="layui-btn layui-btn-primary" id="_button" type="button" onclick="login()" >
            登录
          </button>
        </div>
        <div class="beg-pull-right">
          <button class="layui-btn layui-btn-primary" type="reset">
            重置
          </button>
        </div>

      </div>
    </form>
  </div>

</div>
<script type="text/javascript" src="lib/layui/layui.js"></script>
<script type="text/javascript">
    function changeImg() {
        document.getElementById("validateCodeImg").src = "imageServlet?"+Math.random();
    }

    function login(){
        var code = $("#validateCode").val();
        $.ajax({
            type: "GET",
            dataType: "json",
            url: "${pageContext.request.contextPath}/operatorController/code.action" ,
            data: "code="+code,
            contentType:"application/json;charset=utf-8",
            success: function (data) {
                var vcode = data.toString();
                if(vcode == code) {
                    checkNum();
                }else {
                    alert("验证码输入错误！")
                }
            }
        })
    }

    function checkNum(){
        var operatorID = $("#uname").val();
        var operatorPwd =$("#pass_word1").val();
        $.ajax({
            type: "POST",
            dataType: "json",
            url: "${pageContext.request.contextPath}/operatorController/login.action" ,
            data: JSON.stringify({
                "operatorId":operatorID,
                "operatorPwd":operatorPwd
            }),
            contentType:"application/json;charset=utf-8",
            success:function (data) {
              if(data.result == "1") window.location.href="${pageContext.request.contextPath}/home";
              else alert(data.result);
            }
        })
    }

    $(function () {
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

    })
</script>
</body>

</html>
