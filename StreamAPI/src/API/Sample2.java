package API;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class Sample2 {
	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>(Arrays.asList(25,26,78,11,78,53,11));
		
		Stream<Integer> s = a.stream();
		s.forEach(p->System.out.print(p+" "));
		System.out.println();
		
		      //or
		
//		s.forEach(System.out::println);
		System.out.println("---------------------");
		
//	   2. Remove duplicates from the stream and print.
		
		a.stream().distinct().forEach(p-> System.out.print(p + " "));
		
		System.out.println("---------------------");
		
//		3.Remove all the odd Numbers from the stream and print.
		
		a.stream().filter(e -> e % 2 == 0).forEach(p->System.out.print(p + " "));
		
		System.out.println("---------------------");
		
//		4. For all the number in stream, add it by 5 and print.
		
		a.stream().map(q->q+5).forEach(p->System.out.print(p+" "));
		 
		
		
		
		
	}

}
