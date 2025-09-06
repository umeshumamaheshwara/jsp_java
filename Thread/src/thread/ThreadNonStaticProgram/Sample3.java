package ThreadNonStaticProgram;

class Demoo
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

class Testers1 implements Runnable
{
	public void run()
	{
		Demoo d1 = new Demoo();
		d1.m1();
	}
}
class Testers2 implements Runnable
{
	public void run()
	{
		Demoo d2 = new Demoo();
		d2.m2();
	}
}

public class Sample3 {
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
