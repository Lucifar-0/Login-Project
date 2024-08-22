package com.connector;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnector {
	public static Connection getConnection() {
		Connection con=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:33011/login_project", "root", "admin");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return con;
	}

}
