package cn.cheen.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.cheen.daoimpl.CartDaoImpl;
import cn.cheen.daomain.Product;
import cn.cheen.daomain.User;

/**
 * Servlet implementation class Cart
 */
@WebServlet("/Cart.jsp")
public class Cart extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Cart() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		CartDaoImpl dao = new CartDaoImpl();
		
		User user = (User) request.getSession().getAttribute("user");
		String username="";
		if( user!=null ) {
			username = user.getUsername();
//			System.out.println(username);
			Collection<Product> cartproducts = dao.FindCartProduct(username);
			request.getSession().setAttribute("cartproducts", cartproducts);
			request.getRequestDispatcher("/cart.jsp").forward(request, response);  
		} else {
			request.setAttribute("loginms", "要使用购物车，请先登录");
			request.getRequestDispatcher("/login.jsp").forward(request, response);
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
