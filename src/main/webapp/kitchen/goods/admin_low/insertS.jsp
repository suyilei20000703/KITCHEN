<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="CCCFFF">
	 <center>
            <br><br><br>
            <h3>&nbsp;&nbsp;添加商品信息</h3>
            <form action="../../../addgoodsServlet"  method="get">
                <table border="1" width="230">
                    <tr>
                        <td>商品号:</td>
                        <td><input type="text" name="Gno"/></td>
                    </tr>
                    <tr>
                        <td>商品名:</td>
                        <td><input type="text" name="Gname"/></td>
                    </tr>
                    <tr>
                        <td>价格:</td>
                        <td><input type="text" name="Gprice"/></td>
                    </tr>
                    <tr>
                        <td>商品数:</td>
                        <td><input type="text" name="Gamount"/></td>
                    </tr>
                    <tr>
                        <td>种类号:</td>
                        <td><input type="text" name="Kno"/></td>
                    </tr>
                    <tr>
                        <td>品牌号:</td>
                        <td><input type="text" name="Brno"/></td>
                    </tr>
                    <tr align="center">
                        <td colspan="2">
                            <input name="sure" type="submit" value="提  交"/>
                            &nbsp;&nbsp;&nbsp;&nbsp;
                            <input name="clear" type="reset" value="取  消"/>
                        </td>
                    </tr>
                </table>
            </form>
        </center>
</body>
</html>