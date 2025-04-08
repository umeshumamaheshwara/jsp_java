package JDBCPRO;

import java.sql.*;

public class MainClass3 {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/fun","root","root");
		CallableStatement p = c.prepareCall("Select * from won");
		ResultSet e = p.executeQuery();
		while(e.next())
		{
			System.out.println(e.getString(1)+" "+e.getString(2)+" "+e.getDate(3)+" "+e.getLong(4));
		}
		c.close();
		
	}

}
