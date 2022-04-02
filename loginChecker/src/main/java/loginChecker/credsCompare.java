package loginChecker;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class credsCompare extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
			
			Cookie cookies[] = req.getCookies();
			
			PrintWriter out = res.getWriter();
			String user = null; 
			String pw = null ;
			

			for(Cookie c: cookies) {
				if (c.getName().trim().equals("username")){
					user= c.getValue().trim();
					//System.out.println(c.getName());
				}
				if (c.getName().trim().equals("password")) {
					pw = c.getValue().trim();
					//System.out.println(c.getName());
					
				}
		}
			
			
			
			
			
			if (user.equals("Shilpa") && (pw.equals("Bhandari"))) {	
				out.println("The login was successful");
			}
			else {
				out.println("The login was unsuccessful");
			}
	

	}
}
