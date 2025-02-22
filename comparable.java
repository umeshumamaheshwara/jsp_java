package CollectionFramework;

import java.util.Arrays;

class Employee implements Comparable<Employee>{
	int id;
	String Name;
	Double Salary;
	Employee(int id,String Name,Double Salary)
	{
		this.id=id;
		this.Name=Name;
		this.Salary=Salary;
	}
	public String toString()
	{
		return id+ " "+ Salary;
	}
	public int compareTo(Employee emp)
	{
		//return this.id-emp; //based on integer value.
		//return (int) (this.Salary-emp.Salary); //based  decimal value.
		return this.Name.compareTo(emp.Name); //based on String value
		
	}
}


public class comparable {
	public static void main(String[] args) {
		Employee e1=new Employee(10,"Shanak Sir",78454.78);
		Employee e2=new Employee(5,"Govindhu Rajuuuu",66454.78);
		Employee e3=new Employee(4,"HariKrishna Sir",54454.78);
		Employee [] arr= {e1,e2,e3};
		Arrays.sort(arr);
		for(Employee a: arr)
		{
			System.out.println(a);
		}
		
		
		
		
		
		
	}

}
