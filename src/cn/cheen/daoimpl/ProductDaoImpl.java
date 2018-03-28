package cn.cheen.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import cn.cheen.dao.ProductDao;
import cn.cheen.daomain.Product;
import cn.cheen.utils.Conn;

public class ProductDaoImpl implements ProductDao {
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;

	@Override

	// 添加商品
	public boolean AddProduct(Product product) {
		boolean succeed = false;
		int i = 0;
		String sql = "insert into product(p_name,old_price,now_price,p_image,p_description,discount,p_time,c_id) values(?,?,?,?,?,?,?,?)";
		// 我要获取当前的日期
		Date date = new Date();
		// 设置要获取时间的格式
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		// 将获取到的时间转为String类型
		String time = sdf.format(date);
		try {
			conn = Conn.getConnection();
			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, product.getName());
			pstmt.setDouble(2, product.getOldprice());
			pstmt.setDouble(3, product.getNowprice());
			pstmt.setString(4, product.getImage());
			pstmt.setString(5, product.getDescription());
			pstmt.setInt(6, product.getDiscount());
			pstmt.setString(7, time);
			pstmt.setInt(8, product.getC_id());

			i = pstmt.executeUpdate();
			if (i > 0) {
				succeed = true;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			Conn.release(conn);
			Conn.release(pstmt);
			Conn.release(rs);
		}

		return succeed;
	}

	@Override
	public Product FindProduct(int id) {

		return null;
	}

	// 更新商品
	@Override
	public boolean UpdateProduct(Product product) {
		int i = 0;
		boolean succeed = false;
		String sql = "update product set name=?,old_price=?,now_price=?,p_image=?,p_description=?,discount=?,p_time=?,c_id=? where id=?";

		// 我要获取当前的日期
		Date date = new Date();
		// 设置要获取时间的格式
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		// 将获取到的时间转为String类型
		String time = sdf.format(date);

		try {

			conn = Conn.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, product.getName());
			pstmt.setDouble(2, product.getOldprice());
			pstmt.setDouble(3, product.getNowprice());
			pstmt.setString(4, product.getImage());
			pstmt.setString(5, product.getDescription());
			pstmt.setInt(6, product.getDiscount());
			pstmt.setString(7, time);
			pstmt.setInt(8, product.getC_id());
			pstmt.setInt(9, product.getId());

			i = pstmt.executeUpdate();
			if (i > 0) {
				succeed = true;
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

	// 通过商品ID删除商品
	@Override
	public boolean DeleteProduct(int id) {
		int i = 0;
		boolean succeed = false;
		String sql = "delete from goods where id=?";

		try {
			conn = Conn.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, id);
			i = pstmt.executeUpdate();
			if (i > 0) {
				succeed = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			Conn.release(conn);
			Conn.release(pstmt);
			Conn.release(rs);
		}

		return succeed;
	}

	// 通过商品ID，名称、分类名称分别或者联合搜索商品
	@Override
	public Collection<Product> select(int id, String name, int c_id) {
		Collection<Product> products = new ArrayList<Product>();
		String sql = "select * from product  a,classify  b where a.c_id=b.c_id";
		String a = "";
		String b = "";
		String c = "";
		if (id > 0) {
			a = " and p_id='" + id + "'";
		}
		if (name != null && !name.equals("")) {
			b = " and p_name like '%" + name + "%'";
		}
		if (c_id > 0) {
			c = " and a.c_id='" + c_id + "'";
		}
		sql = sql + a + b + c;
		// System.out.print(sql);
		try {
			conn = Conn.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				Product product = new Product();
				product.setId(rs.getInt("p_id"));
				product.setName(rs.getString("p_name"));
				product.setOldprice(rs.getDouble("old_price"));
				product.setNowprice(rs.getDouble("now_price"));
				product.setImage(rs.getString("p_image"));
				product.setDescription(rs.getString("p_description"));
				product.setDiscount(rs.getInt("discount"));
				product.setTime(rs.getString("p_time"));
				product.setC_id(rs.getInt("c_id"));
				product.setC_name(rs.getString("c_name"));

				products.add(product);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println(e.getMessage().toString());
		} finally {
			Conn.release(conn);
			Conn.release(pstmt);
			Conn.release(rs);
		}

		return products;
	}

	// 查询商品详情图
	@Override
	public Collection<Product> FindProductImages(int id) {
		Collection<Product> images = new ArrayList<Product>();
		String sql = "select * from productimg where p_id=" + id;
		try {
			conn = Conn.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				Product image = new Product();
				image.setImage(rs.getString("pi_img"));

				images.add(image);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println(e.getMessage().toString());
		} finally {
			Conn.release(conn);
			Conn.release(pstmt);
			Conn.release(rs);
		}

		return images;
	}

	// 将商品设置为热卖商品
	@Override
	public boolean UpdateDiscountProduct(int id) {
		int i = 0;
		boolean succeed = false;
		String sql = "update product set discount=1 where id=?";

		try {

			conn = Conn.getConnection();
			pstmt = conn.prepareStatement(sql);

			pstmt.setInt(1, id);
			i = pstmt.executeUpdate();
			if (i > 0) {
				succeed = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			Conn.release(conn);
			Conn.release(pstmt);
			Conn.release(rs);
		}
		return succeed;
	}

	// 取消商品的热卖状态
	@Override
	public boolean CancelDiscountProduct(int id) {
		int i = 0;
		boolean succeed = false;
		String sql = "update product set discount=0 where id=?";
		try {
			conn = Conn.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, id);
			i = pstmt.executeUpdate();
			if (i > 0) {
				succeed = true;
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

	// 查询热卖商品
	@Override
	public Collection<Product> FindDiscountProduct() {
		Collection<Product> products = new ArrayList<Product>();
		int i = 0;
		String sql = "select * from product a,classify b where discount=1 and a.c_id=b.c_id";
		try {
			conn = Conn.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				Product product = new Product();
				product.setId(rs.getInt("p_id"));
				product.setName(rs.getString("p_name"));
				product.setOldprice(rs.getDouble("old_price"));
				product.setNowprice(rs.getDouble("now_price"));
				product.setImage(rs.getString("p_image"));
				product.setDescription(rs.getString("p_description"));
				product.setDiscount(rs.getInt("discount"));
				product.setTime(rs.getString("p_time"));
				product.setC_id(rs.getInt("c_id"));
				product.setC_name(rs.getString("c_name"));

				products.add(product);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println(e.getMessage().toString());
		} finally {
			Conn.release(conn);
			Conn.release(pstmt);
			Conn.release(rs);
		}
		return products;
	}

}
