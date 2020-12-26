<%@page import="bean.goods"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.ArrayList"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>

<body bgcolor="CCCFFF">
        <center>
            <h3>商品信息！</h3>
            <table border="2"  width="600">
                <%
                    ArrayList al=(ArrayList)session.getAttribute("al");
                   for(int i=0;i<al.size();i++){
                        goods st=(goods)al.get(i);
                %>
                <tr>
                    <td>商品号:</td>
                    <td><%=st.getGno()%></td>
                </tr>
                <tr>
                    <td>商品名:</td>
                    <td><%=st.getGname()%></td>
                  </tr>
                 <tr>
                        <td>价格:</td>
                        <td><%=st.getGprice()%></td>
                 </tr>
                 <tr>
                        <td>商品数:</td>
                        <td><%=st.getGprice()%></td>             
                 </tr>
                     <tr>
                        <td>种类号:</td>
                        <td><%=st.getKno()%></td>
                    </tr>
                   <tr>
                        <td>品牌号:</td>
                        <td><%=st.getBrno()%></td>
                 </tr>

                <%
                   }
                %>
            </table>
        </center>
    </body>

</html>