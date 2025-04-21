package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import entity.User;
import service.CrudService;

@Controller
public class CrudController {

	@Autowired
	CrudService service;

	@GetMapping("/")
	public String loadMain() {
		return "home.jsp";
	}

	@GetMapping("/create")
	public String loadCreate() {
		return "add.jsp";
	}

	@PostMapping("/create")
	public String create(@ModelAttribute User user,Model model) {
		return service.save(user,model);
	}

	@GetMapping("/read")
	public String loadFetch() {
		return "fetch.jsp";
	}

	@PostMapping("/read")
	public String fetchById(@RequestParam int id,Model model) {
		return service.findById(id,model);
	}

	@GetMapping("/delete")
	public String loadDelete() {
		return "delete.jsp";
	}

	@PostMapping("/delete")
	public String deleteById(@RequestParam int id,Model model) {
		return service.deleteById(id,model);
	}

	@GetMapping("/update")
	public String loadUpdate() {
		return "update.jsp";
	}

	@PostMapping("/update")
	public String update(@ModelAttribute User user,Model model) {
		return service.update(user,model);
	}

}
