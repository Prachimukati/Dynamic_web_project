
package in.co.rays.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("In First servlet doget");
	
		RequestDispatcher rd = req.getRequestDispatcher("SecondServlet");
		rd.forward(req, resp);
		
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("In First servlet dopost");

		//resp.sendRedirect("SecondServlet");
		
		String firstName= req.getParameter("firstName");
		String lastName= req.getParameter("lastName");
		
		System.out.println(firstName);
		System.out.println(lastName);
		
		System.out.println("FirstServlet firstName = " + req.getParameter("firstName"));
		req.setAttribute("lastName", "xyz");
		
		//resp.sendRedirect("SecondServlet");
		req.setAttribute("fn",firstName);
		req.setAttribute("ln",lastName);
		
		RequestDispatcher rd = req.getRequestDispatcher("SecondServlet");
		rd.forward(req, resp);
	
	}
}
