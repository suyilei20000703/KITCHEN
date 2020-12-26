package dao;
import util.mysqlConn;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class kindsDao {
	//�������ݿ��׼��
	private Statement st=null;
	mysqlConn con=new mysqlConn();
	
    //�鿴������Ʒ������Ϣ
    public ResultSet selectkinds(){
        try{
            String sql="select * from kinds";
            st=con.getStatement();
            return st.executeQuery(sql);
        }catch(Exception e){
            e.printStackTrace();
            message("����ʧ�ܣ�");
            return null;
        }
    }
    
	
	//�����Ʒ������Ϣ
    public boolean addkinds(String Kno ,String Kname){
        try{     
        	
                String sql="insert into kinds"+"(Kno,Kname)"+"values("+"'"+Kno+"'"+","+"'"+Kname+"'"+")";
                
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
            message("���ʧ�ܻ��������Ѵ��ڣ�");
            return false;
        }
    }
    
    //ɾ������
    public boolean Deletekinds( String NO){
        try{
            String sql="delete  from kinds where Kno="+"'"+NO+"'";
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
    public boolean updatekinds(String Kno,String Kname){
        try{
        	
            String sql="update kinds set Kname='"+Kname+"'"+" where Kno="+"'"+Kno+"'";
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
    public ResultSet selectUpdatekinds(String NO){
        try{
            String sql="select * from kinds where Kno='"+NO+"'";
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
