package rui.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import rui.bean.Ygtab;
import rui.db.ConnectionDB;

public class YgDao {
	public ConnectionDB db;
	public Connection conn;
	public PreparedStatement ps;
	public ResultSet rs;
	
	public YgDao(){
		db = new ConnectionDB();
	}
	//查询所有员工信息
	public List<Ygtab> getAllYg(){
		conn = db.openConn();
		String sql = "select * from ygtab";
		List<Ygtab> list = new ArrayList<Ygtab>();
		try {
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()){
				Ygtab yt = new Ygtab();
				yt.setYgNo(rs.getInt(1));
				yt.setyName(rs.getString(2));
				yt.setySex(rs.getString(3));
				yt.setyAge(rs.getInt(4));
				yt.setyPhone(rs.getInt(5));
				yt.setyAddress(rs.getString(6));
				yt.setyHiredate(rs.getDate(7));
				yt.setyJob(rs.getString(8));
				yt.setySal(rs.getInt(9));
				list.add(yt);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			db.closeConn(ps, conn, rs);
		}
		return list;
	}
	public static void main(String[] args) {
		YgDao y = new YgDao();
		List<Ygtab> a = y.getAllYg();
		System.out.println(a);
	}
	//根据员工姓名查询
	public void getYuanGongByName(){
		conn = db.openConn();
		String sql = "select * from ygtab where yname=?";
		
	}
	//修改员工信息
	public void updateYuanGong(){
		conn = db.openConn();
		String sql = "update ygtab set yname=?,ysex=?,yage=?,yphone=?,"
						+"yaddress=?,yhiredate=?,yjob=?,ysal=? where ygno=?";
		
		
	}
	//删除员工信息
	public void deleteYuanGong(int ygno){
		conn = db.openConn();
		String sql = "delete from ygtab where ygno=?";
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, ygno);
			ps.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			db.closeConn(ps, conn, rs);
		}
		
	}
	
	
}
