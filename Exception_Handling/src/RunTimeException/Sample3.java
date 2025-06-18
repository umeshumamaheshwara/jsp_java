package RunTimeException;

public class Sample3 
{
	public static void main(String[] args) 
	{
		try 
		{
		int a = Integer.parseInt("45df");
		System.out.println(a);
		}
		catch(NumberFormatException e)
		{
			System.out.println("Handeled ... --->NumberFormatException");
		}
		
	}

}
