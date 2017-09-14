<%--
  Created by IntelliJ IDEA.
  User: altibest
  Date: 2017-09-14
  Time: 오전 11:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script>
        doSubmit = function(obj, addr) {
            obj.action = addr;
            obj.submit();
        }
    </script>
</head>
<body>
Hi<br/>
${message}
<br/>
<br/>
<br/>
<br/>
Parameter Form으로 던지기
<form method="post">
    name : <input type="text" name="name" /> <br/>
    id : <input type="text" name="id" /> <br/>
    <input type="button" value="test1" onclick="doSubmit(this.form, '/member/test1');" />&nbsp;
    <input type="button" value="test2" onclick="doSubmit(this.form, '/member/test2');" />
</form>
</body>
</html>
