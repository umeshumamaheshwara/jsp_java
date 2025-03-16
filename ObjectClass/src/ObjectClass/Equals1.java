package ObjectClass;


class Employee
{
	int EmpId;
	String EmpName;
	double EmpSal;
	Employee(int EmpId, String EmpName, double EmpSal)
	{
		this.EmpId = EmpId;
		this.EmpName = EmpName;
		this.EmpSal = EmpSal;
	}
	public boolean equals(Object obj)
	{
		Employee e2 = (Employee) obj;
		return (this.EmpSal==e2.EmpSal) && (this.EmpId==e2.EmpId);
		
	}
}

public class Equals1 {
	public static void main(String[] args) {
		Employee e1 = new Employee(123, " Umesh" , 60000);
		Employee e2 = new Employee(124, " Umesh" , 50000);
		if(e1.equals(e2))
		{
			System.out.println("Vales Are Equal...");
		}
		else {
			System.out.println("Not Equal...");
		}
	}

}
