package kitchenServlet.management.admin_high;


import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import dao.managementDao;


/**
 * Servlet implementation class addManagementServlet
 */
@WebServlet("/addmanagementServlet")
public class addManagementServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public addManagementServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {        
        String Mno=request.getParameter("Mno");
        String Mcode=request.getParameter("Mcode");
        String Mname=request.getParameter("Mname");
        String Mphone=request.getParameter("Mphone");
        String Msex=request.getParameter("Msex");
        String Mgrade=request.getParameter("Mgrade");
        managementDao db=new managementDao();
        if(db.addManagement(Mno,Mcode,Mname,Mphone,Msex,Mgrade)){
            response.sendRedirect("kitchen/management/admin_high/message1.jsp");
        }else{
            response.sendRedirect("kitchen/management/admin_high/insertS.jsp");
       }        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

}