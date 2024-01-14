package com.najot.moviestore.dao;

import com.najot.moviestore.mapper.MovieMapper;
import com.najot.moviestore.model.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MovieImpl implements MovieDAO{
    @Autowired
    JdbcTemplate jdbcTemplate;
    @Override
    public List<Movie> getListMovie() {
        return (List<Movie>) jdbcTemplate.query("SELECT * FROM movie", new MovieMapper());
    }

    @Override
    public Movie getMovieById(Integer id) {
        return (Movie) jdbcTemplate.queryForObject("SELECT * FROM movie WHERE id=?", new Object[]{id}, new MovieMapper());
    }

    @Override
    public void updateMovie(Integer id, Movie movie) {
        jdbcTemplate.update("UPDATE movie SET name=?,year=? WHERE ID=?",movie.getName(),movie.getYear(),id);
    }

    @Override
    public void createMovie(Movie movie) {
        jdbcTemplate.update("INSERT INTO movie(name,genre_id,year,author_id) VALUES (?,?,?,?)",movie.getName(),movie.getGenre_id(),movie.getYear(),movie.getAuthor_id());
    }

    @Override
    public void deleteMovie(Integer id) {
        jdbcTemplate.update("DELETE FROM movie WHERE id=?",id);
    }
}
