package JDBCPRO;

import java.sql.*;


public class MAinClass2 {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/fun","root","root");
		CallableStatement p = c.prepareCall("INSERT INTO won VALUES ('A1', 'Umesh', '2001-10-19', 9482110936),('A2', 'Ramesh', '2001-10-02', 9353039062)");
		boolean e = p.execute();
		System.out.println(e);
		c.close();
		
		
		
	}

}
