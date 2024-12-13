class  Area
{ 
	void area()
	{
		int r=5;
		final double pi= 3.142;
		double result=pi*r*r;
		System.out.println("Area of the Circle" + result);
	}
}
class Circle
{

		
	public static void main(String[] args) 
	{
		Area s1 = new Area();
		s1.area();
		
	}

}
