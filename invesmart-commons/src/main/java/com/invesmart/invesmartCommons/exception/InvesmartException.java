package com.invesmart.invesmartCommons.exception;

public class InvesmartException extends RuntimeException {

    public String messageDescription;

    public InvesmartException (String messageDescription, String message, Throwable cause) {
        super(message, cause);
        this.messageDescription = messageDescription;
    }

}
