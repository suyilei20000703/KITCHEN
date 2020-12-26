package dao;
import util.mysqlConn;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class goodsDao {
	//�������ݿ��׼��
	private Statement st=null;
	mysqlConn con=new mysqlConn();
	
    //�鿴������Ʒ��Ϣ
    public ResultSet selectgoods(){
        try{
            String sql="select * from goods";
            st=con.getStatement();
            return st.executeQuery(sql);
        }catch(Exception e){
            e.printStackTrace();
            message("����ʧ�ܣ�");
            return null;
        }
    }
    
	
	//�����Ʒ��Ϣ
    public boolean addgoods(String Gno1,String Gname1,String Gprice1,String Gamount1,String Kno1,String Brno1){
        try{     
        	
        	String sql="insert into goods"+"(Gno,Gname,Gprice,Gamount,Kno,Brno)"+"values("+"'"+Gno1+"'"+","+"'"+Gname1+"'"+","+"'"+Gprice1+"'"+","+"'"+Gamount1+"'"+","+"'"+Kno1+"'"+","+"'"+Brno1+"'"+")";
             
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
            message("�����Ʒʧ�ܻ�����Ʒ��Ϣ�Ѵ��ڣ�");
            return false;
        }
    }
    
    //ɾ������
    public boolean Deletegoods( String NO){
        try{
            String sql="delete  from goods where Gno="+"'"+NO+"'";
            st=con.getStatement();
            st.executeUpdate(sql);
            return true;
        }catch(Exception e){
            e.printStackTrace();
            message("ɾ��ʧ�ܻ���û�иü�¼��");
            return false;
        }
    }
	
    //�޸�����
    public boolean updategoods(String Gno,String Gname,String Gprice,String Gamount,String Kno,String Brno){
        try{
        	String sql="update goods set Gname='"+Gname+"',Gprice="+Gprice+",Gamount="+Gamount+",Brno='"+Brno+"' where Gno='"+Gno+"'";
            st=con.getStatement();
            st.executeUpdate(sql);
            return true;        
        }catch(Exception e){
            e.printStackTrace();
            message("�޸�ʧ�ܣ�");
            return false;
        }
    } 
    
    //��ѯ����
    public ResultSet selectUpdategoods(String NO){
        try{
            String sql="select * from goods where Gno='"+NO+"'";
            st=con.getStatement();
            return st.executeQuery(sql);
        }catch(Exception e){
            e.printStackTrace();
            message("��ѯʧ�ܻ��߸����ݲ����ڣ�");
            return null;
        }
    }

		//��ʾ��
		public void message(String msg){
	           int type=JOptionPane.YES_NO_OPTION;
	           String title="��ʾ��";
	           JOptionPane.showMessageDialog(null,msg,title,type);
	       }
}
