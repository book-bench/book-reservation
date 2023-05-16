package com.book.bookreservation.controller;

import com.book.bookreservation.model.Book;
import com.book.bookserviceconnector.model.ResponseFromBookService;
import com.book.bookserviceconnector.service.BookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping("/")
@RestController
public class BookReservationController {

    BookService bookService;

    public BookReservationController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("books")
    public ResponseFromBookService showAvailableBooks() {
       return bookService.getAvailableBooks();
    }

    @GetMapping("books/{bookId}")
    public ResponseFromBookService reserveBook(@PathVariable int bookId) {
        return bookService.getBookById(bookId);
    }

    public Book returnBook(int bookId) {
        return null;
    }

}
