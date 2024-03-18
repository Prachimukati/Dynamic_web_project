package in.co.rays.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Firstservlet1")
public class Firstservlet1 extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("In First servlet doget");

	} 
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
System.out.println("In First servlet dopost");
		
		String fname = req.getParameter("firstName");
		String lname = req.getParameter("lastName");
		String loginid = req.getParameter("loginId");
		String pass = req.getParameter("password");
		String dob = req.getParameter("dob");
		String add = req.getParameter("address");

        resp.setContentType("text/html");	
		PrintWriter out = resp.getWriter();
		out.println(fname);
		out.println(lname);
		out.println(loginid);
		out.println(pass);
		out.println(dob);
		out.println(add);
		out.close();
		
	}
}
