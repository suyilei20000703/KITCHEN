<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.ArrayList"%>
<%@page import="bean.brand"%>
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
            
            <table border="2" bgcolor= "CCCEEE" width="600">
                <%
                    ArrayList al=(ArrayList)session.getAttribute("al");
                   for(int i=0;i<al.size();i++){
                        brand st=(brand)al.get(i);
                %>
                <tr>
                    <td>品牌号:</td>
                    <td><%=st.getBRno()%></td>
                </tr>
                <tr>
                    <td>品牌名:</td>
                    <td><%=st.getBRanme()%></td>
                    </tr>
                    <tr>
                        <td>所属公司:</td>
                        <td><%=st.getBRfirm()%></td>
                    </tr>

                <%
                   }
                %>
            </table>
        </center>
    </body>
</body>
</html>