package com.polarbookshop.catalogservice.demo;

import com.polarbookshop.catalogservice.domain.Book;
import com.polarbookshop.catalogservice.domain.BookRepository;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.Profile;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.util.List;

@Profile("testdata")
@Component
public class BookDataLoader {

    private final BookRepository bookRepository;

    public BookDataLoader(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }


    @EventListener(ApplicationReadyEvent.class)
    public void loadBookTestData(){
        bookRepository.deleteAll();
        var book1 = Book.of("1234567891", "Monday", "Tushar", null,11.00);
        var book2 = Book.of("1234567892", "Tuesday", "Prajakta", null,32.00);
        bookRepository.saveAll(List.of(book1, book2));
    }


}
