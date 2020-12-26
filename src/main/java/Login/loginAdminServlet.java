package Login;

import java.io.IOException;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.loginDao;
import bean.management;
/**
 * Servlet implementation class lookBrandServlet
 */
@WebServlet("/loginAdminServlet")
public class loginAdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public loginAdminServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)  throws ServletException, IOException{
		// TODO Auto-generated method stub
		try{
		String kitchenNumber=request.getParameter("kitchenNumber");
        String kitchenCode=request.getParameter("kitchenCode");
        String grade=request.getParameter("gradeA");
        System.out.println(grade);

        loginDao db=new loginDao(); 
        ResultSet rs=db.selectCheckKitchen(kitchenNumber,kitchenCode,grade);        	
        HttpSession session=request.getSession();            
        rs.next();
        if(rs.getRow()>0) { 
        	management stu=new management();
        	stu.setMno(rs.getString("Mno"));
        	stu.setMcode(rs.getString("Mcode"));
        	
            session.setAttribute("al",stu);
            rs.close();
            if(grade=="h"){
            	response.sendRedirect("kitchen/frame/Main_admin_high.jsp"); 
            }
            else {
            	response.sendRedirect("kitchen/frame/Main_admin_low.jsp"); 
            }   	  	
          }
        else
        	response.sendRedirect("kitchen/frame/Main_admin_high.jsp");
        
		
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
