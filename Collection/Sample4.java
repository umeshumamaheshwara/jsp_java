package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Sample4 {
	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		a.add(25);
		a.add("Hello");
		a.add(true);
		System.out.println(a);
		Object arr[] = a.toArray();
		for(int i =0 ; i<arr.length ; i++)
		{
			System.out.println(arr[i]);
		}
		
	}

}
