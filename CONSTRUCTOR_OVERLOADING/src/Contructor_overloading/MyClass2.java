package Contructor_overloading;

interface Sample2
{
	public static void sampleMethod() 
	{
        System.out.println("Static method executed");
    }
}
interface Tester2
{
	public static void testerMethod() 
    {
        System.out.println("Staic  method executed");
    }
}
interface Driver2
{
	public static void driverMethod() 
    {
        System.out.println("Driver method executed");
    }
}
public class MyClass2 implements Sample2,Tester2,Driver2 
{
	public static void main(String[] args) 
	{
		Sample2.sampleMethod();
		Tester2.testerMethod();
		Driver2.driverMethod();
	}
		
	
	
}

