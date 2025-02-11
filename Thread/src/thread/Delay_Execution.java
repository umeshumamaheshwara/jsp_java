package thread;

public class Delay_Execution {
	public static void main(String[] args) throws InterruptedException {
		for(int i =1 ; i<11 ; i++)
		{
			Thread.sleep(1000);
			System.out.println(i);
		}
	}

}
