package Constructor;

//Factory Method

class Employee2 {
    int id;
    String name;
    double sal;

    // Private constructor
    private Employee2(int id, String name, double sal) {
        this.id = id;
        this.name = name;
        this.sal = sal;
    }

   
    public static Employee2 createEmployee(int id, String name, double sal)      // Public static factory method
    {
        return new Employee2(id, name, sal);
    }

    public String toString() 
    {
        return id + " " + name + " " + sal;
    }
}

public class MainPrivate 
{
    public static void main(String[] args) 
    {
        
        Employee2 e = Employee2.createEmployee(101, "Umesh", 60000);    // Use the factory method to create the object
        Employee2 e1  = Employee2.createEmployee(10,"ramesh", 60000);
        
        
        System.out.println(e);
        System.out.println(e1);
    }
}

