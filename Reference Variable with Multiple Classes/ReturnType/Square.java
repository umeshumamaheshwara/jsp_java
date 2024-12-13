class  Area
{ 
	int area()
	{

		int a=5;
		int result=a*a;
		return result;
		
	}
}
class Square
{

		
	public static void main(String[] args) 
	{
		Area s1 = new Area();
		int x = s1.area();
		System.out.println("Area of the Square" + x);
		
	}

}

