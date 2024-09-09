package com.petlove.pet.services;
import com.petlove.pet.model.MensagemRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import java.util.List;


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


    public void sendAllMail(List<String> list) {

        for(String mail : list) {
            SimpleMailMessage message = new SimpleMailMessage();
            message.setTo(mail);
            message.setSubject("Evento Especial no Jogo dos Pets: Cuide do Seu Animalzinho!");
            message.setText("Temos uma novidade incrível para você! Um evento especial chegou ao nosso joguinho de pets, trazendo novas aventuras e recompensas. Cuide do seu animalzinho com carinho, complete missões especiais e desbloqueie itens exclusivos para tornar seu pet ainda mais feliz!\n" +
                    "\n" +
                    "Não perca essa oportunidade única de interagir com outros jogadores e mostrar todo o seu amor pelos pets.\n" +
                    "\n" +
                    "Esperamos ver você e seu pet no jogo!\n" +
                    "\n" +
                    "Abraços, Equipe do Jogo dos Pets");
            mailSender.send(message);
        }



    }


}
