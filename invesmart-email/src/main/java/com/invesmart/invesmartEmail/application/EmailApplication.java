package com.invesmart.invesmartEmail.application;

import com.invesmart.invesmartCommons.exception.InvesmartException;

public interface EmailApplication {
    void sendEmailToClients(String fileName, String emailText, String subject) throws InvesmartException;
}
