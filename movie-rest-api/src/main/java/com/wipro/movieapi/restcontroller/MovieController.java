package com.wipro.movieapi.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.movieapi.dto.MovieDTO;
import com.wipro.movieapi.entity.Movie;

import com.wipro.movieapi.service.IMovieService;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/api/movies/")
public class MovieController {
	
	@Autowired
	private IMovieService service;
	
	@PostMapping(value="/add", produces = "application/json",consumes = "application/json")
	public Movie addMovie(@RequestBody MovieDTO movieDto) {
		
		return service.addMovie(movieDto);
	}

	@PutMapping("/update")
	public Movie updateMovie(@RequestBody MovieDTO movieDto) {
		
		return service.updateMovie(movieDto);
	}

	@GetMapping("/get/{movieId}")
	public Movie findMovieById(@PathVariable int movieId) {
		
		Movie movie = service.findMovieById(movieId);
		
		return movie;
	}
	
//	@ResponseStatus(reason = "Movie not found!", code=HttpStatus.BAD_REQUEST)
//	@ExceptionHandler(MovieNotFoundException.class)
//	public void handleException() {
//		
//	}

	@DeleteMapping("/delete/{movieId}")
	public void deleteMovieById(@PathVariable int movieId) {
		
		service.deleteMovieById(movieId);
	}

	@GetMapping("/getall")
	public List<Movie> getAllMovies() {
		
		return service.getAllMovies();
	}
	
	@GetMapping("/get-by-name/{movieName}")
	public MovieDTO getByMovieName(@PathVariable String movieName) {
		return service.getByMovieName(movieName);
	}
//	
//	@GetMapping("/get-by-genre/{genre}")
//	public List<Movie> getByGenre(@PathVariable String genre) {
//		return service.getByGenre(genre);
//	}
//	
//	@DeleteMapping("/delete-by-name/{movieName}")
//	public ResponseEntity<String> deleteByMovieName(@PathVariable String movieName) {
//		service.deleteByMovieName(movieName);
//		return new ResponseEntity<String>("Deleted movie successfully",HttpStatus.ACCEPTED);
//	}

}
