package com.example.arena.entities;

import javax.persistence.*;
import java.util.*;

@Entity
@Table(name = "users")
public class User {
    @Id @GeneratedValue
    public Long id;
    public String first_name;
    public String last_name;
    public String email;
    public String password;
    public boolean active;
    public Long birthday;
    @ManyToMany
    public Set<Order> orders;

    public User(String first_name, String last_name, String email, String password, boolean active, Long birthday) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.password = password;
        this.active = active;
        this.birthday = birthday;
        this.orders = new HashSet<>();
    }

    public User() {

    }


}
