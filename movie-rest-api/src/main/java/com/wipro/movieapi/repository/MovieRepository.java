package com.wipro.movieapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.wipro.movieapi.dto.MovieDTO;
import com.wipro.movieapi.entity.Movie;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Integer> {
	
    public Movie findByMovieName(String movieName);
	
	public List<Movie> findByGenre(String genre);
	
	

}
