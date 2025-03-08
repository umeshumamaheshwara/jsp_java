package AUS;

import java.sql.*;

public class Fetching {
	public static void main(String[] args) throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee1", "root" , "root");
	      CallableStatement p = c.prepareCall("Select * from EMP");
	        ResultSet r = p.executeQuery();
	        while(r.next())
	        {
	        	 System.out.println(r.getInt(1) + " " + r.getString(2) + " " +r.getDouble(3)+ " "+r.getLong(4));
	        }
	        
		 
		  c.close();
	}

}
