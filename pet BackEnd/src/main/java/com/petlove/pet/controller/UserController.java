package com.petlove.pet.controller;

import com.petlove.pet.model.PetModel;
import com.petlove.pet.model.UserList;
import com.petlove.pet.model.UserModel;
import org.apache.catalina.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController

@RequestMapping("/api/user")
public class UserController {
    private static UserList userList = new UserList();
    private static int getPosition(String username){
        int size = 0;
        for(UserModel users: userList.usuarios ){
            size++;
            if(users.getUsername().equals(username)){
                size--;
            }
        }
        return size;
    }

    @PostMapping("/addpet{username}")
    public ResponseEntity<HttpStatus> addPetUser(@RequestBody UserModel user) {
        int size = getPosition(user.getUsername());
        List<PetModel> pets = new ArrayList<>();
        PetModel pet = new PetModel();
        pets.add(new PetModel(pet));
        user.setPets(pets);
        userList.usuarios.set(0, user.getPets().getLast());

        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    public ResponseEntity<HttpStatus> updateUser(@RequestBody UserModel user) {
        int size = 0;
        for (UserModel updateUser : userList.usuarios) {
            size++;
            if (updateUser.getUsername().equals(user.getUsername())) {
                size--;
                System.out.println("Posição do array " + size);
                userList.usuarios.add(size, user);
                return new ResponseEntity<>(HttpStatus.OK);
            }
        }
        return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
    }


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

    @CrossOrigin(origins = "http://localhost:5173")
    @PostMapping("/adduser")
    public ResponseEntity<HttpStatus> addUser(@RequestBody UserModel user) {
        System.out.println(user);
        boolean state = userList.usuarios.add(user);
        if (state) {
            return new ResponseEntity<>(HttpStatus.CREATED);
        } else {
            return new ResponseEntity<>(HttpStatus.CONFLICT);
        }
    }

    @PostMapping("/deletepet")
    public ResponseEntity<HttpStatus> deletePet(@RequestBody String petName) {
        PetModel petModel = new PetModel(petName);
        for (UserModel user : userList.usuarios) {
            if (user.getPets().equals(petModel.getName())) {
                System.out.println("Encontrei");
                break;
            }
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @GetMapping("/users")
    public List<UserModel> listaUsuarios() {
        return userList.usuarios;
    }


}
