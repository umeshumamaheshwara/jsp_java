package AUS;

import java.sql.*;


public class dynamic1 {
		public static void main(String[] args) throws Exception {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/Champions","root","root");
			CallableStatement p = c.prepareCall("select * from details");
			
			ResultSet e = p.executeQuery();
			while(e.next()) 
			{
				System.out.println(e.getInt(1)+ " "+e.getString(2)+" "+e.getDouble(3)+" "+e.getLong(4));
			}
			c.close();
		}

	}



