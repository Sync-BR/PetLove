package com.petlove.pet.model;

import java.util.ArrayList;
import java.util.List;

public class UserList {
    public String id;
    public List<UserModel> usuarios = new ArrayList<>();
    public UserList() {
        usuarios = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
