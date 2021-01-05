package com.learn.spring.demo.exceptions;

public class InvalidFormatException extends RuntimeException {
    public InvalidFormatException(String message) {
        super(message);
    }
}
