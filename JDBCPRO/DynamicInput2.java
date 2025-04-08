package JDBCPRO;

import java.sql.*;

public class DynamicInput2 {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/JdbcStudent","root","root");
		CallableStatement p = c.prepareCall("select * from student");
		ResultSet e = p.executeQuery();
		while(e.next())
		{
			System.out.println(e.getInt(1)+" "+e.getString(2)+" "+e.getString(3)+" "+e.getDouble(4)+" "+e.getLong(5)+" "+e.getDate(6)+" "+e.getString(7)+" "+e.getString(8));
		}
		c.close();
		
		
	}

}
