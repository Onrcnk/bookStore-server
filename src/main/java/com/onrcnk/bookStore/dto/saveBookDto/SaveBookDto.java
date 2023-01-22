package com.onrcnk.bookStore.dto.saveBookDto;

import com.onrcnk.bookStore.domain.Author;
import com.onrcnk.bookStore.domain.Category;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.List;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SaveBookDto {

    @NotBlank
    private String title;

    @NotBlank
    private List<String> categories;

    @NotBlank
    private List<String> authors;

    @NotBlank
    private String publishedDate;

    @NotBlank
    private String description;

    @NotNull
    private Integer pageCount;

    @NotBlank
    private String language;

    @NotBlank
    private String smallThumbnail;

    @NotNull
    private BigDecimal price;

    @NotBlank
    private String currencyCode;

    @NotNull
    private Integer stockAmount;
}
