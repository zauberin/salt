<%--
  Created by IntelliJ IDEA.
  User: altibest
  Date: 2017-09-19
  Time: 오후 5:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="utf-8">
    <title>Salt CRUD</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <script>
        var doSave = function (action) {
            document.frm.action = "/member/" + action;
            document.frm.submit();
        }
    </script>
</head>
<body>
<form name="frm" method="post">

<table>
    <tr>
        <th>아이디</th>
        <td><input type="text" name="id" value="${memberInfo.id}" /></td>
    </tr>
    <tr>
        <th>이름</th>
        <td><input type="text" name="name" value="${memberInfo.name}" /></td>
    </tr>
    <tr>
        <th>이메일</th>
        <td><input type="text" name="email" value="${memberInfo.email}" /></td>
    </tr>
    <tr>
        <th>전화번호</th>
        <td><input type="text" name="phone" value="${memberInfo.phone}" /></td>
    </tr>
    <tr>
        <th>주소</th>
        <td><input type="text" name="addr" value="${memberInfo.addr}" /></td>
    </tr>
    <tr>
        <th>비밀번호</th>
        <td><input type="password" name="pwd" value="${memberInfo.pwd}" /></td>
    </tr>
    <tr>
        <th>기타</th>
        <td><input type="text" name="etc" value="${memberInfo.etc}" /></td>
    </tr>
    <tr>
        <td colspan="2">
            <button onclick="doSave('inputAction');">저장</button>&nbsp;
            <button onclick="doSave('modAction');">수정</button>&nbsp;
            <button onclick="document.location.href='/member/list';">목록</button>
        </td>
    </tr>
</table>
</form>
</body>
</html>
