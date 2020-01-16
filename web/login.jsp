<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>loginc</title>
    <script src="https://cdn.staticfile.org/jquery/1.10.2/jquery.min.js">
    </script>
</head>
<body>
<%--${Book.get(0).name}--%>
<%--<hr/>--%>

<%--<c:forEach begin="0" end="5" var="i">${i}</c:forEach>--%>
<%--<hr/>--%>

<%--<c:forEach var="x" varStatus="xs" items="${Book}">--%>
<%--${x.name}++${xs.count}--%>
<%--</c:forEach>--%>
<%--<hr/>--%>

<%--${requestScope.get("user").name}--%>
<%--<hr/>--%>
<%--${requestScope.get("user").uid}--%>
<%--<hr/>--%>

<%--<%--%>
<%--pageContext.setAttribute("tmp", "tmp", pageContext.PAGE_SCOPE);--%>
<%--%>--%>

<%--<c:if test="${user.name=='user'}">if==ture</c:if>--%>

<%--${tmp}--%>
<%--<hr/>--%>
<%--${pageContext.getAttribute("tmp")}--%>
<%--<hr/>--%>
<%--${pageScope.tmp}--%>
<%--<hr/>--%>
<form>
    用户名：<input type="text" name="name" id="name"><br>
    密码：<input type="password" name="password" id="password"><br>
    <input type="button" value="登录" id="loginButton">
</form>

</body>
<script type="text/javascript">
    $(function () {
        $("#loginButton").click(function () {
            $.ajax({
                url: "user/login",
                type: "POST",
                dataType: "json",
                contentType: "application/json;charset=UTF-8",
                data: JSON.stringify({
                    name: $("#name").val(),
                    password: $("#password").val()
                }),
                success: function (result) {
                    if (result.ok == 1) {
                        alert(result.msg);
                    } else {
                        alert(result.msg);
                    }
                },
                error: function (result) {
                    alert(result)
                }
            })
        })
    });
</script>
</html>
