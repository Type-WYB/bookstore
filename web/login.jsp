<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>loginc</title>
    <script src="https://cdn.staticfile.org/jquery/1.10.2/jquery.min.js">
    </script>
</head>
<body>
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
