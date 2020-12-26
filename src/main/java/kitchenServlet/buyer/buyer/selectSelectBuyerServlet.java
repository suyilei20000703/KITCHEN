package kitchenServlet.buyer.buyer;

import java.io.IOException;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.buyer;
import dao.buyerDao;

/**
 * Servlet implementation class selectSelectBuyerServlet
 */
@WebServlet("/selectSelectBuyerServlet")
public class selectSelectBuyerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public selectSelectBuyerServlet() {
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
	        	
	        	HttpSession session1=request.getSession();    
	        	buyer buyer=(buyer)session1.getAttribute("al");
	        	
	            
	
	            ResultSet rs=db.selectCheckBuyer(buyer.getBno());
	            HttpSession session=request.getSession();
	             ArrayList al=new ArrayList();            
	             while(rs.next()){
	                 buyer bu=new buyer();
	                 bu.setBno(rs.getString("Bno"));
	                 bu.setBname(rs.getString("Bname"));
	                 bu.setBcode(rs.getString("Bcode"));
	                 bu.setBsex(rs.getString("Bsex"));
	                 bu.setBphone(rs.getString("Bphone"));
	                 al.add(bu);                  
	             }  
	             
				session.setAttribute("bu",al);
	             rs.close();
	             response.sendRedirect("kitchen/buyer/buyer/selectSelectB.jsp");
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
