package cn.cheen.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.cheen.daoimpl.OrderDaoImpl;
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
		PrintWriter out = response.getWriter();
		OrderDaoImpl dao = new OrderDaoImpl();
		String[] p_id_temp =  request.getParameterValues("productChose");
		int[] p_id = new int[p_id_temp.length];
		User user = (User) request.getSession().getAttribute("user");
		for (int i = 0; i < p_id_temp.length; i++) {
			p_id[i] = Integer.parseInt(p_id_temp[i]);
		}
		boolean success = dao.createOrder(user, p_id);
//		需要用户信息、总价、订单id（手动生成）、
		if(success) {
			System.out.println("Creating Order Succeed");
			out.println("Creating Order Succeed");
		} else {
			System.out.println("Creating Order Failed");
			out.println("Creating Order Failed");
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
