class  Area
{
	static void area(int a)
	{
		
		double  area = a*a;
		System.out.println("Area of the  Square "+ area);
	}
}
class Square
{
	public static void main(String[] args) 
	{
		Area s1= new Area();
		s1.area(5);
	
    }
	
}
