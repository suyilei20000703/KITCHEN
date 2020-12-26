package kitchenServlet.buyer.admin_low;

import java.io.IOException;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.buyerDao;
import bean.buyer;


/**
 * Servlet implementation class lookDeleteBuyerServlet
 */
@WebServlet("/lookDeleteBuyerServlet")
public class lookDeleteBuyerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public lookDeleteBuyerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 try{
	            buyerDao db=new buyerDao();
	            ResultSet rs=db.lookDeleteBuyer();
	             HttpSession session=request.getSession();
	             ArrayList al=new ArrayList();
	             while(rs.next()){
	                 buyer st=new buyer();
	                 st.setBno(rs.getString("Bno"));
	                 al.add(st);                  
	             }    
	             session.setAttribute("al", al);
	             rs.close();
	             response.sendRedirect("kitchen/buyer/admin_low/deleteB.jsp");
	        }catch(Exception e){
	            e.printStackTrace();
	        }
	        
	    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
