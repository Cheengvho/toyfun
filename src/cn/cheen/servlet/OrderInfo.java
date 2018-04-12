package cn.cheen.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.cheen.daoimpl.OrderDaoImpl;
import cn.cheen.daoimpl.ProductDaoImpl;
import cn.cheen.daomain.Order;
import cn.cheen.daomain.Product;

/**
 * Servlet implementation class OrderInfo
 */
@WebServlet("/OrderInfo.jsp")
public class OrderInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public OrderInfo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		OrderDaoImpl dao = new OrderDaoImpl();
		String o_id = request.getParameter("o_id");
		Order orderInfo = dao.selectSingleOrder(o_id);
		Collection<Product> products = new ArrayList<Product>();
		products = dao.selectOrderitem(o_id);
		request.setAttribute("orderInfo", orderInfo);
		request.setAttribute("products", products);
		request.getRequestDispatcher("/orderInfo.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
