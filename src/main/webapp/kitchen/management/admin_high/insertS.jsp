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
            <h3>&nbsp;&nbsp;添加品牌信息</h3>
            <form action="../../../addmanagementServlet"  method="get">
                <table border="1" width="230">
                    <tr>
                        <td>管理员号:</td>
                        <td><input type="text" name="Mno"/></td>
                    </tr>
                    <tr>
                        <td>密码:</td>
                        <td><input type="text" name="Mcode"/></td>
                    </tr>
                    <tr>
                        <td>姓名:</td>
                        <td><input type="text" name="Mname"/></td>
                    </tr>
                                        <tr>
                        <td>电话号码:</td>
                        <td><input type="text" name="Mphone"/></td>
                    </tr>
                                        <tr>
                        <td>性别:</td>
                        <td><input type="text" name="Msex"/></td>
                    </tr>
                                        <tr>
                        <td>级别:</td>
                        <td><input type="text" name="Mgrade"/></td>
                    </tr>
                    <tr align="center">
                        <td colspan="2">
                            <input name="sure" type="submit" value="提  交"/>
                            &nbsp;&nbsp;&nbsp;&nbsp;
                            <input name="clear" type="reset" value="取  消"/>
                        </td>
                    </tr>
                </table>
            </form>
        </center>
</body>
</html>