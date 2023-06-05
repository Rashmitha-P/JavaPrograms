package com.movieapp.repository;

import java.util.List;
import java.util.Optional;

import com.movieapp.exceptions.MovieNotFoundException;
import com.movieapp.model.Movie;

public interface IMovieRepository {
	void addMovie(Movie movie);

	void updateMovie(int MovieId, double price);

	void deleteMovie(int MovieId);

	List<Movie> findAll();

	Optional<Movie> findById(int MovieId) throws MovieNotFoundException;

	List<Movie> findBylanguage(String language) throws MovieNotFoundException;

	List<Movie> findBymovienameandyear(String moviename, int year) throws MovieNotFoundException;

	List<Movie> findBygenre(String genre) throws MovieNotFoundException;

}
