package boot_crud.boot_crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import boot_crud.boot_crud.entity.Student;
import boot_crud.boot_crud.service.CrudService;

@Controller
public class CrudController {
	
	@Autowired
	CrudService service;
	
	
	@GetMapping("/")
	public String loadHome()
	{
		return "home.html";
	}
	
	
	@GetMapping("/insert")
	public String loadAdd()
	{
		return "add.html";
	}
	
	@PostMapping("/insert")
	public String add(@ModelAttribute Student student,Model model)
	{
		return service.add(student, model);
		
	}
	
	@GetMapping("/fetch")
	public String fetch(Model model)
	{
		return service.fetch(model);
	}
	

}
