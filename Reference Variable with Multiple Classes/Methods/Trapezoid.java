class  Area
{ 
	void area()
	{
		int a=5;
		int b=5;
		int h=5;
	
		double result=0.5*(a+b)*h;
		System.out.println("Area of the Trapezoid" + result);
	}
}
class Trapezoid
{
	public static void main(String[] args) 
	{
		Area s1 = new Area();
		s1.area();
		
	}

}

