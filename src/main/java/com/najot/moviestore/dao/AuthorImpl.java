package com.najot.moviestore.dao;

import com.najot.moviestore.mapper.AuthorMapper;
import com.najot.moviestore.model.Author;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class AuthorImpl implements AuthorDAO{
    @Autowired
    JdbcTemplate jdbcTemplate;
    @Override
    public List<Author> getListAuthor() {
        return (List<Author>) jdbcTemplate.query("SELECT * FROM author", new AuthorMapper());
    }

    @Override
    public Author getAuthorById(Integer id) {
        return (Author) jdbcTemplate.queryForObject("SELECT * FROM author WHERE id=?",new Object[]{id}, new AuthorMapper());
    }

    @Override
    public void updateAuthor(Integer id, Author author) {
        jdbcTemplate.update("UPDATE author SET id=?,first_name=?,last_name=? WHERE id=?",author.getId(),author.getFirst_name(),author.getLast_name(),id);
    }

    @Override
    public void createAuthor(Author author) {
        jdbcTemplate.update("INSERT INTO author(first_name,last_name) VALUES (?,?)",author.getFirst_name(),author.getLast_name());
    }

    @Override
    public void deleteAuthor(Integer id) {
        jdbcTemplate.update("DELETE FROM author WHERE id=?",id);
    }
}
