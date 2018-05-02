package cn.cheen.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.cheen.daoimpl.UserDaoImpl;
import cn.cheen.daomain.User;

/**
 * Servlet implementation class UserInfoUpdate
 */
@WebServlet("/UserInfoUpdate")
public class UserInfoUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserInfoUpdate() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String username = request.getParameter("username");
		String name = new String(request.getParameter("name").getBytes("ISO-8859-1"),"UTF-8");
		System.out.println(name);
		String city = new String(request.getParameter("city").getBytes("ISO-8859-1"),"UTF-8");
		String phone = request.getParameter("phone");
		String email = request.getParameter("email");
		String poscode = request.getParameter("poscode");
		String address = new String(request.getParameter("address").getBytes("ISO-8859-1"),"UTF-8");
		User user = new User();
		user.setUsername(username);
		user.setName(name);
		user.setCity(city);
		user.setPhone(phone);
		user.setEmail(email);
		user.setPoscode(poscode);
		user.setAddress(address);
		UserDaoImpl dao = new UserDaoImpl();
		boolean success = dao.UpdateUserByUsername(user);
		if(success) {
			out.println("Update User Information Succeed!");
		} else {
			out.println("Update User Information Failed!");
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
