package com.onrcnk.bookStore.services.Imp;

import com.onrcnk.bookStore.domain.Author;
import com.onrcnk.bookStore.domain.Book;
import com.onrcnk.bookStore.domain.Category;
import com.onrcnk.bookStore.dto.saveBookDto.SaveBookDto;
import com.onrcnk.bookStore.repository.AuthorRepository;
import com.onrcnk.bookStore.repository.BookRepository;
import com.onrcnk.bookStore.repository.CategoryRepository;
import com.onrcnk.bookStore.services.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class BookServiceImp implements BookService {

    private final BookRepository bookRepository;
    private final CategoryRepository categoryRepository;
    private final AuthorRepository authorRepository;

    @Override
    public void saveBook(SaveBookDto saveBookDto) {

        var categories= saveBookDto.getCategories();

        var authors = saveBookDto.getAuthors();

        var categoryEntities=categories.stream().map(Category::new).collect(Collectors.toList());

        var authorEntities=authors.stream().map(Author::new).collect(Collectors.toList());

        categoryRepository.saveAll(categoryEntities);

        authorRepository.saveAll(authorEntities);

        bookRepository.save(Book.builder()
                        .title(saveBookDto.getTitle())
                        .categories(categoryEntities)
                        .authors(authorEntities)
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
