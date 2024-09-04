package com.petlove.pet.model;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PetModel {
    private String animal;
    private String name;
    private int age;
    private String gender;
    private int life;
    private String creationDate;
    private NeedModel needs;
    private boolean death;
    private String create;
    private String update;

    public PetModel() {
        needs = new NeedModel();
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        this.creationDate = formatter.format(date);
    }

    public PetModel(PetModel pet) {
    }

    public PetModel(String name) {
        this.name = name;
    }

    public PetModel(String animal, String name, int age, String gender, int life, String creationDate, NeedModel needs, boolean death, String create, String update) {
        this.animal = animal;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.life = life;
        this.creationDate = creationDate;
        this.needs = needs;
        this.death = death;
        this.create = create;
        this.update = update;
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
                ", death=" + death +
                ", create='" + create + '\'' +
                ", update='" + update + '\'' +
                '}';
    }

    public String getCreate() {
        return create;
    }

    public void setCreate(String create) {
        this.create = create;
    }

    public String getUpdate() {
        return update;
    }

    public void setUpdate(String update) {
        this.update = update;
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
