package AUS;

import java.sql.*;
import java.util.Scanner;

public class dynamic {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/Champions","root","root");
		CallableStatement p = c.prepareCall("insert into details values(?,?,?,?)");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Id:");
		p.setInt(1, sc.nextInt());
		System.out.println("Enter Name:");
		p.setString(2, sc.next());
		System.out.println("Enter Salary:");
		p.setDouble(3, sc.nextDouble());
		System.out.println("Enter Phone Number:");
		p.setLong(4, sc.nextLong());
		
		int e = p.executeUpdate();
		System.out.println(e);
		c.close();
	}

}
