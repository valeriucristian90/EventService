package com.luka.sda.eventServiceSystem.exception;

public class EventNotFoundException extends RuntimeException {
    public EventNotFoundException(String message){
        super(message);
    }
}
