<%@ page import="pojo.User" %>
<%@ page import="org.omg.CORBA.Request" %>
<%@ page import="org.springframework.http.HttpRequest" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>logincwyb</title>
</head>
<body>
${Book.get(0).name}<hr/>

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
