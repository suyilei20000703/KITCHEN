<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.ArrayList"%>
<%@page import="bean.kinds"%>
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
            <h3>商品种类信息！</h3>
            <form action="../../../updatekindsServlet">
            <table border="2" bgcolor= "CCCEEE" width="600">
                <%
                    ArrayList al=(ArrayList)session.getAttribute("al");
                   for(int i=0;i<al.size();i++){
                        kinds st=(kinds)al.get(i);
                %>
                <tr>
                    <td>种类号:</td>
                    <td><%=st.getKno()%></td>
                </tr>
                <tr>
                    <td>种类名名:</td>
                    <td><%=st.getKname()%></td>
                    </tr>
                    

                <%
                   }
                %>
            </table>
        </center>
    </body>
</body>
</html>