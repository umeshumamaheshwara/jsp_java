package thread;

class main {
   synchronized	public static  void m1()
	{
	   
		for(int i=0 ; i<11 ; i++)
		{
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
   synchronized public static void m2()
	{
	   
		for(int i=100 ; i<111 ; i++)
		{
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
}

class Test1 extends Thread
{
	public void run()
	{
	     main.m1();
	}
}

class Test2 extends Thread
{
	public void run()
	{
	     main.m2();
	}
}

public class synchro  {
	public static void main(String[] args) {
	 
		Thread Th = new Thread(new Test1());
		Thread Th1 = new Thread(new Test2());
		
	        Th.start();
	        Th1.start();
		
		
		
	 
		
	}

}
