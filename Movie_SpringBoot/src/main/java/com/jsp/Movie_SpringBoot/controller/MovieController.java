package com.jsp.Movie_SpringBoot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.jsp.Movie_SpringBoot.entity.Movie;
import com.jsp.Movie_SpringBoot.service.MovieService;


@Controller
public class MovieController {
	
	@Autowired
	MovieService service;
	
	@GetMapping("/")
	public String loadHome()
	{
		return "home.html";
	}
	@GetMapping("/insert")
	public String  loadadd()
	{
		return "add.html";
		
	}
	@PostMapping("/insert")
	public String add(@ModelAttribute Movie  movie,Model model)
	{
		return service.add(movie,model);
	}
	
	@GetMapping("/fetch")
	public String fetch (Model model,@RequestParam(defaultValue = "") String search)
	{
		return service.fetch(model,search);
	}
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable int id,Model model)
	{
		return service.edit(id,model);
	}
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable int id, Model model)
	{
		return service.delete(id,model);
	}
	
	@PostMapping("/update")
	public String update(@ModelAttribute Movie movie,Model model)
	{
		return service.updateProduct(movie,model);
	}



}
