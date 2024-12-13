class  Area
{ 
	double area()
	{
		int r=5;
		final double pi= 3.142;
		double result=pi*r*r;
		return result;
	}
}
class Circle
{

		
	public static void main(String[] args) 
	{
		Area s1 = new Area();
		double x = s1.area();
		System.out.println("Area of the Circle" + x);
	}

}