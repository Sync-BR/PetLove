package com.petlove.pet.model;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.ArrayList;
import java.util.List;



@JsonInclude(JsonInclude.Include.NON_NULL)

public class UserModel {
    private String username;
    private String password;
<<<<<<< HEAD
    private String email;
=======
>>>>>>> a554fefe117173e534be71909d416efe623ab70b
    private int age;
    private List<PetModel> pets = new ArrayList<>();

    public UserModel() {
        pets = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "UserModel{" +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
<<<<<<< HEAD
                ", email='" + email + '\'' +
=======
>>>>>>> a554fefe117173e534be71909d416efe623ab70b
                ", age=" + age +
                ", pets=" + pets +
                '}';
    }



    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<PetModel> getPets() {
        return pets;
    }

    public void setPets(List<PetModel> pets) {
        this.pets = pets;
    }
<<<<<<< HEAD
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
=======
>>>>>>> a554fefe117173e534be71909d416efe623ab70b
}
