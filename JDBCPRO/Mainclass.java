package JDBCPRO;

import java.sql.*;

public class Mainclass {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Connect to MySQL (without specifying a DB yet)
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "root");

            // Prepare and execute SQL to create a new DB
            CallableStatement p = c.prepareCall("CREATE DATABASE Sanjay");
            boolean e = p.execute();

            System.out.println("Database creation result: " + e); // false means success for CREATE

            c.close();
        } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace(); // shows what went wrong
        }
    }
}
