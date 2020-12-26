package kitchenServlet.brand.admin_low;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.brandDao;

/**
 * Servlet implementation class updatebrandServlet
 */
@WebServlet("/updatebrandServlet")
public class updatebrandServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public updatebrandServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String studentNumber=request.getParameter("BRno");
        String studentName=request.getParameter("BRanme");
        String studentSex=request.getParameter("BRfirm");

        brandDao db=new brandDao();
        if(db.updateBrand(studentNumber,studentName,studentSex)){
            response.sendRedirect("kitchen/brand/admin_low/message1.jsp");
        }else{
            response.sendRedirect("kitchen/brand/admin_low/lookUpdate.jsp");
       }        
      
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

}
