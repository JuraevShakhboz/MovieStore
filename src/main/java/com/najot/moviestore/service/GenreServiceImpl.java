package com.najot.moviestore.service;

import com.najot.moviestore.dao.GenreImpl;
import com.najot.moviestore.model.Genre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GenreServiceImpl implements GenreService{
    @Autowired
    GenreImpl genreimpl;
    @Override
    public List<Genre> getListGenre() {

        return  genreimpl.getListGenre() ;
    }

    @Override
    public Genre getGenreById(Integer id) {
        return genreimpl.getGenreById(id);
    }

    @Override
    public void updateGenre(Integer id, Genre genre) {
        genreimpl.updateGenre(id,genre);
    }

    @Override
    public void createGenre(Genre genre) {
        genreimpl.createGenre(genre);
    }

    @Override
    public void deleteGenre(Integer id) {
        genreimpl.deleteGenre(id);
    }
}
