package thread;

class Demo
{
	public static void m1() 
	{
		for(int i =1; i<11 ; i++)
		{
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i);
			
		}
	}
	public static void m2() 
	{
		for(int i =101; i<111 ; i++)
		{
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
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
		Demo.m1();
	}
}
class Tester2 implements Runnable
{
	public void run()
	{
		Demo.m2();
	}
}

public class Sample4 {
	public static void main(String[] args) {
		Tester1 test1 = new Tester1();
		Thread t1 = new Thread(test1);
		t1.start();
		
		Tester2 test2 = new Tester2();
		Thread t2 = new Thread(test2);
		t2.start();
		
		
	}

}
