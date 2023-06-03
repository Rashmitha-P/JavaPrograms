package com.movieapp.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.movieapp.model.Movie;

public class MovieMapper implements RowMapper<Movie> {

	@Override
	public Movie mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		return null;
	}

}
