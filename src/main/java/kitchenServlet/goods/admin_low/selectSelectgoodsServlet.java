package kitchenServlet.goods.admin_low;

import java.io.IOException;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.goods;
import dao.goodsDao;

/**
 * Servlet implementation class selectSelectBrandServlet
 */
@WebServlet("/selectSelectgoodsServlet")
public class selectSelectgoodsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public selectSelectgoodsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try{
        	goodsDao db=new goodsDao(); 
            String no=request.getParameter("Gno");
            ResultSet rs=db.selectUpdategoods(no);
             HttpSession session=request.getSession();
             ArrayList al=new ArrayList();            
             while(rs.next()){
                 goods st=new goods();
                 st.setGno(rs.getString("Gno"));
                 st.setGname(rs.getString("Gname"));
                 st.setGprice(rs.getString("Gprice"));
                 st.setGamount(rs.getString("Gamount"));
                 st.setKno(rs.getString("Kno"));
                 st.setBrno(rs.getString("Brno"));       
                 al.add(st);
             }  
             session.setAttribute("al",al);
             rs.close();
             response.sendRedirect("kitchen/goods/admin_low/selectSelect.jsp");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

}
