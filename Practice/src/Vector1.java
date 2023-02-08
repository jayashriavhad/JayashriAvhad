import java.util.Enumeration;
import java.util.Vector;

public class Vector1{

	public static void main(String[] args)
	{

  Vector v=new Vector();
	System.out.println(v.capacity());
     for(int i=0;i<10;i++)
     {
    	 v.addElement(i); //add the value to the vector 
     }
     System.out.println(v);
     
     Enumeration<Integer> e=v.elements();
	
	
	
     
	
	}
	

}

	