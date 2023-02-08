package com.practice;

import java.util.Scanner;

public class EmployeePack
{
	public void emp()
	{
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter the Employee Id");
	   int id=sc.nextInt();
	   System.out.println("Enter the Employee name");
	   String name=sc.next();
	   System.out.println("Enter the Employee Salary");
	   int sal=sc.nextInt();
	   
	   System.out.println("Employee Id is: "+id);
	   System.out.println("Employee name is: "+name);
	   System.out.println("Employee salary is: "+sal);
	   
	}
}
