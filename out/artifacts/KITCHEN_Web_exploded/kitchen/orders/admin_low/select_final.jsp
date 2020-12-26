<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="bean.orders"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.sql.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
    <body bgcolor="CCCFFF">
        <center>
            <br> <br> <br> <br> <br>
            <%
                 ArrayList al=(ArrayList)session.getAttribute("al");
            %>
            你要查询的订单数据表中共有
            <font size="5" color="red">
                <%=al.size()%>
            </font>
            人
            <table border="2" bgcolor= "CCCEEE" width="600">
                <tr bgcolor="CCCCCC" align="center">
                    <th>订单号</th>
                    <th>数量</th>
                    <th>时间</th>
                    <th>金额</th>
                    <th>用户号</th>
                </tr>
                <%
                    for(int i=0;i<al.size();i++){
                       orders st=(orders)al.get(i);
                %>
                <tr align="center">
                    <td><%=st.getOno()%> </td>
                    <td><%=st.getOamount()%> </td>
                    <td><%=st.getOtime()%> </td>
                    <td><%=st.getOmoney()%> </td>
                    <td><%=st.getBno()%> </td>
                </tr>
                <%
                     }
                %>
            </table>
        </center>
    </body>
</html>