package com.invesmart.invesmartEmail.service;

import com.invesmart.invesmartCommons.exception.InvesmartException;

public interface EmailSenderService {

    void sendEmailToClients(String fileName, String emailText, String subject) throws InvesmartException;

}
