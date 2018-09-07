package com.example.arena.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Selects")
public class Order {
    @Id @GeneratedValue
    private long id;
    public String name;

    public Order() {
    }

    public Order(String name) {
        this.name = name;
    }
}
