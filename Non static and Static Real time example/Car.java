class  Car
{
	int Cost;
	String Car_type;
	static String Car_Model_Name= "BMW";
	
	public static void main(String[] args) 
	{
		
		System.out.println("Car Brand is : " + Car_Model_Name);
		Car C1 = new Car();
		Car C2 = new Car();
		
		C1.Cost = 300000;
		C2.Car_type =  "Petrol";	
		
		System.out.println("Umesh Car Cost is: " + C1.Cost);
		System.out.println("Umesh Car Color is : " + C2.Car_type);
		
		C1.Cost = 350000;
		C2.Car_type  =  "Disel";	
		
		System.out.println("Ramesh Car Cost is: " +  C1.Cost);
		System.out.println("Ramesh Car Color is: " + C2.Car_type);
		
		
		
		
	}
}
