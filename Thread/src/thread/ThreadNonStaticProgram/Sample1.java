package ThreadNonStaticProgram;

class Demo extends Thread
{
	public void run() 
	{
		for(int i = 0 ; i<= 10; i++)
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


public class Sample1 {
	public static void main(String[] args) 
	{
		Demo d1 = new Demo();
		d1.start();
		
	}

}
