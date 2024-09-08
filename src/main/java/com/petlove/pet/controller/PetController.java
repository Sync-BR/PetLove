package com.petlove.pet.controller;

import com.petlove.pet.model.PetModel;
import com.petlove.pet.model.UserModel;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

@RequestMapping("/api")
@RestController
public class PetController {
    private static UserModel userModel = new UserModel();

    public PetController() {
        userModel = new UserModel();
    }

    @PostMapping("/registerPet")
    public ResponseEntity<HttpStatus> addPet(@RequestBody PetModel pet) {
        if(userModel.getPets().size() <= 2){
            List<PetModel> pets = new ArrayList<PetModel>();
            boolean state = pets.add(new PetModel(pet));
            if(state){
                userModel.setPets(pets);
                return new ResponseEntity<>(HttpStatus.CREATED);
            } else {
                return new ResponseEntity<>(HttpStatus.CONFLICT);
            }

        } else {
            return new ResponseEntity<>(HttpStatus.CONFLICT);
        }
    }
}
