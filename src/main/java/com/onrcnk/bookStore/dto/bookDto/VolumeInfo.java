package com.onrcnk.bookStore.dto.bookDto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class VolumeInfo {
    private String title;
    private List<String> authors;
    private String publishedDate;
    private String description;
    private Integer pageCount;
    private List<String> categories;
    private String language;
    private ImageLinks imageLinks;

}