package rui.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class yanzheng extends HttpServlet {

	public void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
        String info=null;
        /*获取输入的值*/
        String value1=request.getParameter("name");

        /*获取图片的值*/
        HttpSession session=request.getSession();
        
        String value2=(String)session.getAttribute("checkcode");

        /*对比两个值（字母不区分大小写）*/
        if(value2.equalsIgnoreCase(value1)){
            info="验证码输入正确";
        }else{
            info="验证码输入错误";
        }
        System.out.println(info);
//        request.setAttribute("info", info);
//        request.getRequestDispatcher("/login.jsp").forward(request, response);
	}


}
