package com.example.arena.entities;

import org.jetbrains.annotations.NotNull;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.HashSet;

@Entity
public class User {
    @Id @GeneratedValue
    public int id;

    @NotNull @Column(unique = true, length = 10000)
    public String username;

    public User() {
    }

    public User(String username) {
        this.username = username;
    }
}
