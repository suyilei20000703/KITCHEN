package kitchenServlet.include.admin_low;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.includeDao;


/**
 * Servlet implementation class addBrandServlet
 */
@WebServlet("/addIcludeServlet")
public class addIcludeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public addIcludeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {        
        String Gno=request.getParameter("Gno");
        String Ono=request.getParameter("Ono");
        String amount=request.getParameter("amount");

        int amount6=Integer.parseInt(amount);
        includeDao db=new includeDao();
        if(db.addInclude(Gno,Ono,amount6)){
            response.sendRedirect("kitchen/include/admin_low/message.jsp");
        }else{
            response.sendRedirect("kitchen/include/admin_low/insert.jsp");
       }        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

}
