package Login;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.loginDao;

/**
 * Servlet implementation class addStudentServlet
 */
@WebServlet("/addBuyerServlet")
public class addBuyerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public addBuyerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {        
        String studentNumber=request.getParameter("studentNumber");
        String studentName=request.getParameter("studentName");
        String studentSex=request.getParameter("studentSex");
        String studentAge=request.getParameter("studentAge");
        String studentWeight=request.getParameter("studentWeight");
        loginDao db=new loginDao();
        if(db.addBuyer(studentNumber,studentName,studentSex,studentAge,studentWeight)){
            response.sendRedirect("kitchen/login/login.jsp");
        }else{
            response.sendRedirect("kitchen/login/loginBuyer.jsp");
       }        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

}
