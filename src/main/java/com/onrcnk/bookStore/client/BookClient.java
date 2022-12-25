package com.onrcnk.bookStore.client;

import com.onrcnk.bookStore.dto.bookDto.BookDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "bookClient", url = "https://www.googleapis.com/books/v1/volumes")
public interface BookClient {

    @RequestMapping(method = RequestMethod.GET, value = "/")
    BookDto getBooks(@RequestParam String q, @RequestParam String key);

}
