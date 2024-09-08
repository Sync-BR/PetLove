package com.petlove.pet.controller;

import com.petlove.pet.model.NeedModel;
import com.petlove.pet.model.PetModel;
import com.petlove.pet.model.UserList;
import com.petlove.pet.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController

@RequestMapping("/api/user")
public class UserController {
    @Autowired
    private static UserList userList = new UserList();

    private static int getPosition(String username) {
        int size = 0;
        for (UserModel users : userList.usuarios) {
            size++;
            if (users.getUsername().equals(username)) {
                size--;
            }
        }
        return size;
    }

    @PostMapping("/addpet/{username}")
    public ResponseEntity<HttpStatus> addPetUser(@PathVariable String username, @RequestBody PetModel pet) {
        UserModel user = null;
        for (UserModel users : userList.getUsuarios()) {
            if (users.getUsername().equals(username)) {
                user = users;
                break;
            }
        }
        if (user == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        // Adiciona o novo pet à lista de pets do usuário
        List<PetModel> pets = user.getPets();
        if (pets == null) {
            pets = new ArrayList<>();
        }
        pets.add(pet);
        user.setPets(pets);

        // Atualiza o usuário na lista
        boolean updated = userList.updateUser(user);
        if (!updated) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }

        return new ResponseEntity<>(HttpStatus.CREATED);
    }


//    @PostMapping("/addpet{username}")
//    public ResponseEntity<HttpStatus> addPetUser(@PathVariable String username, @RequestBody PetModel pet) {
//        UserModel user = null;
//        List<PetModel> pets = new ArrayList<>();
//        pets.add(pet);
//        for(UserModel users : userList.getUsuarios()) {
//            if(users.getUsername().equals(username)) {
//                user = users;
//                break;
//            }
//        }
//        user.setPets(pets);
//      //  userList.usuarios.set(0, user);
//        userList.usuarios.add(pet);
//     //   userList.usuarios.add(user.);
//
//        return new ResponseEntity<>(HttpStatus.CREATED);
//    }


    @CrossOrigin(origins = "http://localhost:5173")
    @PostMapping("/loginUser{Username}Pass{Password}")
    public ResponseEntity<UserModel> login(@PathVariable String Username, @PathVariable String Password) {
        UserModel currentUser = new UserModel();
        for (UserModel user : userList.usuarios) {
            if (user.getUsername().equals(Username) && user.getPassword().equals(Password)) {
                currentUser = user;
                System.out.println("Autenticado");
                return new ResponseEntity<>(currentUser, HttpStatus.OK);
            }
        }
        return new ResponseEntity<>(currentUser, HttpStatus.UNAUTHORIZED);
    }


}
