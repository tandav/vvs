package com.example.arena.entities;

import javax.persistence.*;
import java.util.*;

@Entity
public class User {
    @Id @GeneratedValue
    private long id;
    public String frist_name;
//    private String last_name;
//    private String email;
//    private String password;
//    private boolean active;
//    private long birthday;
//    @ManyToMany
//    private Set<Order> orders;


    public User(String frist_name) {
        this.frist_name = frist_name;
//        this.last_name = last_name;
//        this.email = email;
//        this.password = password;
//        this.active = active;
//        this.birthday = birthday;
//        this.orders = orders;
    }

    public User() {

    }



}
