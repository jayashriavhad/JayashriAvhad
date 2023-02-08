
class ThreadEx1 extends Thread
{
	 public void run()
	 {
		 try 
		 {
			 for(int i=1;i<5;i++)
			  {
				  System.out.println("child Thread");
				  Thread.sleep(3000);
			  }
		  }
		 catch(InterruptedException e)
		 {
			 System.out.println("Child class got interrupted");
		 }
	 }
}
public class UseThreadPriority 
{
  public static  void main(String args[])
  {
	  System.out.println("Main Thread Priority:"+Thread.currentThread().getPriority());
	  ThreadEx1 t=new ThreadEx1();
	  
	  
	  t.setPriority(8);
	  System.out.println("Child Threa priority "+t.getPriority());
	  t.start();
	  
	  for(int i=1;i<5;i++)
	  {
		  System.out.println("main Thread");
	  }
  }
}
 