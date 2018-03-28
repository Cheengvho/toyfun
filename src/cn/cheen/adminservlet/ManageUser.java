package cn.cheen.adminservlet;

import java.io.IOException;
import java.util.Collection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.cheen.daoimpl.UserDaoImpl;
import cn.cheen.daomain.User;

/**
 * Servlet implementation class SelectAllUsers
 */
@WebServlet("/ManageUser.jsp")
public class ManageUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ManageUser() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String likeusername = null;
		UserDaoImpl dao = new UserDaoImpl();
		Collection<User> users = dao.FindAllUsers(likeusername);
		if(users!=null) {
			request.getSession().setAttribute("users", users);
			request.getRequestDispatcher("/admin/manageUser.jsp").forward(request, response);
		} else {
			System.out.println("查询用户列表失败");
			request.getRequestDispatcher("/admin/manageUser.jsp").forward(request, response);
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
