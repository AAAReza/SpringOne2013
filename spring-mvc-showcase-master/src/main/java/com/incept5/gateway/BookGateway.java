package com.incept5.gateway;

import com.incept5.model.Book;
import org.springframework.integration.annotation.Gateway;

/**
 * Created by jt on 9/11/13.
 */
public interface BookGateway {

    @Gateway (requestChannel = "bookChannel")
    Book findBookByISBN(String ISBN);
}
