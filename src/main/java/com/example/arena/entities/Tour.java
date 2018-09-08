package com.example.arena.entities;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "tours")
public class Tour {
    @Id
    @GeneratedValue
    public Long id;
    public String name;
    public String descrition;
    public String location;
    public Long start_date;
    public Long end_date;
    public Integer count_limit;
    @OneToMany
    Set<Order> orders;

    public Tour() {
    }

    public Tour(String name, String descrition, String location, Long start_date, Long end_date, Integer count_limit) {
        this.name = name;
        this.descrition = descrition;
        this.location = location;
        this.start_date = start_date;
        this.end_date = end_date;
        this.count_limit = count_limit;
        this.orders = new HashSet<>();
    }
}