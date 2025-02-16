package Collection;

import java.util.ArrayList;

public class Sample2 {
	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		a.add(25);  // add is used to add the object to the ArrayList. Object a = new Integer(5);  
		a.add("Hello");  //Object a = "Hello";
		a.add('b'); // Object a = new Character('a');  wrapper class is converts explicitly.
		a.add(2.5);   // Object a = new Double(2.5);
		a.add(true);
		a.add(null);
		a.add(25);
		ArrayList a1 = new ArrayList();
		a1.add(25);  // add is used to add the object to the ArrayList. Object a = new Integer(5);  
		a1.add("Hello");  //Object a = "Hello";
		a1.add('b'); // Object a = new Character('a');  wrapper class is converts explicitly.
		a1.add(5.5);   // Object a = new Double(2.5);
		a1.add(false);
		a1.add(251);
		System.out.println(a);
		System.out.println(a1);
//		a.removeAll(a1);
//		System.out.println("........................");
//		System.out.println(a);
//		System.out.println(a1);
		System.out.println("...............");
		//a.retainAll(a1);    //It is used to remove the Unique object  from the Collection.
		System.out.println(a);
		a.addAll(1,a1);
		System.out.println(a);
		System.out.println(a.containsAll(a1));  //It is used to check the collection.
		
		
		
		
	}

}
