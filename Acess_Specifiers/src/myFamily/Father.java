package myFamily;

public class Father
{
	private void atm()
	{
		System.out.println("atm");
	}
	void car()
	{
		System.out.println("car");
	}
	protected void bike()
	{
		System.out.println("Bike");
	}
	public void cycle()
	{
		System.out.println("cycle");
	}
	public static void main(String[] args) 
	{
		Father f1 = new Father();
		f1.atm();
		f1.car();
		f1.bike();
		f1.cycle();
		
	}
	
}

