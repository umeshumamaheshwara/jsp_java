package Contructor_overloading;



public class MainClass1 {
	MainClass1(int a )
	{
		System.out.println(a);
	}
	MainClass1(String b)
	{
		System.out.println(b);
	}
	MainClass1(int a ,String b )
	{
		System.out.println(a +" " +b);
	}
	MainClass1(String b ,  int a )
	{
		System.out.println(b+ " "+a);
	}
	public static void main(String[] args) 
	{
		
		MainClass1 m1 = new MainClass1(10);
		MainClass1 m2 = new MainClass1(10,"Hello");
		MainClass1 m3 = new MainClass1("Hello");
		MainClass1 m4 = new MainClass1("Hello",10);
	}

}
