package com.gnbr.library.book.persistence;

import com.gnbr.library.book.model.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<BookEntity, Long> {
    public BookEntity findByNameAndPages(String name, Integer pages);
}
