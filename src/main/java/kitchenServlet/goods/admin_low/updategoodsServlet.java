package kitchenServlet.goods.admin_low;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.goodsDao;

/**
 * Servlet implementation class updatebrandServlet
 */
@WebServlet("/updategoodsServlet")
public class updategoodsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public updategoodsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    	String Gno1=request.getParameter("Gno");
        String Gname1=request.getParameter("Gname");
        String Gprice1=request.getParameter("Gprice");
        String Gamount1=request.getParameter("Gamount");
        String Kno1=request.getParameter("Kno");
        String Brno1=request.getParameter("Brno");


        goodsDao db=new goodsDao();
        if(db.updategoods(Gno1,Gname1,Gprice1,Gamount1,Kno1,Brno1)){
            response.sendRedirect("kitchen/goods/admin_low/message1.jsp");
        }else{
            response.sendRedirect("kitchen/goods/admin_low/lookUpdate.jsp");
       }        
      
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

}
