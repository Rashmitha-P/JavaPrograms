package com.movieapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.movieapp.exceptions.MovieNotFoundException;
import com.movieapp.model.Movie;
import com.movieapp.repository.IMovieRepository;
@Service
public class MovieServiceImpl implements IMovieService {
	@Autowired
IMovieRepository movieRepository ;

	public MovieServiceImpl(IMovieRepository movieRepository) {
	super();
	this.movieRepository = movieRepository;
}

	@Override
	public void addMovie(Movie movie) {
		movieRepository.addMovie(movie);	
		
	}

	@Override
	public void updateMovie(int MovieId, double price) {
		movieRepository.updateMovie(MovieId, price);
		
	}

	@Override
	public void deleteMovie(int MovieId) {
		movieRepository.deleteMovie(MovieId);
		
	}

	@Override
	public List<Movie> getAll() {
		List	<Movie> movie=movieRepository.findAll();
		if(movie.isEmpty())
		throw new MovieNotFoundException("Movie not found");
		return movie;
		
	}

	@Override
	public Optional<Movie> getById(int MovieId) {
		Optional<Movie> movie= movieRepository.findById(MovieId);
		return Optional.of(movie.orElseThrow(()->new MovieNotFoundException("invalid id")));
		
	}

	@Override
	public List<Movie> getBylanguage(String language) {
		List<Movie> movie=movieRepository.findBylanguage(language);
		if(movie.isEmpty())
			throw new MovieNotFoundException(" language not matched");
		return movie;
		
	}

	@Override
	public List<Movie> getBymovienameandyear(String moviename, int year) {
		List<Movie> movie=movieRepository.findBymovienameandyear(moviename,year);
		if(movie.isEmpty())
		throw new MovieNotFoundException("Moviename not matched");
		return movie;
		
	}

	@Override
	public List<Movie> getBygenre(String genre) {
		List	<Movie>movie=movieRepository.findBygenre(genre);
		if(movie.isEmpty())
			throw new MovieNotFoundException(" genre not matched");
		return movie;
		
	}

}
