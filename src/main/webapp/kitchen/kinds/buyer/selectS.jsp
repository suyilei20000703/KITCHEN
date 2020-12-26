<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="bean.kinds"%>
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
            你要查询的商品种类表中共有
            <font size="5" color="red">
                <%=al.size()%>
            </font>
            条数据
            <table border="2" bgcolor= "CCCEEE" width="600">
                <tr bgcolor="CCCCCC" align="center">
                    <th>种类号</th>
                    <th>种类名</th>
                </tr>
                <%
                    for(int i=0;i<al.size();i++){
                       kinds st=(kinds)al.get(i);
                %>
                <tr align="center">
                    <td><%=st.getKno()%> </td>
                    <td><%=st.getKname()%> </td>
                </tr>
                <%
                     }
                %>
            </table>
        </center>
    </body>
</html>