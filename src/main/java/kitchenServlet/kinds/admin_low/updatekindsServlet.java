package kitchenServlet.kinds.admin_low;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.kindsDao;

/**
 * Servlet implementation class updatekindsServlet
 */
@WebServlet("/updatekindsServlet")
public class updatekindsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public updatekindsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String Kno=request.getParameter("Kno");
        String Kname=request.getParameter("Kname");

        kindsDao db=new kindsDao();
        if(db.updatekinds(Kno,Kname)){
            response.sendRedirect("kitchen/kinds/admin_low/message1.jsp");
        }else{
            response.sendRedirect("kitchen/kinds/admin_low/lookUpdate.jsp");
       }        
      
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

}
