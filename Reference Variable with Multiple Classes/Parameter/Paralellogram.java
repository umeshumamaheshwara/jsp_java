class  Area
{
	 void area(int h, int b)
	{
		
		int  area=b*h;
		System.out.println("Area of the Paralellogram "+ area);
	}
}
class Paralellogram
{
	public static void main(String[] args) 
	{
		Area s1 = new Area();
		s1.area(5,2);
	
    }
	
}
