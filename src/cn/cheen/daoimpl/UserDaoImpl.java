package cn.cheen.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import cn.cheen.dao.UserDao;
import cn.cheen.daomain.User;
import cn.cheen.utils.Conn;

import java.util.Collection;

public class UserDaoImpl implements UserDao {

	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	User user = null;

	@Override
	public User Login(String username, String password) {

		// ��ֵ
		try {
			conn = Conn.getConnection();
			// ��̬sql���
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
				System.out.println("�û���"+user.getUsername()+" ��¼�ɹ���");
			} else {
				System.out.println("�û��������������");
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

	@Override
	public User FindUserByUsername(String username) {

		// ��ֵ
		try {
			conn = Conn.getConnection();
			// ��̬sql���
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
				System.out.println("��ѯ�ɹ���");
			} else {
				System.out.println("��ѯʧ�ܣ�");
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

	@Override
	public boolean DeleteUserByUsername(String username) {
		int i = 0;
		boolean succeed = false;
		// ��ֵ
		try {
			conn = Conn.getConnection();
			// ��̬sql���
			String sql = "delete * from user where username=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, username);
			i = pstmt.executeUpdate();
			if (i > 0) {
				succeed = true;
				System.out.println("ɾ���ɹ�");
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
	public boolean UpdateUserByUsername(String username) {
		int i = 0;
		boolean succeed = false;
		// TODO Auto-generated method stub
		return succeed;
	}

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
				System.out.println("����ɹ�");
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

}
