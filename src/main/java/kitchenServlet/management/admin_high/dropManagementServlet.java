package kitchenServlet.management.admin_high;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import dao.managementDao;

/**
 * Servlet implementation class dropManagementServlet
 */
@WebServlet("/dropmanagementServlet")
public class dropManagementServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public dropManagementServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        managementDao db=new managementDao();
        String NO=request.getParameter("NO");
        if(db.DeleteManagement(NO))
            response.sendRedirect("kitchen/management/admin_high/message1.jsp");
        else
        	response.sendRedirect("kitchen/management/admin_high/deleteS.jsp");
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

}