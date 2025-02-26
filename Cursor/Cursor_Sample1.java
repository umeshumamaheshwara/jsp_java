package Cursor;

import java.util.Enumeration;
import java.util.Vector;

public class Cursor_Sample1  {
	public static void main(String[] args) {
		
	   Vector<Integer> V = new Vector<Integer>();
	   V.add(25);
	   V.add(2);
	   V.add(75);
	   V.add(45);
	   Enumeration<Integer> e = V.elements();
	   while(e.hasMoreElements())
	   {
		   Integer i = e.nextElement();
		   if(i==75)
		   {
			   V.add(100);
		   }
		   
	    }
	   System.out.println(V);

	   
	   
	}

}
