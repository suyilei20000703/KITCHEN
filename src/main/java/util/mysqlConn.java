package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class mysqlConn {
	private String driverName="com.mysql.cj.jdbc.Driver";
    private String url="jdbc:mysql://localhost:3306/chufang?useUnicode=true&serverTimezone=UTC&characterEncoding=utf8";
    private String user="root";
    private String password="root";
    private Connection con=null;

    public String getDriverName() {
        return driverName;
    }
    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }
    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
    public String getUser() {
        return user;
    }
    public void setUser(String user) {
        this.user = user;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public Connection getCon() {
        return con;
    }
    public void setCon(Connection con) {
        this.con = con;
    }
  
  
    public Statement getStatement(){
        try{
            Class.forName(getDriverName());//加载驱动
            con=DriverManager.getConnection(getUrl(), getUser(), getPassword());//连接到数据库
            return con.createStatement();
        }catch(Exception e){
            e.printStackTrace();
            message("连接有误");
            return null;
        }
    }
    
    private void message(String string) {
	// TODO Auto-generated method stub
    	int type=JOptionPane.YES_NO_OPTION;
        String title="提示233";
        Object msg = null;
		JOptionPane.showMessageDialog(null,msg,title,type);
    }
	public void close() {
		// TODO Auto-generated method stub
		
	}


}
