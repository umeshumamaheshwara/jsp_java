package HiberNet;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Mainclass {
	
	public static void main(String[] args) {
		Employee e = new Employee();
		
		e.setId(12);
		e.setName("Umesh");
		e.setSalary(70000);
		
		EntityManagerFactory w = Persistence.createEntityManagerFactory("dev");
	     EntityManager m = w.createEntityManager();
	    EntityTransaction t = m.getTransaction();
		
	    t.begin();
	    m.persist(e);
	    t.commit();
	}

}
