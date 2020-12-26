package kitchenServlet.include.admin_low;

import java.io.IOException;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.include;
import dao.includeDao;

/**
 * Servlet implementation class selectSelectBrandServlet
 */
@WebServlet("/selectSelectIncludeServlet")
public class selectSelectIncludeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public selectSelectIncludeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try{
        	includeDao db=new includeDao(); 
            String Ono=request.getParameter("Ono");
            ResultSet rs=db.selectUpdateInclude(Ono);
             HttpSession session=request.getSession();
             ArrayList al=new ArrayList();            
             while(rs.next()){
                 include st=new include();
                 st.setGno(rs.getString("Gno"));
                 st.setOno(rs.getString("Ono"));
                 st.setAmount(rs.getString("amount"));
                 al.add(st);                  
             }  
             session.setAttribute("al",al);
             rs.close();
             response.sendRedirect("kitchen/include/admin_low/selectMed.jsp");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

}
