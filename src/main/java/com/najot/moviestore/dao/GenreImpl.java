package com.najot.moviestore.dao;

import com.najot.moviestore.mapper.GenreMapper;
import com.najot.moviestore.model.Genre;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class GenreImpl implements GenreDAO{
    JdbcTemplate jdbcTemplate;
    @Override
    public List<Genre> getListGenre() {
        return (List<Genre>) jdbcTemplate.query("SELECT * FROM genre", new GenreMapper());
    }

    @Override
    public Genre getGenreById(Integer id) {
        return (Genre) jdbcTemplate.queryForObject("SELECT * FROM genre WHERE id=?", new Object[]{id},new GenreMapper());
    }

    @Override
    public void updateGenre(Integer id, Genre genre) {
        jdbcTemplate.update("UPDATE genre SET name=? WHERE id=?", genre.getName(), id);
    }

    @Override
    public void createGenre(Genre genre) {
        jdbcTemplate.update("INSERT INTO genre(name) VALUES (?)", genre.getName());
    }

    @Override
    public void deleteGenre(Integer id) {
        jdbcTemplate.update("DELETE FROM genre WHERE id=?",id);
    }
}
