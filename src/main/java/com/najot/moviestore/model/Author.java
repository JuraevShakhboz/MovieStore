package com.najot.moviestore.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class Author {
    private Integer id;
    private String first_name;
    private String last_name;
}