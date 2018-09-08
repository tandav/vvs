package com.example.arena.dtos;

import com.example.arena.entities.User;

public class UserDTO {
    public Long id;
    public String first_name;
    public String last_name;
    public String email;
    public String password;
    public Long birthday;

    public UserDTO() {
    }

    public UserDTO(User user) {
        this.id = user.id;
        this.first_name = user.first_name;
        this.last_name = user.last_name;
        this.email = user.email;
        this.password = user.password;
        this.birthday = user.birthday;
    }
}
