package com.connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {
	
	private static Connection conn = null;
	
	public static Connection getconn()
	{	
		
		String url = "jdbc:mysql://localhost:3306/employees";
		String username = "root";
		String password = "Francisco";
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(url,username,password);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		return conn;
	}

}
