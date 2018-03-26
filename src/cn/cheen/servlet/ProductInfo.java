package cn.cheen.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.cheen.daoimpl.ProductDaoImpl;
import cn.cheen.daomain.Product;

/**
 * Servlet implementation class ProductInfo
 */
@WebServlet("/ProductInfo.jsp")
public class ProductInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductInfo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		ProductDaoImpl dao = new ProductDaoImpl();
		int id = Integer.parseInt(request.getParameter("id"));
//		System.out.println(id);
		String name = null;
		int c_id = 0;
		Collection<Product> product = dao.select(id, name, c_id);
		
		Collection<Product> images = dao.FindProductImages(id);
		
		
		request.setAttribute("productInfo", product);
		request.setAttribute("images", images);
		request.getRequestDispatcher("/productInfo.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
