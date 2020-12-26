<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.ArrayList"%>
<%@page import="bean.management"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="CCCFFF">
        <center>
            <br> <br> <br> 
            <h3>请修改管理员信息！</h3>
            <form action="../../../updateManagementServlet">
            <table border="2" bgcolor= "CCCEEE" width="600">
                <%
                    ArrayList al=(ArrayList)session.getAttribute("al");//定义一个动态数组
                   for(int i=0;i<al.size();i++){
                        management st=(management)al.get(i);
                %>
                <tr>
                    <td>管理员号:</td>
                    <td><input type="text" name="Mno" value="<%=st.getMno()%>"/></td>
                </tr>
                <tr>
                    <td>密码:</td>
                    <td><input type="text" name="Mcode" value="<%=st.getMcode()%>"/></td>
                    </tr>
                    <tr>
                        <td>姓名:</td>
                        <td><input type="text" name="Mname" value="<%=st.getMname()%>"/></td>
                    </tr>
                    <tr>
                    <tr>
                        <td>电话号码:</td>
                        <td><input type="text" name="Mphone" value="<%=st.getMphone()%>"/></td>
                    </tr>

                        <td>性别:</td>
                        <td><input type="text" name="Msex" value="<%=st.getMsex()%>"/></td>
                    </tr>
                                        <tr>
                        <td>等级:</td>
                        <td><input type="text" name="Mgrade" value="<%=st.getMgrade()%>"/></td>
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