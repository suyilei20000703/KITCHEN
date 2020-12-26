/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import util.mysqlConn;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrator
 *          Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/student?useUnicode=true&serverTimezone=UTC&characterEncoding=utf8";
            String user="root";
            String password="123";
            Connection conn=DriverManager.getConnection(url,user,password);
                Statement stmt=conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
                String sql="select * from stuinfo"; 
                ResultSet rs=stmt.executeQuery(sql);

 */
public class buyerDao {
	private Statement st=null;
	mysqlConn con=new mysqlConn();
   
    //添加学生信息的方法
   /* public boolean addStudent(String studentNumber,String studentName,String studentSex,String studentAge,String studentWeight){
        try{     //sql="INSERT into stuinfo(sid,sname) VALUES("+studentNumber+",'"+studentName+"')";
        
                String sql="insert into stuinfo"+"(SID,SName,SSex,SAge,SWeight)"+"values("+"'"+studentNumber+"'"+","+"'"+studentName+"'"+","+"'"+studentSex+"'"+","+"'"+studentAge+"'"+","+"'"+studentWeight+"'"+")";
                st=con.getStatement(); //连接数据库
                int row=st.executeUpdate(sql);
                if(row==1){
                    st.close();
                    con.close();
                    return true;
                }else{
                    st.close();
                    con.close();
                    return false;
            }  
        }catch(Exception e){
            e.printStackTrace();
            message("无法添加学生信息，请检查addStudent()方法！");
            return false;
        }
    }*/
    //查询所有买家信息，并返回 rs
    public ResultSet selectBuyer(){
        try{
            String sql="select * from buyer";
            st=con.getStatement();
            return st.executeQuery(sql);
        }catch(Exception e){
            e.printStackTrace();
            message("无法查询买家信息，请检查selectBuyer()方法！");
            return null;
        }
    }
    
    //查询指定买家号的信息，核对名字是否正确
   public ResultSet selectCheckBuyer(String buyerNumber){
       try{  //SELECT * FROM `stuinfo` where sid=1 and sname='djp'
             //"SELECT * FROM `stuinfo` where sid="+1+" and sname='"+djp+"'"
           String sql="SELECT * FROM buyer where Bno='"+buyerNumber+"'" ;
           st=con.getStatement();
           return st.executeQuery(sql);
       }catch(Exception e){
           e.printStackTrace();
           message("无法查询买家信息，请检查selectBuyer()方法！");
           return null;
       } 
	   
	   
	   
   }
    //查询要修改的买家信息
    public ResultSet selectUpdateBuyer(String NO){
        try{
            String sql="select * from buyer where Bno='"+NO+"'";
            st=con.getStatement();
            return st.executeQuery(sql);
        }catch(Exception e){
            e.printStackTrace();
            message("无法查询到要修改买家的信息，请检查输入买家号！");
            return null;
        }
    }
    //修改买家信息
    public boolean updateBuyer(String Bno,String Bname,String Bcode,String Bsex,String Bphone){
        try{
        	//update update stuinfo set SName='jjj',SSex='nan',sage=15,sweight=54 where sid=14
        			
        	//"update stuinfo set SName='"+studentName+"',SSex='"+studentSex+"',sage="+studentAge+",sweight="+studentWeight+" where sid="+studentNumber+";
        	
        	//"update stuinfo set SName='"+studentName+"',SSex='"+studentSex+"',SAge="+studentAge+",SWeight="+studentWeight+" where SID=+"studentNumber+";
            String sql="update buyer set Bname='"+Bname+"'"+",Bcode='"+Bcode+"'"+",Bsex='"+Bsex+"'"+",Bphone="+"'"+Bphone+"'"+" where Bno="+"'"+Bno+"'";
            st=con.getStatement();
            st.executeUpdate(sql);
            return true;        
        }catch(Exception e){
            e.printStackTrace();
            message("无法进行修改买家的信息，请检查updateBuyer()方法！");
            return false;
            
        }
    } 
  //修改个人信息
    public boolean updateMyself(String Bno,String Bname,String Bcode,String Bsex,String Bphone){
        try{
        	//update update stuinfo set SName='jjj',SSex='nan',sage=15,sweight=54 where sid=14
        			
        	//"update stuinfo set SName='"+studentName+"',SSex='"+studentSex+"',sage="+studentAge+",sweight="+studentWeight+" where sid="+studentNumber+";
        	
        	//"update stuinfo set SName='"+studentName+"',SSex='"+studentSex+"',SAge="+studentAge+",SWeight="+studentWeight+" where SID=+"studentNumber+";
           
            st=con.getStatement();
        	String sql="update buyer set Bname='"+Bname+"'"+",Bcode='"+Bcode+"'"+",Bsex='"+Bsex+"'"+",Bphone="+"'"+Bphone+"'"+" where Bno="+"'"+Bno+"'";

            st.executeUpdate(sql);
            return true;        
        }catch(Exception e){
            e.printStackTrace();
            message("无法进行修改个人的信息，请检查updateMyself()方法！");
            return false;
            
        }
    } 
    //查询要删除的买家信息
    public ResultSet lookDeleteBuyer(){
        try{
            String sql="select * from buyer";
            st=con.getStatement();
            return st.executeQuery(sql);
        }catch(Exception e){
            e.printStackTrace();
            message("无法查询到要删除买家的信息，请检LookDeleteBuyer()方法！");
            return null;
        }
    }
    //查询要删除的买家信息
    public boolean DeleteStudent( String NO){
        try{
            String sql="delete  from buyer where Bno="+NO;
            st=con.getStatement();
            st.executeUpdate(sql);
            return true;
        }catch(Exception e){
            e.printStackTrace();
            message("无法要删除买家的信息，请检DeleteStudent()方法！");
            return false;
        }
    }
    //一个带参数的信息提示框，供找错是用
    public void message(String msg){
        int type=JOptionPane.YES_NO_OPTION;
        String title="信息提示";
        JOptionPane.showMessageDialog(null,msg,title,type);
    }
    
    
    
}
