package com.zakariabaouali.graphql.api.controllers;

import com.zakariabaouali.graphql.api.models.Author;
import com.zakariabaouali.graphql.api.models.Book;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

import java.util.ArrayList;

@Controller
public class BookController {

    @QueryMapping
    public ArrayList<Book> books(){
        return Book.getBooks();
    }

    @QueryMapping
    public Book bookById(@Argument Integer id){
        return Book.getBookById(id);
    }

    @SchemaMapping
    public Author author(Book book){
        return Author.getAuthorById(book.getAuthorId());
    }

    @MutationMapping
    public Book createBook(@Argument String name, @Argument Integer pageCount , @Argument Integer authorId){
        return Book.createBook(name , pageCount , authorId);
    }
}
