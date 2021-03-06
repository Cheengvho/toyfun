package cn.cheen.adminservlet;

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
 * Servlet implementation class UpdateUserInfo
 */
@WebServlet("/UpdateUserInfo")
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
		PrintWriter out = response.getWriter();
		String username = request.getParameter("u_username");
//		System.out.println(username);
		
		String name = new String(request.getParameter("u_name").getBytes("ISO-8859-1"),"UTF-8");
		String email = request.getParameter("u_email");
		String phone = request.getParameter("u_phone");
		String city = new String(request.getParameter("u_city").getBytes("ISO-8859-1"),"UTF-8");
		String address = new String(request.getParameter("u_address").getBytes("ISO-8859-1"),"UTF-8");
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
		boolean succeed = dao.UpdateUserByUsername(user);
		if(succeed) {
			out.println("Update User Info Succeed");
		} else {
			out.println("Update User Info Failed");
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
