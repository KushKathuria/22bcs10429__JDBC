package com.capgemini.Main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class connectionClass {
	public Connection getConnection() throws ClassNotFoundException,SQLException {
		Connection con=null; 
		Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cuims","root","Kush@0000");
		System.out.println("Connection Established");
		System.out.println(con.getClass().getName());
		return con;
	}
//
}
