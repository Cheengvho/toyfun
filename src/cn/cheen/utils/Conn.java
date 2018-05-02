package cn.cheen.utils;

import java.sql.*;
public class Conn {

	public static Connection getConnection(){
		Connection conn=null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/toyfun?useUnicode=true&amp;characterEncoding=UTF-8";
			String user="root";
//			String password="x5";
			String password="123456";
			conn=DriverManager.getConnection(url,user,password);
			
		}catch(Exception e){
			e.printStackTrace();
		}
		return conn;
	}
	public static void release(Connection conn){
		if(conn!=null)
		try{
			conn.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
	public static void release(PreparedStatement pstmt){
		if(pstmt!=null)
		try{
			pstmt.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
	public static void release(ResultSet rs){
		if(rs!=null)
		try{
			rs.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
}



