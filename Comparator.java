package CollectionFramework;

import java.util.Arrays;

final class student
{
	int id;
	String Name;
	double Marks;
	public student(int id, String name, double marks) {
		super();
		this.id = id;
		Name = name;
		Marks = marks;
	}
	public String toString()
	{
		return id+ " " + Name+ " " + Marks;
	}
	
	
}

public class Comparator implements java.util.Comparator<student> {
	
	public static void main(String[] args) {
		
		student s1 = new student(10,"Sachin",86.2);
		student s2 = new student(10,"Rachin",86.2);
		student s3 = new student(1,"Umesh",98.2);
		student [] arr = {s1,s2,s3};
		Arrays.sort(arr ,new Comparator());
		for(student s : arr)
		{
			System.out.println(s);
			
		}
		
	}
	public int compare(student std1, student std2)  

	{
		return std1.id-std2.id;
	
	}


}
