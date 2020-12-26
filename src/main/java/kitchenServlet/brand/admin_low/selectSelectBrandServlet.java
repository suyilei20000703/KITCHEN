package kitchenServlet.brand.admin_low;

import java.io.IOException;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.brand;
import dao.brandDao;

/**
 * Servlet implementation class selectSelectBrandServlet
 */
@WebServlet("/selectSelectBrandServlet")
public class selectSelectBrandServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public selectSelectBrandServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try{
        	brandDao db=new brandDao(); 
            String studentNumber=request.getParameter("BRno");
            ResultSet rs=db.selectUpdateBrand(studentNumber);
             HttpSession session=request.getSession();
             ArrayList al=new ArrayList();            
             while(rs.next()){
                 brand st=new brand();
                 st.setBRno(rs.getString("BRno"));
                 st.setBRanme(rs.getString("BRanme"));
                 st.setBRfirm(rs.getString("BRfirm"));
                 al.add(st);                  
             }  
             session.setAttribute("al",al);
             rs.close();
             response.sendRedirect("kitchen/brand/admin_low/selectSelect.jsp");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

}
