package demo;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AddServlet extends HttpServlet{
	@Override
	public void doGet(HttpServletRequest req,HttpServletResponse res ) throws IOException, ServletException {
		int i=Integer.parseInt(req.getParameter("num1"));
		int j=Integer.parseInt(req.getParameter("num2"));
		int k=i+j;
		//HttpSession session =req.getSession();
		//session.setAttribute("k",k);
		//res.sendRedirect("div");
	//Cookie cookies=new Cookie("name",k+"");
	//res.addCookie(cookies);
	//res.sendRedirect("sq");
	res.sendRedirect("sub?k="+k);
		
	}
}
