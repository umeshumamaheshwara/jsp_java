package AUS;

import java.sql.*;

public class Mainclass1 {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/jspider","root","root");
		CallableStatement p = c.prepareCall("Select * from student" );
		 ResultSet e = p.executeQuery();
		while(e.next())
		{
			System.out.println(e.getInt(1) + " " + e.getString(2)+ " " + e.getLong(3) + " " + e.getString(4) );
		}
		c.close();
	    
		
		
		
		
	}

}
