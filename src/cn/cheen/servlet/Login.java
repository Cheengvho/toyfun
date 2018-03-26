package cn.cheen.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.cheen.daomain.User;
import cn.cheen.daoimpl.UserDaoImpl;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");  
        response.setContentType("text/html;charset=utf-8");  
        String username = request.getParameter("username");  
        String password = request.getParameter("password");  
        UserDaoImpl userDaoImpl = new UserDaoImpl();
        User user=userDaoImpl.Login(username, password);  
        if(user!=null){  
        	request.getSession().setAttribute("user", user);
//            request.getRequestDispatcher("index.jsp").forward(request, response);
        	response.sendRedirect("/Index.jsp");
        }else{
        	request.setAttribute("loginms", "’ ∫≈ªÚ√‹¬Î¥ÌŒÛ");
            request.getRequestDispatcher("login.jsp").forward(request, response);  
        }  
	}

}
