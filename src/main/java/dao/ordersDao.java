package dao;
import util.mysqlConn;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class ordersDao {
	//�������ݿ��׼��
	private Statement st=null;
	mysqlConn con=new mysqlConn();
	
    //�鿴���ж�����Ϣ
    public ResultSet selectOrder(){
        try{
            String sql="select * from orders";
            st=con.getStatement();
            return st.executeQuery(sql);
        }catch(Exception e){
            e.printStackTrace();
            message("����ʧ�ܣ�");
            return null;
        }
    }
    
	
	//�����Ϣ
    public boolean addOrders(String Ono,int Oamount,String Otime,float Omoney,String Bno){
        try{     
        	
                String sql="insert into orders"+"(Ono,Oamount,Otime,Omoney,Bno)"+"values("+"'"+Ono+"'"+","+"'"+Oamount+"'"+","+"'"+Otime+"'"+","+"'"+Omoney+"'"+","+"'"+Bno+"'"+")";
                
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
    //��ѯ����
    public ResultSet selectUpdateOrder(String NO){
        try{
            String sql="select * from orders where Ono='"+NO+"'";
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
