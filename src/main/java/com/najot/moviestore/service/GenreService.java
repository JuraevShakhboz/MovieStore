package com.najot.moviestore.service;

import com.najot.moviestore.model.Genre;
import org.springframework.stereotype.Service;

import java.util.List;
public interface GenreService {
    public List<Genre> getListGenre();
    public Genre getGenreById(Integer id);
    void updateGenre(Integer id, Genre author);
    void createGenre(Genre author);
    void deleteGenre(Integer id);
}
