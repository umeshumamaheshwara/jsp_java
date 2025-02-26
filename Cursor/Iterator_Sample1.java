package Cursor;

import java.util.Iterator;
import java.util.LinkedList;

public class Iterator_Sample1 {
	public static void main(String[] args) {
		LinkedList<Integer> L = new LinkedList<Integer>();
		L.add(10);
		L.add(20);
		L.add(11);
		L.add(22);
		L.add(70);
		L.add(50);
		Iterator<Integer> I = L.iterator();
		while(I.hasNext())
		{
			Integer r = I.next();
			if(r.equals(22))
			{
				I.remove();
			}
			
		}
		System.out.println(L);
		
		
	}


}
