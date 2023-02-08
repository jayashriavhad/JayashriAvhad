package com.lectPractice;
	
class SynchronizeEX extends Thread
{
	  int total=0;
	  public void run()
	  {
	    synchronized(this)
		{
			System.out.println("Child Thread start calculation");
			for(int i=1;i<5;i++)
			{
				total=total+i;
			}
			System.out.println("Child Thread is trying to give notification");
			this.notify();
		}
     }
}

class ynchronizeThreadEX 
	{
		public static void main(String args[]) throws InterruptedException
		{
			SynchronizeEX s=new SynchronizeEX();
			s.start();
			synchronized(s)
			{
				System.out.println("main thread trying to call method ");
				s.wait();
		    	System.out.println("main thread got notification");
			    System.out.println(s.total);

			}
		}
	}

