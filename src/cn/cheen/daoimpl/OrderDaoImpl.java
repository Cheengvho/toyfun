package cn.cheen.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import java.sql.SQLException;

import cn.cheen.dao.OrderDao;
import cn.cheen.daomain.Order;
import cn.cheen.daomain.User;
import cn.cheen.utils.Conn;

public class OrderDaoImpl implements OrderDao {
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;

	@Override
	public boolean createOrder(User user, int[] p_id) {
		Date date = new Date();
		int successCount = 0;
		boolean success = false;
		// 设置要获取时间的格式
		SimpleDateFormat time_sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		SimpleDateFormat o_id_sdf = new SimpleDateFormat("yyMMddHHmmssSSS");
		// 将获取到的时间转为String类型
		String o_id = o_id_sdf.format(date);
		double sum_total_price = 0;
		double total_price = 0;
		String o_time = time_sdf.format(date);
		// 对购物车中商品进行查询的sql
		String selectsql = "";
		// 插入订单的sql语句
		String insertsql = "";
		// 插入orderitem表中商品的sql
		String insertproductsql = "";
		// 插入orderitem完成后，进行删除购物车中内容
		String deleteproductsql = "";
		try {
			conn = Conn.getConnection();
			for (int i = 0; i < p_id.length; i++) {
				selectsql = "select * from cart where u_id='" + user.getId() + "' and p_id=" + p_id[i];
				pstmt = conn.prepareStatement(selectsql);
				rs = pstmt.executeQuery();
				while (rs.next()) {
					total_price = rs.getInt("cp_count") * rs.getDouble("cp_price");
					sum_total_price += total_price;
					insertproductsql = "insert into orderitem(item_count,item_totalprice,p_id,o_id) values(?,?,?,?)";
					pstmt = conn.prepareStatement(insertproductsql);
					pstmt.setInt(1, rs.getInt("cp_count"));
					pstmt.setDouble(2, total_price);
					pstmt.setInt(3, rs.getInt("p_id"));
					pstmt.setString(4, o_id);
					int testInsert = pstmt.executeUpdate();
					if (testInsert > 0) {
						System.out.println("orderitem succeed");
						deleteproductsql = "delete from cart where cp_id=" + rs.getInt("cp_id");
						pstmt = conn.prepareStatement(deleteproductsql);
						int testDelete = pstmt.executeUpdate();
						if (testDelete > 0) {
							System.out.println("cart succeed");
						} else {
							System.out.println("cart failed");
						}
					} else {
						System.out.println("orderitem failed");
					}
				}

			}
			insertsql = "insert into orders(o_id,total_price,o_time,city,name,phone,address,poscode,u_id) values(?,?,?,?,?,?,?,?,?)";
			pstmt = conn.prepareStatement(insertsql);
			pstmt.setString(1, o_id);
			pstmt.setDouble(2, sum_total_price);
			pstmt.setString(3, o_time);
			pstmt.setString(4, user.getCity());
			pstmt.setString(5, user.getName());
			pstmt.setString(6, user.getPhone());
			pstmt.setString(7, user.getAddress());
			pstmt.setString(8, user.getPoscode());
			pstmt.setInt(9, user.getId());
			successCount = pstmt.executeUpdate();
			if (successCount > 0) {
				success = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println(e.getMessage().toString());
		} finally {
			Conn.release(conn);
			Conn.release(pstmt);
			Conn.release(rs);
		}

		return success;
	}

	@Override
	public boolean deleteOrder(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateOrder(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Collection<Order> selectAllOrder(int u_id) {
		Collection<Order> orders = new ArrayList<Order>();
		String sql = "select * from orders where u_id="+u_id;
		try {
			conn = Conn.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				Order order = new Order();
				order.setId(rs.getString("o_id"));
				order.setTotalPrice(rs.getDouble("total_price"));
				order.setTime(rs.getString("o_time"));
				order.setCity(rs.getString("city"));
				order.setName(rs.getString("name"));
				order.setPhone(rs.getString("phone"));
				order.setEmail(rs.getString("email"));
				order.setAddress(rs.getString("address"));
				order.setPoscode(rs.getString("poscode"));
				order.setU_id(rs.getInt("u_id"));
				orders.add(order);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println(e.getMessage().toString());
		} finally {
			Conn.release(conn);
			Conn.release(pstmt);
			Conn.release(rs);
		}
		return orders;
	}

	@Override
	public Order selectSingleOrder(String id) {
		Order orderInfo = new Order();
		String sql = "select * from order where o_id="+id;
		try {
			conn = Conn.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				orderInfo.setId(rs.getString("o_id"));
				orderInfo.setTotalPrice(rs.getDouble("total_price"));
				orderInfo.setTime(rs.getString("o_time"));
				orderInfo.setCity(rs.getString("city"));
				orderInfo.setName(rs.getString("name"));
				orderInfo.setPhone(rs.getString("phone"));
				orderInfo.setEmail(rs.getString("email"));
				orderInfo.setAddress(rs.getString("address"));
				orderInfo.setPoscode(rs.getString("poscode"));
				orderInfo.setU_id(rs.getInt("u_id"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println(e.getMessage().toString());
		}
		return orderInfo;
	}

}
