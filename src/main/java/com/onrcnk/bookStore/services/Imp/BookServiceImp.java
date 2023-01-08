package com.onrcnk.bookStore.services.Imp;

import com.onrcnk.bookStore.domain.Book;
import com.onrcnk.bookStore.dto.saveBookDto.SaveBookDto;
import com.onrcnk.bookStore.repository.BookRepository;
import com.onrcnk.bookStore.services.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
@RequiredArgsConstructor
public class BookServiceImp implements BookService {

    private final BookRepository bookRepository;

    @Override
    public void saveBook(SaveBookDto saveBookDto) {

        bookRepository.save(Book.builder()
                        .title(saveBookDto.getTitle())
                        .categories(saveBookDto.getCategories())
                        .authors(saveBookDto.getAuthors())
                        .publishedDate(saveBookDto.getPublishedDate())
                        .description(saveBookDto.getDescription())
                        .pageCount(saveBookDto.getPageCount())
                        .language(saveBookDto.getLanguage())
                        .smallThumbnail(saveBookDto.getSmallThumbnail())
                        .price(saveBookDto.getPrice())
                        .currencyCode(saveBookDto.getCurrencyCode())
                        .stockAmount(saveBookDto.getStockAmount())
                .build());

    }
}
