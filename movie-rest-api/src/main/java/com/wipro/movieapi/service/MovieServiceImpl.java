package com.wipro.movieapi.service;
import com.wipro.movieapi.repository.MovieRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.movieapi.dto.MovieDTO;
import jakarta.transaction.Transactional;
import com.wipro.movieapi.entity.Movie;

@Transactional
@Service
public class MovieServiceImpl implements IMovieService {
	
	@Autowired
	MovieRepository repo;

	@Override
	public Movie addMovie(MovieDTO movieDto) {
		
		Movie movie = new Movie();
		movie.setMovieId(movieDto.getMovieId());
		movie.setMovieName(movieDto.getMovieName());
		movie.setDirector(movieDto.getDirector());
		movie.setReleaseDate(movieDto.getReleaseDate());
		movie.setGenre(movieDto.getGenre());
		movie.setRating(movieDto.getRating());
		return repo.save(movie);
	}

	@Override
	public Movie updateMovie(MovieDTO movieDto) {
		
		Movie movie = new Movie();
		movie.setMovieId(movieDto.getMovieId());
		movie.setMovieName(movieDto.getMovieName());
		movie.setDirector(movieDto.getDirector());
		movie.setReleaseDate(movieDto.getReleaseDate());
		movie.setGenre(movieDto.getGenre());
		movie.setRating(movieDto.getRating());
		return repo.save(movie);
	}

	@Override
	public Movie findMovieById(int movieId) {
		
		Movie movie = repo.findById(movieId).orElse(null);
		return movie;
	}

	@Override
	public void deleteMovieById(int movieId) {
		repo.deleteById(movieId);
		//return "Movie with id: " + movieId + " deleted successfully!";
	}

	@Override
    public List<Movie> getAllMovies() {
		return repo.findAll();
    }
	
	@Override
	public MovieDTO getByMovieName(String movieName) {
	    
		Movie movie = repo.findByMovieName(movieName);
		
		MovieDTO movieDto = new MovieDTO();
		movieDto.setMovieId(movie.getMovieId());
		movieDto.setMovieName(movie.getMovieName());
		movieDto.setDirector(movie.getDirector());
		movieDto.setReleaseDate(movie.getReleaseDate());
		movieDto.setGenre(movie.getGenre());
		movieDto.setRating(movie.getRating());
		
		return movieDto;
	}
//	
//	@Override
//	public List<Movie> getByGenre(String genre) {
//		return repo.findByGenre(genre);
//	}
//	
//	@Override
//	public void deleteByMovieName(String movieName) {
//		repo.deletebyMovieName(movieName);
//	}


	
	
	
	
	

}
