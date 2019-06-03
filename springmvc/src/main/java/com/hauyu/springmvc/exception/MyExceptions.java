package com.hauyu.springmvc.exception;

public class MyExceptions extends Exception {
    private String message;

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public MyExceptions(String message) {

        this.message = message;
    }

    public MyExceptions(String message, String message1) {
        super(message);
        this.message = message1;
    }
}
