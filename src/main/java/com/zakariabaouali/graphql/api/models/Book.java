package com.zakariabaouali.graphql.api.models;


import lombok.Getter;

import java.util.ArrayList;

public class Book {
    @Getter
    private Integer id;

    @Getter
    private String name;

    @Getter
    private Integer pageCount;

    public Book(Integer id , String name , Integer pageCount){
        this.id = id;
        this.name = name;
        this.pageCount = pageCount;
    }

    public static ArrayList<Book> getBooks(){
        ArrayList<Book> books = new ArrayList<>(5);
        for (int i = 0 ; i < 5 ; i++)
            books.add(new Book(i , "book " + i , i * 2));
        return books;
    }
}
