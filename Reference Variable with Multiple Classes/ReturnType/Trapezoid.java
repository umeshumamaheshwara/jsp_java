class  Area
{ 
	double area()
	{
		int a=5;
		int b=5;
		int h=5;
		double result=0.5*(a+b)*h;
		return result;
		
	}
}
class Trapezoid
{

		
	public static void main(String[] args) 
	{
		Area s1 = new Area();
		double x = s1.area();
		System.out.println("Area of the Trapezoid" + x);
		
	}

}

