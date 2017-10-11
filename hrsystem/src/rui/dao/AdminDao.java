package rui.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import rui.bean.Adtab;
import rui.db.ConnectionDB;

public class AdminDao {
	
	public ConnectionDB db;
	public Connection conn;
	public PreparedStatement ps;
	public ResultSet rs;
	
	public AdminDao(){
		db = new ConnectionDB();
	}

	public String getAdminByUserName(String aduser){
		String adpwd = null;
		conn = db.openConn();
		String sql = "select adpwd from adtab where aduser=?";
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, aduser);
			rs = ps.executeQuery();
			if(rs.next()){
				adpwd = rs.getString(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			db.closeConn(ps, conn, rs);
		}
		return adpwd;
		
	}
	public static void main(String[] args) {
		AdminDao adm = new AdminDao();
		System.out.println(adm.getAdminByUserName("aaa"));
	}
	public List<Adtab> getAll(){//查询所有管理员
		List<Adtab> list = new ArrayList<Adtab>();
		conn = db.openConn();
		String sql = "select * from adtab";
		try {
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()){
				Adtab at = new Adtab();
				at.setAdno(rs.getInt(1));
				at.setAduser(rs.getString(2));
				at.setAdpwd(rs.getString(3));
				list.add(at);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			db.closeConn(ps, conn, rs);
		}
		return list;
	}
	
	public void addadtab(Adtab atInfo){//插入管理员
		conn = db.openConn();
		String sql = "insert into adtab(aduser,adpwd) values(?,?)";
		
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, atInfo.getAduser());
			ps.setString(2, atInfo.getAdpwd());
			ps.executeUpdate();
			 
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			db.closeConn(ps, conn, rs);
		}	
	}
	
	public void deleadtab(){
		conn = db.openConn();
		String sql = "delete from adtab where ";
		try {
			ps = conn.prepareStatement(sql);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
