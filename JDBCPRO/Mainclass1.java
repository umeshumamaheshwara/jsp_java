package JDBCPRO;

import java.sql.*;

public class Mainclass1 {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/fun","root","root");
		CallableStatement p = c.prepareCall("create table won(Id char(2) unique not null,Name varchar(25),DOB date,Phone BIGINT unique)");
		boolean e = p.execute();
		System.out.println(e);
		c.close();
		
		
		
	}

}
