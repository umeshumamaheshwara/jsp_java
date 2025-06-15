package Constructor;


class Employee
{
	int id;
	String name;
	double sal;
   protected Employee(int id, String name, double sal)    //  If we declare as protected create  objects inside the same package.
	{
		
		this.id = id;
		this.name = name;
		this.sal = sal;
	}
	
	public  String toString()
	{
		return id + " " + name +" "  + sal;
	}
	
	
}

public class MainClass 
{
	public static void main(String[] args) 
	{
		Employee  e1 = new Employee(001, " umesh ", 60000);
		System.out.println(e1.name);
		System.out.println(e1);
	}
	

}
