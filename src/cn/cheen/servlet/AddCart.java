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
 * Servlet implementation class AddCart
 */
@WebServlet("/AddCart")
public class AddCart extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddCart() {
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
		int u_id = 0;
		String username = null;
		if( user!=null ) {
			u_id = user.getId();
			username = user.getUsername();
//			System.out.println("userID:"+user.getId());
			boolean succeed = dao.AddCartProduct(u_id, username, p_id);
			if (succeed) {
				request.setAttribute("addms","<font color='green'>��ӹ��ﳵ�ɹ�</font><a href='Products.jsp' class='btn btn-primary'>�����̳�</a>");
			} else {
				request.setAttribute("addms","<font color='red'>��ӹ��ﳵʧ��</font><a href='Products.jsp' class='btn btn-danger'>ȥ�������</a>");
			}
		} else {
			request.setAttribute("addms","<font color='red'>��ӹ��ﳵʧ�ܣ�ʧ��ԭ��δ��¼</font><a href='login.jsp' class='btn btn-danger'>ȥ��¼</a>");
		}
		request.getRequestDispatcher("/products.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
