package com.movieapp.model;

import java.time.LocalDateTime;

public class Movie {
	private int movieId;
	private String movieName;
	private String language;
	private String genre;
	private int ratings;
	private LocalDateTime year;

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

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public int getRatings() {
		return ratings;
	}

	public void setRatings(int ratings) {
		this.ratings = ratings;
	}

	public LocalDateTime getYear() {
		return year;
	}

	public void setYear(LocalDateTime year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "Movie [movieId=" + movieId + ", movieName=" + movieName + ", language=" + language + ", genre=" + genre
				+ ", ratings=" + ratings + ", year=" + year + "]";
	}

}
