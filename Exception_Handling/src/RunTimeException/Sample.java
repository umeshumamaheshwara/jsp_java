package RunTimeException;

public class Sample {
	public static void main(String[] args)
	{
		int [] arr = {1,2,3,4,5,6,7};
		try {
		System.out.println(arr[9]);
		}
		catch(ArrayIndexOutOfBoundsException e )
		{
			System.out.println("Handeled");
			
		}
	
		
	}

}
