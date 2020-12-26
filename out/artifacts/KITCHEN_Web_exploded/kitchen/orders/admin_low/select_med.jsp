<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.ArrayList"%>
<%@page import="bean.orders"%>
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
            <h3>品牌信息！</h3>
            <form action="../../../updatebrandServlet">
            <table border="2" bgcolor= "CCCEEE" width="600">
                <%
                    ArrayList al=(ArrayList)session.getAttribute("al");
                   for(int i=0;i<al.size();i++){
                	   orders st=(orders)al.get(i);
                %>
                <tr>
                    <td>订单号:</td>
                    <td><%=st.getOno()%></td>
                </tr>
                <tr>
                    <td>数量:</td>
                    <td><%=st.getOamount()%></td>
                    </tr>
                    <tr>
                        <td>时间:</td>
                        <td><%=st.getOtime()%></td>
                    </tr>
                   <tr>
                        <td>金额:</td>
                        <td><%=st.getOmoney()%></td>
                    </tr>
                    <tr>
                        <td>客户号:</td>
                        <td><%=st.getBno()%></td>
                    </tr>

                <%
                   }
                %>
            </table>
        </center>
    </body>
</body>
</html>