package com.petlove.pet.controller;

import com.petlove.pet.model.MensagemRequest;
import com.petlove.pet.model.UserList;
import com.petlove.pet.services.ServiceEmail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/admin")
public class ServiceController extends UserController {
    @Autowired
    private ServiceEmail serviceEmail;

    @PostMapping("/send")
    public ResponseEntity<HttpStatus> sendMail(@RequestBody MensagemRequest mensagem) {
        serviceEmail.sendEmail(mensagem);
        return new ResponseEntity<>(HttpStatus.OK);
    }



}

