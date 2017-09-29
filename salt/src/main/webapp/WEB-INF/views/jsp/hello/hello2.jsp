<%--
  Created by IntelliJ IDEA.
  User: altibest
  Date: 2017-09-15
  Time: 오전 8:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>hello2</title>
</head>
<body>
    <c:out value="<xmp>" escapeXml="true">what</c:out>
    <h2>Hello2 : ${name}</h2>
<br/>
Image
<br/>
<img src="<c:url value='/resources/img/sign.jpg' />" />
<img src="<c:url value='/img/sign.jpg' />" />
<img src="/img/sign.jpg" />
<img src="${pageContext.request.contextPath}/resources/img/sign.jpg" />
<img src="${pageContext.request.contextPath}/img/sign.jpg" />
</body>
</html>
