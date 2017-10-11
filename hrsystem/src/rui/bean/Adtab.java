package rui.bean;

public class Adtab {
	private int adno;
	private String aduser;
	private String adpwd;
	
	
	public Adtab() {
		super();
	}
	public Adtab(int adno, String aduser, String adpwd) {
		super();
		this.adno = adno;
		this.aduser = aduser;
		this.adpwd = adpwd;
	}
	public int getAdno() {
		return adno;
	}
	public void setAdno(int adno) {
		this.adno = adno;
	}
	public String getAduser() {
		return aduser;
	}
	public void setAduser(String aduser) {
		this.aduser = aduser;
	}
	public String getAdpwd() {
		return adpwd;
	}
	public void setAdpwd(String adpwd) {
		this.adpwd = adpwd;
	}
	
	

}
