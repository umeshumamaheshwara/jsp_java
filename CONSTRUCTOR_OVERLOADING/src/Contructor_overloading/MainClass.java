package Contructor_overloading;

 class Sample extends Object
{
	public Sample(int a)
	{
		super();
		System.out.println(a);
	}
	
}
 class Demo extends Sample
 {
	public Demo(String b)
	{
		super(10);
		System.out.println(b);
		
	}
 }
 class Tester extends Demo
 {
	 public Tester(int a , String b)
	 {
		 super("Hello");
		 System.out.println(a+" "+b);
		 
	 }
 }
 class Cool  extends Tester
 {
	 public Cool(String b,int a)
	 {
		 super(10,"Bye");
		 System.out.println(a+" "+b);
		 
	 }
 }

public class MainClass 
{
	public static void main(String[] args) 
	{
		Cool c1 = new Cool("Hello Java",10);
 		
	}

}
