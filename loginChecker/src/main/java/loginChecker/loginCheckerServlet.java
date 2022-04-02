package loginChecker;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class loginCheckerServlet extends HttpServlet{

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		String i = req.getParameter("username");
		String j = req.getParameter("password");
		
		
		//HttpSession session = req.getSession();
		//session.setAttribute("k", k);
		
		
		//cookie is used to send multiple attributes
		Cookie username = new Cookie("username", i.toString());
		Cookie password = new Cookie("password", j.toString());
		res.addCookie(username);
		res.addCookie(password);
		
		res.sendRedirect("credsCompare");

	}

}
