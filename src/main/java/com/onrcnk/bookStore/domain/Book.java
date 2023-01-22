package com.onrcnk.bookStore.domain;

import com.onrcnk.bookStore.dto.bookDto.ImageLinks;
import com.onrcnk.bookStore.dto.bookDto.ListPrice;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
public class Book {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(updatable = false, nullable = false)
    private String bookId;

    private String title;

    @ManyToMany
    @JoinTable(
            name = "Book_Category",
            joinColumns = { @JoinColumn(name = "book_id") },
            inverseJoinColumns = { @JoinColumn(name = "category_id") }
    )
    private List<Category> categories;

    @ManyToMany
    @JoinTable(
            name = "Book_Author",
            joinColumns = { @JoinColumn(name = "book_id") },
            inverseJoinColumns = { @JoinColumn(name = "author_id") }
    )
    private List<Author> authors;

    private String publishedDate;

    private String description;

    private Integer pageCount;

    private String language;

    private String smallThumbnail;

    private BigDecimal price;

    private String currencyCode;

    private Integer stockAmount;
}
