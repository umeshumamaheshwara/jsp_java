package ConstructorOverloading;

public class MainClass2 {
	
	MainClass2(int a) 
	{
		this("Hello");
	  System.out.println(a);
	}
	MainClass2(String b) 
	{
		this(10,"Hello");
	  System.out.println(b);
	}
	MainClass2(int a , String b) 
	{
		this("Hello",10);
	  System.out.println(a + ".......**2nd.....**" + b);
	}
	MainClass2(String b, int a) 
	{
	  System.out.println(b+ "....**1St ....**" + a);
	}
	public static void main(String[] args) {
		MainClass2 m1 = new MainClass2(10);
		
		
	}
	

}
