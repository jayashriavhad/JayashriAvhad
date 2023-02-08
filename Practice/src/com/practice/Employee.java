package com.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class  Employee5
{   
    String name;
    String Address;
    int Experience;
	
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		 public void print() throws IOException 
		{
		  
		System.out.println("Enter the Employee name"+name);
		name=br.readLine();
		
		System.out.println("Enter the Employee Address"+Address);
		Address=br.readLine();
		
		System.out.println("Enter the Employee Experience"+Experience);
		Experience=Integer.parseInt(br.readLine());
	  }
   
}

class Programmer extends Employee
{
	String Lang;
  public void print1() throws NumberFormatException, IOException
  {
	  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
 
     System.out.println(" Enter Employee working programing language" +Lang);
 	  Lang=br.readLine();
   }
}
class ProjectManager  extends Employee
{
	 int noofProject;
   public void print2() throws NumberFormatException, IOException
  {
	  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      System.out.println("Enter the number of project"+noofProject);
	  noofProject=Integer.parseInt(br.readLine());
   }
}


class Employee
{
  public static void main(String args[])throws Exception
  {
    ProjectManager p=new ProjectManager();

	p.print2();
	Programmer p1=new Programmer();
    p1.print1();
	

  }
}