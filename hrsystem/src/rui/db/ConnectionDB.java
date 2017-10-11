package rui.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConnectionDB {
	private String url = "jdbc:mysql://127.0.0.1:3306/hrsys?useUnicode=true&characterEncoding=UTF8";
	private String username = "root";
	private String password = "123";
	private Connection conn;
	
	public Connection openConn(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url, username, password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;	
	}
	
	public void closeConn(PreparedStatement ps,Connection conn,ResultSet rs){
		if(rs != null){
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if(ps != null){
			try {
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if(conn!= null){
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}
	public static void main(String[] args) {
		ConnectionDB db = new ConnectionDB();
		System.out.println(db.openConn());
	}
}
