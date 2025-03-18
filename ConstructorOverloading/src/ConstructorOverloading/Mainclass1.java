package ConstructorOverloading;

public class Mainclass1 {
	Mainclass1(int a) 
	{
	  System.out.println(a);
	}
	Mainclass1(String b) 
	{
	  System.out.println(b);
	}
	Mainclass1(int a , String b) 
	{
	  System.out.println(a + " " + b);
	}
	Mainclass1(String b, int a) 
	{
	  System.out.println(b+ " " + a);
	}
	public static void main(String[] args) {
		Mainclass1 m1 = new Mainclass1(10);
		Mainclass1 m2 = new Mainclass1("Hello");
		Mainclass1 m3 = new Mainclass1(10,"Hello");
		Mainclass1 m4 = new Mainclass1("hello",10);
		
	}
}
