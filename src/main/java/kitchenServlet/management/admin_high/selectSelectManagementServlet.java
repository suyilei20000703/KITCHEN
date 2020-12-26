package kitchenServlet.management.admin_high;

import java.io.IOException;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.management;
import dao.managementDao;

/**
 * Servlet implementation class selectSelectManagementServlet
 */
@WebServlet("/selectSelectmanagementServlet")
public class selectSelectManagementServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public selectSelectManagementServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try{
        	managementDao db=new managementDao(); 
            String studentNumber=request.getParameter("Mno");
            ResultSet rs=db.selectUpdateManagement(studentNumber);
             HttpSession session=request.getSession();
             ArrayList al=new ArrayList();           
             while(rs.next()){
                 management st=new management();
                 st.setMno(rs.getString("Mno"));
                 st.setMcode(rs.getString("Mcode"));
                 st.setMname(rs.getString("Mname"));
                 st.setMphone(rs.getString("Mphone"));
                 st.setMsex(rs.getString("Msex"));
                 st.setMgrade(rs.getString("Mgrade"));
                 al.add(st);                  
             }  
             session.setAttribute("al",al);
             rs.close();
             response.sendRedirect("kitchen/management/admin_high/selectSelect.jsp");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

}
