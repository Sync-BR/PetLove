package com.petlove.pet.controller;

import com.petlove.pet.model.UserList;
import com.petlove.pet.model.UserModel;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {
    private static UserList userList = new UserList();

    public boolean verifyUser(UserModel user) {
        return false;
    }
    @PostMapping("/loginUser{username}Pass{password}")
    public ResponseEntity<HttpStatus> login(@PathVariable String username, String password) {
        int sizeList = 0;
        for(UserModel usuarios: userList.usuarios){
            sizeList++;
            if(usuarios.getUsername().equals(username) && usuarios.getPassword().equals(password)){
                sizeList--;
                System.out.println("Posição do usuario: " +sizeList);
                return new ResponseEntity<>(HttpStatus.OK);

            } else {
                return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
            }

        }
        return null;
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
