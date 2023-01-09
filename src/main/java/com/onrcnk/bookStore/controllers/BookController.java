package com.onrcnk.bookStore.controllers;

import com.onrcnk.bookStore.client.BookClient;
import com.onrcnk.bookStore.dto.bookDto.GetBookDto;
import com.onrcnk.bookStore.dto.saveBookDto.SaveBookDto;
import com.onrcnk.bookStore.services.BookService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Slf4j
@RestController
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
        GetBookDto book = bookClient.getBooks(query, key);
        return new ResponseEntity<>(book, HttpStatus.OK);
    }

    @PostMapping("/book")
    public ResponseEntity<?> addBook(@RequestBody @Valid SaveBookDto saveBookDto){
        bookService.saveBook(saveBookDto);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
