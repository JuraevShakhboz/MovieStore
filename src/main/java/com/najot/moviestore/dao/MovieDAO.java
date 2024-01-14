package com.najot.moviestore.dao;

import com.najot.moviestore.model.Movie;

import java.util.List;

public interface MovieDAO {
    public List<Movie> getListMovie();
    public Movie getMovieById(Integer id);
    void updateMovie(Integer id, Movie author);
    void createMovie(Movie author);
    void deleteMovie(Integer id);
}
