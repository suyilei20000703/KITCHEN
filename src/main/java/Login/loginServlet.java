package Login;

import java.io.IOException;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.buyer;
import dao.loginDao;

/**
 * Servlet implementation class loginServlet
 */
@WebServlet("/loginServlet")
public class loginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public loginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
try{
            
            String buyerNumber=request.getParameter("buyerNumber");
            String buyerCode=request.getParameter("buyerCode");
            loginDao db=new loginDao(); 
       
            ResultSet rs=db.selectbuyerKitchen(buyerNumber,buyerCode);        	
            HttpSession session=request.getSession();            
            rs.next();
            if(rs.getRow()>0) { 
                buyer stu=new buyer();
            	stu.setBno(rs.getString("Bno"));
            	stu.setBcode(rs.getString("Bcode"));
            	
                session.setAttribute("al",stu);
                rs.close();               
            	response.sendRedirect("kitchen/frame/Main.jsp");          
              }
            else
            	response.sendRedirect("kitchen/login.jsp"); 
        }catch(Exception e){
            e.printStackTrace();
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
