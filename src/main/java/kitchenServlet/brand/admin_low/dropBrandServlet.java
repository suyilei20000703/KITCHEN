package kitchenServlet.brand.admin_low;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import dao.brandDao;

/**
 * Servlet implementation class dropBrandServlet
 */
@WebServlet("/dropBrandServlet")
public class dropBrandServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public dropBrandServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        brandDao db=new brandDao();
        String NO=request.getParameter("NO");
        if(db.DeleteBrand(NO))
            response.sendRedirect("kitchen/brand/admin_low/message1.jsp");
        else
        	response.sendRedirect("kitchen/brand/admin_low/deleteS.jsp");
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

}
