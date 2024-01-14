package com.najot.moviestore.service;

import com.najot.moviestore.dao.MovieImpl;
import com.najot.moviestore.model.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieServiceImpl implements MovieService{
    @Autowired
    MovieImpl movieimpl;
    @Override
    public List<Movie> getListMovie() {

        return  movieimpl.getListMovie() ;
    }

    @Override
    public Movie getMovieById(Integer id) {
        return movieimpl.getMovieById(id);
    }

    @Override
    public void updateMovie(Integer id, Movie movie) {
        movieimpl.updateMovie(id,movie);
    }

    @Override
    public void createMovie(Movie movie) {
        movieimpl.createMovie(movie);
    }

    @Override
    public void deleteMovie(Integer id) {
        movieimpl.deleteMovie(id);
    }
}
