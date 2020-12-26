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
<body>
	<body bgcolor="CCCFFF">
        <center>
            <br><br><br>
            <br><br><br>
            <h2>删除商品信息</h2><br>
            <form  action="../../../dropgoodsServlet" method="post">
                <p>删除的商品的商品号:</p>
                <input type="text" name="NO"/>
                 <p>
                    <input type="submit"  value="确定">&nbsp;
                    <input  type="button"  value="返回" onClick="javascript:history.go(-1)">
                </p>
            </form>
        </center>
    </body>
</body>
</html>