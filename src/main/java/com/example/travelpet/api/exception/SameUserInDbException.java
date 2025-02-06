package com.example.travelpet.api.exception;

public class SameUserInDbException extends RuntimeException{
    public SameUserInDbException(String message){
        super(message);
    }
}
