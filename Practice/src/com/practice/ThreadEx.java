package com.practice;

import java.util.Scanner;
class MyThread extends Thread
{
	 public void run()
	 {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the Salary of employee : ");
		 int sal=sc.nextInt();
		 int add_hike;
		 int new_sal;
		 add_hike=sal/100*10;
		 System.out.println("Employee salary by adding the 10% hike :  "+add_hike);
		 
		 new_sal=sal+add_hike;
		 System.out.println("After adding the hike to the new salary: "+new_sal);
		 
	 }
}

public class ThreadEx 
{
   public static void main(String args[])
   {
	   MyThread m=new MyThread();
	   m.start();
   }
   
}
 