package RunTimeException;

public class Sample2 
{
	public static void main(String[] args) 
	{
		Sample2 s2 = null;
		try
		{
			System.out.println(s2.hashCode());
		}
		catch(NullPointerException e)
		{
			System.out.println("Handeled..");
			
		}
	
    }

}
