package AUS;

import java.sql.*;
import java.util.Scanner;



public class dynamic3 {
		public static void main(String[] args) throws Exception {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/Champions","root","root");
			CallableStatement p = c.prepareCall("select * from details where id=?");
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter id:");
			p.setInt(1, sc.nextInt());
			
			ResultSet e = p.executeQuery();
			while(e.next()) 
			{
				System.out.println(e.getInt(1)+ " "+e.getString(2)+" "+e.getDouble(3)+" "+e.getLong(4));
			}
			c.close();
		}

	}



