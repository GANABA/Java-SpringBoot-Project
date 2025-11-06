package com.gnbr.library.book.service;

import com.gnbr.library.book.persistence.BookRepository;
import com.gnbr.library.book.model.BookEntity;
import io.micrometer.common.util.StringUtils;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public String createBook(String bookName, Integer pageNumber){

        if (bookName == null || StringUtils.isBlank(bookName)){
            return "Le bookName ne peut pas être null ou vide";
        }

        if  (pageNumber == null || pageNumber <= 0){
            return "Le nombre de page ne peut pas etre <= 0";
        }

        BookEntity existingBook = bookRepository.findByNameAndPages(bookName, pageNumber);

        if (existingBook == null) {
            BookEntity book = BookEntity.builder()
                    .name(bookName)
                    .pages(pageNumber)
                    .build();

            bookRepository.save(book);
            return "Book Saved";
        }else {
            return "Le livre existe deja";
        }
    }
}
