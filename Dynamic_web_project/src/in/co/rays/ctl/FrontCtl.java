package in.co.rays.ctl;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



@WebFilter(filterName ="FrontCtl" , urlPatterns="*.do")
public class FrontCtl implements Filter{
	@Override
	public void init(FilterConfig arg0) throws ServletException {
		
	}
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain arg2)
			throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse resp = (HttpServletResponse) response;
		
		HttpSession session = req.getSession();
		
		if(session.getAttribute("user") == null) {
			req.setAttribute("msg", "session expired");
		}
	}
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}
}
