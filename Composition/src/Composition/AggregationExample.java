package Composition;

//College class
class College 
{
 String name;

 public College(String name) 
 {
     this.name = name;
 }

 void display() 
 {
     System.out.println("College Name: " + name);
 }
}

//Student class — has a reference to College
class Student 
{
 String studentName;
 College college;  // Aggregation (College is passed from outside)

 Student(String studentName, College college) {
     this.studentName = studentName;
     this.college = college;
 }

 void show() {
     System.out.println("Student Name: " + studentName);
     college.display();  // Student uses College object
 }
}

//Main class
public class AggregationExample 
{
 public static void main(String[] args) {
     College c1 = new College("VCET Puttur"); // College exists independently
     Student s1 = new Student("Umamaheshwara", c1); // Aggregation
     s1.show();
 }
}

