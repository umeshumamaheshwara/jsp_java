class  Area
{ 
	double area()
	{
		int a=5;
		int b=5;
		final double pi= 3.142;
		double result=pi*a*b;
		return result;
		
	}
}
class Ellipse
{

		
	public static void main(String[] args) 
	{
		Area s1 = new Area();
		double x = s1.area();
		System.out.println("Area of the Ellipse" + x);
		
	}

}

