package dao;

import util.mysqlConn;

import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class brandDao {
	//连接数据库的准备
	private Statement st=null;
	mysqlConn con=new mysqlConn();
	
    //查看所有品牌信息
    public ResultSet selectBrand(){
        try{
            String sql="select * from brand";
            st=con.getStatement();
            return st.executeQuery(sql);
        }catch(Exception e){
            e.printStackTrace();
            message("查找失败！");
            return null;
        }
    }
    
	
	//添加品牌信息
    public boolean addBrand(String studentNumber ,String studentName,String studentSex){
        try{     
        	
                String sql="insert into brand"+"(BRno,BRanme,BRfirm)"+"values("+"'"+studentNumber+"'"+","+"'"+studentName+"'"+","+"'"+studentSex+"'"+")";
                
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
            message("添加失败或者数据已存在！");
            return false;
        }
    }
    
    //删除数据
    public boolean DeleteBrand( String NO){
        try{
            String sql="delete  from brand where BRno="+"'"+NO+"'";
            st=con.getStatement();
            st.executeUpdate(sql);
            return true;
        }catch(Exception e){
            e.printStackTrace();
            message("删除失败或者没有该记录！");
            return false;
        }
    }
	
    //修改数据
    public boolean updateBrand(String studentNumber,String studentName,String studentSex){
        try{
        	//update update stuinfo set SName='jjj',SSex='nan',sage=15,sweight=54 where sid=14
        			
        	//"update stuinfo set SName='"+studentName+"',SSex='"+studentSex+"',sage="+studentAge+",sweight="+studentWeight+" where sid="+studentNumber+";
        	
        	//"update stuinfo set SName='"+studentName+"',SSex='"+studentSex+"',SAge="+studentAge+",SWeight="+studentWeight+" where SID=+"studentNumber+";
            String sql="update brand set BRanme='"+studentName+"',BRfirm='"+studentSex+"'"+" where BRno="+"'"+studentNumber+"'";
            st=con.getStatement();
            st.executeUpdate(sql);
            return true;        
        }catch(Exception e){
            e.printStackTrace();
            message("修改失败！");
            return false;
            
        }
    } 
    
    //查询数据
    public ResultSet selectUpdateBrand(String NO){
        try{
            String sql="select * from brand where BRno='"+NO+"'";
            st=con.getStatement();
            return st.executeQuery(sql);
        }catch(Exception e){
            e.printStackTrace();
            message("查询失败或者该数据不存在！");
            return null;
        }
    }

		//提示框
		public void message(String msg){
	           int type=JOptionPane.YES_NO_OPTION;
	           String title="提示！";
	           JOptionPane.showMessageDialog(null,msg,title,type);
	       }
}
