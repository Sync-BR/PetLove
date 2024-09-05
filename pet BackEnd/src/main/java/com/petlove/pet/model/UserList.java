package com.petlove.pet.model;

import java.util.ArrayList;
import java.util.List;

public class UserList {
    public String id;
    public List<UserModel> usuarios = new ArrayList<>();
    public UserList() {
        usuarios = new ArrayList<>();
    }

    public List<UserModel> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<UserModel> usuarios) {
        this.usuarios = usuarios;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
