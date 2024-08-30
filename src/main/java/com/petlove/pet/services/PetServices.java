package com.petlove.pet.services;

import com.petlove.pet.model.NeedModel;
import com.petlove.pet.model.PetModel;
import com.petlove.pet.model.UserModel;

import java.util.ArrayList;
import java.util.List;

public class PetServices {
    private static List<PetModel> pets = new ArrayList<>();
    private static UserModel userModel = new UserModel();

    public PetServices() {
        pets = new ArrayList<>();
        userModel = new UserModel();

    }

    private void addPet(PetModel pet) {
        boolean state = pets.add(new PetModel(pet));
        if (state) {
            if (userModel.getPets().size() <= 2) {
                userModel.setPets(pets);
                System.out.println("Sucesso!");
            }
        }
    }

    public static void main(String[] args) {
        NeedModel needModel = new NeedModel(100, 100);
        needModel.setUrine(50);
        needModel.setFaecs(50);
        PetModel francisco = new PetModel();
        francisco.setName("Francisco");
        francisco.setAge(11);
        francisco.setGender("Male");
        francisco.setLife(100);
        francisco.setNeeds(needModel);
        francisco.setDeath(false);

        NeedModel needAnderson = new NeedModel(100, 100);
        needModel.setUrine(50);
        needModel.setFaecs(50);
        PetModel anderson = new PetModel();
        anderson.setName("anderson");
        anderson.setAge(11);
        anderson.setGender("masculino");
        anderson.setLife(100);
        anderson.setNeeds(needAnderson);
        anderson.setDeath(false);

        PetServices petServices = new PetServices();
        petServices.addPet(francisco);
        petServices.addPet(anderson);
        System.out.println(pets);
    }
}
