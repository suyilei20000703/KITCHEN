<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="bean.management"%>
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
            你要查询的管理员数据表中共有
            <font size="5" color="red">
                <%=al.size()%>
            </font>
            人
            <table border="2" bgcolor= "CCCEEE" width="600">
                <tr bgcolor="CCCCCC" align="center">
                    <th>管理员号</th>
                    <th>密码</th>
                    <th>姓名</th>
                    <th>电话号码</th>
                    <th>性别</th>
                    <th>等级</th>
                </tr>
                <%
                    for(int i=0;i<al.size();i++){
                    	management st=(management)al.get(i);
                %>
                <tr align="center">
                    <td><%=st.getMno()%> </td>
                    <td><%=st.getMcode()%> </td>
                    <td><%=st.getMname()%> </td>
                    <td><%=st.getMphone()%> </td>
                    <td><%=st.getMsex()%> </td>
                    <td><%=st.getMgrade()%> </td>
                    
                </tr>
                <%
                     }
                %>
            </table>
        </center>
    </body>
</html>