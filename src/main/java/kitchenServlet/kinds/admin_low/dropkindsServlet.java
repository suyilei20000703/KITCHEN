package kitchenServlet.kinds.admin_low;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import dao.kindsDao;

/**
 * Servlet implementation class dropkindsServlet
 */
@WebServlet("/dropkindsServlet")
public class dropkindsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public dropkindsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        kindsDao db=new kindsDao();
        String NO=request.getParameter("NO");
        if(db.Deletekinds(NO))
            response.sendRedirect("kitchen/kinds/admin_low/message1.jsp");
        else
        	response.sendRedirect("kitchen/kinds/admin_low/deleteS.jsp");
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

}
