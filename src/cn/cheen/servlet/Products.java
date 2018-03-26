package cn.cheen.servlet;

import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.cheen.daoimpl.ClassifyDaoImpl;
import cn.cheen.daoimpl.ProductDaoImpl;
import cn.cheen.daomain.Classify;
import cn.cheen.daomain.Product;

/**
 * Servlet implementation class FindProduct
 */
@WebServlet("/Products.jsp")
public class Products extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Products() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ProductDaoImpl p_dao = new ProductDaoImpl();
		ClassifyDaoImpl c_dao = new ClassifyDaoImpl();
		int id=0;
		String name=request.getParameter("p_name");
		int c_id = 0;
		if(request.getParameter("c_id")!=null && request.getParameter("c_id")!="") {
			c_id = Integer.parseInt(request.getParameter("c_id"));
		}
		
		Collection<Product> product = p_dao.select(id, name, c_id);
		Collection<Classify> classify = c_dao.FindClassify(c_id);
		
		request.setAttribute("product", product);
		request.setAttribute("classify", classify);
        request.getRequestDispatcher("products.jsp").forward(request, response);  
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
