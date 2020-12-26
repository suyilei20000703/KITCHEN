<%@page import="bean.buyer"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>买家信息删除</title>
    </head>
   <body bgcolor="CCCFFF">
        <center>
            <br><br><br>
            <br><br><br>
            <h2>删除买家信息</h2><br>
             <%
                 ArrayList al=(ArrayList)session.getAttribute("al");
            %>
            <form  action="../../../deleteBuyerServlet" method="post">
                <p>请选择要删除买家的买家号:</p>
                <select name="NO">
                    <%
                        for(int i=0;i<al.size();i++){
                            buyer st=(buyer)al.get(i);
                    %>
                    <option value="<%=st.getBno()%>"><%=st.getBno()%></option>
                    <%
                        }
                    %>
                </select>
                 <p>
                    <input type="submit"  value="确定">&nbsp;
                    <input  type="button"  value="返回" onClick="javascript:history.go(-1)">
                </p>
            </form>
        </center>
    </body>
</html>
