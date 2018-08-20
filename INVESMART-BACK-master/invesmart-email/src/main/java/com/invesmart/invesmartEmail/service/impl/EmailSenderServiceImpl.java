package com.invesmart.invesmartEmail.service.impl;

import com.invesmart.invesmartCommons.exception.InvesmartException;
import com.invesmart.invesmartEmail.service.EmailSenderService;
import com.invesmart.invesmartModel.model.client.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import javax.mail.internet.MimeMessage;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

@Service
public class EmailSenderServiceImpl implements EmailSenderService {

    @Autowired
    private JavaMailSender javaMailSender;

    @Async
    public void sendEmailToClients(String fileName, String emailText, String subject) throws InvesmartException {
        List<Client> clients = new ArrayList<>();
        File fileToAttach = null;
        for(Client client : clients) {
            sendMessage(
                client.getPerson().getEmail().getValue(),
                subject,
                emailText,
                fileName,
                fileToAttach);
        }
    }

    private void sendMessage(String to, String subject, String text, String fileName, File fileToAttach) {
        try {
            MimeMessage message = javaMailSender.createMimeMessage();
            MimeMessageHelper helper = new MimeMessageHelper(message, true);
            helper.setTo(to);
            helper.setSubject(subject);
            helper.setText(text);
            FileSystemResource file = new FileSystemResource(fileToAttach);
            helper.addAttachment(fileName, file);
            javaMailSender.send(message);
            //TODO: GUARDO EL MAIL COMO ENVIADO AL CLIENTE
        } catch (Exception e) {
            //TODO: GUARDO EL ERROR
        }
    }

}
