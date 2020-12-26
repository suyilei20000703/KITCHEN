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
<body bgcolor="CCCFFF">
        <center>
            <br> <br> <br> 
            <h3>请修改商品种类信息！</h3>
            <form action="../../../updatekindsServlet">
            <table border="2" bgcolor= "CCCEEE" width="600">
                <%
                    ArrayList al=(ArrayList)session.getAttribute("al");
                   for(int i=0;i<al.size();i++){
                       kinds st=(kinds)al.get(i);
                %>
                <tr>
                    <td>种类号:</td>
                    <td><input type="text" name="Kno" value="<%=st.getKno()%>"/></td>
                </tr>
                <tr>
                    <td>种类名:</td>
                    <td><input type="text" name="Kname" value="<%=st.getKname()%>"/></td>
                    </tr>

                    <tr align="center">
                        <td colspan="2">
                            <input name="sure" type="submit" value="修  改"/>
                            &nbsp;&nbsp;&nbsp;&nbsp;
                            <input name="clear" type="reset" value="取  消"/>
                        </td>
                    </tr>
                <%
                   }
                %>
            </table>
        </center>
    </body>
</html>