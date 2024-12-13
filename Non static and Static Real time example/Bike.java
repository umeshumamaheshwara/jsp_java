class  Bike
{
	int Cost;
	String Color;
	static String Brand= "KTM";
	
	public static void main(String[] args) 
	{
		
		System.out.println("Car Brand is : " + Brand);
		 Bike B1 = new  Bike();
		 Bike B2 = new  Bike();
		
		B1.Cost = 300000;
		B2.Color =  "Black";	
		
		System.out.println(" Bike Cost Is : " + B1.Cost);
		System.out.println(" Bike Color Is : " + B2.Color);
		
		B1.Cost = 350000;
		B2.Color  =  "Orange";	
		
		System.out.println(" Bike Cost Is : " +  B1.Cost);
		System.out.println(" Bike Color Is : " + B2.Color);
		
		
		
	}
}
