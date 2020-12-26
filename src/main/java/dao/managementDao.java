
package dao;
import util.mysqlConn;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class managementDao {
	//�������ݿ��׼��
	private Statement st=null;
	mysqlConn con=new mysqlConn();
	
    //�鿴����Ʒ����Ϣ
    public ResultSet selectManagement(){
        try{
            String sql="select * from management";
            st=con.getStatement();
            return st.executeQuery(sql);
        }catch(Exception e){
            e.printStackTrace();
            message("����ʧ�ܣ�");
            return null;
        }
    }
    
	
	//���Ʒ����Ϣ
    public boolean addManagement(String no ,String code,String name,String phone,String sex,String grade){
        try{     
        	
        	String sql="insert into management (Mno,Mcode,Mname,Mphone,Msex,Mgrade) values('"+no+"',"+"'"+code+"',"+"'"+name+"',"+"'"+phone+"',"+"'"+sex+"',"+"'"+grade+"')";
                
                st=con.getStatement(); //�������ݿ�
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
    public boolean DeleteManagement( String NO){
        try{
            String sql="delete  from management where Mno="+"'"+NO+"'";
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
    public boolean updateManagement(String Mno,String Mcode,String Mname,String Mphone,String Msex,String Mgrade){
        try{
        	//update update stuinfo set SName='jjj',SSex='nan',sage=15,sweight=54 where sid=14
        			
        	//"update stuinfo set SName='"+studentName+"',SSex='"+studentSex+"',sage="+studentAge+",sweight="+studentWeight+" where sid="+studentNumber+";
        	
        	//"update stuinfo set SName='"+studentName+"',SSex='"+studentSex+"',SAge="+studentAge+",SWeight="+studentWeight+" where SID=+"studentNumber+";
            String sql="update Management set Mname='"+Mname+"', Mgrade='"+Mgrade+"'"+",Mcode="+"'"+Mcode+"'"+", Mphone="+"'"+Mphone+"'"+", Msex="+"'"+Msex+"'"+" where Mno="+"'"+Mno+"'";
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
    //��ѯ����
    public ResultSet selectUpdateManagement(String NO){
        try{
            String sql="select * from management where Mno='"+NO+"'";
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