<%@page import="java.util.ArrayList"%>
<%@page import="bean.buyer"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body bgcolor="CCCFFF">
        <center>
            <br> <br> <br> 
            <h3>请修改个人信息！</h3>
            <form action="../../../updateBuyerServlet">
            <table border="2" bgcolor= "CCCEEE" width="600">
                <%
                    ArrayList al=(ArrayList)session.getAttribute("st");
                   for(int i=0;i<al.size();i++){
                        buyer st=(buyer)al.get(i);
                %>
                <tr>
                    <td>买家号:</td>
                    <td><input type="text" disabled="disabled" name="Bno" value="<%=st.getBno()%>"/></td>
                    </tr>
                <tr>
                    <td>买家姓名:</td>
                    <td><input type="text" name="Bname" value="<%=st.getBname()%>"/></td>
                    </tr>
                    <tr>
                        <td>买家密码:</td>
                        <td><input type="text" name="Bcode" value="<%=st.getBcode()%>"/></td>
                    </tr>
                    <tr>
                        <td>买家性别:</td>
                        <td><input type="text" name="Bsex" value="<%=st.getBsex()%>"/></td>
                    </tr>
                    <tr>
                        <td>买家电话:</td>
                         <td><input type="text" name="Bphone" value="<%=st.getBphone()%>"/></td>
                    </tr>
                    <tr align="center">
                        <td colspan="2">
                            <input name="sure" type="submit" value="修  改"/>
                            &nbsp;&nbsp;&nbsp;&nbsp;
                           <!--  <input name="clear" type="reset" value="取  消"/>--> 
                            <input  type="button"  value="返回" onClick="javascript:history.go(-1)">
                        </td>
                    </tr>
                <%
                   }
                %>
            </table>
        </center>
    </body>
</html>