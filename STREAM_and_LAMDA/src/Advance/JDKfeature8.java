package Advance;


interface Test 
{
    void add();  // abstract method

    default void mul() {      // default method
        System.out.println("Inside default method mul()");
    }
}

class MyClass implements Test 
{
	
    public void add() 
    {
        System.out.println("Inside add()");
    }
}


public class JDKfeature8 {
	public static void main(String[] args) 
	{
		MyClass m1 = new MyClass();
		m1.mul();
		
	}
	

}
