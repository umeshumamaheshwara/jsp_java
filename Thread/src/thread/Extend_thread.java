package thread;

import java.util.Iterator;

public class Extend_thread extends Thread {
	 public void run()
	 {
		 for(int i =1 ; i<11 ; i++)
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
	
	public static void main(String[] args) throws InterruptedException {
		Extend_thread s = new Extend_thread();
		Thread t = new Thread(s);
		t.start();
		
	}

}
