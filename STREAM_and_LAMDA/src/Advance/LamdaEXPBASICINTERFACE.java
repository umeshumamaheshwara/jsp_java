package Advance;

interface Lamda
{
	double area();
}
class sample1  implements Lamda
{
	public double area()
	{
		int r = 5;
		final double pi = 3.142;
		return r*r*pi;
	}
	
}

public class LamdaEXPBASICINTERFACE {
	public static void main(String[] args) {
		sample1 s1 = new sample1();
		double x = s1.area();
		System.out.println(x);
		
		
	}
	

}
