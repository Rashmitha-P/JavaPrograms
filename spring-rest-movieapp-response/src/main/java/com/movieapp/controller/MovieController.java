package com.movieapp.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.movieapp.model.Movie;
import com.movieapp.service.IMovieService;

@RestController
@RequestMapping("/movie-api")
public class MovieController {
	IMovieService movieService;

	public MovieController(IMovieService movieService) {
		super();
		this.movieService = movieService;
	}

	@PostMapping("/movies")
	ResponseEntity<Void> addMovie(@RequestBody Movie movie) {
		movieService.addMovie(movie);
		HttpHeaders headers = new HttpHeaders();
		headers.add("info", "showing all movies");
		return ResponseEntity.status(HttpStatus.CREATED).headers(headers).build();
	}

	@PutMapping("/movies")
	ResponseEntity<Void> updateMovie(@RequestBody int MovieId, double price) {
		movieService.updateMovie(MovieId, price);
		return ResponseEntity.accepted().build();
	}

	@PatchMapping("/movies")
	ResponseEntity<Void> deleteMovie(int MovieId) {
		movieService.deleteMovie(MovieId);
		return ResponseEntity.accepted().build();
	}

	@GetMapping("/movies")
	ResponseEntity<List<Movie>> getAll() {
		List<Movie> movies = movieService.getAll();
		HttpHeaders headers = new HttpHeaders();
		headers.add("info", "showing all movies");
		headers.add("desc", "showing all movies from database");
		ResponseEntity<List<Movie>> responseEntity = new ResponseEntity<List<Movie>>(movies, headers, HttpStatus.OK);
		return responseEntity;
	}

	@GetMapping("/movies/id/{MovieId}")
	ResponseEntity<Optional<Movie>> getById(int MovieId) {
		Optional<Movie> movie = movieService.getById(MovieId);
		HttpHeaders httpheaders = new HttpHeaders();
		httpheaders.add("info", "returning one movie bu id");
		return ResponseEntity.status(HttpStatus.OK).headers(httpheaders).body(movie);
	}

	@GetMapping("/movies/language/{language}")
	ResponseEntity<List<Movie>> getBylanguage(@PathVariable("language") String language) {
		List<Movie> movies = movieService.getBylanguage(language);
		return ResponseEntity.ok(movies);
	}

	@GetMapping("/movies/moviename/{moviename}/year/{year}")
	ResponseEntity<List<Movie>> getBymovienameandyear(@PathVariable("moviename") String moviename,
			@PathVariable("year") int year) {
		List<Movie> movies = movieService.getBymovienameandyear(moviename, year);
		return ResponseEntity.ok(movies);
	}

	@GetMapping("/movies/genre/{genre}")
	ResponseEntity<List<Movie>> getBygenre(@PathVariable("genre") String genre) {
		List<Movie> movies = movieService.getBygenre(genre);
		return ResponseEntity.ok(movies);
	}

}
