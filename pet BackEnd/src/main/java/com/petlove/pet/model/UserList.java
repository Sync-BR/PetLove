package com.petlove.pet.model;
import java.util.ArrayList;
import java.util.List;

public class UserList {
    public List<UserModel> usuarios = new ArrayList<>();

    public UserList() {
        usuarios = new ArrayList<>();
    }

    public boolean updateUser(UserModel updatedUser) {
        for (int i = 0; i < usuarios.size(); i++) {
            UserModel user = usuarios.get(i);
            if (user.getUsername().equals(updatedUser.getUsername())) {
                usuarios.set(0, user);
                return true;
            }
        }
        return false;
    }

    public List<UserModel> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<UserModel> usuarios) {
        this.usuarios = usuarios;
    }




}

