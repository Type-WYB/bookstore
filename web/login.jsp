<%@ page import="pojo.User" %>
<%@ page import="org.omg.CORBA.Request" %>
<%@ page import="org.springframework.http.HttpRequest" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>wanglogin</title>
    <script src="js/my.js" type="text/javascript" charset="utf-8"></script>
    <link rel="stylesheet" type="text/css" href="css/my.css"/>
    <script src="js/vue-router.js" type="text/javascript" charset="utf-8"></script>
    <script src="js/axios.min.js" type="text/javascript" charset="utf-8"></script>
    <script src="js/vue-resource.min.js" type="text/javascript" charset="utf-8"></script>
</head>
<body>
<img src="images/a1.jpg" id="image1" onclick="onclik()">
${c.email}
${Book.get(0).name}<hr/>
<hr/>
<c:forEach begin="0" end="5" var="i" >${i}</c:forEach><hr/>

<c:forEach var="x" varStatus="xs" items="${Book}">
    ${x.name}++${xs.count}
</c:forEach><hr/>

${requestScope.get("user").name}<hr/>
${requestScope.get("user").uid}<hr/>

<%
pageContext.setAttribute("tmp","tmp",pageContext.PAGE_SCOPE);
%>

<c:if test="${user.name=='user'}">if==ture</c:if>

${tmp}<hr/>
${pageContext.getAttribute("tmp")}<hr/>
${pageScope.tmp}<hr/>


</body>
</html>
