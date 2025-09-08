package API;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Sample1 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(25);
		a.add(26);
		a.add(78);
		a.add(11);
		a.add(78);
		a.add(51);
		
		Stream<Integer> s = a.stream();
		
		a.stream().forEach(System.out::println);
		
	}

}
