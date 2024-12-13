class  Area
{
	 void area(int r)
	{
		
		final double theta=1.54;
		double  area= 0.5*r*r*theta;
		System.out.println("Area of the  Sector "+ area);
	}
}
class Sector
{
	public static void main(String[] args) 
	{
		Area s1= new Area();
		s1.area(2);
	
    }
	
}
