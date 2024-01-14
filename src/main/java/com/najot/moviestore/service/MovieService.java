package com.najot.moviestore.service;

import com.najot.moviestore.model.Movie;

import java.util.List;

public interface MovieService {
    public List<Movie> getListMovie();
    public Movie getMovieById(Integer id);
    void updateMovie(Integer id, Movie author);
    void createMovie(Movie author);
    void deleteMovie(Integer id);
}
