package rui.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import rui.dao.YgDao;

public class DeleteYuanGong extends HttpServlet {

	public void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int ygNo =Integer.parseInt(request.getParameter("ygNo"));
		//System.out.println(ygNo);
		YgDao yd = new YgDao();
		yd.deleteYuanGong(ygNo);
		
		request.getRequestDispatcher("yuangong.jsp").forward(request, response);
	}

}
