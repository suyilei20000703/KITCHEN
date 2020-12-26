package kitchenServlet.brand.admin_low;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.brandDao;


/**
 * Servlet implementation class addBrandServlet
 */
@WebServlet("/addBrandServlet")
public class addBrandServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public addBrandServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {        
        String BRno=request.getParameter("BRno");
        String BRanme=request.getParameter("BRanme");
        String BRfirm=request.getParameter("BRfirm");

        brandDao db=new brandDao();
        if(db.addBrand(BRno,BRanme,BRfirm)){
            response.sendRedirect("kitchen/brand/admin_low/message1.jsp");
        }else{
            response.sendRedirect("kitchen/brand/admin_low/insertS.jsp");
       }        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

}
