package API;

import java.util.ArrayList;
import java.util.Arrays;

public class Stream6 {
	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>(Arrays.asList(25,26,78,11,78,53,11));
		
		//Find maximum and Minimum in The List.
		
		Object MAX=a.stream().max(Integer::compareTo).get();
		System.out.println("Maximum is "+ MAX);
		
		
		Object MIN=a.stream().min(Integer::compareTo).get();
		System.out.println("Minimum is "+ MIN);
		
		//To reduce the List to 1 value
		
		Object Reduce=a.stream().reduce(0,Integer::sum);
		System.out.println("Reduced value is = " + Reduce);
		
		
		
		
	}

}
