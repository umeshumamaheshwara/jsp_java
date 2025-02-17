package vector;

import java.util.Vector;

public class sample1 {
	public static void main(String[] args) {
		Vector v = new Vector();
		v.add(25);
		v.add(2.5);
		v.add("Hello");
		v.add(true);
		v.add(null);
		System.out.println( v.capacity());
		
	}

}
