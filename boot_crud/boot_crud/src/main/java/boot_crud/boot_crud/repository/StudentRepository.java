package boot_crud.boot_crud.repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;

import boot_crud.boot_crud.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>  
{



	
	Collection<? extends Student> findByMobile(long num);

	Collection<? extends Student> findByNameLike(String string);

	Collection<? extends Student> findByEmailLike(String string);


}
