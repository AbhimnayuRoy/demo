package demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SubServlet extends HttpServlet {
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException {
		int k=Integer.parseInt(req.getParameter("k"));
		int p=k-10;
		PrintWriter out=res.getWriter();
		
		out.println("the answer is p:-"+p);
		
	}

}
