package com.petlove.pet.controller;

<<<<<<< HEAD
import com.petlove.pet.model.NeedModel;
import com.petlove.pet.model.PetModel;
import com.petlove.pet.model.UserList;
import com.petlove.pet.model.UserModel;
import org.apache.catalina.User;
=======
import com.petlove.pet.model.UserList;
import com.petlove.pet.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
>>>>>>> main
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
<<<<<<< HEAD

@RequestMapping("/api/user")
public class UserController {
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

    @CrossOrigin(origins = "http://localhost:5173")
=======
@RequestMapping("/api/user")
public class UserController {
    @Autowired(required = false)
    private  UserList userList = new UserList();

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
>>>>>>> main
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

<<<<<<< HEAD
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

    public static void main(String[] args) {
        //Usuario 1
        try {
            NeedModel needModel = new NeedModel(0, 0);
            PetModel pet = new PetModel("Gato", "Francisco", 1, "Masculino", 100, needModel, false);
            List<PetModel> pets = new ArrayList<>();
            pets.add(pet);
            UserModel user = new UserModel("1", "Sync", "1212", 24, pets);
            userList.usuarios.add(user);
            System.out.println(user);
            System.out.println(pets);
            System.out.println(userList.usuarios);

        } catch (Exception e) {
            e.getMessage();
        }
        //Usuario 2
        try {
            NeedModel needModel = new NeedModel(0, 0);
            PetModel pet = new PetModel("Gato", "Francisco", 1, "Masculino", 100, needModel, false);
            List<PetModel> pets = new ArrayList<>();
            pets.add(new PetModel(pet));
            List<UserList> users = new ArrayList<>();

            UserModel user = new UserModel("1", "teste", "1212", 24, pets);
            users.add(new UserList(users));
            userList.usuarios.add(user);
        } catch (Exception e) {
            e.getMessage();
        }

        UserModel newUsers = new UserModel();
        for (UserModel users : userList.getUsuarios()) {
            if (users.getUsername().equals("Sync")) {
                newUsers = users;
                System.out.println("Encontrei");
            }
        }

        System.out.println(userList.usuarios.set(1, newUsers));
        System.out.println(userList.usuarios);


    }
=======
    @GetMapping("/users")
    public List<UserModel> listaUsuarios(){
        return userList.usuarios;
    }


>>>>>>> main

}
