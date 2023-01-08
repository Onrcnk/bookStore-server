package com.onrcnk.bookStore.services;

import com.onrcnk.bookStore.domain.Book;
import com.onrcnk.bookStore.dto.saveBookDto.SaveBookDto;

public interface BookService {

    void saveBook(SaveBookDto saveBookDto);
}
