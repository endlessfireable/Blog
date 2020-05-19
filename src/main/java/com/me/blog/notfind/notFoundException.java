package com.me.blog.notfind;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class notFoundException extends RuntimeException{
    public notFoundException() {
    }

    public notFoundException(String message) {
        super(message);
    }

    public notFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
