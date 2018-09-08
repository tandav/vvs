package com.example.arena.repositories;

import com.example.arena.entities.Order;
import com.example.arena.entities.Tour;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order, Long> {


}