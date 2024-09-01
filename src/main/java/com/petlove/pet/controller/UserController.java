package com.petlove.pet.controller;

import com.petlove.pet.model.UserList;
import com.petlove.pet.model.UserModel;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {
    private static UserList userList = new UserList();


    public boolean verifyUser(UserModel user) {
        return false;
    }
    @PostMapping("/loginUser{Username}Pass{Password}")
    public ResponseEntity<UserModel> login(@PathVariable String Username, @PathVariable String Password) {
        UserModel currentUser = new UserModel();
        for(UserModel user : userList.usuarios){
            if(user.getUsername().equals(Username) && user.getPassword().equals(Password)) {
                currentUser = user;
                return new ResponseEntity<>(currentUser, HttpStatus.OK);
            }
        }
        return new ResponseEntity<>(currentUser, HttpStatus.UNAUTHORIZED);
    }
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

    @GetMapping("/users")
    public List<UserModel> listaUsuarios(){
        return userList.usuarios;
    }



}
