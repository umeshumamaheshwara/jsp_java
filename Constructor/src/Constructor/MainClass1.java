package Constructor;



class Employee1 {
    int id;
    String name;
    double sal;

  
    protected Employee1(int id, String name, double sal) {     // protected constructor
        this.id = id;
        this.name = name;
        this.sal = sal;
    }

    public String toString() {
        return id + " " + name + " " + sal;
    }
}

class Manager extends Employee1 {
    
	String dept;

   
    public Manager(int id, String name, double sal, String dept) 
    {
        super(id, name, sal);                                       // calling Employee's constructor
        this.dept = dept;
    }

    public String toString() 
    {
        return super.toString() + " Department: " + dept;             // If we want super class Implementation write super.toString() 
    }
}



public class MainClass1 
{
	public static void main(String[] args) 
	{

	        Manager m1 = new Manager(101, "Umesh", 60000, "IT");
	        System.out.println(m1);
		
	}

}
