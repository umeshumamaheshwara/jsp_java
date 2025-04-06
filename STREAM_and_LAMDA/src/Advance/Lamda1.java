package Advance;

interface lam
{
	void area(int r );
}

public class Lamda1 {
	public static void main(String[] args) {
		lam  l = (r)-> {
			
			
			final double pi = 3.142;
			System.out.println(pi*r*r);
			
		};
		l.area(10);
	}
	

}
