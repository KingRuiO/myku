package rui.bean;

import java.sql.Date;

public class Ygtab {
	private int ygNo;
	private String yName;
	private String ySex;
	private int yAge;
	private int yPhone;
	private String yAddress;
	private Date yHiredate;
	private String yJob;
	private int ySal;
	
	
	public Ygtab(int ygNo, String yName, String ySex, int yAge, int yPhone,
			String yAddress, Date yHiredate, String yJob, int ySal) {
		super();
		this.ygNo = ygNo;
		this.yName = yName;
		this.ySex = ySex;
		this.yAge = yAge;
		this.yPhone = yPhone;
		this.yAddress = yAddress;
		this.yHiredate = yHiredate;
		this.yJob = yJob;
		this.ySal = ySal;
	}
	public Ygtab() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getYgNo() {
		return ygNo;
	}
	public void setYgNo(int ygNo) {
		this.ygNo = ygNo;
	}
	public String getyName() {
		return yName;
	}
	public void setyName(String yName) {
		this.yName = yName;
	}
	public String getySex() {
		return ySex;
	}
	public void setySex(String ySex) {
		this.ySex = ySex;
	}
	public int getyAge() {
		return yAge;
	}
	public void setyAge(int yAge) {
		this.yAge = yAge;
	}
	public int getyPhone() {
		return yPhone;
	}
	public void setyPhone(int yPhone) {
		this.yPhone = yPhone;
	}
	public String getyAddress() {
		return yAddress;
	}
	public void setyAddress(String yAddress) {
		this.yAddress = yAddress;
	}
	public Date getyHiredate() {
		return yHiredate;
	}
	public void setyHiredate(Date yHiredate) {
		this.yHiredate = yHiredate;
	}
	public String getyJob() {
		return yJob;
	}
	public void setyJob(String yJob) {
		this.yJob = yJob;
	}
	public int getySal() {
		return ySal;
	}
	public void setySal(int ySal) {
		this.ySal = ySal;
	}
	
}
