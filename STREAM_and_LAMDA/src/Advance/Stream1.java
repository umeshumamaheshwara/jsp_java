package Advance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream1 {
	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<>();
		a.add(25);
		a.add(26);
		a.add(78);
		a.add(78);
		a.add(51);
		Stream<Integer> s = a.stream();
		s.forEach(System.out::println);
		System.out.println("............................");
		a.stream().distinct().forEach(System.out::println);
		System.out.println(".............................");
		a.stream().filter(e->e%2==0).forEach(System.out::println);
		System.out.println(".............................");
		a.stream().map(q->q+5).forEach(System.out::println);
		
		
		List<Integer> l = a.stream().distinct().sorted().collect(Collectors.toList());
		a.clear();
		a.addAll(l);
		System.out.println(l);
		
		System.out.println(".............................");
		int [] arr = {78,7,5,84,78};
		Arrays.stream(arr).distinct().forEach(System.out::println);
		
	}

}
