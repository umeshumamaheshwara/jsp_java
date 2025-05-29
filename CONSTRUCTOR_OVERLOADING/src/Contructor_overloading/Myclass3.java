package Contructor_overloading;

interface Sample3
{
	public static void sampleMethod()
	{
		System.out.println("static method is Executed...");
	}
	void NonStaticSampleMethod();
}
interface Tester3
{
	public static void Testermethod()
	{
		System.out.println("static method is Executed...");
	}
	void NonStaticTesterMethod();
	
}

public class Myclass3 
{
	void NonStaticSampleMethod()
	{
		System.out.println("NonStatic Method ..");
	}
	void NonstaticTestermethod()
	{
		System.out.println("NonStatic Method ..");
	}
	public static void main(String[] args) 
	{
		Sample3.sampleMethod();	
		Tester3.Testermethod();
		
		Myclass3 obj = new Myclass3();
	    obj.NonStaticSampleMethod();
	    obj.NonstaticTestermethod();
	}

}
