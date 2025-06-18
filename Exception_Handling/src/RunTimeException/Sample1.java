package RunTimeException;

public class Sample1 
{
	public static void main(String[] args) 
	{
		try {
			int i = 1/0;
			
		}
		catch(ArithmeticException e) {
			
        System.out.println("Handeled...");
			
		}
		
	}

}
