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

//	�û���¼
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
				System.out.println("�û���" + user.getUsername() + " ��¼�ɹ���");
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

//	ͨ���û��������û�
	@Override
	public User FindUserByUsername(String username) {
		String sql = "select * from user where username='"+username+"'";
		try {
			conn = Conn.getConnection();
			// ��̬sql���
			pstmt = conn.prepareStatement(sql);
//			System.out.println(sql);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				user = new User();
				user.setId(rs.getInt("u_id"));
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
	
//	�����û���ɾ���û�
	@Override
	public boolean DeleteUserByUsername(String username) {
		int i = 0;
		boolean succeed = false;
		String sql = "delete from user where username='"+username+"'";
		try {
			conn = Conn.getConnection();
			pstmt = conn.prepareStatement(sql);
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
		}
		return succeed;

	}

	@Override
	public boolean UpdateUserByUsername(User user) {
		int i = 0;
		boolean succeed = false;
		String sql = "update user set u_name='"+user.getName()+"',u_email='"+user.getEmail()+"',u_phone='"+user.getPhone()+"',u_city='"+user.getCity()+"',u_address='"+user.getAddress()+"',u_poscode='"+user.getPoscode()+"' where username='"+user.getUsername()+"'";
//		System.out.println(sql);
		try {
			conn = Conn.getConnection();
			pstmt = conn.prepareStatement(sql);
//			pstmt.setString(1, user.getName());
//			pstmt.setString(2, user.getEmail());
//			pstmt.setString(3, user.getPhone());
//			pstmt.setString(4, user.getCity());
//			pstmt.setString(5, user.getAddress());
//			pstmt.setString(6, user.getPoscode());
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

//	�û�ע��
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
				System.out.println("�û���"+user.getUsername()+"ע��ɹ�");
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
	
//	��ѯ�û��б��ģ����ѯ�û��б�
	@Override
	public Collection<User> FindAllUsers(String likeusername) {
		Collection<User> users = new ArrayList<User>();
		String sql = "select * from user where 1=1";
		String a = " and username like '%" + likeusername + "%'";
		try {
			if (likeusername!="" && likeusername!=null) {
				sql += a;
			}
//			System.out.println(sql);
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
	
//	����Ա�޸��û��������
	@Override
	public boolean UpdatePasswordByAdmin(String username, String newpassword) {
		int i = 0;
		boolean succeed = false;
		String sql = "Update user set password=? where username=?";
		try {
			conn = Conn.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, newpassword);
			pstmt.setString(2, username);
			i = pstmt.executeUpdate();
			if(i>0) {
				succeed = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println(e.getMessage().toString());
		} finally {
			Conn.release(conn);
			Conn.release(pstmt);
		}
		return succeed;
	}

}
