package com.movieapp.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.movieapp.exceptions.MovieNotFoundException;
import com.movieapp.model.Movie;

@Repository
public class MovieRepositoryImpl implements IMovieRepository {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public void addMovie(Movie movie) {
		String sql = "insert into movie (movieId,movieName,language,genre,ratings,year)values(MOVIESEQ.nextval,?,?,?,?,?)";
		Object[] MovieArray = { movie.getMovieName(), movie.getLanguage(), movie.getGenre(), movie.getRatings(),
				movie.getYear() };
		jdbcTemplate.update(sql, MovieArray);

	}

	@Override
	public void updateMovie(int movieId, double price) {
		String sql = "Update movie set price=? where movieId=?";
		jdbcTemplate.update(sql, price, movieId);

	}

	@Override
	public void deleteMovie(int movieId) {
		String sql = "delete from book where movieId=?";
		jdbcTemplate.update(sql, movieId);

	}

	@Override
	public List<Movie> findAll() {
		String sql = "select * from movie";

		return jdbcTemplate.query(sql, new MovieMapper());

	}

	@Override
	public Optional<Movie> findById(int movieId) {

		String sql = "select * from book where movieId=?";
		Movie nmovie = null;
		try {
			nmovie = jdbcTemplate.queryForObject(sql, (rs, rownum) -> {
				Movie movie = new Movie();
				movie.setMovieName(rs.getString("movieName"));
				movie.setMovieId(rs.getInt("movieId"));
				movie.setLanguage(rs.getString("language"));
				movie.setGenre(rs.getString("genre"));
				movie.setPrice(rs.getDouble("price"));
				movie.setRatings(rs.getInt("ratings"));
				movie.setYear(rs.getInt("year"));
				return movie;
			}, movieId);

		} catch (DataAccessException e) {
			throw new MovieNotFoundException("invalid  id");
		}

		Optional<Movie> optMovie = Optional.of(nmovie);
		return optMovie;
	}

	@Override
	public List<Movie> findBylanguage(String language) {
		String sql = "select * from book where language=?";
		return jdbcTemplate.query(sql, new MovieMapper(), language);

	}

	@Override
	public List<Movie> findBymovienameandyear(String moviename, int year) {

		String sql = "select * from book where moviename=? and year=?";
		return jdbcTemplate.query(sql, new MovieMapper(), moviename, year);
	}

	@Override
	public List<Movie> findBygenre(String genre) {

		String sql = "select * from book where genre=?";
		return jdbcTemplate.query(sql, new MovieMapper(), genre);
	}

}
