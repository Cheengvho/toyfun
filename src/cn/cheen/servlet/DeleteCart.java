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
 * Servlet implementation class DeleteCart
 */
@WebServlet("/DeleteCart")
public class DeleteCart extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteCart() {
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
		int p_id = Integer.parseInt(request.getParameter("p_id"));
		User user = (User) request.getSession().getAttribute("user");
		String username = null;
		int u_id = 0;
		boolean succeed = false;
		if (user!=null) {
			u_id = user.getId();
			succeed = dao.DeletedCartProduct(u_id, username, p_id);
			if(succeed) {
				request.setAttribute("deletecartms", "<font color='green'>ɾ�����ﳵ��Ʒ�ɹ�</font><a href='Cart.jsp' class='btn btn-primary'>���ع��ﳵ</a>");
			} else {
				request.setAttribute("deletecartms", "<font color='green'>ɾ�����ﳵ��Ʒʧ��</font><a href='Cart.jsp' class='btn btn-danger'>���ع��ﳵ</a>");
			}
		} 
		request.getRequestDispatcher("/cart.jsp").forward(request, response);
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
