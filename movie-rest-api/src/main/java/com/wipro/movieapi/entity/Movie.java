package com.wipro.movieapi.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

@Entity
public class Movie {
	
	@Id
	private int movieId;
	
	
	private String movieName;
	
	
	private String director;
	
	
	private LocalDate releaseDate;
	
	private String genre;
	private double rating;
	
	public Movie() {
		super();
	}

	public Movie(int movieId, String movieName, String director, LocalDate releaseDate, String genre, double rating) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
		this.director = director;
		this.releaseDate = releaseDate;
		this.genre = genre;
		this.rating = rating;
	}

	public int getMovieId() {
		return movieId;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public LocalDate getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(LocalDate releaseDate) {
		this.releaseDate = releaseDate;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "Movie [movieId=" + movieId + ", movieName=" + movieName + ", director=" + director + ", genre=" + genre
				+ ", rating=" + rating + "]";
	}
	
	
	
	

}
