package com.gnbr.library.book.controllers;

import com.gnbr.library.book.dto.BookDTO;
import com.gnbr.library.book.service.BookService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/book")
public class BookRestController {

    private final BookService bookService;

    public BookRestController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping
    public String getBook(@RequestParam String bookName, @RequestParam Integer pageNumber) {

        /*
        log.info(bookName);

        log.info(String.valueOf(pageNumber));

        String response = bookService.createBook(bookName, pageNumber);

        return response;
         */
        return "OK GET";
    }

    @PostMapping
    public String post(@RequestBody BookDTO.PostInput input) {

        log.info(input.getBookName());
        log.info(String.valueOf(input.getPageNumber()));

        String response = bookService.createBook(input.getBookName(), input.getPageNumber());

        return response;
    }

}
