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
        /*��ȡ�����ֵ*/
        String value1=request.getParameter("name");

        /*��ȡͼƬ��ֵ*/
        HttpSession session=request.getSession();
        
        String value2=(String)session.getAttribute("checkcode");

        /*�Ա�����ֵ����ĸ�����ִ�Сд��*/
        if(value2.equalsIgnoreCase(value1)){
            info="��֤��������ȷ";
        }else{
            info="��֤���������";
        }
        System.out.println(info);
//        request.setAttribute("info", info);
//        request.getRequestDispatcher("/login.jsp").forward(request, response);
	}


}
