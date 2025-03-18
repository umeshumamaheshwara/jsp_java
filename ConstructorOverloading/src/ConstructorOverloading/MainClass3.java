package ConstructorOverloading;


class sample  extends Object
{
	sample(int a) 
	{
		super();
	  System.out.println(a);
	}
			
}
class Tester extends sample
{
	
	public Tester(String b) {
		super(10);
		System.out.println(b);

	}
}

class Cool extends Tester
{
	
	public Cool(int a,String b) {
		super("Hello");
		System.out.println(a+ " ........*" + b);

	}
}

class Demo extends Cool
{
	
	public Demo(String b,int a) {
		super(10,"Hello");
		System.out.println(b+ "* ........*" + a);

	}
}



public class MainClass3 {
	public static void main(String[] args) {
		Demo d1 = new Demo("Hello",10);
	}
	
	
	
	
	
	

}
