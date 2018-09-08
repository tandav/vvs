package com.example.arena.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "orders")
public class Orders {
    @Id @GeneratedValue
    private long id;
    public String name;

    public Orders() {
    }

    public Orders(String name) {
        this.name = name;
    }
}
