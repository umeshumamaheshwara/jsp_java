class  Area
{ 
	double area()
	{

		int b=5;
		int h=5;
		
		double result=0.5*b*h;
		return result;
		
	}
}
class Triangle
{

		
	public static void main(String[] args) 
	{
		Area s1 = new Area();
		double x = s1.area();
		System.out.println("Area of the Triangle" + x);
		
	}

}

