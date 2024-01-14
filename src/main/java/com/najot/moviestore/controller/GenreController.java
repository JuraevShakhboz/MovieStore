package com.najot.moviestore.controller;

import com.najot.moviestore.model.Genre;
import com.najot.moviestore.service.GenreServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/genre")
public class GenreController {
    @Autowired
    GenreServiceImpl genreserverimpl;
    @GetMapping
    public List<Genre> getGenres(){
        return genreserverimpl.getListGenre();
    }

    @GetMapping("/{id}")
    public Genre getGenreById(@PathVariable("id") Integer id){
        return genreserverimpl.getGenreById(id);
    }
    @PostMapping()
    public void insertGenre(@RequestBody Genre genre){
        genreserverimpl.createGenre(genre);
    }
    @DeleteMapping()
    public void deleteGenre(@RequestBody Genre genre){

        genreserverimpl.deleteGenre(genre.getId());
    }
    @PutMapping("/{id}")
    public void updateGenre(@PathVariable("id") Integer id,@RequestBody Genre genre){
        genreserverimpl.updateGenre(id,genre);
    }
}
