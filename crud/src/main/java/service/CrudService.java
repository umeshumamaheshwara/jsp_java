package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import entity.User;
import repository.CrudRepository;

@Service
public class CrudService {

	@Autowired
	CrudRepository repository;

	public String save(User user, Model model) {
		boolean status = repository.save(user);
		if (status) {
			model.addAttribute("success", "Data Saved Success");
		} else {
			model.addAttribute("failure", "Data Failed to Save");
		}
		return "home.jsp";
	}

	public String findById(int id, Model model) {
		User user = repository.findById(id);
		if (user == null) {
			model.addAttribute("failure", "No record found with id : " + id);
			return "home.jsp";
		} else {
			model.addAttribute("user", user);
			return "display.jsp";
		}
	}

	public String update(User user, Model model) {
		boolean status = repository.update(user);
		if (status) {
			model.addAttribute("success", "Updated Success");
		} else {
			model.addAttribute("failure", "Failed to Update");
		}
		return "home.jsp";
	}

	public String deleteById(int id, Model model) {
		boolean status = repository.delete(id);
		if (status) {
			model.addAttribute("success", "Deleted Success");
		} else {
			model.addAttribute("failure", "Not able to delete");
		}
		return "home.jsp";
	}
}
