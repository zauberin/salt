<%--
  Created by IntelliJ IDEA.
  User: altibest
  Date: 2017-09-20
  Time: 오전 9:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>MemberList</title>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <%--<script src="<c:url value="/resources/js/jquery-3.2.1.min.js" />"></script>--%>
    <script>
        $(document).ready(function() {
            $("#chkAll").click(function() {
                $("input:checkbox[name='id']").prop("checked", $(this).is(":checked"));
            });

            $(".btnDel").click(function() {
               document.location.href='/member/del?id=' + $(this).val();
            });

        });
    </script>
</head>
<body>
<img src="<c:url value="/resources/img/sign.jpg" />" /> <br/>
<img src="${pageContext.request.contextPath}/resources/img/sign.jpg" /> <br/>
<table border="1" style="border-collapse: collapse;">
    <tr>
        <th><input type="checkbox" id="chkAll" /></th>
        <th>이름</th>
        <th>이메일</th>
        <th>전화번호</th>
        <th>주소</th>
        <th>삭제</th>
    </tr>
<c:forEach var="result" items="${memberList}" varStatus="status">
    <tr>
        <td><input type="checkbox" name="id" value="${result.ID}" /></td>
        <td><a href="/member/view?id=${result.ID}">${result.NAME}</a></td>
        <td>${result.EMAIL}</td>
        <td>${result.PHONE}</td>
        <td>${result.ADDR}</td>
        <td>
            <button class="btnDel" value="${result.ID}">Del</button>
        </td>
    </tr>
</c:forEach>
</table>
<br/>
<button id="btnList" onclick="document.location.href='/member/input';">등록</button>
</body>
</html>
