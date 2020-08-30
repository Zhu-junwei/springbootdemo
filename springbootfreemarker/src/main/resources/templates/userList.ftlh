<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>userList</title>
</head>
<body>
    <table border="1" align="center" width="50%">
        <tr>
            <th>名字</th>
            <th>性别</th>
            <th>年龄</th>
        </tr>
        <#list userList as user>
            <tr>
                <td>${user.username}</td>
                <td>${user.usersex}</td>
                <td>${user.userage}</td>
            </tr>
        </#list>
    </table>
</body>
</html>