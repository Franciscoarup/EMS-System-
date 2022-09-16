package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.entity.Employee;

public class EmployeeDAO {

	private Connection conn;
	
	public EmployeeDAO(Connection conn)
	{
		super();
		this.conn = conn;
	}
	
	public boolean addEmployee(Employee employee)
	{
		boolean result = false;
		
		try
		{
			
			String query = "insert into emp(name,phone,address,email,password) values(?,?,?,?,?)";
			PreparedStatement ps = conn.prepareStatement(query);
			
			ps.setString(1,employee.getName());
			ps.setString(2,employee.getPhone());
			ps.setString(3,employee.getAddress());
			ps.setString(4,employee.getEmail());
			ps.setString(5,employee.getPassword());
			
			int i = ps.executeUpdate();
			
			if(i==1)
			{
				result = true;
			}
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return result;
	}
	
	
}
