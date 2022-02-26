package com.Connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class Myconnection {

	static Connection con;

	public static Connection myConnectionMethod() {
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
		
			String user = "root";
			String pass = "root";
			//String url = "jdbc:mysql://localhost:3306/stmanage";
			String url = "jdbc:mysql://localhost:3306/getepay_pg";
			con = DriverManager.getConnection(url, user, pass);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return con;
	}
}

