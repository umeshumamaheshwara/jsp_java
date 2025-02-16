package Collection;

import java.util.ArrayList;

public class Sample1 {
	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		a.add(5);  // add is used to add the object to the ArrayList. Object a = new Integer(5);  
		a.add("Hello");  //Object a = "Hello";
		a.add('b'); // Object a = new Character('a');  wrapper class is converts explicitly.
		a.add(2.5);   // Object a = new Double(2.5);
		a.add(true);
		a.add(null);
		a.add(25);
		
		System.out.println(a);
		System.out.println(a.size()); //which it is used to check the size of the collection.
		System.out.println(a.contains("Hello")); // Whether the object is contain or not it will checked.
		System.out.println(a.isEmpty());  //It is used to check whether the list is empty or not.
		a.remove(0);   //It is used to remove the object from the collection based on the index values.
		System.out.println(a);
		a.clear(); //it is used to clear all the object from the collection.
		System.out.println(a);
		
	}

}
