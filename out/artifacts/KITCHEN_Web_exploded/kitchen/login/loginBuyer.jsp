<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
 <body bgcolor="CCCFFF">
        <center>
            <br><br><br>
            <h3>&nbsp;&nbsp;注册用户信息</h3>
            <form action="../../addBuyerServlet"  method="get">
                <table border="1" width="230">
                    <tr>
                        <td>账号:</td>
                        <td><input type="text" name="studentNumber"/></td>
                    </tr>
                    <tr>
                        <td>密码:</td>
                        <td><input type="text" name="studentName"/></td>
                    </tr>
                    <tr>
                        <td>名字:</td>
                        <td><input type="text" name="studentSex"/></td>
                    </tr>
                    <tr>
                        <td>性别:</td>
                        <td><input type="text" name="studentAge"/></td>
                    </tr>
                    <tr>
                        <td>电话:</td>
                        <td><input type="text" name="studentWeight"/></td>
                    </tr>
                    <tr align="center">
                        <td colspan="2">
                            <input name="sure" type="submit" value="注 册"/>
                            &nbsp;&nbsp;&nbsp;&nbsp;
                            <input name="clear" type="reset" value="清 除"/>
                        </td>
                    </tr>
                </table>
            </form>
        </center>
    </body>
</html>