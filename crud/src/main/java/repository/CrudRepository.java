package repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.stereotype.Repository;

import entity.User;

@Repository
public class CrudRepository {

	EntityManagerFactory factory = Persistence.createEntityManagerFactory("crud");
	EntityManager manager = factory.createEntityManager();
	EntityTransaction transaction = manager.getTransaction();

	public boolean save(User user) {
		try {
			transaction.begin();
			manager.persist(user);
			transaction.commit();
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public User findById(int id) {
		return manager.find(User.class, id);
	}

	public boolean update(User user) {
		try {
			transaction.begin();
			manager.merge(user);
			transaction.commit();
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public boolean delete(int id) {
		try {
			transaction.begin();
			manager.remove(findById(id));
			transaction.commit();
			return true;
		} catch (Exception e) {
			transaction.commit();
			return false;
		}
	}
}
