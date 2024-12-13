class Cloth
{
	static String Color= "Black";
	String Size;
	int Cost;
	public static void main(String[] args) 
	{
	    
		System.out.println("Cloth Color is : " + Color);
		 Cloth C1 = new  Cloth();
		 Cloth  C2 = new  Cloth();
		
		C1.Size = "L";
		C2.Cost =  2000 ;	
		
		System.out.println(" Cloth Size :   " +  C1.Size );
		System.out.println(" Exam Fee : " + C2.Cost);
		
		C1.Size  = "XL";
		C2.Cost =  1500 ;	
		
		System.out.println(" Cloth Size : " + 	C1.Size );
		System.out.println(" Cloth Cost : " + 	C2.Cost);
		
		C1.Size  = "M";
		C2.Cost =  1000 ;	
		
		System.out.println(" Cloth Size : " + 	C1.Size );
		System.out.println(" Cloth Cost : " + 	C2.Cost);
		
	}
}
