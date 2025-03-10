package Advance;



interface Rectangle
{
	double area();
}

public class LamdaEXP {
	public static void main(String[] args) {
	     Rectangle r = ()-> {
	    	 double res = 5*7.5;
			return res;
	     };
	     double w = r.area();
	     System.out.println(w);
	}
	

}
