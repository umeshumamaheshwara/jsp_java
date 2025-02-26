package Cursor;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIterator_Sample1 {
	public static void main(String[] args) {
		ArrayList<Integer> a  = new ArrayList<Integer>();
		a.add(10);
		a.add(20);
		a.add(11);
		a.add(22);
		a.add(70);
		a.add(50);
	    ListIterator<Integer> e =  a.listIterator();
	    while(e.hasNext())
	    {
	    	Integer i = e.next();
	    	System.out.println(i);
	    }
	    System.out.println("........................");
	    while(e.hasPrevious())
	    {
	    	Integer i = e.previous();
	    	System.out.println(i);
	    }
	    

}
}
