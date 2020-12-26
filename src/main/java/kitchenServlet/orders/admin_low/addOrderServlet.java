package kitchenServlet.orders.admin_low;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ordersDao;


/**
 * Servlet implementation class addBrandServlet
 */
@WebServlet("/addOrderServlet")
public class addOrderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public addOrderServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {        
        String Ono=request.getParameter("Ono");
        String Oamount=request.getParameter("Oamount");
        String Otime=request.getParameter("Otime");
        String Omoney=request.getParameter("Omoney");
        String Bno=request.getParameter("Bno");
        
        int Oamount1=Integer.parseInt(Oamount);
        float Omoney1=Float.parseFloat(Omoney);
        
        ordersDao db=new ordersDao();
        if(db.addOrders(Ono,Oamount1,Otime,Omoney1,Bno)){
            response.sendRedirect("kitchen/orders/admin_low/Omessage.jsp");
        }else{
            response.sendRedirect("kitchen/orders/admin_low/Oinsert.jsp");
       }        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

}
