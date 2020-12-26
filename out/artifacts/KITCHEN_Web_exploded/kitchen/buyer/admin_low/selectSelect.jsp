<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.ArrayList"%>
<%@page import="bean.buyer"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<body bgcolor="CCCFFF">
        <center>
            <br> <br> <br> 
            <h3>买家信息！</h3>
            <table border="2" bgcolor= "CCCEEE" width="600">
                <%
                    ArrayList al=(ArrayList)session.getAttribute("al");
                   for(int i=0;i<al.size();i++){
                        buyer st=(buyer)al.get(i);
                %>
                <tr>
                    <td>买家号:</td>
                    <td><%=st.getBno()%></td>
                </tr>
                <tr>
                    <td>买家姓名:</td>
                    <td><%=st.getBname()%></td>
                    </tr>
                    <tr>
                        <td>买家密码:</td>
                        <td><%=st.getBcode()%></td>
                    </tr>
				<tr>
					<td>买家性别:</td>
					<td><%=st.getBsex() %></td>
				</tr>
				<tr>
					<td>买家电话:</td>
					<td><%=st.getBphone() %></td>
				</tr>
                <%
                   }
                %>
            </table>
        </center>
    </body>
</body>
</html>