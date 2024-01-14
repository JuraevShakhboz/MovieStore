package com.najot.moviestore.mapper;

import com.najot.moviestore.model.Movie;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class MovieMapper implements RowMapper<Movie> {
    @Override
    public Movie mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new Movie(
                rs.getInt("id"),
                rs.getString("name"),
                rs.getInt("genre_id"),
                rs.getInt("year"),
                rs.getInt("author_id"));
    }
}
