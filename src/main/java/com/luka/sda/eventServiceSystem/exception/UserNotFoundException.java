package com.luka.sda.eventServiceSystem.exception;

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException (String message){
        super(message);
    }
}
