package com.petlove.pet.model;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.text.SimpleDateFormat;
import java.util.Date;
@JsonInclude(JsonInclude.Include.NON_NULL)

public class PetModel  {
    private String animal;
    private String name;
    private int age;
    private String gender;
    private int life;
    private String creationDate;
    private NeedModel needs;
    private boolean death;

    public PetModel() {
        needs = new NeedModel();
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        this.creationDate = formatter.format(date);
    }


    public PetModel(String name) {
        this.name = name;
    }

    public PetModel(String animal, String name, int age, String gender, int life, NeedModel needs, boolean death) {
        this.animal = animal;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.life = life;
        this.needs = needs;
        this.death = death;
    }

    @Override
    public String toString() {
        return "PetModel{" +
                "animal='" + animal + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", life=" + life +
                ", creationDate='" + creationDate + '\'' +
                ", needs=" + needs +
                ", death=" + death+
                '}';
    }

    public String getAnimal() {
        return animal;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
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
