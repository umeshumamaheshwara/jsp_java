package AUS;

import java.sql.*;

public class Mainclass {
	public static void main(String[] args) throws Exception {
		
		 Class.forName("com.mysql.cj.jdbc.Driver");
		 Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root");
		 CallableStatement p = c.prepareCall("DELETE FROM EMP WHERE EMP_id=10");
		 boolean e = p.execute();
		 System.out.println(e);
		 c.close();
		
	}
	
	

}
