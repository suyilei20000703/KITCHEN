<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<div align="center">
  <h2>欢迎光临</h2>
  <form action="../../loginServlet" method="get">
  
          <table width="300" border="1" cellspacing="0" cellpadding="0">
          <tr>
            <td height="40">账号:</td>
            <td><input type="text" name="buyerNumber"  /></td>
          </tr>
          <tr>
            <td height="40">密码:</td>
            <td height="40"><input type="password" name="buyerCode"  /></td>
          </tr>
          <tr>
            <td height="40"><input name="" type="submit" value="登录" /></td>
            <td height="40"><input name="" type="reset" value="清除" /></td>
          </tr>
          <tr>
            <td height="40" colspan="1"><a href="loginBuyer.jsp">注册</a></td>
            <td height="40" colspan="1"><a href="login_admin.jsp">管理员登录</a></td>
          </tr>
          
        </table>

   </form> 
 </div>
 
  
</body>
</html>