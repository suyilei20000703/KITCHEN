<%@page import="bean.buyer"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>学生信息查询</title>
    </head>
    <body bgcolor="CCCFFF">
        <center>
            <br> <br> <br> <br> <br>
            <%
                 ArrayList al=(ArrayList)session.getAttribute("al");
            %>
            你要查询的买家数据表中共有
            <font size="5" color="red">
                <%=al.size()%>
            </font>
            人
            <table border="2" bgcolor= "CCCEEE" width="600">
                <tr bgcolor="CCCCCC" align="center">
                    <th>买家号</th>
                    <th>买家姓名</th>
                    <th>买家密码</th>
                    <th>买家性别</th>
                    <th>买家电话</th>
                </tr>
                <%
                    for(int i=0;i<al.size();i++){
                       buyer st=(buyer)al.get(i);
                %>
                <tr align="center">
                    <td><%=st.getBno()%> </td>
                    <td><%=st.getBname()%> </td>
                    <td><%=st.getBcode()%> </td>
                    <td><%=st.getBsex()%> </td>
                    <td><%=st.getBphone()%> </td>
                </tr>
                <%
                     }
                %>
            </table>
        </center>
    </body>
</html>
