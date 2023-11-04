package com.bangbangas.exception;

public class MyException extends Exception{
    static final long serialVersionUID = -7034897190745L;

    public MyException() {
    }

    public MyException(String message) {
        super(message);
    }
}
