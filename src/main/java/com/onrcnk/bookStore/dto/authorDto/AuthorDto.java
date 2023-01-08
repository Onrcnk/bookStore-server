package com.onrcnk.bookStore.dto.authorDto;

import com.onrcnk.bookStore.domain.Author;
import com.onrcnk.bookStore.domain.Category;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AuthorDto {

    private String authorName;
}
