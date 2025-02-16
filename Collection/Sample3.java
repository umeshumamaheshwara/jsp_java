package Collection;

import java.util.ArrayList;

public class Sample3 {
	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		a.add(25);
		a.add(2.5);
		a.add(true);
		System.out.println(a);
		a.add(1,74);     // add the object at the specified index position.
		System.out.println(a);
		a.set(3, 74);
		System.out.println(a);
		System.out.println(a.get(2));  // for retrieve the object at the specific index.
		
	}

}
