package com.learn.spring.demo.exceptions;

import java.time.LocalDateTime;

public class ApiError {
    private String message;
    private LocalDateTime failTime;

    public ApiError(String message) {
        this.message = message;
        this.failTime = LocalDateTime.now();
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public LocalDateTime getFailTime() {
        return failTime;
    }

    public void setFailTime(LocalDateTime failTime) {
        this.failTime = failTime;
    }
}
