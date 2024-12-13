class  TV
{
	int Cost;
	String TV_type;
	static String Brand = "TCL";
	
	
	public static void main(String[] args) 
	{
		
		System.out.println("TV Brand is : " + Brand);
		TV T1 = new TV();
		TV T2 = new TV();
		
		T1.Cost = 300000;
		T2.TV_type =  "LED";	
		
		System.out.println(" TV Cost IS: " + T1.Cost);
		System.out.println(" TV Type IS:" + T2.TV_type);
		
		T1.Cost = 350000;
		T2.TV_type  =  "LCD";	
		
		System.out.println(" TV Cost IS: " +  T1.Cost);
		System.out.println(" TV Type IS: " + T2.TV_type);
		
		
		
		
	}
}
