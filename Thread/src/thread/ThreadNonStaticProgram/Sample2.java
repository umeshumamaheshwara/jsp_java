package ThreadNonStaticProgram;

class Demon
{
	public void m1() 
	{
		for(int i=0 ; i<= 10; i++)
		{
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}
	public void m2() 
	{
		for(int i=0 ; i<=10; i++)
		{
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}
}

class Tester1 extends Thread
{
	public void run()
	{
		Demon d1 = new Demon();
		d1.m1();
	}
}
class Tester2 extends Thread
{
	public void run()
	{
		Demon d2 = new Demon();
		d2.m2();
	}
}

public class Sample2 {
	public static void main(String[] args) {
		Tester1 t1 = new Tester1();
		t1.start();
		
		//or 
//		Tester1 t1 = new Tester1();
//		Thread th1 = new Thread(t1);
//		th1.start();
		
	
		Tester2 t2 = new Tester2();
		t2.start();
		
		//or
//		Tester2 t2 = new Tester2();
//		Thread th2 = new Thread(t2);
//		th2.start();
		
	}

}
