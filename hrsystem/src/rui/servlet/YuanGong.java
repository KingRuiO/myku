package rui.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import rui.bean.Ygtab;
import rui.dao.YgDao;

public class YuanGong extends HttpServlet {

	public void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		YgDao yg = new YgDao();
		List<Ygtab> Yglist = yg.getAllYg();
		
		request.setAttribute("Yglist", Yglist);
		request.getRequestDispatcher("yuangong.jsp").forward(request, response);
	}

}
