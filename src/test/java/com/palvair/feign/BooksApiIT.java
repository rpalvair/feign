package com.palvair.feign;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class BooksApiIT {


    @Autowired
    private BooksApi booksApi;

    @Test
    public void should_return_all_books() {
        final List<String> allBooks = booksApi.findAllBooks();

        assertThat(allBooks).isNotEmpty()
                .containsExactly("Clean Code", "The Software Craftsman");
    }
}
