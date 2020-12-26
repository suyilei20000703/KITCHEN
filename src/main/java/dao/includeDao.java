package dao;
import util.mysqlConn;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class includeDao {
	//�������ݿ��׼��
	private Statement st=null;
	mysqlConn con=new mysqlConn();
	
    //�鿴���ж����굥��Ϣ
    public ResultSet selectInclude(){
        try{
            String sql="select * from include";
            st=con.getStatement();
            return st.executeQuery(sql);
        }catch(Exception e){
            e.printStackTrace();
            message("����ʧ�ܣ�");
            return null;
        }
    }
    
	
	//�����Ϣ
    public boolean addInclude(String Gno,String Ono,int amount){
        try{     
        	
                String sql="insert into include"+"(Gno,Ono,amount)"+"values("+"'"+Gno+"'"+","+"'"+Ono+"'"+","+"'"+amount+"'"+")";
                
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
    public ResultSet selectUpdateInclude(String NO){
        try{
            String sql="select * from include where Ono='"+NO+"'";
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
