package MultiThread;

class Demon
{
	synchronized public static void m1() 
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
	synchronized public static void m2() 
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
		Demon.m1();
	}
}
class Tester2 extends Thread
{
	public void run()
	{
		Demon.m2();
	}
}

public class Sample1 {
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
