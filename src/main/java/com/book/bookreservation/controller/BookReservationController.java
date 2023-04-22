package com.book.bookreservation.controller;

import com.book.bookreservation.model.Book;
import com.book.bookreservation.model.Response;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/")
@RestController
public class BookReservationController {

    @GetMapping("books")
    public Response showAvailableBooks() {
        List<Book> books = List.of(new Book(2, "Harry"),
                                    new Book(4, "Jason"));
        return new Response(books, null);
    }

    public Book reserveBook(int bookId) {
        return null;
    }

    public Book returnBook(int bookId) {
        return null;
    }

}
