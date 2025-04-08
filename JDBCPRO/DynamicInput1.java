package JDBCPRO;

import java.sql.*;
import java.util.Scanner;

public class DynamicInput1 {
		public static void main(String[] args) throws Exception {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/JdbcStudent","root","root");
			CallableStatement p = c.prepareCall("Insert into  Student values(?,?,?,?,?,?,?,?)");
			
			Scanner sc= new Scanner(System.in);
			
			System.out.println("Enter Id:");
			p.setInt(1, sc.nextInt());
			
			System.out.println("Enter Student Name:");
			p.setString(2, sc.next());
			
			System.out.println("Stream:");
			p.setString(3, sc.next());
			
			System.out.println("Percentage:");
			p.setDouble(4, sc.nextDouble());
			
			System.out.println("Phone Number:");
			p.setLong(5, sc.nextLong());
			
			System.out.println("DOB");
			String DOB = sc.next();
			p.setDate(6, java.sql.Date.valueOf(DOB));
			
			System.out.println("Email:");
			p.setString(7, sc.next());
			
			System.out.println("Address:");
			p.setString(8, sc.next());
			
			int e = p.executeUpdate();
			System.out.println(e);
			c.close();
			
			
			
		}

	}



