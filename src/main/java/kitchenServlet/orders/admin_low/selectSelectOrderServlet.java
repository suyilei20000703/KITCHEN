package kitchenServlet.orders.admin_low;

import java.io.IOException;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.orders;
import dao.ordersDao;

/**
 * Servlet implementation class selectSelectBrandServlet
 */
@WebServlet("/selectSelectOrderServlet")
public class selectSelectOrderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public selectSelectOrderServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try{
        	ordersDao db=new ordersDao(); 
            String Ono=request.getParameter("Ono");
            ResultSet rs=db.selectUpdateOrder(Ono);
             HttpSession session=request.getSession();
             ArrayList al=new ArrayList();            
             while(rs.next()){
            	 orders st=new orders();
                 st.setOno(rs.getString("Ono"));
                 st.setOamount(rs.getInt("Oamount"));
                 st.setOtime(rs.getString("Otime"));
                 st.setOmoney(rs.getFloat("Omoney"));
                 st.setBno(rs.getString("Bno"));
                 al.add(st);                  
             }  
             session.setAttribute("al",al);
             rs.close();
             response.sendRedirect("kitchen/orders/admin_low/select_med.jsp");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

}
