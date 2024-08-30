package com.petlove.pet.model;

import com.petlove.pet.exception.dateException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PetModel {
    private String name;
    private int age;
    private String gender;
    private int life;
    private String creationDate;
    private NeedModel needs;
    private boolean death;

    public PetModel() {
        needs = new NeedModel();

    }

    public PetModel(PetModel pet) {
    }


    @Override
    public String toString() {
        return "PetModel{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", life=" + life +
                ", creationDate='" + creationDate + '\'' +
                ", needs=" + needs +
                ", death=" + death +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public String getCreationDate() {
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        this.creationDate = formatter.format(date);
        return creationDate;
    }


    public NeedModel getNeeds() {
        return needs;
    }

    public void setNeeds(NeedModel needs) {
        this.needs = needs;
    }

    public boolean isDeath() {
        return death;
    }

    public void setDeath(boolean death) {
        this.death = death;
    }
}
