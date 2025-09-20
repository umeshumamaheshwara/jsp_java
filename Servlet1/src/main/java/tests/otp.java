package tests;

import java.io.IOException;
import java.util.Random;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/otp")
public class otp extends GenericServlet
{
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		int otp=new Random().nextInt(1000, 10000);
		res.getWriter().println("<h1 align='center'>the otp is "+ otp+ "</h1>");	
		
	}
}
