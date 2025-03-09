package AUS;

import java.sql.*;
import java.util.Scanner;

public class dynamic2 {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/Champions","root","root");
		CallableStatement p = c.prepareCall("Update details set name =? where id=?");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Updating Name:");
		p.setString(1, sc.next());
		
		System.out.println("Whose Id :");
		p.setInt(2, sc.nextInt());
		
		
		
		
		int e = p.executeUpdate();
		System.out.println(e);
		c.close();
	}

}
