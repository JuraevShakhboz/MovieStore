package com.najot.moviestore.dao;

import com.najot.moviestore.model.Author;

import java.util.List;

public interface AuthorDAO {
    public List<Author> getListAuthor();
    public Author getAuthorById(Integer id);
    void updateAuthor(Integer id, Author author);
    void createAuthor(Author author);
    void deleteAuthor(Integer id);
}
