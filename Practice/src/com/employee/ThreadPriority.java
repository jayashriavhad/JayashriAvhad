
package com.employee;

 class ThreadEx1 extends Thread
{
	 public void run()
	 {
		 for(int i=1;i<5;i++)
		  {
			  System.out.println("child Thread");
		  }
	 }
}
public class ThreadPriority 
{
  public static  void main(String args[])
  {
	  System.out.println("Main Thread Priority:"+Thread.currentThread().getPriority());
	  ThreadEx1 t=new ThreadEx1();
	  
	  
	  t.setPriority(8);
	  System.out.println("Child Threa pririty "+t.getPriority());
	  t.start();
	  
	  for(int i=1;i<5;i++)
	  {
		  System.out.println("main Thread");
	  }
  }
}
 