package com.palvair.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "books", url = "http://localhost:8080")
public interface BooksApi {
    @GetMapping("/books")
    List<String> findAllBooks();
}
