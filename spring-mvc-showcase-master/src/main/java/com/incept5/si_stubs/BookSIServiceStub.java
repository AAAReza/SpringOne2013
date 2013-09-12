package com.incept5.si_stubs;

import com.incept5.model.Book;
import org.springframework.stereotype.Component;

/**
 * Created by jt on 9/11/13.
 */
@Component
public class BookSIServiceStub {

    public Book getBook(String isbn){

        Book book = new Book();
        book.setTitle("Spring in Action");
        book.setISBN("33778822");

        return book;
    }
}
