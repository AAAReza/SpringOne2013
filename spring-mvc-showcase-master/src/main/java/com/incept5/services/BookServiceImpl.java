package com.incept5.services;

import com.incept5.gateway.BookGateway;
import com.incept5.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by jt on 9/11/13.
 */
@Service
public class BookServiceImpl implements BookService{

    private BookGateway bookGateway;

    @Override
    public Book findBookByISBN(String ISBN) {
        return bookGateway.findBookByISBN(ISBN);
    }

    @Override
    public void saveBook(Book book) {

    }

    @Autowired
    public void setBookGateway(BookGateway bookGateway) {
        this.bookGateway = bookGateway;
    }
}
