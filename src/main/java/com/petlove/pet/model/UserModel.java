package com.petlove.pet.model;

import org.apache.catalina.User;

import java.util.ArrayList;
import java.util.List;

public class UserModel {
    private String username;
    private String password;
    private int age;
    private List<PetModel> pets = new ArrayList<>();

    public UserModel() {
        pets = new ArrayList<>();
    }

    public UserModel(UserModel user) {
    }

    public UserModel(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public String toString() {
        return "UserModel{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
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
}
