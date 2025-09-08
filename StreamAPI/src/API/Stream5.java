package API;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class Stream5 {
	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>(Arrays.asList(25,26,78,11,78,53,11));
		
		Stream<Integer> s = a.stream();
		
		a.stream().skip(3).forEach(p->System.out.print(p+ " "));   // starting 3 values is Skipped.
		
		System.out.println("\n --------------------------");
		
		a.stream().skip(a.size()-3).forEach(p->System.out.print(p+ " "));   // last 3 values is Skipped.
		
		System.out.println("\n --------------------------");
		
		a.stream().limit(3).forEach(p->System.out.print(p+ " "));           //it will limit 3 
		
		
		// converts list to array
		
		Object[] arr = a.stream().toArray();
		
	    for(Object a1 : arr)
	    {
	        System.out.print(a1 + " ");	
	    }
	
}
}
