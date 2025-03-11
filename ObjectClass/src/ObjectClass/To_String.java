package ObjectClass;

class student
{
	String stdname;
	int fees;
	char sec;
	student(String stdname, int fees , char sec)
	{
		this.stdname = stdname;
		this.fees = fees;
		this.sec = sec;
		
	}
	public String toString()
	{
		return this.stdname+ " "+this.fees+ " " + this.sec;
	}
	
}

public class To_String {
	public static void main(String[] args) {
		student s1 = new student("Rajesh",5000,'A');
		System.out.println(s1);
		
	}

}
