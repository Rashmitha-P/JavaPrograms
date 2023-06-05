package com.movieapp.service;

import java.util.List;
import java.util.Optional;

import com.movieapp.model.Movie;

public interface IMovieService {
	void addMovie(Movie movie );
	void updateMovie(int MovieId,double price);
	void deleteMovie(int MovieId);
List<Movie> getAll() ;
Optional<Movie> getById(int MovieId);
List<Movie> getBylanguage(String language) ;
List<Movie> getBymovienameandyear(String moviename,int year) ;
List<Movie> getBygenre(String genre) ;
}
