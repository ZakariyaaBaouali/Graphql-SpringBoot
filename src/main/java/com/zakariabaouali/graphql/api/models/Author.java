package com.zakariabaouali.graphql.api.models;

import lombok.Getter;
import java.util.ArrayList;

public class Author {
    @Getter
    private Integer id;

    @Getter
    private String name;

    public Author(Integer id, String name) {
        this.id = id;
        this.name = name;
    }


    public static ArrayList<Author> getAuthors(){
        ArrayList<Author> authors = new ArrayList<>(3);
        for(int i = 1 ; i <= 3 ; i++)
            authors.add(new Author(i , "author " + i));
        return authors;
    }

    public static Author getAuthorById(int id){
        var authors = getAuthors();
        for(Author author : authors){
            if(author.getId() == id)
                return author;
        }
        return null;
    }
}
