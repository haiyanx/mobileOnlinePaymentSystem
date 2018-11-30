<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/11/24
  Time: 21:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <%
        String path = request.getContextPath();
        String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
    %>
    <script type="text/javascript" src="<%=basePath%>/js/jquery-1.8.3.min.js"></script>

    <script type="text/javascript">
        function queryOperators(opeId) {
            <%--$.ajax({--%>
            <%--type: "GET",--%>
            <%--url: "${pageContext.request.contextPath}/operatorController/queryOperatorList.action" ,--%>
            <%--contentType:"application/json;charset=utf-8",--%>
            <%--dataType:"json",--%>
            <%--});--%>
            alert(opeId);
        }
    </script>
</head>

<body style="position: relative">
<div style="border-bottom: 2px solid #283132">您现在的位置: >>操作员列表</div>

<form id="_form" action="${pageContext.request.contextPath}/operatorController/likeQuery.action" method="post" style="position: absolute;top: 50px;left: 20%">
    操作员姓名：<input type="text" name="operator_Name" width="50px"/>
    操作员编号：<input type="text" name="operator_ID" width="50px"/>
    <input type="submit" value="立即提交">
</form>
<div style="color: red;position: absolute;top: 80px;left: 25%;" >${nullOperators}</div>
<form id="_formUpdate" action="${pageContext.request.contextPath}/operatorController/deleteBatch.action" method="post" onsubmit="return checked()" style="position: absolute;top: 100px;left: 20%;">
    <table border="1px" id="_tab">
        <thead>
            <tr>
                <th width="50px">选中</th>
                <th width="50px">编号</th>
                <th width="50px">姓名</th>
                <th width="50px">权限</th>
                <th width="50px">操作</th>
            </tr>
        </thead>
        <tbody>
        <c:forEach var="operator" items="${operatorList}">
            <tr>
                <th>
                    <input type="checkbox" name="item_ids" value="${operator.operatorId}">
                </th>
                <th>
                    ${operator.operatorId}
                </th>
                <th>
                    ${operator.operatorName}
                </th>
                <th>
                    ${operator.isAdmin}
                </th>
                <th>
                    <a href="${pageContext.request.contextPath}/operatorController/updateOperator.action?operatorId=${operator.operatorId}">修改</a>
                </th>
            </tr>
        </c:forEach>
        </tbody>
    </table>
    <div style="color: red;position: absolute;top: 250px;left: 25%;" >${deleOperas}</div>
    <input type="submit" value="立即删除" style="position: absolute;left: 25%;top: 300px"/>
</form>

</body>
<script>
    function checked() {
        var str = document.getElementsByName("item_ids");
        var isok = false;
        for (var i = 0; i < str.length; i++) {
            if (str[i].checked == true){
                isok = true;
                break;
            }
        }
        if(!isok) {
            alert("请选择要删除的操作员！");
            return false;

        }else{
            if(confirm("确定要删除吗？")) {
                return true;
            }else {
                return false;
            }
        }
    }
</script>
</html>
