package com.incept5.services;

import com.incept5.model.Book;

/**
 * Created by jt on 9/11/13.
 */
public interface BookService {

    Book findBookByISBN(String ISBN);

    void saveBook(Book book);
}
