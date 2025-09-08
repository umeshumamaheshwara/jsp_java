package API;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Sample3 {
	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>(Arrays.asList(25,26,78,11,78,53,11));
		
		Stream<Integer> s = a.stream();
		
		//1. Remove the duplicate from the stream, sort it in ascending.
		
		a.stream().distinct().sorted().forEach(p -> System.out.print(p + " "));
		System.out.println("\n -------------");
		
//      2. Remove the duplicate from the stream, sort it in ascending. convert it new list collection, 
//		remove all the values in original collection and add new collection into original collection.
		
		List<Integer> q = a.stream().distinct().sorted().collect(Collectors.toList()) ;
		
		System.out.println(q);
		
		a.clear();
		a.addAll(q);
		System.out.println(q);
		
		
		
	}

}
