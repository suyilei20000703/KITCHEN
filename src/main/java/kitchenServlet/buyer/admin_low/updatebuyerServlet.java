package kitchenServlet.buyer.admin_low;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.buyerDao;

/**
 * Servlet implementation class updatebuyerServlet
 */
@WebServlet("/updatebuyerServlet")
public class updatebuyerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public updatebuyerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String Bno=request.getParameter("Bno");
        String Bname=request.getParameter("Bname");
        String Bcode=request.getParameter("Bcode");
        String Bsex=request.getParameter("Bsex");
        String Bphone=request.getParameter("Bphone");

        buyerDao db=new buyerDao();
        if(db.updateBuyer(Bno,Bname,Bcode,Bsex,Bphone)){
            response.sendRedirect("kitchen/buyer/admin_low/message.jsp");
        }else{
            response.sendRedirect("kitchen/buyer/admin_low/lookUpdate.jsp");
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
