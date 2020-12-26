package kitchenServlet.kinds.buyer;

import java.io.IOException;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.kinds;
import dao.kindsDao;

/**
 * Servlet implementation class selectSelectkindsServlet
 */
@WebServlet("/selectSelectkindsServletA")
public class selectSelectkindsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public selectSelectkindsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try{
        	kindsDao db=new kindsDao(); 
            String Kno=request.getParameter("Kno");
            ResultSet rs=db.selectUpdatekinds(Kno);
             HttpSession session=request.getSession();
             ArrayList al=new ArrayList();            
             while(rs.next()){
            	 kinds st=new kinds();
                 st.setKno(rs.getString("Kno"));
                 st.setKname(rs.getString("Kname"));
                 al.add(st);                  
             }  
             session.setAttribute("al",al);
             rs.close();
             response.sendRedirect("kitchen/kinds/admin_low/selectSelect.jsp");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

}
