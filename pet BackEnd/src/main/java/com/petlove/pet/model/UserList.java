package com.petlove.pet.model;

<<<<<<< HEAD
<<<<<<< HEAD
import org.apache.catalina.User;

=======
>>>>>>> main
=======
import org.apache.catalina.User;

>>>>>>> a554fefe117173e534be71909d416efe623ab70b
import java.util.ArrayList;
import java.util.List;

public class UserList {
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> a554fefe117173e534be71909d416efe623ab70b
    public String id;
    public List<UserModel> usuarios =new ArrayList<>();
    public UserList(List<UserList> users) {
    }
    public UserList() {
        usuarios = new ArrayList<>();
    }
    public boolean updateUser(UserModel updatedUser) {
        for (int i = 0; i < usuarios.size(); i++) {
            UserModel user = usuarios.get(i);
            if (user.getUsername().equals(updatedUser.getUsername())) {
                usuarios.set(0,user);
                return true; // Retorna true se a atualização for bem-sucedida
            }
        }
        return false; // Retorna false se o usuário não for encontrado
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

    public void setUsuarios(int i, UserModel user) {
    }
<<<<<<< HEAD
=======
    public List<UserModel> usuarios = new ArrayList<>();
    public UserList() {
        usuarios = new ArrayList<>();
    }
>>>>>>> main
=======
>>>>>>> a554fefe117173e534be71909d416efe623ab70b
}
