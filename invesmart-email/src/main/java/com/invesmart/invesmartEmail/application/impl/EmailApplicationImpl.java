package com.invesmart.invesmartEmail.application.impl;

import com.invesmart.invesmartCommons.exception.InvesmartException;
import com.invesmart.invesmartEmail.application.EmailApplication;
import com.invesmart.invesmartEmail.service.EmailSenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmailApplicationImpl implements EmailApplication {

    @Autowired
    private EmailSenderService emailSenderService;

    @Override
    public void sendEmailToClients(String fileName, String emailText, String subject) throws InvesmartException {
        emailSenderService.sendEmailToClients(fileName, emailText, subject);
    }

}
