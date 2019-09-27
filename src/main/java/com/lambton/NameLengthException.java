package com.lambton;

public class NameLengthException extends Exception{
    private String message;

    public NameLengthException(String message) {

        this.message = message;
    }

}
