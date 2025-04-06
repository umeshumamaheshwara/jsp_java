package Advance;

interface Tester
{
	void add();
	static void sub()
	{
		System.out.println("hello");
	}
	default void mul()
	{
		System.out.println("Bye");
	}
}


public class JDK8Feature {
	public static void main(String[] args) {
		Tester.sub();
		
	}
	

}
