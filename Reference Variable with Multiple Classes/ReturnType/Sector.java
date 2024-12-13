class  Area
{ 
	double area()
	{
		int r=5;
		final double theta= 1.54;
		double result=0.5*r*r*theta;
		return result;
		
	}
}
class Sector
{

		
	public static void main(String[] args) 
	{
		Area s1 = new Area();
		double x = s1.area();
		System.out.println("Area of the Sector" + x);
		
	}

}

