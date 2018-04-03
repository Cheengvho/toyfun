package cn.cheen.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.cheen.daoimpl.CartDaoImpl;
import cn.cheen.daomain.User;

/**
 * Servlet implementation class CreateOrder
 */
@WebServlet("/CreateOrder")
public class CreateOrder extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreateOrder() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		CartDaoImpl dao = new CartDaoImpl();
		String[] p_id_temp =  request.getParameterValues("productChose");
		int[] p_id = new int[p_id_temp.length];
		User user = (User) request.getSession().getAttribute("user");
		for (int i = 0; i < p_id_temp.length; i++) {
			p_id[i] = Integer.parseInt(p_id_temp[i]);
		}
		
//		需要用户信息、总价、订单id（手动生成）、
		boolean succeed;
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
