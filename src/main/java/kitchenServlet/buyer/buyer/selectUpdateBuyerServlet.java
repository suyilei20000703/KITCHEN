package kitchenServlet.buyer.buyer;

import java.io.IOException;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.buyer;
import dao.buyerDao;

/**
 * Servlet implementation class selectUpdateBuyerServlet
 */
@WebServlet("/selectUpdateBuyerServlet")
public class selectUpdateBuyerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public selectUpdateBuyerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 try{
			    buyerDao dd=new buyerDao();  
	        	
	        	HttpSession session1=request.getSession();    
	        	buyer buyer=(buyer)session1.getAttribute("al");
	        	
	            
				String Bno= request.getParameter("Bno");
	            ResultSet rs=dd.selectUpdateBuyer(buyer.getBno());
	            HttpSession session=request.getSession();
	            

	             ArrayList al=new ArrayList();            
	             while(rs.next()){
	                 buyer st=new buyer();
	                 st.setBno(rs.getString("Bno"));
	                 st.setBname(rs.getString("Bname"));
	                 st.setBcode(rs.getString("Bcode"));
	                 st.setBsex(rs.getString("Bsex"));
	                 st.setBphone(rs.getString("Bphone"));
	                 al.add(st);                  
	             }  
	             session.setAttribute("st",al);
	             rs.close();
	             response.sendRedirect("kitchen/buyer/buyer/selectUpdateB.jsp");
	        }catch(Exception e){
	            e.printStackTrace();
	        }
	    }
	    protected void doPost(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {
	        doGet(request, response);
	    }

	}