package com.employee;

 class UseThread extends Thread
{
    public void  run()
    {
    	try
    	{
    		for(int i=1;i<5;i++)
    		{
    			System.out.println("I am child i am sleepy");
    			Thread.sleep(1000);
    		}
    	
    	} 
    	catch (InterruptedException e)
    	{
			System.out.println("child class got intrrupted");  
		}
    }
}
public class SleepEx 
{
  public static void main(String args[])
  {
	  UseThread u=new UseThread();
	  u.start();
	  u.interrupt();
	  for(int i=1;i<5;i++)
	  {
		  System.out.println("main Thread");
	  }
  }
}