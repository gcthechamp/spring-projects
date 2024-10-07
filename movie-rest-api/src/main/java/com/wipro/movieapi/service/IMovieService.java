package com.wipro.movieapi.service;
import com.wipro.movieapi.dto.MovieDTO;
import com.wipro.movieapi.entity.Movie;
import java.util.List;

import org.springframework.http.ResponseEntity;





public interface IMovieService {
	
    public Movie addMovie(MovieDTO movieDto);
	
	public Movie updateMovie(MovieDTO movieDto);
	
	public Movie findMovieById(int movieId);
	
	public void deleteMovieById(int movieId);
	
	public List<Movie> getAllMovies();
	
    public MovieDTO getByMovieName(String movieName);
//
//	public List<Movie> getByGenre(String genre);
//	
//	public void deleteByMovieName(String movieName);

	
}
