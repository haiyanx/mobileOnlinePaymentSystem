<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/11/21
  Time: 20:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set value="${pageContext.request.contextPath}" var="path" scope="page"/>
<html>
<head>
    <meta charset="utf-8">
    <title>
        index
    </title>
    <%--<link rel="shortcut icon" href="../../favicon.ico" type="image/x-icon" />--%>

    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
    <link rel="stylesheet" href="${path}/css/x-admin.css" media="all">
    <link rel="stylesheet" href="${path}/lib/layui/css/layui.css" media="all">
    <%
        String path = request.getContextPath();
        String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
    %>
</head>
<body>
<div class="layui-layout layui-layout-admin">
    <div class="layui-header header header-demo">
        <div class="layui-main">
            <a class="logo" href="#">
                <img src="${path}/images/banner2.png"/>
            </a>
        </div>
    </div>
    <div class="layui-side layui-bg-black x-side">
        <div class="layui-side-scroll">
            <ul class="layui-nav layui-nav-tree site-demo-nav" lay-filter="side">
                <!--操作员管理-->
                <li class="layui-nav-item">
                    <a class="javascript:;" href="#" >
                        <i class="layui-icon" style="top: 3px;">&#xe629;</i><cite>操作员管理</cite>
                    </a>
                    <dl class="layui-nav-child">
                        <dd class="">
                            <a href="javascript:;" _href="<%=basePath%>addOperator">
                                <cite>新增操作员</cite>
                            </a>
                        </dd>
                        <dd class="">
                            <a href="javascript:;" _href="<%=basePath%>/operatorServlet?method=queryOperatorList">
                                <cite>操作员列表</cite>
                            </a>
                        </dd>
                        <dd class="">
                            <a href="javascript:;" _href="#">
                                <cite>扩展功能一</cite>
                            </a>
                        </dd>
                        <dd class="">
                            <a href="javascript:;" _href="#">
                                <cite>扩展功能二</cite>
                            </a>
                        </dd>

                    </dl>
                </li>
                <!--资源管理-->
                <li class="layui-nav-item">
                    <a class="javascript:;" _href="#" >
                        <i class="layui-icon" style="top: 3px;">&#xe629;</i><cite>用户管理</cite>
                    </a>
                    <dl class="layui-nav-child">
                        <dd class="">
                            <a href="javascript:;" _href="<%=basePath%>addResources">
                                <cite>新增资源</cite>
                            </a>
                        </dd>
                        <dd class="">
                            <a href="javascript:;" _href="#">
                                <cite>扩展功能</cite>
                            </a>
                        </dd>
                    </dl>
                </li>
                <!--业务管理-->
                <li class="layui-nav-item">
                    <a class="javascript:;" href="#" >
                        <i class="layui-icon" style="top: 3px;">&#xe629;</i><cite>业务管理</cite>
                    </a>
                    <dl class="layui-nav-child">
                        <dd class="">
                            <a href="javascript:;" _href="<%=basePath%>/chargeServlet?method=queryChargeList">
                                <cite>配置业务</cite>
                            </a>
                        </dd>
                        <dd class="">
                            <a href="javascript:;" _href="#">
                                <cite>扩展功能</cite>
                            </a>
                        </dd>
                    </dl>
                </li>
                <!--开户-->
                <li class="layui-nav-item">
                    <a class="javascript:;" href="#">
                        <i class="layui-icon" style="top: 3px;">&#xe629;</i><cite>开户</cite>
                    </a>
                    <dl class="layui-nav-child">
                        <dd class="">
                            <a href="#">
                                <i class="layui-icon"></i><cite>新增客户</cite>
                            </a>
                        </dd>
                        <dd class="">
                            <a href="#">
                                <i class="layui-icon"></i><cite>扩展功能</cite>
                            </a>
                        </dd>
                    </dl>
                </li>

                <!--系统帮助-->
                <li class="layui-nav-item">
                    <a class="javascript:;" href="#">
                        <i class="layui-icon" style="top: 3px;">&#xe629;</i><cite>系统帮助</cite>
                    </a>
                </li>
                <!--查询信息-->
                <li class="layui-nav-item">
                    <a class="javascript:;" href="#">
                        <i class="layui-icon" style="top: 3px;">&#xe629;</i><cite>查询信息</cite>
                    </a>
                </li>
                <!--退出-->
                <li class="layui-nav-item">
                    <a class="javascript:;" href="<%=basePath%>exit">
                        <i class="layui-icon" style="top: 3px;">&#xe629;</i>
                            <cite>退出</cite>
                    </a>
                </li>
            </ul>
        </div>
    </div>

    <div class="layui-tab layui-tab-card site-demo-title x-main" lay-filter="x-tab" lay-allowclose="true">
        <div class="x-slide_left"></div>
        <ul class="layui-tab-title">
            <li class="layui-this">
                登陆首页
                <i class="layui-icon layui-unselect layui-tab-close">ဆ</i>
            </li>
        </ul>
        <div class="layui-tab-content site-demo site-demo-body">
            <div class="layui-tab-item layui-show">
                <iframe frameborder="0" src="<%=basePath%>login" class="x-iframe"></iframe>
            </div>
        </div>
    </div>
    <div class="site-mobile-shade">
    </div>
</div>
<script src="${path}/lib/layui/layui.js" charset="utf-8"></script>
<script src="${path}/js/x-admin.js"></script>

</body>
</html>
