package com.petlove.pet.services;
import com.petlove.pet.model.MensagemRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;


@Service
public class ServiceEmail {
    @Autowired
    private JavaMailSender mailSender;

    public void sendEmail(MensagemRequest mail) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(mail.getEmail());
        message.setSubject(mail.getTitle());
        message.setText(mail.getText());
        mailSender.send(message);
    }


}
