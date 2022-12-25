package com.onrcnk.bookStore.controllers;

import com.onrcnk.bookStore.client.BookClient;
import com.onrcnk.bookStore.dto.bookDto.BookDto;
import com.onrcnk.bookStore.services.BookService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Slf4j
@Controller
@CrossOrigin
public class BookController {

    private final BookService bookService;
    private final BookClient bookClient;
    private final String key= "AIzaSyBeNAOTotjs0GcDb_-gtzZVzBHoTZtzavY";


    public BookController(BookService bookService, BookClient bookClient) {
        this.bookService = bookService;
        this.bookClient = bookClient;
    }

    @RequestMapping("/books")
    public ResponseEntity<?> getBook(@RequestParam String query){
        BookDto book = bookClient.getBooks(query, key);

        book.getItems().stream()
                .forEach(item -> System.out.println(item.getId()));
        return new ResponseEntity<>(book, HttpStatus.OK);
    }
}
