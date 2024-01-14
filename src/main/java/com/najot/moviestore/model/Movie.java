package com.najot.moviestore.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class Movie {
    private Integer id;
    private String name;
    private Integer genre_id;
    private Integer year;
    private Integer author_id;
}
