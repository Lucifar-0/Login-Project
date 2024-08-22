package com.dao;

import java.sql.Connection;
import java.sql.ResultSet;

import com.connector.DatabaseConnector;
import com.mysql.jdbc.Statement;

public class UserDao {
	public static boolean userRegistration(String name, String email, String password) {
		Connection con=null;
		Statement st=null;
		boolean flag=false;
		ResultSet rs=null;
		try {
			con=DatabaseConnector.getConnection();
			st=(Statement) con.createStatement();
			
			String query="insert into m_user(name,email,password)values('"+name+"','"+email+"','"+password+"')";
			int n=st.executeUpdate(query);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return flag;
	}

}
