package com.manish.movieinfoservice.resources;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.manish.movieinfoservice.models.Movie;

@RestController
@RequestMapping("/movies")
public class MovieResource {
	
	
	@RequestMapping("/{movieId}")
	public Movie getMovie(@PathVariable String movieId) {
		return new Movie(movieId, "Test movie name");
	}
}
