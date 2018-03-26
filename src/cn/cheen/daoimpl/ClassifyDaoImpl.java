package cn.cheen.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;



import cn.cheen.dao.ClassifyDao;
import cn.cheen.daomain.Classify;
import cn.cheen.utils.Conn;

public class ClassifyDaoImpl implements ClassifyDao {
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	@Override
	public boolean AddClassify(String name) {
		int i = 0;
		boolean succeed = false;
		String sql = "insert into classify(name) values(?)";
		try {
			conn = Conn.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
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
	public boolean DeleteClassify(int id) {
		int i = 0;
		boolean succeed = false;
		String sql = "delete from classify where id=?";
		try {
			conn = Conn.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, id);
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
	public Collection<Classify> FindClassify(int id) {
		Collection<Classify> classifys = new ArrayList<Classify>();
		String a="";
		String sql = "select * from classify where 1=1";
		if(id > 0) {
			a=" and id=?";
		}
		try {
			conn = Conn.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				Classify classify = new Classify();
				classify.setId(rs.getInt("c_id"));
				classify.setName(rs.getString("c_name"));
				classifys.add(classify);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println(e.getMessage().toString());
		} finally {
			Conn.release(conn);
			Conn.release(pstmt);
			Conn.release(rs);
		}
		
		return classifys;
	}

	@Override
	public boolean UpdateClassify(Classify classify) {
		int i = 0;
		boolean succeed = false;
		String sql = "update classify set c_name=? where c_id=?";
		try {
			conn = Conn.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, classify.getName());
			pstmt.setInt(1, classify.getId());
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

}
