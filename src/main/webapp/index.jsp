<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title></title>
    <script type="text/javascript">
        $(function(){
            $('#login_ff').form({
                success:function(data){
                    var data = eval('(' + data + ')');
                    if (data.success){
                        window.location.href="main.do";
                    }else{
                        alert(data.error);
                    }

                }
            });
        });
    </script>
</head>
<body>
<center>
    <form id="login_ff" action="login!verify.do" method="post">
    <table>
        <tr>
            <td>用户名：</td>
            <td><input type="text" class="easyui-validatebox" required="true" name="username"></td>
        </tr>
        <tr>
            <td>密码：</td>
            <td><input type="password" class="easyui-validatebox" required="true" name="userpwd"></td>
        </tr>
        <tr>
            <td colspan="2" align="center">
                <input type="submit" value="登陆">
                <input type="button" value="清空">
            </td>
        </tr>
    </table>
    </form>
</center>
</body>
</html>