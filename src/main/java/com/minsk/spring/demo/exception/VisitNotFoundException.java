package com.minsk.spring.demo.exception;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class VisitNotFoundException extends RuntimeException {

    public VisitNotFoundException(String visitId) {
        super("couldn't find visit with id: " + visitId);
    }

}
