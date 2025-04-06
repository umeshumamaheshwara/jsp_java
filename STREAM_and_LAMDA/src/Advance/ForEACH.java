package Advance;

import java.util.ArrayList;

public class ForEACH {
	public static void main(String[] args) {
		ArrayList<Integer> a  =  new ArrayList<>();
		a.add(10);
		a.add(11);
		a.add(20);
		a.add(2);
		a.forEach(p->System.out.println(p));
		a.forEach(System.out::println);
		
	}

}
