<%--
  Created by IntelliJ IDEA.
  User: altibest
  Date: 2017-09-18
  Time: 오후 5:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<table border="1" style="border-collapse: collapse;">
    <c:forEach var="result" items="${empList}" varStatus="status">
        <tr>
            <td>${result.empNm}</td>
            <td>${result.empPos}</td>
            <td>${result.deptNm}</td>
            <td>${result.email}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
