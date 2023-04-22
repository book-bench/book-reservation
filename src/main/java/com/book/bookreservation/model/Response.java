package com.book.bookreservation.model;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

public record Response(@JsonInclude(JsonInclude.Include.NON_EMPTY) List<Book> books,
                       @JsonInclude(JsonInclude.Include.NON_EMPTY) List<String> errors) {

    public static Response createResponseWithBooks(List<Book> books) {
        return new Response(books, null);
    }
    public static Response createResponseWithErrors(List<String> errors) {
        return new Response(null, errors);
    }
}
