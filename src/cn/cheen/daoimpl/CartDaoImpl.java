package cn.cheen.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;

import cn.cheen.dao.CartDao;
import cn.cheen.daomain.Product;
import cn.cheen.utils.Conn;

public class CartDaoImpl implements CartDao {
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	@Override
	public Collection<Product> FindCartProduct(String username) {
		Collection<Product> cartproducts = new ArrayList<Product>(); 
		
		String sql = "select * from user a,product b,cart c,classify d where a.username=c.username and b.p_id=c.p_id and b.c_id=d.c_id and a.username='"+username+"'";
		try {
			conn = Conn.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				Product product = new Product();
				product.setId(rs.getInt("p_id"));
				product.setName(rs.getString("p_name"));
				product.setOldprice(rs.getDouble("old_price"));
				product.setNowprice(rs.getDouble("now_price"));
				product.setDescription(rs.getString("p_description"));
				product.setDiscount(rs.getInt("discount"));
				product.setTime(rs.getString("p_time"));
				product.setC_id(rs.getInt("c_id"));
				product.setC_name(rs.getString("c_name"));
				cartproducts.add(product);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println(e.getMessage().toString());
		} finally {
			Conn.release(conn);
			Conn.release(pstmt);
			Conn.release(rs);
		}
		return cartproducts;
	}

	@Override
	public boolean AddCartProduct(int u_id, String username, int p_id) {
		int i = 0;
		boolean succeed = false;
		int cp_count = 0;
		String selectsql = "select * from cart where u_id=? and username=? and p_id=?";
		String insertcountsql = "insert into cart(cp_count) values(?)";
		String insertsql = "insert into cart(u_id,username,p_id) values(?,?,?)";
		try {
			conn = Conn.getConnection();
			pstmt  = conn.prepareStatement(selectsql);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				cp_count = rs.getInt("cp_count");
				cp_count++;
				pstmt = null;
				pstmt = conn.prepareStatement(insertcountsql);
				pstmt.setInt(1, cp_count);
				i = pstmt.executeUpdate();
				if(i>0) {
					succeed = true;
				} 
			} else {
				pstmt  = conn.prepareStatement(insertsql);
				pstmt.setInt(1, u_id);
				pstmt.setString(2, username);
				pstmt.setInt(3, p_id);
				i = pstmt.executeUpdate();
				if(i > 0) {
					succeed = true;
				}
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
	public boolean DeletedCartProduct(int u_id, String username, int p_id) {
		int i = 0;
		boolean succeed = false;
		String sql = "delete from cart where u_id=? and p_id=? ";
		try {
			conn = Conn.getConnection();
			pstmt  = conn.prepareStatement(sql);
			pstmt.setInt(1, u_id);
			pstmt.setInt(2, p_id);
			i = pstmt.executeUpdate();
			if(i > 0) {
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

	@Override
	public boolean UpdateCartProduct(int u_id, String username, int p_id) {
		int i = 0;
		boolean succeed = false;
		int cp_count = 0;
		String sql = "update cart set cp_count=? where u_id=? and username=? and p_id=?";
		try {
			conn = Conn.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, cp_count);
			pstmt.setInt(2, u_id);
			pstmt.setString(3, username);
			pstmt.setInt(4, p_id);
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
