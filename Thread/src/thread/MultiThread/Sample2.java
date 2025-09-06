package MultiThread;

class Demoo
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

class Testers1 implements Runnable
{
	public void run()
	{
		Demoo.m1();
	}
}
class Testers2 implements Runnable
{
	public void run()
	{
		Demoo.m2();
	}
}

public class Sample2 {
	public static void main(String[] args) {
		Testers1 t1 = new Testers1();
		Thread th1 = new Thread(t1);
		th1.start();
		
		
		Testers2 t2 = new Testers2();
		Thread th2 = new Thread(t2);
		th2.start();
		
//		Testers2 t2 = new Testers2();  like this way is not possible because start() method is belongs to the thread class so it is not possible in runnables.
//		t2.start();
		
		
		
	}


}

