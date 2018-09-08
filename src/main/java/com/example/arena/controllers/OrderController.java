package com.example.arena.controllers;

import com.example.arena.dtos.OrderDTO;
import com.example.arena.repositories.TourRepository;
import com.example.arena.repositories.UserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.example.arena.entities.Order;
import com.example.arena.repositories.OrderRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class OrderController {

    private UserRepository userRepository;
    private TourRepository tourRepository;
    private OrderRepository orderRepository;

    public OrderController(UserRepository userRepository, TourRepository tourRepository, OrderRepository orderRepository) {
        this.userRepository = userRepository;
        this.tourRepository = tourRepository;
        this.orderRepository = orderRepository;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public Iterable<Order> getAll() {
        return orderRepository.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void create(@RequestBody OrderDTO order_dto) {
        System.out.println(order_dto);
//        orderRepository.save(new Order(
//            userRepository.findOne(order_dto.user_id),
//            tourRepository.findOne(order_dto.tour_id)
//        ));
        orderRepository.save(new Order(
            userRepository.findById(order_dto.user_id).get(),
            tourRepository.findById(order_dto.tour_id).get()
        ));
    }

}
