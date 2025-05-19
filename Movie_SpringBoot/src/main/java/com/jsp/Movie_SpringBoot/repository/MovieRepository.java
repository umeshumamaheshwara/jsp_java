package com.jsp.Movie_SpringBoot.repository;

import java.util.Collection;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.Movie_SpringBoot.entity.Movie;

public interface MovieRepository extends JpaRepository<Movie, Integer> {

	List<Movie> findByNameLike(String string);

//	Collection<? extends Movie> findByActressLike(String string);

}
