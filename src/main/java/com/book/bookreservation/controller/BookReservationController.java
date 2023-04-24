package com.book.bookreservation.controller;

import com.book.bookreservation.model.Book;
import com.book.bookreservation.model.Response;
import com.book.bookserviceconnector.service.BookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/")
@RestController
public class BookReservationController {

    BookService bookService;

    public BookReservationController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("books")
    public Response showAvailableBooks() {
        List<Book> transformedBooks = bookService.getAvailableBooks().stream().
                map((com.book.bookserviceconnector.model.Book arrivedBook) -> new Book(arrivedBook.id(), arrivedBook.name())
                ).toList();

        return Response.createResponseWithBooks(transformedBooks);
    }

    public Book reserveBook(int bookId) {
        return null;
    }

    public Book returnBook(int bookId) {
        return null;
    }

}
