package cn.cheen.adminservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.cheen.daoimpl.ProductDaoImpl;
import cn.cheen.daomain.Product;

/**
 * Servlet implementation class UpdateProductInfo
 */
@WebServlet("/UpdateProductInfo")
public class UpdateProductInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateProductInfo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		ProductDaoImpl dao = new ProductDaoImpl();
		int id = Integer.parseInt(request.getParameter("p_id"));
		String name = request.getParameter("p_name");
		double oldprice = Double.parseDouble(request.getParameter("old_price"));
		double nowprice = Double.parseDouble(request.getParameter("now_price"));
		String description = request.getParameter("p_description");
		int discount = Integer.parseInt(request.getParameter("discount"));
		Product product = new Product();
		product.setId(id);
		product.setName(name);
		product.setOldprice(oldprice);
		product.setNowprice(nowprice);
		product.setDescription(description);
		product.setDiscount(discount);
		boolean succeed = dao.UpdateProduct(product);
		if(succeed) {
			out.println("Update Product Information Succeed");
		} else {
			out.println("Update Product Information Failed");
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
