class School 
{
	static String School_Name = "Jspyder";
	String Grade;
	int Strength;
	public static void main(String[] args) 
	{
	    
		System.out.println("Institution Name is : " + School_Name);
		School S1 = new School();
		School  S2 = new School();
		
		S1.Grade = "A";
		S2.Strength =  60 ;	
		
		System.out.println("Grade Is: " + S1.Grade);
		System.out.println("Strength Is : " + 	S2.Strength);
		
		S1.Grade = "B";
		S2.Strength =  150 ;	
		
		System.out.println("Grade Is: " + S1.Grade);
		System.out.println("Strength Is " + 	S2.Strength);
		
	}
}
