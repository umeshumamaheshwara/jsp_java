package boot_crud.boot_crud.repository;




import org.springframework.data.jpa.repository.JpaRepository;

import boot_crud.boot_crud.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>  {

	

}
