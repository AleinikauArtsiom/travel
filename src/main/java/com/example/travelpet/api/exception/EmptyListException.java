package com.example.travelpet.api.exception;

public class EmptyListException extends RuntimeException{
    public EmptyListException(String message){
        super(message);
    }
}
