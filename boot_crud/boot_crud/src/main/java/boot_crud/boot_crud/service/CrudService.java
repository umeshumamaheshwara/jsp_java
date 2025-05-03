package boot_crud.boot_crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import boot_crud.boot_crud.entity.Student;
import boot_crud.boot_crud.repository.StudentRepository;

@Service
public class CrudService {
	
	@Autowired
	StudentRepository repository;
	
	public String add(Student student, Model model)
	{
		repository.save(student);
		model.addAttribute("message","Record Added Sucess");
		return "home.html";
	}

	public String fetch(Model model)
	{
		List<Student> students =repository.findAll();
		if(students.isEmpty())
		{
			model.addAttribute("students" , "No Records found");
			return "home.html";
		}
		else
		{
			model.addAttribute("students", students);
			return "fetch.html";
		}
	}
	

}
