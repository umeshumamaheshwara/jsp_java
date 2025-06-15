package Constructor;

 class SingletonePattern {
	private static SingletonePattern instance;
	
	int id;
	String name;
	double sal;
	private SingletonePattern(int id, String name, double sal) 
	{
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
	}
	
	public static SingletonePattern getInstace(int id, String name, double sal)
	{
		if(instance == null)
		{
			instance  = new SingletonePattern(id,name,sal);
			
		}
		return instance;
	}
	
	public String toString()
	{
		return id + " "+name+" "+sal;
	}
	

}
public class SingleTon
{
	public static void main(String[] args) {
      
		SingletonePattern s1 =  SingletonePattern.getInstace(001, "Umesh", 1001);
		
		System.out.println(s1);
		
		
       SingletonePattern s2 =  SingletonePattern.getInstace(101, "gannesh", 12001);
		
		System.out.println(s2);
		
		
		
	}
}
