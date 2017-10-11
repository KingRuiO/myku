package rui.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import rui.bean.Adtab;
import rui.dao.AdminDao;

public class ToIndex extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}


	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String aduser = null;
		String adpwd = null;
		String pwddb = null;
		aduser = request.getParameter("aduser");
		adpwd = request.getParameter("adpwd");
		System.out.println(aduser);
		System.out.println(adpwd);
		Adtab adt = new Adtab();
		adt.setAduser(aduser);
		adt.setAdpwd(adpwd);
		AdminDao adao = new AdminDao();
		String msg = null;
		if(aduser == null || adpwd ==null || aduser.equals("") || adpwd.equals("")){
			//msg = URLEncoder.encode("未接受到用户名或密码！", "UTF-8");
			out.print("<script language='javascript'>alert('未接受到用户名或密码！');window.location.href='login.jsp';</script>");
		}
		pwddb = adao.getAdminByUserName(aduser);
		System.out.println(pwddb);
		if(pwddb == null || pwddb.equals("")){
			//msg = URLEncoder.encode("用户名未找到", "UTF-8");
			out.print("<script language='javascript'>alert('用户名未找到');window.location.href='login.jsp';</script>");
			//response.sendRedirect(""+msg);
			return ;
		}
		if(!pwddb.equals(adpwd)){
			//msg = URLEncoder.encode("密码错误","UTF-8");
			out.print("<script language='javascript'>alert('密码错误');window.location.href='login.jsp';</script>");
			return ;
		}else{
			response.sendRedirect("index.jsp");
		}
	}

}
