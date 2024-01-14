package com.najot.moviestore.dao;

import com.najot.moviestore.model.Genre;

import java.util.List;

public interface GenreDAO {
    public List<Genre> getListGenre();
    public Genre getGenreById(Integer id);
    void updateGenre(Integer id, Genre author);
    void createGenre(Genre author);
    void deleteGenre(Integer id);
}
