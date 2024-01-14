package com.najot.moviestore.controller;

import com.najot.moviestore.model.Author;
import com.najot.moviestore.service.AuthorServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/author")
public class AuthorController {

    @Autowired
    AuthorServiceImpl authorService;
    @GetMapping
    public List<Author> getAuthors(){
        return authorService.getListAuthor();
    }

    @GetMapping("/{id}")
    public Author getAuthorById(@PathVariable("id") Integer id){
        return authorService.getAuthorById(id);
    }
    @PostMapping
    public void insertAuthor(@RequestBody Author author){
        authorService.createAuthor(author);
    }
    @DeleteMapping()
    public void deleteAuthor(@RequestBody Author author){

        authorService.deleteAuthor(author.getId());
    }
    @PutMapping("/{id}")
    public void updateAuthor(@PathVariable("id") Integer id,@RequestBody Author author){
        authorService.updateAuthor(id,author);
    }
}
