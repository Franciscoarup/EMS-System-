package com.start;

import java.util.Scanner;

import com.connection.DBConnect;
import com.dao.EmployeeDAO;
import com.entity.Employee;

public class StartApplication {
	
	public static void main(String[] args)
	{
		int choice;
		Scanner sc = new Scanner(System.in);
		
		do
		{
			System.out.println("Welcome To Employee Management System");
			System.out.println("1. Add Employee");
			System.out.println("2. Display Employee");
			System.out.println("3. Update Employee");
			System.out.println("4. Delete Employee");
			System.out.println("5. Exit");
			
			System.out.println("Enter Your Choice: ");
			choice=sc.nextInt();
			
			switch(choice)
			{
			
			case 1:
				System.out.println("Enter Employee Name: ");
				String name = sc.next();
				
				System.out.println("Enter Employee Phone: ");
				String phone = sc.next();
				
				System.out.println("Enter Employee Address: ");
				String address = sc.next();
				
				System.out.println("Enter Employee Email: ");
				String email = sc.next();
				
				System.out.println("Enter Employee Password: ");
				String password = sc.next();
				
				
				Employee emp = new Employee(name,phone,address,email,password);
				
				EmployeeDAO dao = new EmployeeDAO(DBConnect.getconn());
				
				dao.addEmployee(emp);
				
				break;
			case 2:
				//display employee
				break;
			case 3:
				//update employee
				break;
			case 4:
				//delete employee
				break;
			case 5:
				System.out.println("Exiting...");
				break;
				
			default:
				System.out.println("Please Enter A Valid Input");
				break;
				
			}
		}while(choice !=5);
		
	}

}
