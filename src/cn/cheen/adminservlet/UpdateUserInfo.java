package cn.cheen.adminservlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.cheen.daoimpl.UserDaoImpl;
import cn.cheen.daomain.User;

/**
 * Servlet implementation class UpdateUserInfo
 */
@WebServlet("/UpdateUserInfo.jsp")
public class UpdateUserInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateUserInfo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("u_username");
		String name = request.getParameter("u_name");
		String email = request.getParameter("u_email");
		String phone = request.getParameter("u_phone");
		String city = request.getParameter("u_city");
		String address = request.getParameter("u_address");
		String poscode = request.getParameter("u_poscode");
		User user = new User();
		user.setUsername(username);
		user.setName(name);
		user.setEmail(email);
		user.setPhone(phone);
		user.setCity(city);
		user.setAddress(address);
		user.setPoscode(poscode);
		UserDaoImpl dao = new UserDaoImpl();
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
