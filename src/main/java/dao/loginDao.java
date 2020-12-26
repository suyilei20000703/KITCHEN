package dao;
import util.mysqlConn;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class loginDao {
	
	private Statement st=null;
	mysqlConn con=new mysqlConn();
	

	   //管理员登录
		public ResultSet selectCheckKitchen(String kitchenNumber,String kitchenName,String grade){
		       try{
		    	   String sql=null;
		    	   
		    	   if(grade=="h"){
		    		   sql="select * from management where Mno='"+kitchenNumber+"' and Mcode='"+kitchenName+"' and Mgrade=1";
		    	   }
		    	   else{
		    		   sql="select * from management where Mno='"+kitchenNumber+"' and Mcode='"+kitchenName+"' and Mgrade=2";
		    	   }
		    	   
		    	   mysqlConn conn=new mysqlConn();
		           st=conn.getStatement();
		           
		           return st.executeQuery(sql);
		       }catch(Exception e){
		           e.printStackTrace();
		           message("账号或密码错误!");
		           return null;
		       } 
		}
		
		//买家登录
		public ResultSet selectbuyerKitchen(String kitchenNumber,String kitchenName){
		       try{
		    	   String sql="select * from buyer where Bno='"+kitchenNumber+"' and Bcode='"+kitchenName+"'";
		    	   
		    	   mysqlConn conn=new mysqlConn();
		           st=conn.getStatement();
		           
		           return st.executeQuery(sql);
		       }catch(Exception e){
		           e.printStackTrace();
		           message("账号或密码错误!");
		           return null;
		       } 
		}
		
		//用户注册
	    public boolean addBuyer(String studentNumber,String studentName,String studentSex,String studentAge,String studentWeight){
	        try{     //sql="INSERT into stuinfo(sid,sname) VALUES("+studentNumber+",'"+studentName+"')";
	        
	                String sql="insert into buyer"+"(Bno,Bcode,Bname,Bsex,Bphone)"+"values("+"'"+studentNumber+"'"+","+"'"+studentName+"'"+","+"'"+studentSex+"'"+","+"'"+studentAge+"'"+","+"'"+studentWeight+"'"+")";
	                st=con.getStatement(); 
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
	            message("账号已存在！");
	            return false;
	        }
	    }

			public void message(String msg){
		           int type=JOptionPane.YES_NO_OPTION;
		           String title="提示";
		           JOptionPane.showMessageDialog(null,msg,title,type);
		       }
}
