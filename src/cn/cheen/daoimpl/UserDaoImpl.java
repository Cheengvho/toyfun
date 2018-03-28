package cn.cheen.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import cn.cheen.dao.UserDao;
import cn.cheen.daomain.User;
import cn.cheen.utils.Conn;

import java.util.ArrayList;
import java.util.Collection;

public class UserDaoImpl implements UserDao {

	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	User user = null;

	@Override
	public User Login(String username, String password) {

		// 赋值
		try {
			conn = Conn.getConnection();
			// 静态sql语句
			String sql = "select * from user where username=? and password=?";
			pstmt = (PreparedStatement) conn.prepareStatement(sql);
			pstmt.setString(1, username);
			pstmt.setString(2, password);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				user = new User();
				user.setId(rs.getInt("u_id"));
				user.setUsername(rs.getString("username"));
				user.setPassword(rs.getString("password"));
				user.setName(rs.getString("u_name"));
				user.setEmail(rs.getString("u_email"));
				user.setPhone(rs.getString("u_phone"));
				user.setAddress(rs.getString("u_address"));
				user.setCity(rs.getString("u_city"));
				user.setPoscode(rs.getString("u_poscode"));
				user.setImg(rs.getString("u_img"));
				System.out.println("用户：" + user.getUsername() + " 登录成功！");
			} else {
				System.out.println("用户名或者密码错误！");
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println(e.getMessage().toString());
		} finally {
			Conn.release(conn);
			Conn.release(pstmt);
			Conn.release(rs);
		}
		return user;
	}

//	通过用户名查找用户
	@Override
	public User FindUserByUsername(String username) {

		// 赋值
		try {
			conn = Conn.getConnection();
			// 静态sql语句
			String sql = "select * from user where username=?";
			pstmt = (PreparedStatement) conn.prepareStatement(sql);
			pstmt.setString(1, username);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				user = new User();

				user.setUsername(rs.getString("username"));
				user.setName(rs.getString("u_name"));
				user.setEmail(rs.getString("u_email"));
				user.setPhone(rs.getString("u_phone"));
				user.setAddress(rs.getString("u_address"));
				user.setCity(rs.getString("u_city"));
				user.setPoscode(rs.getString("u_poscode"));
				user.setImg(rs.getString("u_img"));
				System.out.println("查询成功！");
			} else {
				System.out.println("查询失败！");
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println(e.getMessage().toString());
		} finally {
			Conn.release(conn);
			Conn.release(pstmt);
			Conn.release(rs);
		}
		return user;
	}
	
//	根据用户名删除用户
	@Override
	public boolean DeleteUserByUsername(String username) {
		int i = 0;
		boolean succeed = false;
		// 赋值
		try {
			conn = Conn.getConnection();
			// 静态sql语句
			String sql = "delete * from user where username=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, username);
			i = pstmt.executeUpdate();
			if (i > 0) {
				succeed = true;
				System.out.println("删除成功");
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println(e.getMessage().toString());
		} finally {
			Conn.release(conn);
			Conn.release(pstmt);
			Conn.release(rs);
		}
		return succeed;

	}

	@Override
	public boolean UpdateUserByUsername(User user) {
		int i = 0;
		boolean succeed = false;
		String sql = "update user ser u_name=? and u_email=? and u_phone=? and u_city=? and u_address=? and u_poscode=? where username=?";
		try {
			conn = Conn.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, user.getName());
			pstmt.setString(2, user.getEmail());
			pstmt.setString(3, user.getPhone());
			pstmt.setString(4, user.getCity());
			pstmt.setString(5, user.getAddress());
			pstmt.setString(6, user.getPoscode());
			pstmt.setString(7, user.getUsername());
			i = pstmt.executeUpdate();
			if(i>0) {
				succeed = true;
			}
					
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println(e.getMessage().toString());
		}
		return succeed;
	}

//	用户注册
	@Override
	public boolean AddUser(User user) {
		int i = 0;
		boolean succeed = false;
		String sql = "insert into user(username,password,u_email)values(?,?,?)";
		try {
			conn = Conn.getConnection();
			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, user.getUsername());
			pstmt.setString(2, user.getPassword());
			pstmt.setString(3, user.getEmail());
			i = pstmt.executeUpdate();
			if (i > 0) {
				succeed = true;
				System.out.println("插入成功");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage().toString());
		} finally {
			Conn.release(conn);
			Conn.release(pstmt);
		}
		return succeed;
	}
	
//	查询用户列表和模糊查询用户列表
	@Override
	public Collection<User> FindAllUsers(String likeusername) {
		Collection<User> users = new ArrayList<User>();
		String sql = "select * from user where 1=1";
		String a = " and username like '%" + likeusername + "%'";
		try {
			if (likeusername!="" && likeusername!=null) {
				sql += a;
			}
			conn = Conn.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				User user = new User();
				user.setUsername(rs.getString("username"));
				user.setName(rs.getString("u_name"));
				user.setEmail(rs.getString("u_email"));
				user.setPhone(rs.getString("u_phone"));
				user.setAddress(rs.getString("u_address"));
				user.setCity(rs.getString("u_city"));
				user.setPoscode(rs.getString("u_poscode"));
				user.setImg(rs.getString("u_img"));
				users.add(user);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println(e.getMessage().toString());
		} finally {
			Conn.release(conn);
			Conn.release(pstmt);
			Conn.release(rs);
		}
		return users;
	}

}
