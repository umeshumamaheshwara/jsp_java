package HiberNatePro;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class MainClass {
	public static void main(String[] args) {

		
		EntityManagerFactory e = Persistence.createEntityManagerFactory("HIBER1");
		EntityManager p = e.createEntityManager();
	    EntityTransaction t = p.getTransaction();
		
		Student s = new Student();
		   
		   //1st data....
		   s.setId(10);
		   s.setName("Ramesh");
		   s.setAddress("Sagar");
		   s.setPhoneNumber(9482110936l);
		   s.setPercentage(86.6);
		
//		   s.setId(0);
		   
		   //2nd data
//		   s.setId(1);
//		   s.setName("Umesh");
//		   s.setAddress("Purappemane");
//		   s.setPhoneNumber(9353039062l);
//		   s.setPercentage(83.6);
//		   
		   //2.Fetching the object
		   
//		   Student std = p.find(Student.class, 1);
//		   System.out.println(std.getId()+std.getName()+" "+std.getAddress()+" "+std.getPhoneNumber()+" "+std.getPercentage());
		  
		   
		   t.begin();
		   p.persist(s);
		   t.commit();

		   
		   //3.Updating the object
		   
//		   Student std=p.find(Student.class, 10);
//		   std.setName("Pratheek");
//		   
//		   t.begin();
//	       p.merge(std);
//	 	   t.commit();
		   
		   //4. Deleting the object
		   
//		   Student std=p.find(Student.class, 10);
//		   t.begin();
//		   p.remove(std);
//		   t.commit();
		   
		   
	}

}
