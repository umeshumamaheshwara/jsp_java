package Constructor;

//getInstace()


class Employee3 
{
    private static Employee3 instance;  // Step 1: static instance variable     // we can give any name instead of instance it is not an keyword 

    int id;
    String name;
    double sal;

   
    private Employee3(int id,String name,double sal)                      // Step 2: private constructor to restrict object creation from outside
    {
        System.out.println("Employee constructor called");
                                                                             // You can set default values here if needed               
        this.id = id;
        this.name = name;
        this.sal = sal;
    }

   
    public static Employee3 getInstance(int id, String name, double sal)                                        // Step 3: public static method to get the single instance
    {
        if (instance == null) 
        {
            instance = new Employee3(id,name,sal);                                         // only once!
        }
        return instance;
    }

    public String toString() 
    {
        return id + " " + name + " " + sal;
    }
}


public class MainSingleton {
	public static void main(String[] args) {
       
        Employee3 e1 = Employee3.getInstance(001,"Umesh",6000);                // Call Singleton object using static method
        System.out.println(e1);

        Employee3 e2 = Employee3.getInstance(002,"harish",9000);
        System.out.println(e2);

       
        System.out.println("Are both objects same? " + (e1 == e2));              // Just to show it's the same object
	}

}
