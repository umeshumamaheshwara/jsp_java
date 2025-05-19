package com.jsp.Movie_SpringBoot.service;

import java.util.HashSet;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.jsp.Movie_SpringBoot.entity.Movie;
import com.jsp.Movie_SpringBoot.repository.MovieRepository;




@Service
public class MovieService 
{
	
	@Autowired
	MovieRepository repository;

	public String add(Movie movie, Model model) {
		
		repository.save(movie);
		model.addAttribute("message","Record Added Sucess");
		return "home.html";

	}

//	public String fetch(Model model, String search) 
//	{
//		 HashSet<Movie> movies = new HashSet<>();
//
//		    try {
//		        // Try to parse search as a number (e.g., rating)
//		        double rating = Double.parseDouble(search);
//		        movies.addAll(repository.findByRating(rating));
//		    } catch (NumberFormatException e) {
//		  
//		        movies.addAll(repository.findByNameLike("%" + search + "%"));
//		        movies.addAll(repository.findByActorLike("%" + search + "%"));
//		        movies.addAll(repository.findByActressLike("%" + search + "%"));
//		    }
//
//		    if (movies.isEmpty()) {
//		        model.addAttribute("message", "No Records Found");
//		        return "home.html";
//		    } else {
//		        model.addAttribute("movies", movies);
//		        return "fetch.html";
//		    }
		
//		HashSet<Movie> movies = new HashSet<>();
//
//	    if (search != null && !search.trim().isEmpty()) 
//	    {
//	        movies.addAll(repository.findByNameLike("%" + search.trim() + "%"));
//	    }
//
//	    if (movies.isEmpty()) 
//	    {
//	        model.addAttribute("message", "No Records Found");
//	        return "home.html"; 
//	    } else
//	    {
//	        model.addAttribute("movies", movies);
//	        return "fetch.html";
//	    }
//	}
	public String fetch(Model model, String search) {
	    List<Movie> movies;

	    if (search != null && !search.trim().isEmpty()) {
	        movies = repository.findByNameLike("%" + search.trim() + "%");
	        if (movies.isEmpty()) {
	            model.addAttribute("message", "No Records Found");
	        }
	    } else {
	        movies = repository.findAll(); // Show all records if no search
	    }

	    model.addAttribute("movies", movies);
	    return "fetch.html";
	}

	public String edit(int id, Model model) {
		Movie movie = repository.findById(id).orElseThrow();
		model.addAttribute("movie", movie);
		return "edit.html";
		
	}

	public String delete(int id, Model model) {
		repository.deleteById(id);
		model.addAttribute("message", "Deleted Success");
		return "home.html";

	}

	public String updateProduct(Movie movie, Model model) {
		repository.save(movie);
		model.addAttribute("message", "Updated SucessFully");
		return "home.html";
	}


}
