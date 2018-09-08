package com.example.arena.entities;

import com.example.arena.dtos.OrderDTO;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "orders")
public class Order {
    @Id @GeneratedValue
    public Long id;
    @ManyToOne
    public Tour tour;
    public boolean confirmed;
    @ManyToMany
    Set<User> users;


    public Order(User user, Tour tour) {
        this.users = new HashSet<>();
        this.users.add(user);
        this.tour = tour;
        user.orders.add(this);
        tour.orders.add(this);

//        Order(getTourById(order_dto.tour_id), false, )
    }

    public Order() {
    }
}
