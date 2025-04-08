package JDBCPRO;

import java.sql.*;
public class DynamicInput {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/JdbcStudent","root","root");
		CallableStatement p = c.prepareCall("create table Student(Id int primary key,Name varchar(25) not null, Stream varchar(15) not null,Percentage Double not null,Phone Bigint unique not null,DOB date not null,Email varchar(25) not null unique,Address varchar(50))");
		int e = p.executeUpdate();
		System.out.println(e);
		c.close();
		
		
		
	}

}
