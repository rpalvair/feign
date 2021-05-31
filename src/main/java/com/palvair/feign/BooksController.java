package com.palvair.feign;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class BooksController {


    @GetMapping("/books")
    public List<String> findAllBooks() {
        return Arrays.asList(
                "Clean Code",
                "The Software Craftsman"
        );
    }
}
