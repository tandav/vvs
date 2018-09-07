package com.example.arena.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Tour {
    @Id @GeneratedValue
    private long id;
    public String name;

//    @OneToOne
//    public Order order;

    public Tour() {
    }

    public Tour(String name) {
        this.name = name;
    }


}