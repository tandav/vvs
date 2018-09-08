package com.example.arena.entities;

import javax.persistence.*;

@Entity
@Table(name = "tours")
public class Tour {
    @Id @GeneratedValue
    private long id;
    public String name;

    @OneToOne
    public Orders order;

    public Tour() {
    }

    public Tour(String name) {
        this.name = name;
    }


}