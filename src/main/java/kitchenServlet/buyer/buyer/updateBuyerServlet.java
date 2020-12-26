package kitchenServlet.buyer.buyer;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.buyerDao;
import bean.buyer;

/**
 * Servlet implementation class updateBuyerServlet
 */
@WebServlet("/updateBuyerServlet")
public class updateBuyerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public updateBuyerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session1=request.getSession();    
    	buyer buyer=(buyer)session1.getAttribute("al");
		
		String Bno=buyer.getBno();

        String Bname=request.getParameter("Bname");
        String Bcode=request.getParameter("Bcode");
        String Bsex=request.getParameter("Bsex");
        String Bphone=request.getParameter("Bphone");

        buyerDao db=new buyerDao();

        if(db.updateMyself(Bno,Bname,Bcode,Bsex,Bphone)){
            response.sendRedirect("kitchen/buyer/buyer/message.jsp");
        }else{
            response.sendRedirect("kitchen/frame/right.jsp");
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
