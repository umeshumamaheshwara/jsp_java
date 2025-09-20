package tests;

import java.io.IOException;
import java.util.Random;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/color")
public class randomColor extends GenericServlet{
	
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		Random rand = new Random();
		int r = rand.nextInt(256);
		int g = rand.nextInt(256);
		int b = rand.nextInt(256);
		String rgbColor = String.format("rgb(%d, %d, %d)", r, g, b);

		res.getWriter().println("<h1  align='center' style='color:" + rgbColor + "'>Hello... Welcome" + "</h1>");

	}
	

}
