package kitchenServlet.goods.admin_low;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import dao.goodsDao;

/**
 * Servlet implementation class dropgoodsServlet
 */
@WebServlet("/dropgoodsServlet")
public class dropgoodsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public dropgoodsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        goodsDao db=new goodsDao();
        String NO=request.getParameter("NO");
        if(db.Deletegoods(NO))
            response.sendRedirect("kitchen/goods/admin_low/message1.jsp");
        else
        	response.sendRedirect("kitchen/goods/admin_low/deleteS.jsp");
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

}
