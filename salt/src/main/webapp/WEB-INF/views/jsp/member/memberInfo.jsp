<%--
  Created by IntelliJ IDEA.
  User: altibest
  Date: 2017-09-19
  Time: 오후 2:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3> ${memberInfo.name} 님의 상세정보</h3>
<ul>
    <li>아이디: ${memberInfo.id}</li>
    <li>이메일: ${memberInfo.email}</li>
    <li>주소: ${memberInfo.addr}</li>
    <li>생년월일: ${memberInfo.birthday}</li>
    <li>전화번호: ${memberInfo.phone}</li>
    <li>로그인횟수: ${memberInfo.loginCnt}</li>
</ul>
</body>
</html>
