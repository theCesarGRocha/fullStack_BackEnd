package com.java.crud.fullstack.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

//@ResponseStatus(value = HttpStatus.NOT_FOUND) //Mensaje Default
public class ResourceNotFoundException extends RuntimeException {
    private String message;
    public ResourceNotFoundException(String message) {
        super(message);
        this.message = message;
    }
}
