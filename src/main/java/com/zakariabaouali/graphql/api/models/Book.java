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

    @Getter
    private Integer authorId;


    public Book(Integer id , String name , Integer pageCount , Integer authorId){
        this.id = id;
        this.name = name;
        this.pageCount = pageCount;
        this.authorId = authorId;
    }

    public static ArrayList<Book> getBooks(){
        ArrayList<Book> books = new ArrayList<>(5);
        for (int i = 1 ; i < 3 ; i++)
            books.add(new Book(i , "book " + i , i * 2 , 1));

        for (int i = 3 ; i <= 5 ; i++)
            books.add(new Book(i , "book " + i , i * 2 , 3));
        return books;
    }

    public static Book getBookById(int id){
        var books = getBooks();
        for(Book book : books){
            if(book.getId() == id)
                return book;
        }
        return null;
    }

    public static Book createBook(String name, int pageCount , int authorId){
        var books = getBooks();
        int size = books.size();
        books.add(new Book(size , name, pageCount , authorId));
        return  books.get(size);
    }
}
