package com.invesmart.userService.exception;

import com.invesmart.invesmartCommons.exception.InvesmartException;

public class UserServiceException extends InvesmartException {

    public UserServiceException(String messageDescription, String message, Throwable cause) {
        super(messageDescription, message, cause);
    }

}
